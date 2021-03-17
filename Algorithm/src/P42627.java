//import java.util.*;
//class Solution {
//	public int solution(int[][] jobs) {
//		int answer = 0;
//		int end = 0; //���ೡ �ð�
//		int jobsIdx = 0; // ��û�迭�� �ε���
//		int count = 0; // ����� ��û��
//
//		//�������� ���� (��û�ð� ��������)
//		Arrays.sort(jobs,new Comparator<int[]>(){
//            public int compare(int a[] ,int b[]){
//                return a[0] - b[0];
//            }
//        });
//
//		// ó�� �ð� ������������ ���ĵǴ� �켱���� ť(Heap)
//		PriorityQueue<int[]> pq = new PriorityQueue<>(
//            new Comparator<int[]>(){
//                public int compare(int a[] ,int b[]){
//                    return a[1] - b[1];
//                }
//        });
//
//		// ��û�� ��� ����� ������ �ݺ�
//		while (count < jobs.length) {
//
//			// �ϳ��� �۾��� �Ϸ�Ǵ� ����(end)���� ���� ��� ��û�� ť�� ����
//			while (jobsIdx < jobs.length && jobs[jobsIdx][0] <= end) {
//				pq.add(jobs[jobsIdx++]);
//			}
//
//			// ť�� ����ִٸ� �۾� �Ϸ�(end) ���Ŀ� �ٽ� ��û�� ���´ٴ� �ǹ�
//			// (end�� ��û�� ���� ó������ ������)
//			if (pq.isEmpty()) {
//				end = jobs[jobsIdx][0];
//
//			// �۾��� ������ ��(end ����) ���� ��û �� ���� ����ð��� ª�� ��û���� ����
//			} else {
//				int[] temp = pq.poll();
//				answer += temp[1] + end - temp[0];
//				end += temp[1];
//				count++;
//			}
//		}
//
//		return (int) Math.floor(answer / jobs.length);
//	}
//}