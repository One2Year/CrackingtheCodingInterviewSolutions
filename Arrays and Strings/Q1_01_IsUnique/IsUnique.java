/**
 * 1.1 Is Unique
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 *
 */

import java.util.Arrays;

class IsUnique {
    /**
     * 1. BF without additional data structures
     * Time : O(n^2)
     * Space: O(1)
    */
    public static boolean isUniqueBF (String str) {
        if (str.length() <= 1) return true;
        for (int i = 0; i < str.length(); ++i) {
            for (int j = i + 1; j < str.length(); ++j) {
                if (str.charAt(i) == str.charAt(j)) return false;
            }
        }
        return true;
    }

    /**
     * 2. Sort - Input will be changed.
     * Time : O(nlgn)
     * Space : O(1) which depends on sort algorithm
    */
    public static boolean isUniqueSort (String str) {
        char tempArray[] = str.toCharArray();
        Arrays.sort(tempArray);
        for (int i = 0; i < tempArray.length - 1; ++i) {
            if (tempArray[i] == tempArray[i + 1]) return false;
        }
        return true;
    }


    /**
     * 3. Char Set
     * Time : O(n)
     * Space : O(n)
    */
    public static boolean isUniqueChar (String str) {
        if (str.length() > 128) return false;
        boolean[] charSet = new boolean[128];
        for(int i = 0; i < str.length(); ++i) {
            int val = str.charAt(i);
            if (charSet[val]) return false;
            charSet[val] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] test = {"", "abc", "abbc"};
        for (String t : test) {
            System.out.println(t + " : " + isUniqueChar(t));
        }
    }

}