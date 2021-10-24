package domain;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentManager {

    List<Student> studentList = new ArrayList();
    List<Address> addressesList = new ArrayList();

    //Read the file - student.txt
    //Able to search & print - we should able to update the information provided

    private void readAddress() throws IOException {
        FileReader fd = new FileReader("/Users/dawitgebremichael/hcc/javaII/src/main/java/domain/address.txt");
        BufferedReader br = new BufferedReader(fd);
        String line = br.readLine(); //This read the first line

        Address address; //variable declaration

        while (line != null){
            String[] data =  line.split(",");
            address = new Address(Integer.parseInt(data[0]),data[1]);
            addressesList.add(address);
            line = br.readLine();
        }

    }


    /**
     * This method reads data from a given file system and
     * Load the data into a collection of student objects
     */
    private void readStudent() throws IOException {
        FileReader fd = new FileReader("/Users/dawitgebremichael/hcc/javaII/src/main/java/domain/student.txt");
        BufferedReader br = new BufferedReader(fd);
        String line = br.readLine(); //This read the first line

        Student student; //variable declaration

        // This reads address from the address.text and loads it to addressesList
        readAddress();

        while (line != null){

            //1,Mike,3.2,2  -- this is the first line that is read but we read the rest of the file
            String[] data =  line.split(",");
            // what is the address of the student
            int addressId = Integer.parseInt(data[3]);
            //Let's find the address from addressList collection
            Address address = searchByAddressId(addressId);
            //create object for each line in the file
            student = new Student(Integer.parseInt(data[0]),data[1],Float.parseFloat(data[2]),address);
            //add each object in the collection
            studentList.add(student);
            //read the next line
            line = br.readLine();
        }

    }

    public void display(){
        for(Student s : studentList){
            s.toString();
        }
    }

    public void search(String name){

        boolean found = false;
        for(Student s : studentList){

            if(s.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThe name is found : "+s.toString());
                found = true;
                break;
            }
        }

        if( found == false){
            System.out.println(" \n The name is not found!");
        }

    }


    public Student searchByName(String name){

        for(Student s : studentList){

            if(s.getName().equalsIgnoreCase(name)) {
                return s;
            }
        }
        return null;
    }

    public Address searchByAddressId(int id){

        for(Address address : addressesList){

            if(address.getId() == id) {
                return address;
            }
        }
        return null;
    }

    public static void main(String[] args) throws IOException {

        StudentManager studentManager = new StudentManager();
        studentManager.readStudent();
        studentManager.display();
        studentManager.search("dawit");



//        Make an object - making a copy A001 ->
//        Student student = new Student("Mike",3.2f);
//
//
//        //        Make an object - making a copy A002 ->
//        Student student2 = new Student();
//        student2.setCountryName("Dawit");
//        student2.setGpa(2.2f);
//
//
//        System.out.println(" Hello "+student.getCountryName()+"  my gap is : "+student.getGpa());
    }
}
