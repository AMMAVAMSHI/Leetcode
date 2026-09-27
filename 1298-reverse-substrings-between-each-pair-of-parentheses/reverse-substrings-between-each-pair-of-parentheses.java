class Solution {
    public String reverseParentheses(String s) {
        Stack<String> stack = new Stack<>();
        String str = "";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                stack.push(str);
                str = "";
            }
            else if(ch == ')'){
                String rev = "";
                for(int j=str.length()-1;j>=0;j--){
                    rev += str.charAt(j);
                }
                str = stack.pop() + rev;
            }
            else{
                str += ch;
            }
        }
        return str;
    }
}

// etco
// octe
// leetcode