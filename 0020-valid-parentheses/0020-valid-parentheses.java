class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        char ch[] = s.toCharArray();
        for(char c : ch){
            //Inset if Opening bracket is present
            if(c=='[' || c== '{' || c== '('){
                stk.push(c);
            }else if(!stk.isEmpty()){
                if((stk.peek()=='[' && c==']') || (stk.peek()=='{' && c=='}') || (stk.peek()=='(' && c==')')){
                    stk.pop();
                }else{
                    return false;
                }       
            }else{
                return false;
            }
        }
        return stk.isEmpty();
    }
}