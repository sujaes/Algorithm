import java.util.*;
public class Q5052 {
	static String arr[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tcase =sc.nextInt();
		while(tcase-- > 0) {
			int n = sc.nextInt();
			arr = new String[n];
			boolean flag = true;
			for(int i= 0 ; i < n; i++) {
				arr[i] = sc.next();
			}
			Arrays.sort(arr);
			
			
			for(int i=0; i<arr.length-1; i++ ){
	            if(arr[i+1].startsWith(arr[i])){
	                System.out.println("NO");
	                flag = false;
	                break;
	            }
	        }
			if(flag) {
				System.out.println("YES");
			}
		}
	}	
}
