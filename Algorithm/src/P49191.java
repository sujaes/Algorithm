//import java.util.*;
//class Solution {
//     int INF=987654321;//�湮�Ұ��� ����
//     public int solution(int n, int[][] results) {
//         int answer = 0;
//         int[][] scores=new int[n+1][n+1];
//         int win, lose;
//         //�迭 �ʱ�ȭ
//         for(int[] score:scores){
//             Arrays.fill(score, INF);
//         }
//         //�밢���� 0
//         for(int i=0;i<scores.length;i++){
//             for(int j=0;j<scores.length;j++){
//                 if(i==j) scores[i][j]=0;
//             }
//         }
//         //�ѹ��� �׷��� win->lose
//         for(int[] result:results){
//             win=result[0];
//             lose=result[1];
//             scores[win][lose]=1;
//         }
//         //scores[i][j]�� ���� �ִܰ�� ����
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
//         //�������� ������ �� ���� �ִ��� Ȯ��
//         boolean[] flag=new boolean[n+1];
//         Arrays.fill(flag, true);
//         for(int i=1;i<=n;i++){//��� i ����
//             for(int j=1;j<=n;j++){//������ j������� �������� �ִ��� üũ
//                 if(i==j) continue;//���ڽŰ� ������ ���ϹǷ� �н�
//                 if(scores[i][j]==INF&&scores[j][i]==INF){//��ΰ� �������� ������(i�� j�� �������� �ʾҴٸ�)
//                     flag[i]=false;
//                     break;//��ο� ������ �ؾ��ϹǷ�
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