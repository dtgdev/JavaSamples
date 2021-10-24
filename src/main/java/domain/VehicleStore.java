package domain;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class VehicleStore {

    List<Parts> parts;

    public void loaddata() throws IOException {

        FileReader fd = new FileReader("/Users/dawitgebremichael/hcc/javaII/src/main/java/domain/vehicle.txt");
        BufferedReader br = new BufferedReader(fd);
        String line = br.readLine(); //This read the first line

        Car car;
        Parts part; //variable declaration
        List<Car> cars = new ArrayList();

        List<String> brands = new ArrayList();

        while (line != null){
            String[] data =  line.split(",");
            String brand = data[0];
            String model = data[1];

            if( !brands.contains(brand)) {
                brands.add(brand);

                List<Parts> parts = getParts(brand, fd);
                car = new Car(brand, parts, model);
                cars.add(car);
            }

            System.out.println(data[0]);
//            part = new Parts()
//            parts.add(part);
            line = br.readLine();
        }
//        Car car = new Car();

    }

    public List<Parts> getParts(String brand,FileReader fd  ) throws IOException {

        List<Parts> parts = new ArrayList();
        BufferedReader br = new BufferedReader(fd);
        String line = br.readLine(); //This read the first line

        while (line != null){
            String[] data =  line.split(",");
            String part = data[2];
            Parts part1 = new Parts(part);
            parts.add(part1);
            line = br.readLine();
        }

        return parts;

    }




    public static void main(String[] args) throws IOException {
        VehicleStore vehicleStore = new VehicleStore();
        vehicleStore.loaddata();
    }
}
