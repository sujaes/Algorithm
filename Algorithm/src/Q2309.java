
import java.util.Scanner;
import java.util.Arrays;
class Q2309{
	static int arr[];
	static int temp[];
	static int ans[];
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		arr = new int[9];
		temp = new int[7];
		ans = new int[7];
		for(int i = 0 ; i < 9;i++){
			arr[i] = sc.nextInt();
		}
		int loc = 0;
		com(loc,7);
	}
	public static void com(int loc,int r){
		if(r==0){
			int sum=0;
			for(int i = 0 ; i < temp.length;i++){
				sum+=arr[temp[i]];
				ans[i]=arr[temp[i]];
			}
			if(sum==100){
				Arrays.sort(ans);
				for(int i=0; i<temp.length;i++){
					System.out.println(ans[i]);
				}
			}
			return;
		}
		for(int i = loc ; i < arr.length;i++){
			temp[temp.length-r] = i;
			com(i+1,r-1);
		}
	}
}