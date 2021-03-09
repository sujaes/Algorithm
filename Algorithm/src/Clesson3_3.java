//class Solution {
//    public int solution(int[] A) {
//    	int start =0;
//        int sum = 0;
//        int min = Integer.MAX_VALUE;
//
//        for(int part : A){
//            sum += part;
//        }
//
//        for(int i = 0; i < A.length-1; i++){
//            start += A[i];
//            sum -= A[i];
//            if(Math.abs(start - sum) < min) {
//                min =  Math.abs(start - sum);
//            }
//        }
//        return min;
//    }
//}
