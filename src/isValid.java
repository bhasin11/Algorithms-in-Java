public class Solution {
    public boolean isValid(String s) {
        
        /*
         * The approach is to iterate through the characters of
         * the string and for any open paranthesis, push a 
         * corresponding closed paranthesis into stack. If we
         * find a close paranthesis in the string, it must be 
         * same as current peek element of the stack, else 
         * we can return false. Finally, there shouldn't be any
         * elements left on the stack, if yes - we return true.
         */
        
        if(s == null || s.length() == 0 || s.length()%2 != 0) return false;
        
        Stack<Character> stack = new Stack();
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(') stack.push(')');
            else if(s.charAt(i) == '{') stack.push('}');
            else if(s.charAt(i) == '[') stack.push(']');
            else if(!stack.isEmpty() && stack.peek() == s.charAt(i)) stack.pop();
            else return false;
        }
        return stack.isEmpty();
    }
}