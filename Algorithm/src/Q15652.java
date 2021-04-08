import java.util.*;
public class Q15652 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[] = new int[m];
		comb(n,m,arr,0,1);
	}
	public static void comb(int n,int r,int arr[],int index,int target) {
		if(r== 0) {
			for(int i = 0 ; i < arr.length ; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			return;
		}
		if(target == n+1) {
			return;
		}
		arr[index] = target;
		comb(n,r-1,arr,index+1,target);
		comb(n,r,arr,index,target+1);
	}
}
