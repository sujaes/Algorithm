import java.util.Arrays;
import java.util.Scanner;

public class Q3273 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int count = 0;
		for(int i = 0 ; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int x = sc.nextInt();
		Arrays.sort(arr);				//오름차순정렬
		int s = 0;
		int e = n-1;
		
		while(s <=e) {
			if(arr[s] + arr[e] == x) {	//같으면 추가
				count++;
				s++;					//s증가
			}else if(arr[s] + arr[e] > x ) { //크면 e를 감소
				e--;
			}else if(arr[s] + arr[e] < x) {	//작으면 s를 증가
				s++;
			}
		}
		
		System.out.println(count);
	}
}