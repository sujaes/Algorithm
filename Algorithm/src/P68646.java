//class Solution {
//    public static int solution(int[] a) {
//        int answer = 0;
//
//        int l = 1000000000, r = 1000000000;
//
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] < l) {
//                answer++;
//                l = a[i];
//            }
//
//            if (a[a.length - 1 - i] < r) {
//                answer++;
//                r = a[a.length - 1 - i];
//            }
//
//            if (l == r)
//                break;
//        }
//        if( l == r){
//            return answer -1;
//        }else{
//            return answer;
//        }
//    }
//}