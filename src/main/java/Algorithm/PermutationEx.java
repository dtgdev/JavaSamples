package Algorithm;

import java.util.HashMap;
import java.util.Map;

public class PermutationEx {

    public static boolean dup(String value) {

        boolean[] isDup = new boolean[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];

        for (char c : value.toCharArray()) {
            int v = getCharNumber(c);

            if (isDup[v])

                return true;

            isDup[v] = true;
        }

        return false;
    }


    public static String strComp(String str) {
        //aaccccaaa

        StringBuilder compressed = new StringBuilder();
        int countConsecutive = 0;

        for (int i = 0; i < str.length(); i++) {
            countConsecutive++;

            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressed.append(str.charAt(i));
                compressed.append(countConsecutive);
                countConsecutive = 0;
            }
        }
        return null;
    }


    public static boolean isPermutationOfPalindroe(String phrase) {
        int countOdd = 0;
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        System.out.println(table.length);
        for (char c : phrase.toCharArray()) {
            int x = getCharNumber(c);
            if (x != -1) {
                table[x]++;
                if (table[x] % 2 == 1) {
                    countOdd++;
                } else {
                    countOdd--;
                }
            }
        }
        return countOdd <= 1;
    }

    private static int getCharNumber(char c) {

        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);
        if (a <= val && val <= z)
            return val - a;
        return -1;
    }

    public static void main(String[] args) {
//        boolean value = isPermutationOfPalindroe("dawit iwad");
//        System.out.println(value);
//        System.out.println(dup("Daawit"));
        strComp("aabccccccaa");
    }
}
