//class Solution
//{
//    public int solution(String s)
//    {
//        int answer = 1; 
//        for(int i = 0; i< s.length()-1; i++) {
//            int oddSol = oddSolution(i, s.length(), s);
//            int evenSol = evenSolution(i, s.length(), s);
//
//            if(answer < oddSol)
//                answer = oddSol;
//            if(answer < evenSol)
//                answer = evenSol;
//        }
//        return answer;
//    }
//    
//    public static int oddSolution(int pos, int length, String s) {
//        int maxCount = 1;
//        for(int i = 1; i<= length/2; i++) {
//            if(pos-i < 0 || pos+i >= length) {
//                break;
//            }
//            if(s.charAt(pos-i) == s.charAt(pos+i)) {
//                maxCount +=2;
//            }else {
//                break;
//            }
//        }
//        return maxCount;
//    }
//    
//    public static int evenSolution(int pos, int length, String s) {
//        int maxCount = 0;
//        if(s.charAt(pos) == s.charAt(pos+1)) {
//            maxCount = 2;
//            for(int i = 1; i<= length/2; i++) {
//            
//                if(pos-i < 0 || pos+1+i >= length) {
//                    break;
//                }
//                if(s.charAt(pos-i) == s.charAt(pos+1+i)) {
//                    maxCount +=2;
//                }else {
//                    break;
//                }
//            }
//        }
//        return maxCount; 
//        
//    }
//}