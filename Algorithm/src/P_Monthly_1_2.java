//import java.util.*;
//class Solution {
//    static Stack<Character> stack = new Stack<Character>();
//    static int answer =0 ;
//    static String s;
//    public int solution(String s) {
//        this.s = s;
//        for(int i = 0 ; i < s.length();i++){
//            s = shift(s);
//            // System.out.println(s);
//            check(s);
//        }
//        
//        return answer;
//    }
//    public static String shift(String str){
//        String front = str.charAt(0)+"";
//        String back = str.substring(1,str.length());
//        return back+front;
//    }
//    public static void check(String str){
//        int loopCount ;
//        for (loopCount = 0; loopCount < str.length(); loopCount++) {
//            char ch = str.charAt(loopCount);
//            boolean isIncorrect = false;
//
//            switch (ch) {
//            case '(': case '{': case '[':
//                stack.push(ch);
//                break;
//
//            case ')':
//                if (stack.isEmpty() || (ch = stack.pop()) != '(') {
//                    isIncorrect = true;
//                }
//                break;
//
//            case '}':
//                if (stack.isEmpty() || (ch = stack.pop()) != '{') {
//                    isIncorrect = true;
//                }
//                break;
//
//            case ']':
//                if (stack.isEmpty() || (ch = stack.pop()) != '[') {
//                    isIncorrect = true;
//                }
//                break;
//            }
//            
//            if(isIncorrect) {
//                break;
//            }
//        }
//        
//        if(stack.isEmpty() && loopCount == str.length()) {
//            answer++;
//        }
//    }
//    
//}