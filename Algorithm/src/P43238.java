//import java.util.*;
//
// class Solution {
//     public long solution(int n, int[] times) {
//         Arrays.sort(times);
//         long min=1;//������ ��� 1�ʷ� �ʱ�ȭ
//         long max=(long)times[times.length-1]*n;//�־��� ���� �ʱ�ȭ
//         long mid=0;
//         long sum;
//         long answer = max;
//         while(min<=max){
//             sum=0;
//             mid=(min+max)/2;
//             for(int time:times){
//                 sum+=mid/time;//�ɻ�� �� ���� �� �ִ� �Ա��� ��
//             }
//             if(sum>=n){//�� ���� �� �����Ƿ� �ð� ����
//                 if(mid<answer){
//                     answer=mid;
//                 }
//                 max=mid-1;                
//             }
//             else{//�Ұ��ϹǷ� �ð� �ø�
//                 min=mid+1;
//             }
//         }
//         return answer;
//     }
// }