import java.util.LinkedList;

class Solution {

	public int[] solution(int[] progresses, int[] speeds) {

		double[] days = new double[progresses.length];

		double max = 0;
		LinkedList<int[]> result = new LinkedList<>();
		for (int i = 0; i < progresses.length; i++) {

			// ���� �� �ִ� ����
			days[i] = Math.ceil((float)(100 - progresses[i]) / speeds[i]);

			// max���� ū ���� ���� ��� ���ο� ��Ʈ�� ����
			if (days[i] > max) {
				max = days[i];
				result.add(new int[] { 1 });

			// max���� ���� ���� ��� max���� ���۵� count�� �� ��Ʈ
			} else {
				result.getLast()[0]++;
			}
		}

		// �Ϲ� �迭�� ���� �� ����
		int size = result.size();
		int[] answer = new int[size];
		for (int i = 0; i < size; i++) {
			answer[i] = result.pollFirst()[0];
		}

		return answer;
	}
}