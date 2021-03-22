//import java.util.*;
//class Solution {
//    boolean solution(String s) {
//        // Stack<Character> stack = new Stack<Character>();
//        int count= 0;
//        int len = s.length();
//        if(len%2 !=0 ){
//            return false;
//        }
//        if(s.charAt(0)==')'){
//            return false;
//        }
//        if(s.charAt(len-1)=='('){
//            return false;
//        }
//        
//        
//        for(int i = 0 ; i <len;i++){
//            if(s.charAt(i)=='('){
//                count++;
//                // stack.add('(');
//            }else{
//                // if(stack.isEmpty()){
//                //     return false;
//                // }
//                if(count == 0){
//                    return false;
//                }
//                count--;
//                // stack.pop();
//            }
//        }
//        if(count==0){
//            return true;
//        }else{
//            return false;
//        }
//
//    }
//}