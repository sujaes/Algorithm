//class Solution {
//    public int jump(int[] nums) {
//        int answer = 0;
//        int now = 0;
//        int end = 0;
//
//        for (int i = 0; i < nums.length - 1; i++) {
//            end = Math.max(end, i + nums[i]);           //end값을정해줌.
//            if (i == now) {                             //i가 현재값이랑 같으면
//                answer++;                               //점프
//                now = end;                              //end값을 현재값으로 변경
//            }
//        }
//
//        return answer;
//    }
//}