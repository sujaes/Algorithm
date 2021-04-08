
import java.util.Scanner;
class Q1182{
	static int n,m,cnt ; 
	static int arr[];
	static int temp[];
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int [n];
		cnt = 0;
		for(int i = 0 ; i <n;i++){
			arr[i]=sc.nextInt();
		}

		for(int i = 1 ; i <=n ;i++){
			int loc = 0;
			temp = new int[i];
			com(loc,i);
		}
		System.out.println(cnt);
	}
	public static void com(int loc,int r){
		if(r==0){
			int sum=0;
			for(int i =0;i<temp.length ;i++){
//				System.out.print(arr[temp[i]]+" ");
				sum += arr[temp[i]];

			}
//			System.out.println(" гую╨ = "+sum);
			if(temp.length!=0 && sum==m){
				cnt++;
			}
			return;
		}
		for(int i =loc; i< arr.length;i++){
			temp[temp.length-r]=i;
			com(i+1,r-1);
		}
	}
}