//import java.util.*;
//class Solution {
//    public String solution(String new_id) {
//        new_id = new_id.toLowerCase();          //1단계
//        String temp = "";
//        for (int i = 0; i < new_id.length(); i++) { //2단계
//            char t = new_id.charAt(i);
//            if (t == '-' || t == '_' || t == '.') {
//                temp += t;
//            }
//            if (t >= '0' && t <= '9') {
//                temp += t;
//            }
//            if (t >= 'a' && t <= 'z') {
//                temp += t;
//            }
//        }
//        new_id = temp;
//        
//        
//        String pattern = "\\.{2,}";                 //3단계
//        new_id = new_id.replaceAll(pattern,".");
//       
//        
//        if (new_id.startsWith(".")){                //4단계
//            new_id = new_id.substring(1);    
//        } 
//        else if (new_id.endsWith(".")){
//            new_id = new_id.substring(0, new_id.length() - 1);    
//        } 
//        
//        if (new_id.length() == 0){                  //5단계
//            new_id = "a";    
//        } 
//        
//        
//        if (new_id.length() >= 16) {                // 6단계
//            new_id = new_id.substring(0, 15);
//        }
//        if (new_id.endsWith(".")){
//            new_id = new_id.substring(0, new_id.length() - 1);    
//        } 
//
//        if (new_id.length() <= 2) {                 // 7단계
//            while(true) {
//                new_id += new_id.charAt(new_id.length() - 1);
//                if(new_id.length() == 3){
//                    break;
//                }
//            }
//        }
//        
//        return new_id;
//    }
//}