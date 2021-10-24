package domain;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {
    List<Student> students = new ArrayList<Student>();

    public void fileReader() throws IOException {
        FileReader fr = new FileReader("/Users/dawitgebremichael/hcc/javaII/src/main/java/domain/student.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();

        Student student = new Student();
        while(line != null){
            System.out.println(line);
            line = br.readLine();
            if(line != null){
                String[] data = line.split(",");
                student.setName(data[0]);
                student.setGpa(Float.parseFloat(data[1]));
                students.add(student);
            }

        }
    }

    public void display(){
        for (Student student: students){
            System.out.println(student.getGpa());
        }
    }


    public static void main(String[] args) throws IOException {

        Test test = new Test();
        test.fileReader();
        test.display();

    }
}
