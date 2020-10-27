/*카카오  괄호변환*/

import java.util.Stack;

class Pkakaolevel2_01 {
    int index =0 ;
    public String solution(String p) {
        if(p.equals("")){
            return "";
        }
        boolean perfect = isPerfect(p);
        String u = p.substring(0,index);
        String v = p.substring(index,p.length());    
        if(perfect){
            return u + solution(v);
        }
        String answer = "(" + solution(v) + ")";
        for(int i = 1; i < u.length() -1 ;i++){
            if(u.charAt(i)=='('){
                answer += ')';
            }else{
                answer +='(';
            }
        }
        
        return answer;
    }
    public boolean isPerfect(String s){
        Stack<Character> stack = new Stack<Character>();
        int left = 0;
        int right = 0;
        boolean result = true;
        
        for(int i = 0 ; i < s.length();i++){
            if(s.charAt(i) == '('){
                left++;
                stack.push('(');
            }else{
                right++;
                if(stack.isEmpty()){
                    result = false;
                }else{
                    stack.pop();
                }

            }
            if(left == right){
                index = i+1;
                return result;
            }
        }
        return true;
        
    }
}