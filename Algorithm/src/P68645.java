//class Solution {
//    public int[] solution(int n) {
//        int[] answer = new int[(n* (n+1))/2];
//        // n��   �������� / n-1�� �����ΰ��� / n-2�� �ö󰡱�
//        // n-3�� �������� / n-4�� �����ΰ��� / n-5�� �ö󰡱�...
//        // n-n���� �ɶ�����
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