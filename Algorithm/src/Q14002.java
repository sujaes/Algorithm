import java.util.Scanner;

public class Q14002{	//범위 1000까지 n^3까지 가능
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int max=0;
		int arr[]= new int[n+1];
		int d[]= new int[n+1];
		int num = 1;
		String answer[] = new String[n+1];

		for(int i =1;i<=n;i++){
			arr[i]=sc.nextInt();
			answer[i] = arr[i]+" ";
		
		}
		
		for(int i=1;i<=n;i++){
			d[i]=1;	//자기보다 큰게 없을때 수열길이는 1
			for(int j =1; j<i;j++){			// i=3, j=1,2
				if(arr[j]<arr[i] && d[i]<d[j]+1){
					d[i]=d[j]+1;
					answer[i] = answer[j] + arr[i]+" ";
				}
			}
		}
		
		for(int i = 1; i<=n;i++){
			if(d[i]>max){
				max = d[i];
				num = i;
			}
		}
		
		System.out.println(max);
		System.out.println(answer[num]);
	}
}
