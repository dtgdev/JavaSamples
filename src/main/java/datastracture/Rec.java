package datastracture;

public class Rec {

    public static int f(int n){
        if ( n <= 1)
            return 1;

        return f(n-1) + f(n-1);

    }

    public static int f2(int n){
        if ( n == 0)
            return 1;

        return n * f2(n-1);

    }

    public static int fib(int n){
        if ( n < 3)
            return 1;

        return fib(n-1) + fib(n-2);

    }

    public static void foo(int[] arr){
        for( int i=0; i< arr.length; i++){
            for(int j= i+1; j< arr.length; j++){
                System.out.println(arr[i] + " &&  arr[j] "+ arr[j]);
            }
        }
    }



    public static void main(String[] args) {
//        System.out.println(f(4));
//        System.out.println(f2(4));
        System.out.println(fib(4));
//
    }
}
