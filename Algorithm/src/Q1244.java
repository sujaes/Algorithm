import java.util.Scanner;

public class Q1244 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		int stu = sc.nextInt();
		for(int i = 0 ; i <stu ; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a == 1) {	//남자
				for(int j = b; j <= n; j = j+b) {
					arr[j-1] = (arr[j-1] +1)%2;
				}
			}else {			//여자
				arr[b-1] = (arr[b-1] +1)%2;	//해당숫자
				int left = b;
				int right = b;
				while(true) {
					if(left-1 >0 && right+1 <=n) {
						if(arr[left--] == arr[right++]) {
							arr[left-1] = (arr[left-1] +1)%2;
							arr[right-1] = (arr[right-1] +1)%2;
						}else {
							break;
						}
					}else {
						break;
					}
				}
			}
		}	
		
		for(int i = 0 ; i < n ; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
