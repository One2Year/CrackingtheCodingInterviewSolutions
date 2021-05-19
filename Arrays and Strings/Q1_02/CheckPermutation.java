/**
 * Given two strings, write a method to decide if one is a permutation of the other.  
*/

import java.util.Arrays;

class CheckPermutation {
    
    /**
     * 1. Sort
     * Time: O(nlgn)
     * Space: O(1)
    */
    public static boolean checkPermutaionSort(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        char c1[] = s1.toCharArray();
        char c2[] = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        for (int i = 0; i < s1.length(); ++i) {
            if (c1[i] != c2[i]) return false;
        }

        return true;
    }

    public static boolean checkPermutaionMap(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] charMap = new int[128];
        for (int i = 0; i < s1.length(); ++i) {
            charMap[s1.charAt(i)]++;
        }

        for (int i = 0; i < s2.length(); ++i) {
            if (--charMap[s2.charAt(i)] < 0) return false;
        }

        return true;
    }

    /**
     * 1. Map
     * Time : O(n)
     * Space : O(n)
    */
    public static void main (String[] args) {
        String[][] test = {{"abc", "cba"}, {"abcd","abcc"}, {" ", "a"}};
        for(String[] t : test) {
            String s1 = t[0];
            String s2 = t[1];
            boolean res = checkPermutaionMap(s1, s2);
            System.out.println(s1 + " " + s2 + " : " + res);
        }

    }
}