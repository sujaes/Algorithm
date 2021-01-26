import java.util.Scanner;

public class Q11055{	//범위 1000까지 n^3까지 가능
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int max=0;
		int arr[]= new int[n+1];
		int sum[]= new int[n+1];

		for(int i =1;i<=n;i++){
			arr[i]=sc.nextInt();
		}
		
		for(int i=1;i<=n;i++){
			sum[i]=arr[i];	
			for(int j =1; j<i;j++){			
				if(arr[j]<arr[i] && sum[i]<sum[j] + arr[i]){
					sum[i]=sum[j]+arr[i];
				}
			}
		}
		
		for(int i = 1; i<=n;i++){
			if(sum[i]>max){
				max = sum[i];
			}
		}
		
		System.out.println(max);
	}
}
