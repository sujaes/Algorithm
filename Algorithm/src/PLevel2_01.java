//class Main{
//
//    public static void main(String[] args){
//    	Solution s = new Solution();
//    	s.solution(10);
//    	
//    	
//    }
//   
//}
//
//class Solution {
//    public int solution(int n) {
//        int answer = 0;
//        int fix = trans(n);
//        a: for(int i = n+1 ; i <= 1000000; i++){
//            if(fix == trans(i)){
//                answer = i;
//                break a;
//            }
//        }
//        
//        return answer;
//    }
//    
//    public int trans(int n){
//        String res = "";
//        int result = 0;
//        while(n!=0){
//            if(n%2 ==1){
//                result++;
//            }
//            res = res + n%2;
//            n = n/2;
//        }
//        return result;
//    }
//}