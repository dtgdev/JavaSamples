package collectionExmple;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    List<Student> studentList = new ArrayList(); // used to add a collection of student object

    //Read the file - student.txt

    private void readAddress() throws IOException {
        FileReader fd = new FileReader("c://dave/student.txt");
        //something is missing here. Please add you code here to fix the code
        BufferedReader br = new BufferedReader(fd);
        String line = br.readLine(); //This line reads the first line

        Student student; //variable declaration

        while (line != null){
            String[] data =  line.split(","); // this split each line read from the file. ex 1,Mike
            student = new Student(Integer.parseInt(data[0]),data[1]);
            // add the student object in the  List<Student> addressesList collection here
            studentList.add(student);
            line = br.readLine();
        }

    }
}
