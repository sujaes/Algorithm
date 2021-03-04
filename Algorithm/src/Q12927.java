//import java.util.PriorityQueue;
//import java.util.Collections;
//
//class Solution {
//    public long solution(int n, int[] works) {
//        PriorityQueue<Integer> overtime = new PriorityQueue<>(Collections.reverseOrder());
//        for(int i = 0 ; i < works.length; i++){
//            overtime.offer(works[i]);
//        }
//        
//        for (int i = 0; i < n; i++) {
//            int max = (int)overtime.poll();
//            if (max <= 0){
//                break;  
//            } 
//            overtime.offer(max - 1);
//        }
//        return sumPow(overtime);
//    }
//    public static long sumPow(PriorityQueue<Integer> works) {
//        long sum = 0;
//        while (!works.isEmpty()) {
//            sum += Math.pow(works.poll(), 2);
//        }
//        return sum;
//    }    
//}