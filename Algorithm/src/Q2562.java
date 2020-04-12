import java.util.Scanner;
public class Q2562{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[9];
		int max = 0;
		int index = 0;
		for(int i = 0 ; i < 9; i++) {
			int n = sc.nextInt();
			arr[i] = n;
			if(arr[i] > max) {
				max = arr[i];
				index = i;
			}
		}
		System.out.println(max +"\n" + (index+1));
    }    
}