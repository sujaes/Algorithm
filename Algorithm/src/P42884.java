//import java.util.*;
//
//class Solution {
//    public int solution(int[][] routes) {
//        // ������ �ð� �� ��� �������� ����
//		Arrays.sort(routes, new Comparator<int[]>() {
//		    public int compare(int[] o1, int[] o2) {
//		        return o1[1] - o2[1];
//		    }
//	    });
//        int cnt = 0;
//		int min = Integer.MIN_VALUE;
//		for(int[] route : routes) {
//			if(min <  route[0] ) {
//				// �� ���� ������ �ð� ���� ���� �ð��� ū ���
//				// �� ��ġ�ϱ� �����ϰ�, ���� ���ϱ�
//				min = route[1];
//				cnt++;
//			}
//		}
//        return cnt;
//    }
//}