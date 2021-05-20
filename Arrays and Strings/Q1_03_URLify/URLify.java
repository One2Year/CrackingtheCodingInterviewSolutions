/** 
 * Write a method to replace all spaces in a string with '%20'. 
 * You may assume that the string has sufficient space at the end 
 * to hold the additional characters,and that you are given the "true" length of the string. 
 * (Note: If implementing in Java,please use a character array 
 * so that you can perform this operation in place.)
 * 
 * EXAMPLE
 * Input:  "Mr John Smith    ", 13 
 * Output: "Mr%20John%20Smith"
*/

class URLify {

    /**
     * 1. BF - Forward
     * Time : O(n^2)
     * Space : O(1)
    */
    public static void replaceSpaceBF (char[] url, int trueLen) {
        // TODO: Implement BF function 
    }

    /**
     * 1. Backward
     * Time : O(n)
     * Space : O(1)
    */
    public static void replaceSpace (char[] url, int trueLen) {
        int wsCount = 0;
        for (int i = 0; i < trueLen; ++i) {
            if (url[i] == ' ') wsCount++;
        }
        
        int end = trueLen + 2 * wsCount;
        for (int i = trueLen - 1; i >= 0; --i) {
            if (url[i] == ' ') {
                url[--end] = '0';
                url[--end] = '2';
                url[--end] = '%';
            } else {
                url[--end] = url[i];
            }
        }
    }
    
    public static void main(String[] args) {
        String strTest = "Mr John Smith    ";
        char[] charTest = strTest.toCharArray();
        replaceSpace(charTest, 13);
        String res = new String(charTest);
        System.out.println(res);
    }
}