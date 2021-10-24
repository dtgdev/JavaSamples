package datastracture;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentManager {

    List<Student> students = new ArrayList();
    List<String> names = new ArrayList();


    private void loaData2(){
        students.add(new Student( 23L,"Peter","Sugarland",3.7));
        students.add(new Student( 12L,"Bazy","Houston",2.7));
        students.add(new Student(11L,"Aron","Woodlan",3.1));
        students.add(new Student(1L,"Samm","Houston",3.9));


        Collections.sort(students, new NameComparator());
        System.out.println(students);
        Collections.sort(students, new GpaComparator());
        System.out.println(students);

    }

    private void loadData(){

        names.add("Peter");
        names.add("Bazy");
        names.add("Aron");
        names.add("Sam");
        Collections.sort(names);
        System.out.println(names);

    }


    public static void main(String[] args) {

        StudentManager studentManager = new StudentManager();
        studentManager.loaData2();
    }
}
