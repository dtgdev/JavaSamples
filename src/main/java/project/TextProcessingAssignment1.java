package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class TextProcessingAssignment1 {
    public static void main(String[] args) {

        int characters = 0;
        int theIs = 0;
        int sentences = 0;
        int digits = 0;

        String text = "Hong Kong (CNN) -- Thousands of demonstrators bracing for the possibility of a police crackdown packed streets in the heart of Hong Kong early Tuesday.\n" +
                "\n" +
                "Protesters had masks, protective goggles and plastic raincoats on hand as they camped out on the main thoroughfare leading into the city's central business district around 3 a.m. Tuesday, about 24 hours after officers had fired tear gas and pepper spray at the crowd.\n" +
                "\n" +
                "\"They're all ready just in case there is any sort of move by the Hong Kong police,\" CNN's Andrew Stevens reported.";

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) != ' ' && text.charAt(i) != '\n') {
                characters++;
            }
            if (Character.isDigit(text.charAt(i))) {
                digits++;
            }
        }

        String[] sentenceList = text.split("\\.\n");

        sentences += sentenceList.length;

        String[] wordList = text.split("\\s+");

        for (int i = 0; i < wordList.length; i++) {
            if (wordList[i].equalsIgnoreCase("the") || wordList[i].equalsIgnoreCase("is")) {
                theIs++;
            }
        }

        System.out.print("The total number of characters is: " + characters + "\nThe total number of times the words \"the\" and \"is\" appear is: " + theIs +
                "\nThe total number of sentences is: " + sentences + "\nThe total number of digits is: " + digits);
    }

}