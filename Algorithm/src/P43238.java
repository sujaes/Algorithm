//import java.util.*;
//
// class Solution {
//     public long solution(int n, int[] times) {
//         Arrays.sort(times);
//         long min=1;//최적의 경우 1초로 초기화
//         long max=(long)times[times.length-1]*n;//최악의 경우로 초기화
//         long mid=0;
//         long sum;
//         long answer = max;
//         while(min<=max){
//             sum=0;
//             mid=(min+max)/2;
//             for(int time:times){
//                 sum+=mid/time;//심사관 당 맡을 수 있는 입국자 수
//             }
//             if(sum>=n){//더 맡을 수 있으므로 시간 줄임
//                 if(mid<answer){
//                     answer=mid;
//                 }
//                 max=mid-1;                
//             }
//             else{//불가하므로 시간 늘림
//                 min=mid+1;
//             }
//         }
//         return answer;
//     }
// }