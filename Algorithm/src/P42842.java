//
//import java.util.*;
//
//class Solution {
//    public int[] solution(int brown, int yellow) {
//        int[] answer = new int[2];
//        int sum = (brown + 4) / 2; // 가로와 세로의 합.
//        int m = 3; // 세로
//        int n = sum - m; // 가로
//        
//        while(n >= 3 && n >= m) {
//            // (가로 - 2) * (세로 - 2)는 노란색 칸의 개수와 같음.
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
