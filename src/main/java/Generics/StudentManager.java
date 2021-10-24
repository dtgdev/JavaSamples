package Generics;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {

    List<String> students = new ArrayList();

    public void test(){
        students.add("ddfd");
        test2();
    }
    public void test2(){
        students.add("ddfd");
    }

    public static void main(String[] args) {
        Student<String> student = new Student();
        student.name  =  "Tom";
//        student.courses =  new Course("CS");
        student.courses = "CS";


        StudentManager studentManager = new StudentManager();
        studentManager.test();
        System.out.println("Final");
    }

}
