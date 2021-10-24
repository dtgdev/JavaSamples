package project;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SchoolProfile {
    List<Campus> campuses = new ArrayList();


    /***
     * Load the data from the college.txt and collect it in the  List<Campus> campuses
     * @throws IOException
     */
    private void load() throws IOException {
        FileReader fd = new FileReader("/Users/dawitgebremichael/hcc/javaII/src/main/java/project/college.txt");
        //something is missing here. Please add you code here to fix the code
        BufferedReader br = new BufferedReader(fd);
        String line = br.readLine();  //This line reads the first line
        line = br.readLine();  //This line reads the first line


        while (line != null){
            String[] data =  line.split(","); // this split each line read from the file. ex College Name,campus_name,city,state
            Address address = new Address(data[2],data[3]);
            Campus campus = new Campus(data[0],data[1], address);
            line = br.readLine();
            campuses.add(campus);
        }
    }

    /***
     * Display all campuses
     */
    private void displayCampus(){

        for(Campus campus : campuses){
            System.out.println(campus);
        }
        System.out.println("done displaying ....");
        System.out.println();
    }

    /***
     * Find all campuses for a given college name
     * @param collegName
     */
    private void findCampuses(String collegName){
        System.out.println(".... search for college "+collegName);
        for(Campus campus : campuses){
            if(campus.name.equals(collegName))
                System.out.println(campus);
        }
        System.out.println();
    }


    public static void main(String[] args) throws IOException {
       SchoolProfile schoolProfile = new SchoolProfile();
       schoolProfile.load();
       schoolProfile.displayCampus();
       schoolProfile.findCampuses("HCC");
    }
}
