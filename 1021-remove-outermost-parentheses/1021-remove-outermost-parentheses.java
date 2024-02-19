class Solution {
    public String removeOuterParentheses(String s) {

        Stack<Character> charStack = new Stack<>();
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                if (charStack.isEmpty()!=true) {
                    result += ch;
                }
                charStack.push(ch);
            } else {
                charStack.pop();
                if (!charStack.isEmpty()) {
                    result += ch;
                }
            }
        }

        return result;
     /*   Stack<Character> charStack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                if (!charStack.isEmpty()) {
                    result.append(ch);
                }
                charStack.push(ch);
            } else {
                charStack.pop();
                if (!charStack.isEmpty()) {
                    result.append(ch);
                }
            }
        }

        return result.toString();*/
    }
}