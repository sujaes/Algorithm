//
//import java.util.*;
//
//class Solution {
//    public int[] solution(int brown, int yellow) {
//        int[] answer = new int[2];
//        int sum = (brown + 4) / 2; // ���ο� ������ ��.
//        int m = 3; // ����
//        int n = sum - m; // ����
//        
//        while(n >= 3 && n >= m) {
//            // (���� - 2) * (���� - 2)�� ����� ĭ�� ������ ����.
//            if((n - 2) * (m - 2) == yellow){
//                answer[0] = n;
//                answer[1] = m;
//                break;
//            }
//            n--;
//            m++;
//        }
//        
//        return answer;
//    }
//}
