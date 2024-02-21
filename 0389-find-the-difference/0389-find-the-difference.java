class Solution {
    public char findTheDifference(String s, String t) {
        // Initialize the result character to 0
        char c = 0;

        // XOR each character in string s
        for (char cs : s.toCharArray()) {
            c ^= cs;
        }

        // XOR each character in string t
        for (char ct : t.toCharArray()) {
            c ^= ct;
        }

        // The final value of 'c' is the difference between the characters in s and t
        return c;
    }
}
