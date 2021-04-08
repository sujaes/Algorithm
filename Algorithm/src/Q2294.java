
import java.util.Scanner;
class Q2294{
	static int n,k;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		//동전 종류 넣기
		int arr[] = new int [n+1];
		//d[i] = i를 만들기까지 최소동전갯수
		int d[] = new int [100001];
		for(int i = 1 ; i <=n;i++){
			arr[i]=sc.nextInt();
		}
		for(int i = 1 ; i <=k ; i++){
			d[i] = 100001;
		}
		//0원은 0개니깐
		d[0] = 0;
		
		for(int i = 1; i <=n;i++){
			for(int j=arr[i];j<=k;j++){
				d[j] = Math.min(d[j],d[j-arr[i]]+1);
			}
		}
		if(d[k]==100001){
			d[k] = -1;
		}
		System.out.println(d[k]);
	}
}