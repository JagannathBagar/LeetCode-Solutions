class Solution {
    public boolean isValid(String s) {

        Stack<Character> test=new Stack<>();

        for(int i=0; i<s.length(); i++){

            char ch=s.charAt(i);

            if(ch=='(' || ch=='{' || ch=='[' ){

                test.push(ch);
            }
            else{

                if(test.isEmpty()==true){return false;}

                char c=test.peek();

                if(ch==')'  && c=='('
                || ch=='}' && c=='{' 
                || ch==']' && c=='[' ){

                    test.pop();
                }
                else{
                    return false;
                }
            }
        }

        if(test.isEmpty()==true){return true;}
        return false;
    }
}