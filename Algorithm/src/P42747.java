//class Solution {
//    public int solution(int[] citations) {        
//        int max = 0;
//        for(int i = 0 ; i  < citations.length; i++){
//            int cnt = 0;
//            for(int j = 0 ; j < citations.length ;j++){
//                if(citations[j] >= i+1){
//                    cnt++;
//                }
//                if(cnt > i+1){
//                    cnt = i+1;
//                }
//            }
//            if(cnt >= i+1){
//                if(max < cnt ){
//                    max = cnt;
//                }
//            }
//        }
//        return max;
//    }
//}