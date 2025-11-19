import java.util.Stack;

public class L20 {
    
}

class Solution {
    public boolean isValid(String s) {
        // ( -> ) -> { -> ( -> [ -> ( -> ) -> ( -> ) -> ] -> ) -> } -> 
        int len = s.length();
        if(len%2!=0){
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for(int i=0;i<len;i++){
            char c = s.charAt(i);
            if( c == '[' || c == '{' || c == '('){
                stack.push(c);
            } else {
                // c -> ),},]
                if(stack.size()==0){
                    return false;
                }
                char lc = stack.pop();
                if (
                    (lc == '(' && c == ')') || 
                    (lc == '{' && c == '}') || 
                    (lc == '[' && c == ']')){}
                    else {
                    return false;
                }
            }
        }
        return stack.size()==0;
    }
}