import java.util.*;
class P60058 {
	static int index =0 ;
    
    public static void main(String[] args) {
    	String s = ")(";
    	solution(s);
    }
    public static String solution(String p) {
        if(p.equals("")){
            return "";
        }
        boolean perfect = isPerfect(p);
        String u = p.substring(0,index);
        String v = p.substring(index,p.length());    
        if(perfect){
            return u + solution(v);
        }
        String answer = "(" + solution(v) + ")";            //완전괄호아닐때
        for(int i = 1; i < u.length() -1 ;i++){
            if(u.charAt(i)=='('){                           //열림괄호는 닫힘으로 변경
                answer += ')';
            }else{                                          //닫힘괄호는 열림으로 변경
                answer +='(';
            }
        }
        System.out.println(answer);
        return answer;
    }
    public static boolean isPerfect(String s){
        Stack<Character> stack = new Stack<Character>();
        int left = 0;
        int right = 0;
        boolean result = true;
        
        for(int i = 0 ; i < s.length();i++){                //길이만큼 돌리기
            if(s.charAt(i) == '('){                         //닫힘괄호시 left++
                left++;
                stack.push('(');                            //스택에 추가
            }else{                                          //닫힘괄호시 right++
                right++;
                if(stack.isEmpty()){                        //스택이 비어있으면 false
                    result = false;
                }else{
                    stack.pop();                            //스택이 차있으면 pop
                }

            }
            if(left == right){                              //가장 작은 인덱스 찾기
                index = i+1;
                return result;
            }
        }
        return true;                                        //다돌았을때 없으면 참
        
    }
}