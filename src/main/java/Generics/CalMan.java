package Generics;

public class CalMan {

    public static void main(String[] args) {
        Cal<Integer> cal  = new Cal();

        System.out.println(cal.add(2,3));
    }
}
