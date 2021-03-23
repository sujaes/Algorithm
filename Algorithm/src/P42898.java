//class Solution {
//    public int solution(int m, int n, int[][] puddles) {
//        int answer = getFact(m-1,n-1);
//        for(int i =0 ; i < puddles.length; i++){
//            int x = puddles[i][0];
//            int y = puddles[i][1];
//            answer = answer - (getFact(x-1,y-1) * getFact(m-x,n-y));
//        }
//        return answer;
//    }
//    public int getFact(int x,int y){
//        int max = Math.max(x,y);
//        int min = Math.min(x,y);
//        int temp = 1;
//        for(int i = x+y ; i > max ; i--){
//            temp = temp*i;
//        }
//        for(int i = 1; i<= y ; i++){
//            temp = temp/i;
//        }
//        return temp;
//    }
//}
//
////m =4 , n=3 , [2,2]
//
//// (m+n -2 )! / (m-1)! * (n-1)! - {( x-1+ y-1 )! / (x-1)! * (y-1)!  * (m-x+n-y)!/ (m-x)! * (n-y)! }
//
////   5! / 2!*3! -  2! * 3!/2! 
//    


//import java.util.*;
//
//class Solution {
//    public int solution(int m, int n, int[][] puddles) {
//        int answer = 0;
//        
//        int[][] dp = new int[n+1][m+1];
//        
//        for(int i=0; i<puddles.length; i++) {
//            dp[puddles[i][1]][puddles[i][0]] = -1;	//웅덩이표시
//        }
//        
//        dp[1][1] = 1;		//첫방문
//        
//        for(int i=1; i<=n; i++) {
//            for(int j=1; j<=m; j++) {
//                if(dp[i][j] == -1) {		//웅덩이면 넘어가기
//                    continue;
//                }
//                if(dp[i][j-1] >= 0 && dp[i][j] >= 0) {	//이전 경로가 웅덩이가 아니고 현재가 길이면
//                    dp[i][j] += dp[i][j-1] %1000000007 ;
//                }
//                if(dp[i-1][j] >= 0 && dp[i][j] >= 0) {	//이전 경로가 웅덩이가 아니고 현재가 길이면
//                    dp[i][j] += dp[i-1][j] % 1000000007;
//                }
//            }
//        }
//
//        answer = dp[n][m]%1000000007;
//        
//        return answer;
//    }
//}

