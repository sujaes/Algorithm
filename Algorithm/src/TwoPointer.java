/*
 * Date 2021.03.11
 * author 장수제
 * 투포인터 코드정리
 */
import java.util.*;

public class TwoPointer{
	static int n,m;
	static int answer ;
	static int arr[];
	static int sum;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = 0;
		int e = 0;
		sum = 0;
		n = sc.nextInt();
		m = sc.nextInt();
		//나중에 값이 변했는지 확인하는 용도로 n+1
		answer = n+1;
		//n으로 하면 범위가 인덱스 범위가 초과되어서 n+1
		arr = new int[n+1];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		while( e <= n && s <= n) {	//모두 양끝까지 갔을때
			if(sum >= m && answer > e-s) { //sum이 m보다 크거나 같고 차이가 기존 차이보다 작을때 (계속 반복하면서 answer을 줄여감)
				answer = e-s;
			}	//합이 더 작으면 오른쪽을 늘려가고
			if(sum < m ) {
				sum += arr[e];
				e++;
			}else { //합이 더 크면 왼쪽수를 뺀다
				sum -= arr[s];
				s++;
			}
		}
//		System.out.println( "s = " + s + " e = "+ e + " sum = " + sum);

		if(answer == n+1) {	//기존에 값과 같으면 차이를 만족한게 없기때문에 불가능
			System.out.println(0);
		}else {
			System.out.println(answer);
		}
	}
}