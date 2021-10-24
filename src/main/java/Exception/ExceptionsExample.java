package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ExceptionsExample {
    public void test2() {
        Integer[] x = {2, 4, 6, 0};
        x = checkforzeor(x);
        System.out.println("Found zero " + x);

    }


    public Integer[] checkforzeor(Integer[] y) {
        boolean found = false;

        List<Integer> num = new ArrayList();

        for (int i : y) {
            if (i != 0) {
                num.add(i);
            }
        }

        Integer[] arr = new Integer[num.size()];
        arr = num.toArray(arr);
        return arr;
    }

    public void test() {
        Scanner scanner = new Scanner(System.in);
        int x = 0, y = 0;

//        try{
//            System.out.println("Enter number x ");
//
//            x = scanner.nextInt();
//
//            System.out.println("Enter number y");
//
//            y = scanner.nextInt();
//
//            System.out.println("x/y = "+x/y);
//
//        }catch (Exception ex){
//            System.out.println( " your input is incorrect "+ex.getMessage());
//        }


        int cont = 1;
        int index = 3;
        int a[] = {2, 4, 6};

        do {
            try {
                System.out.println("Enter number x ");

                x = scanner.nextInt();

                System.out.println("Enter number y");

                y = scanner.nextInt();

                System.out.println("x/y = " + x / y);

                System.out.println(a[index]);
                cont = 0;


            } catch (InputMismatchException ex) {
                System.out.println(" your input is incorrect " + ex.getMessage());
            } catch (ArithmeticException ex2) {
                System.out.println(" your input is incorrect " + ex2.getMessage());
            } catch (ArrayIndexOutOfBoundsException ex3) {

                System.out.println(" Array Error ");
                index = a.length - 1;
            } finally {
                System.out.println(" I am the last statement");
            }

        } while (cont == 1);


        System.out.println(" x  is : " + x);
    }

    public static void intex(String str) {

        try {

            Integer num = Integer.parseInt(str);
            FileReader fr = new FileReader("c:\\");

        } catch (NumberFormatException ex) {
            System.out.println(ex.getStackTrace()[0]);
            System.out.println("Exception : " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Exception --- : " + ex.getStackTrace()[0]);
        }

    }

    public void exmp()   {

        try {
            FileReader n = new FileReader("test.txt");
            Integer.parseInt("3a");
            int x =2, y=0;

            int z = x/y;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println(" File should be available");

        } catch (NumberFormatException ex){
            ex.printStackTrace();
            System.out.println(" The number you have entered has issue");
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }finally {
            System.out.println(" closing network connections");
        }


    }

    public static void intex2() throws FileNotFoundException, NumberFormatException, HCCException {

        try {


            Integer num = Integer.parseInt("2a");
            FileReader fr = new FileReader("dgebrem");


        } catch (FileNotFoundException e) {
           throw new FileNotFoundException("File doesn't exist");
        } catch (NumberFormatException e){
            throw new HCCException("The string value should be strictly number");
        }finally {
            System.out.println(" Hello I am in finally ");
        }

        System.out.println(" Hello I am here");

    }


    public static void main(String[] args) {
        ExceptionsExample example = new ExceptionsExample();
//        example.test();


            example.exmp();

        try {
            intex2();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }catch (NumberFormatException e){
            System.out.println("Number format");
        } catch (HCCException e) {
            e.printStackTrace();
        }

    }
}
