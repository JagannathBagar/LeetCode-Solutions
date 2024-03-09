class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.length() == 0) {
            // Handle empty string case
            return false;
        }

        // Case 1: All letters are in uppercase
        boolean allUpperCase = true;
        for (char c : word.toCharArray()) {
            if (c < 'A' || c > 'Z') {
                allUpperCase = false;
                break;
            }
        }
        if (allUpperCase) {
            return true;
        }

        // Case 2: All letters are in lowercase
        boolean allLowerCase = true;
        for (char c : word.toCharArray()) {
            if (c < 'a' || c > 'z') {
                allLowerCase = false;
                break;
            }
        }
        if (allLowerCase) {
            return true;
        }

        // Case 3: Only the first letter is uppercase
        if (word.charAt(0) >= 'A' && word.charAt(0) <= 'Z') {
            boolean restLowerCase = true;
            for (int i = 1; i < word.length(); i++) {
                if (word.charAt(i) < 'a' || word.charAt(i) > 'z') {
                    restLowerCase = false;
                    break;
                }
            }
            return restLowerCase;
        }

        // If none of the above cases match, return false
        return false;
    }
}
