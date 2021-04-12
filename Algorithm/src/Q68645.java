//class Solution {
//    public int[] solution(int n) {
//        int[] answer = new int[(n* (n+1))/2];
//        // n번   내려가기 / n-1번 옆으로가기 / n-2번 올라가기
//        // n-3번 내려가기 / n-4번 옆으로가기 / n-5번 올라가기...
//        // n-n번이 될때까지
//        int val = 1; int idx = 0; int cnt = 0;
//        int stg = 0; // 0 Down 1 Side 2 Up
//        int stg_n = n;
//        
//        while(n>0){
//            // Down
//            if(stg == 0){
//                idx = idx + cnt;
//                answer[idx] = val++;
//                cnt++;
//                stg_n--;
//                // Down -> Side
//                if(stg_n == 0){
//                    stg = 1; // Side
//                    stg_n = --n;
//                }
//            }
//            // Side
//            else if(stg == 1){
//                answer[++idx] = val++;
//                stg_n--;
//                // Side -> Up
//                if(stg_n == 0){
//                    stg = 2; // Up
//                    stg_n = --n;
//                }
//            }
//            // Up
//            else{
//                idx = idx - cnt;
//                answer[idx] = val++;
//                cnt--;
//                stg_n--;
//                // Up -> Down
//                if(stg_n == 0){
//                    stg = 0; // Down
//                    stg_n = --n;
//                }
//            }
//        }
//        return answer;
//    }
//}