//class Solution {
//    public int jump(int[] nums) {
//        int answer = 0;
//        int now = 0;
//        int end = 0;
//
//        for (int i = 0; i < nums.length - 1; i++) {
//            end = Math.max(end, i + nums[i]);           //end����������.
//            if (i == now) {                             //i�� ���簪�̶� ������
//                answer++;                               //����
//                now = end;                              //end���� ���簪���� ����
//            }
//        }
//
//        return answer;
//    }
//}