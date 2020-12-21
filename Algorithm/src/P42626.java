//정답이지만 시간초과 ( for 문안에 정렬에서 시간 )

//import java.util.*;
//class Solution {
//    public int solution(int[] scoville, int K) {
//        int count = 0;
//        int leng = scoville.length;
//        Arrays.sort(scoville);
//        
//        for(int i = 0 ; i < leng -1 ; i++){
//            if(scoville[count] > K){
//                break;
//            }else{
//                int temp0 = scoville[count];
//                scoville[count] = -1;
//                int temp1 = scoville[count+1];
//                scoville[count+1] = temp0 + (temp1 *2);
//                Arrays.sort(scoville);
//                count++;
//            }
//            Arrays.sort(scoville);
//        }
//        if(scoville[leng-1] < K){
//            return -1;
//        }else{
//            return count;            
//        }    
//
//    }
//}

//import java.util.*;
//
//class Solution {
//    public int solution(int[] scoville, int K) {
//        int answer = 0;
//        PriorityQueue<Integer> heap = new PriorityQueue();
//
//        for (int temp : scoville) {
//            heap.offer(temp);
//        }
//
//        while (heap.peek() <= K) {
//            if (heap.size() == 1) {
//                return -1;
//            }
//            int a = heap.poll();
//            int b = heap.poll();
//
//
//            int result = a + (b * 2);
//
//            heap.offer(result);
//            answer ++;
//        }
//        return answer;
//    }
//}