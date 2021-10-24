package project;

import java.io.*;

//import java.util.regex.*;

public class TextProcessingAssignment {
    File file = new File("/Users/dawitgebremichael/hcc/javaII/src/main/java/project/test.txt");
    FileInputStream fileStream;

    {
        try {
            fileStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    InputStreamReader input = new InputStreamReader(fileStream);
    BufferedReader reader = new BufferedReader(input);


    public void Counter() throws IOException {
        String str = "Hong Kong (CNN) -- Thousands of demonstrators bracing for the possibility of a police crackdown packed streets in the heart of Hong Kong early Tuesday.\n" +
                "\n" +
                "Protesters had masks, protective goggles and plastic raincoats on hand as they camped out on the main thoroughfare leading into the city's central business district around 3 a.m. Tuesday, about 24 hours after officers had fired tear gas and pepper spray at the crowd.\n" +
                "\n" +
                "\"They're all ready just in case there is any sort of move by the Hong Kong police,\" CNN's Andrew Stevens reported.";
        str = reader.readLine();
        int position = str.indexOf("the", 0);
        int counter1 = 0;

        int characters = 0;
        for (int i = 0, length = str.length(); i < length; i++) {   //code to count characters and leave out spaces
            if (str.charAt(i) != ' ') {
                characters++;
            }
        }

        System.out.println("Number of characters excluding space: " + characters);

        while (position != -1) {
            counter1++;
            position = str.indexOf("the", position + 1);
        }
        System.out.println("the counter: " + counter1);

        int position2 = str.indexOf("is", 0);
        int counter2 = 0;

        while (position2 != -1) {      //loop to search for "is" in str(String)
            counter2++;
            position2 = str.indexOf("is", position2 + 1);
        }

        System.out.println("is counter: " + counter2); //printing number of "is" found in String

        String words[]  = str.split(" . ");
        System.out.println("Number of sentences: " + words.length);


        int count = 0;
        for (int i = 0, len = str.length(); i < len; i++) {
            if (Character.isDigit(str.charAt(i))) {
                count++;
            }
        }
        System.out.println("Number of digits : " + count);


    }


    public static void main (String[]args) throws IOException {
        TextProcessingAssignment sample = new TextProcessingAssignment();
        sample.Counter();
    }
}