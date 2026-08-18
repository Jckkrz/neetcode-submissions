class Solution {
    public boolean isValid(String s) {

        Stack<Character> parentheses = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '[' || s.charAt(i) == '(' || s.charAt(i) == '{'){
                parentheses.push(s.charAt(i));
            }
            else if(!parentheses.isEmpty() && s.charAt(i) == ']' && parentheses.peek() == '['){
                parentheses.pop();
            }
            else if(!parentheses.isEmpty() && s.charAt(i) == ')' && parentheses.peek() == '('){
                parentheses.pop();
            }
            else if(!parentheses.isEmpty() && s.charAt(i) == '}' && parentheses.peek() == '{'){
                parentheses.pop();
            }
            else{return false;}

        }

        if(parentheses.isEmpty()){return true;}
        else{return false;}

    
        
    }
}
