
class P42895 {
	int answer;
	public int solution(int N, int number) {
		answer = 9;
		dfs(0, 0, N, number);
		if(answer > 8) {
			return -1;
		}else {
			return answer;
		}
	}
	private void dfs(int cnt, int number, int N, int target) {
		if (cnt > 8) {
			return;
		}
		if (number == target) {
			answer = Math.min(answer, cnt);
			return;
		}
		for (int i = 1; i <= 8 - cnt; i++) {
			dfs(cnt + i, number + getNum(i, N), N, target);
			dfs(cnt + i, number - getNum(i, N), N, target);
			dfs(cnt + i, number / getNum(i, N), N, target);
			dfs(cnt + i, number * getNum(i, N), N, target);
		}
	}

	private int getNum(int digit, int N) {
		int result = 0;
		for (int i = 0; i < digit; i++) {
			result += Math.pow(10, i) * N;
		}
		return result;
	}
}
