//import java.util.*;
//class Solution {
//     int INF=987654321;//방문불가를 뜻함
//     public int solution(int n, int[][] results) {
//         int answer = 0;
//         int[][] scores=new int[n+1][n+1];
//         int win, lose;
//         //배열 초기화
//         for(int[] score:scores){
//             Arrays.fill(score, INF);
//         }
//         //대각선을 0
//         for(int i=0;i<scores.length;i++){
//             for(int j=0;j<scores.length;j++){
//                 if(i==j) scores[i][j]=0;
//             }
//         }
//         //한방향 그래프 win->lose
//         for(int[] result:results){
//             win=result[0];
//             lose=result[1];
//             scores[win][lose]=1;
//         }
//         //scores[i][j]로 가는 최단경로 저장
//         for(int k=1;k<=n;k++){
//             for(int i=1;i<=n;i++){
//                 for(int j=1;j<=n;j++){
//                     if(scores[i][j]>scores[i][k]+scores[k][j]){
//                         scores[i][j]=scores[i][k]+scores[k][j];
//                     }
//                 }
//             }
//         }
//         // for(int i = 1 ; i < scores.length;i++){
//         //     for(int j = 1; j< scores[0].length ;j++){
//         //         System.out.printf("%10d" ,scores[i][j]);
//         //     }System.out.println("");
//         // }
//         //선수들이 게임을 한 적이 있는지 확인
//         boolean[] flag=new boolean[n+1];
//         Arrays.fill(flag, true);
//         for(int i=1;i<=n;i++){//사람 i 기준
//             for(int j=1;j<=n;j++){//나머지 j선수들과 게임한적 있는지 체크
//                 if(i==j) continue;//나자신과 게임을 뜻하므로 패스
//                 if(scores[i][j]==INF&&scores[j][i]==INF){//경로가 존재하지 않으면(i와 j가 게임하지 않았다면)
//                     flag[i]=false;
//                     break;//모두와 게임을 해야하므로
//                 }
//             }
//         }
//         // System.out.println(Arrays.toString(flag));
//         for(int i=1;i<flag.length;i++){
//             if(flag[i]) answer++;
//         }
//         return answer;
//     }
// }