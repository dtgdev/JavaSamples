package Interview;

import java.util.*;

public class Test {

    public int arrayMaxConsecutiveSum2(int[] inputArray){
        int max_sum = inputArray[0];
        int current_sum = max_sum;

        for(int i=1; i < inputArray.length; i++){
            current_sum = Math.max(current_sum + inputArray[i], inputArray[i]);
            max_sum = Math.max(current_sum, max_sum);
        }

        return max_sum;
    }








    //find sumOfTwo
    public static boolean sumOfTwo(int[]a, int[]b, int v){
        Map<Integer,Integer> map = new HashMap();
        for(int i = 0; i<a.length; i++){
            map.put(a[i], v - a[i]);
        }

        for(int i = 0; i<b.length; i++){
            if( map.containsValue(b[i]))
                return true;
        }

        return false;
    }

    public static boolean sumOfTwo2(int[]a, int[]b, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i < a.length; i++){
            map.put(a[i],target - a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            if ( map.containsValue(b[i]))
                return true;
        }

        return false;

    }

    //rotate image
    public static int[][] rotateImage(int[][] matrix){

        int N = matrix.length;

        for(int i =0; i < N; i++ ){
            for(int j = i; j < N; j++){
               int temp = matrix[i][j];
               matrix[i][j] = matrix[j][i];
               matrix[j][i] = temp;
            }
        }

        for(int i =0; i < N; i++ ){
            for(int j = 0; j < (N/2); j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][N-1];
                matrix[i][N-1-j] = temp;
            }
        }
        return null;
    }


    public int[] squareArray(int[] arr) {
        int[] sortedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sortedArr[i] = (int) Math.pow(arr[i], 2);
        }
        Arrays.sort(sortedArr);
        return sortedArr;
    }

    /***
     *  More efficient square array
     * @param arr
     * @return
     */



    /***
     *  Check for it is sorted
     * @param words
     * @param order
     * @return
     */
    public boolean isAlienSorted(String[] words, String order) {
        int[] alphabet = new int[26];
        for (int i = 0; i < order.length(); i++) {
            alphabet[order.charAt(i) - 'a'] = i;
            System.out.println(order.charAt(i) - 'a');
        }

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                int min = Math.min(words[i].length(), words[j].length());
                for (int k = 0; k < min; k++) {
                    char iChar = words[i].charAt(k);
                    char jChar = words[j].charAt(k);
                    if (alphabet[iChar - 'a'] < alphabet[jChar - 'a']) {
                        break;
                    } else if (alphabet[jChar - 'a'] < alphabet[iChar - 'a']) {
                        return false;
                    } else if (k == min - 1 && words[i].length() > words[j].length())
                        return false;
                }
                System.out.println(i + " " + j);
            }
        }
        return false;
    }

    public void display(int[] x) {
        for (int i : x) {
            System.out.println(i);
        }
    }

    public void findLongestSubArrayBysum(int s, int[] arr) {
        int[] result = new int[]{-1};

        int sum = 0;
        int left = 0;
        int right = 0;


        while (right < arr.length) {
            sum += arr[right];
            while (left < right && sum > s) {
                sum -= arr[left++];
            }
            if (sum == s && (result.length == 1 || result[1] - result[0] < right - left)) {
                result = new int[]{left + 1, right + 1};
            }
            right++;
        }
    }


    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        // Write your code here
        int alice = 0;
        int bob = 0;
        int index = 0;
        for( int a_ : a){
            if( a_ > b.get(index)){
                bob++;
            }else if( a_ < b.get(index))
                alice++;
            index++;
        }
        List<Integer> total = new ArrayList();
        total.add(bob);
        total.add(alice);
        return total;
    }

    /*
        int sum = 15;
        int[] arr = {1, 2, 3, 4, 0, 0, 0, 6, 7, 8, 9, 10};
     */

    public void findLongestSubArrayBysum2(int s, int[] arr) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int[] result = new int[]{-1};
        List<Long> arr2 = new ArrayList();

        while(right < arr.length){

            sum += arr[right];

            while(left < right && sum > s){
                sum -= arr[left++];
            }

            if( sum == s && (result.length == 1 || result[1] - result[0] < right -left) ){
                result = new int[] {left + 1, right + 1};
            }

            right++;



        }
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here

        int ldiagonal = arr.size();
        int rdiagonal = 1;
        int lsum = 0;
        int rsum = 0;

        for(List<Integer> rows : arr){
            int counter = 1;

            for(int c : rows){
                if (counter == rdiagonal){
                    rsum += c;
                }

                if (counter == ldiagonal){
                    lsum += c;
//                    break;
                }
                counter++;
            }
            rdiagonal++;
            ldiagonal--;
        }

        return Math.abs(rsum - lsum);
    }

    /*
      {10,2,4,9}; 14
     */
    public static boolean sumArr(int[] arr, int v){

        int sum = 0;

        for(int i=0; i< arr.length; i++){
          for(int j=i; j< arr.length; j++){
              if(arr[i] + arr[j] == v || arr[i] == v)
                  return true;
          }
        }
        return false;
    }

    public static boolean addSum(int[] arr, int n, int sum){

        int curr_sum = arr[0], start = 0, i;

        // Pick a starting point
        for (i = 1; i <= n; i++) {
            // If curr_sum exceeds the sum,
            // then remove the starting elements
            while (curr_sum > sum && start < i - 1) {
                curr_sum = curr_sum - arr[start];
                start++;
            }

            // If curr_sum becomes equal to sum,
            // then return true
            if (curr_sum == sum) {
                int p = i - 1;
                System.out.println(
                        "Sum found between indexes " + start
                                + " and " + p);
                return true;
            }

            // Add this element to curr_sum
            if (i < n)
                curr_sum = curr_sum + arr[i];
        }

        System.out.println("No subarray found");
        return false;
    }

    static int getPairsCount(int[] arr, int n, int target)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int pairs=0;
        for (int i=0; i<n; i++)
        {
            if (map.containsKey(target - arr[i]))
            {
                pairs += map.get(target - arr[i]);
                for (int j=1; j<=map.get(target - arr[i]); j++)
                    System.out.print("(" + (target-arr[i]) + "," + arr[i] + ") ");
            }
            map.put(arr[i] , map.getOrDefault(arr[i],0)+1);
        }
        return pairs;
    }



    public static void main(String[] args) {

        Test test = new Test();
//        String[] words = {"word","world","row"};
//        String order = "worldabcefghijkmnpqstuvxyz";
//        test.isAlienSorted(words,order);
//
//        boolean result = test.isAlienSorted(words,order);
//        System.out.println(result);

//        int[] value = {-8, 4, 6, 12};
//        test.display(test.squareArray2(value));


        int sum = 15;
        int[] arr = {1, 2, 3, 4, 0, 0, 0, 6, 7, 8, 9, 10};
//        test.findLongestSubArrayBysum2(sum, arr);
//        List<Integer> values = compareTriplets(Arrays.asList(17,28,30), Arrays.asList(19,16,8) );
//        System.out.println(values);


//        List<Integer> row1 = Arrays.asList(11,2,4);
//        List<Integer> row2 = Arrays.asList(4,5,6);
//        List<Integer> row3 = Arrays.asList(10,8,-12);
//        List<List<Integer>> rows = new ArrayList<List<Integer>>();
//        rows.add(row1);
//        rows.add(row2);
//        rows.add(row3);
//
//        System.out.println(diagonalDifference(rows));

    //init matrix
//          int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
//          rotateImage(matrix);

        int[] a = {0,0,-5,30212};
        int[] b = {10,2,4,9};
        int v = 14;
//        sumOfTwo(a, b, v);
//        sumArr(b,14);
        System.out.println("add sum "+ getPairsCount(b,b.length,v));


    }
}
