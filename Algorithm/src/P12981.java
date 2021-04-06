//import java.util.*;
//class Solution {
//    public int[] solution(int n, String[] words) {
//        List<String> list = new ArrayList<String>();
//        int[] answer = {0,0};
//        int round = 0;
//        int index = 0;
//        
//        list.add(words[0]);
//        for(int i = 0 ; i < words.length-1 ;i++){
//            String first = words[i];
//            String second = words[i+1];
//            if(first.charAt(first.length()-1) == second.charAt(0) && !list.contains(second)){
//                list.add(second);
//                continue;
//            }else{
//                System.out.println(i+ " " + first + " " + second);
//                round = (i+1)/n +1;
//                index = (i+1)%n +1;
//                answer[0] = index;
//                answer[1] = round;
//                break;
//            }
//            
//        }
//
//        return answer;
//    }
//}