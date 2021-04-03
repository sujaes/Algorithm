//class Solution {
//    public int solution(int sticker[]) {
//        int size = sticker.length;
//    
//        if(size <= 3){
//            int max = 0;
//            for(int i = 0; i <size; i++){
//                max = Math.max(max,sticker[i]);
//            }
//            return max;
//        }
//            
//        int[] dp1 = new int[size];
//        int[] dp2 = new int[size];
//        
//        dp1[0] = dp1[1] = sticker[0];
//        dp2[0] = 0; dp2[1] = sticker[1];
//        
//        for(int i=2; i<size-1; i++){
//            dp1[i] = Math.max(dp1[i-2]+sticker[i], dp1[i-1]);
//            dp2[i] = Math.max(dp2[i-2]+sticker[i], dp2[i-1]);
//        }
//
//        int i = size-1;
//        dp1[i] = Math.max(dp1[i-1], dp1[i-2]);
//        dp2[i] = Math.max(dp2[i-2]+sticker[i], dp2[i-1]);
//        
//        return Math.max(dp1[i], dp2[i]);
//    }
//}