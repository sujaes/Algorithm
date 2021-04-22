import java.util.*;
public class Q13458 {
	static int n,b,c;
	static int arr[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long answer = 0;
		n = sc.nextInt();
		arr= new int[n];
		for(int i = 0 ; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		b = sc.nextInt();
		c = sc.nextInt();
		
		for(int i = 0 ; i < n; i++) {
			arr[i] -= b;
            answer++;
            if(arr[i]<=0) {
            	continue;
            }
			if(arr[i]%c ==0) {
				answer += arr[i]/c;
			}else {
				answer += arr[i]/c+1;
			}
		}
		System.out.println(answer);
		
	}

}
