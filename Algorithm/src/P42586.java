import java.util.LinkedList;

class Solution {

	public int[] solution(int[] progresses, int[] speeds) {

		double[] days = new double[progresses.length];

		double max = 0;
		LinkedList<int[]> result = new LinkedList<>();
		for (int i = 0; i < progresses.length; i++) {

			// 끝낼 수 있는 일자
			days[i] = Math.ceil((float)(100 - progresses[i]) / speeds[i]);

			// max보다 큰 값이 나올 경우 새로운 세트로 시작
			if (days[i] > max) {
				max = days[i];
				result.add(new int[] { 1 });

			// max보다 작은 값일 경우 max값이 시작된 count와 한 세트
			} else {
				result.getLast()[0]++;
			}
		}

		// 일반 배열로 복사 후 리턴
		int size = result.size();
		int[] answer = new int[size];
		for (int i = 0; i < size; i++) {
			answer[i] = result.pollFirst()[0];
		}

		return answer;
	}
}