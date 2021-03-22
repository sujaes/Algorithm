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
        String answer = "(" + solution(v) + ")";            //������ȣ�ƴҶ�
        for(int i = 1; i < u.length() -1 ;i++){
            if(u.charAt(i)=='('){                           //������ȣ�� �������� ����
                answer += ')';
            }else{                                          //������ȣ�� �������� ����
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
        
        for(int i = 0 ; i < s.length();i++){                //���̸�ŭ ������
            if(s.charAt(i) == '('){                         //������ȣ�� left++
                left++;
                stack.push('(');                            //���ÿ� �߰�
            }else{                                          //������ȣ�� right++
                right++;
                if(stack.isEmpty()){                        //������ ��������� false
                    result = false;
                }else{
                    stack.pop();                            //������ �������� pop
                }

            }
            if(left == right){                              //���� ���� �ε��� ã��
                index = i+1;
                return result;
            }
        }
        return true;                                        //�ٵ������� ������ ��
        
    }
}