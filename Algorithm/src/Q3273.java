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
		Arrays.sort(arr);				//������������
		int s = 0;
		int e = n-1;
		
		while(s <=e) {
			if(arr[s] + arr[e] == x) {	//������ �߰�
				count++;
				s++;					//s����
			}else if(arr[s] + arr[e] > x ) { //ũ�� e�� ����
				e--;
			}else if(arr[s] + arr[e] < x) {	//������ s�� ����
				s++;
			}
		}
		
		System.out.println(count);
	}
}