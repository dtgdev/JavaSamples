package Algorithm;

public class BitM {

    public static int ones(int x) {
        int sum = 0;
        while (x > 0) {
            sum += x % 2;
            x >>= 1;
        }

        return sum;
    }

    public static void shift() {

        System.out.println(2 ^ 1);
        System.out.println(3 >> 1);
    }

    public static int fib(int n) {

        int[] mem = new int[n+1];
        return fibn(n,mem);

    }
    public static int fibn(int n, int[] mem) {

       if( n == 0 || n == 1)
           return 1;

       if(mem[n] != 0 )
           return mem[n];

        mem[n] = fibn(n - 1, mem) + fibn(n - 2, mem);

        return mem[n];
    }

    public static void main(String[] args) {
//        System.out.println(ones(5));
        System.out.println(fib(3));
//        shift();
    }


}
