//import java.util.*;
//class Solution {
//    public int[] solution(int[] lottos, int[] win_nums) {
//        int[] answer = new int[2];
//        int zero = 0;
//        int match = 0;
//        int score = 0;
//        Arrays.sort(lottos);
//        Arrays.sort(win_nums);
//        
//        for(int i = 0 ; i < lottos.length;i++){
//            if(lottos[i] == 0){
//                zero++;
//                continue;
//            }
//            for(int j = 0 ; j < win_nums.length;j++){
//                if(lottos[i] == win_nums[j]){
//                    match++;
//                    break;
//                }
//            }
//        }
//        switch(match){
//            case 6:
//                score = 1;
//                break;
//            case 5:
//                score = 2;
//                break;
//            case 4:
//                score = 3;
//                break;
//            case 3:
//                score = 4;
//                break;
//            case 2:
//                score = 5;
//                break;
//            default:
//                score = 6;
//                break;
//        }
//        answer[1] = score;
//        answer[0] = score-zero;
//        if(answer[0] == 0){
//            answer[0] = 1;
//        }
//        
//        
//        return answer;
//    }
//}