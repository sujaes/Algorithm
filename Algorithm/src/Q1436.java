import java.util.Scanner;
public class Q1436{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = 666;
		int k  = 666;
		while(n!=1) {
			
			if(check(k,temp)) {
				
				temp = k;
				
				n--;
			}
			k++;
		}
		System.out.println(temp);
	}
	public static boolean check(int k ,int temp) {

		if((Integer.toString(k).contains("666")) && k > temp){
			return true;
		}else {
			return false;
		}
	}
}

