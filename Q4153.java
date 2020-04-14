import java.util.Scanner;
public class Q4153{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[3];
		int temp[] = new int[3];
		int sum = 0; 
		int max=Integer.MIN_VALUE;
		boolean flag = true;
		
		while(flag){
		
			for(int i = 0 ; i < 3; i++){
				arr[i] = sc.nextInt();
				temp[i] = arr[i] * arr[i];
				if(temp[i] > max){
					max = temp[i];
				}
			}
			if(arr[0]==0 &&arr[1]==0 && arr[2]==0){
				break;
			}
			
			for(int i = 0 ; i <3; i++){
				if(max == temp[i]){
					continue;
				}else{
					sum += temp[i];
				}
			}
			if(sum == max){
				System.out.println("right");
			}else{
				System.out.println("wrong");
			}
			sum = 0;
			max = Integer.MIN_VALUE;
		}
		
	}
}
