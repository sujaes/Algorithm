
import java.util.*;
class Q2455{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int arr[]= new int[4];
		int max=0;
		arr[0]=0;
		for(int i =1;i<=3;i++){
			arr[i]= arr[i-1] - sc.nextInt()+ sc.nextInt();
			if(arr[i]>max){
				max= arr[i];
			}
		}
		System.out.println(max);
	}
}
