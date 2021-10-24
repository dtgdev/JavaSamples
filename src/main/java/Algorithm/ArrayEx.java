package Algorithm;

public class ArrayEx {

    public static int[] voidaddOne(int[] arr){
        int carry  =  1;

        int[] result  = new int[arr.length];

        for (int i = arr.length -1; i >= 0; i--){

             int total  = arr[i] + carry;

             if(total == 10)
                 carry = 1;
             else
                 carry = 0;

             result[i] = total % 10;
            System.out.println();

        }

        if (carry == 1){
            result = new int[arr.length +1];
            result[0] =1;
        }

        return result;
    }

    public static void display(int[] x){
        for (int i :x ){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int [] arr =  {9,9,9};
        display(voidaddOne(arr));
    }
}
