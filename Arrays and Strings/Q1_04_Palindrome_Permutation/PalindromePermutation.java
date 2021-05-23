/**
 * 1.4 Palindrome Permutation
 * Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word
 * or phrase that is same forwards and backwards.A permutation is a rearragement of letters. The palindrome
 * does not need to be limited to just dictionary words.
 * 
 * EXAMPLE
 * Input:  Tact Coa
 * Output: True (permutations: "taco cat", "atco cta", etc.)
*/

public class PalindromePermutation {

    public static boolean isPalindromePermuation(String str) {
        String s1 = str.replaceAll(" ", "");
        String s2 = s1.toLowerCase();

        int[] charArr = new int[128];
        for (int i = 0; i < s2.length(); ++i) {
            charArr[s2.charAt(i)]++;
        }

        int cnt = 0;
        for (int i = 0; i < charArr.length; ++i) {
            if (charArr[i] % 2 == 1) cnt++;
            if (cnt > 1) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String[] str = {" ", "A a B","abc", "Tact Coa"};
        for (String s : str) {
            System.out.println(s + " is palindrome permutation? " + isPalindromePermuation(s));
        }
    }
    
}
