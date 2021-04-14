import java.util.*;
public class Q11694 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int input[] = new int[N];
		boolean flag = false; // 돌이 1개인 더미만 존재하는가?
		int num = 0; // 돌이 1개인 더미의 개수

		for (int i = 0; i < N; i++) {
			input[i] = sc.nextInt();

			if (input[i] != 1) {
				flag = true;
			} else {
				num++;	//돌이1개인 더미의수 증가
			}
		}

		// 돌이 1개인 더미만 존재하는 경우
		// 돌 더미가 짝수면 선공이 승리하고, 홀수면 후공이 승리한다.
		if (!flag) {
			if(num % 2 == 1) {
				System.out.println("cubelover");
			}else {
				System.out.println("koosaga");
			}
			return;
		}
		
		long result = 0; // 님 합
		for (int i = 0; i < N; i++) {
			result ^= input[i];	
		}
		if (num != 0) { // 돌이 1개인 더미가 존재하는 경우  
			if (num % 2 == 1 && result != 0) {      //님의 합이 0이면 후공이 이김 ( 돌이 한개밖에없는 더미를 홀수개로 만들어준다. 이외에는 님의 합을 0으로 만들어주면 된다.)
				System.out.println("koosaga");
			} else if (num % 2 == 1 && result == 0) {
				System.out.println("cubelover");
			} else if (num % 2 == 0) {
				// 돌이 1개인 더미가 짝수인 경우
				// 돌이 1개가 아닌 임의의 더미를 돌이 1개인 더미로
				// 만들어주어야 한다.

				for (int i = 0; i < N; i++) {
					if (input[i] != 1) {
						input[i] = 1;
						break;
					}
				}
				result = 0; // 님 합
				for (int i = 0; i < N; i++) {
					result ^= input[i];
				}

				if(result != 0) {						
					System.out.println("koosaga");
					
				}else {
					System.out.println("cubelover");
				}
			}
		} else { // 돌이 1개인 더미가 없는 경우
			if(result != 0) {
				System.out.println("koosaga");
				
			}else {
				System.out.println("cubelover");
			}
		}
	}

}