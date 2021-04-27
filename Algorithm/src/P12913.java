//import java.util.*;
//class Solution {
//    int solution(int[][] land) {
//        int c = land.length;
//        int dp[][] = new int[c][4];
//        
//        for(int i = 0 ; i < 4; i++){
//            dp[0][i] = land[0][i];   
//        }
//            
//        for(int i = 1; i < c; i++){                             //Çà
//            for(int j =0  ;j <4 ; j++){                         //¿­1
//                int max = 0;
//                for(int k = 0 ; k < 4; k++){                    //¿­2
//                    if(j==k){
//                        continue;
//                    }
//                    max = Math.max(max,dp[i-1][k]);
//                    dp[i][j] = max + land[i][j];                    
//                }
//            }
//        }
//        int answer = 0;
//        for(int i = 0 ; i <4 ;i++){
//            answer = Math.max(answer,dp[c-1][i]);
//        }
//        return answer;
//    }
//}