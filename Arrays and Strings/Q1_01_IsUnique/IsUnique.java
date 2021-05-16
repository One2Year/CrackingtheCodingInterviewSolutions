/**
 * 1.1 Is Unique
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 *
 */

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

    public static void main(String[] args) {
        String[] test = {"", "abc", "abbc"};
        for (String t : test) {
            System.out.println(t + " : " + isUniqueBF(t));
        }
    }

}