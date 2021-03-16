//import java.util.*;
//
//class Solution {
//    public int solution(int[][] routes) {
//        // 끝나는 시간 순 대로 오름차순 정렬
//		Arrays.sort(routes, new Comparator<int[]>() {
//		    public int compare(int[] o1, int[] o2) {
//		        return o1[1] - o2[1];
//		    }
//	    });
//        int cnt = 0;
//		int min = Integer.MIN_VALUE;
//		for(int[] route : routes) {
//			if(min <  route[0] ) {
//				// 전 거의 끝나는 시간 보다 시작 시간이 큰 경우
//				// 안 겹치니까 변경하고, 숫자 더하기
//				min = route[1];
//				cnt++;
//			}
//		}
//        return cnt;
//    }
//}