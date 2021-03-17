//import java.util.*;
//class Solution {
//	public int solution(int[][] jobs) {
//		int answer = 0;
//		int end = 0; //수행끝 시간
//		int jobsIdx = 0; // 요청배열의 인덱스
//		int count = 0; // 수행된 요청수
//
//		//오름차순 정렬 (요청시간 오름차순)
//		Arrays.sort(jobs,new Comparator<int[]>(){
//            public int compare(int a[] ,int b[]){
//                return a[0] - b[0];
//            }
//        });
//
//		// 처리 시간 오름차순으로 정렬되는 우선순위 큐(Heap)
//		PriorityQueue<int[]> pq = new PriorityQueue<>(
//            new Comparator<int[]>(){
//                public int compare(int a[] ,int b[]){
//                    return a[1] - b[1];
//                }
//        });
//
//		// 요청이 모두 수행될 때까지 반복
//		while (count < jobs.length) {
//
//			// 하나의 작업이 완료되는 시점까지 들어온 모든 요청을 큐에 넣음
//			while (jobsIdx < jobs.length && jobs[jobsIdx][0] <= end) {
//                System.out.println("완료전까지 큐에 삽입하기 "+jobs[jobsIdx][0] + " "+jobs[jobsIdx][1] );
//				pq.add(jobs[jobsIdx++]);
//			}
//
//			// 큐가 비어있다면 작업 완료 이후에 다시 요청이 들어온다는 의미
//			if (pq.isEmpty()) {
//				end = jobs[jobsIdx][0];
//                System.out.println("큐가 비어있음 end = " + end);
//
//			// 작업이 끝나기 전 들어온 요청 중 가장 수행시간이 짧은 요청부터 수행
//			} else {
//				int[] temp = pq.poll();
//                System.out.println(temp[0] + " " + temp[1] + "부터 수행");
//                System.out.println("이전 end = " + end);
//				answer += temp[1] - temp[0] + end;
//				end += temp[1];
//                System.out.println("이후 end = " + end);
//				count++;
//			}
//		
//        }
//		return (int) Math.floor(answer / jobs.length);
//	}
//}