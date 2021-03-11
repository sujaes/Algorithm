//class Solution {
//    public String solution(String s) {
//        String answer = "";
//        String arr[] = s.split(" ");
//
//        for(int i = 0 ; i < arr.length; i++){
//            String word = arr[i];
//            if(word.equals("")){
//                answer += " ";
//                continue;
//            }
//            String first = word.charAt(0) +"";
//            first = first.toUpperCase();
//            String back = word.substring(1,word.length());
//            back = back.toLowerCase();
//            answer += first+back +" ";
//        }
//        if(s.charAt(s.length()-1) != ' '){
//            answer = answer.trim();
//        }
//        return answer;
//    }
//}