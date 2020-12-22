import java.util.Arrays;
import java.util.Scanner;
public class Q10610{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String num =sc.next();
		int leng = num.length();
		char numToArray[] = num.toCharArray();
		int sum = 0 ;
		String temp = "";
		Arrays.sort(numToArray);
		
		if(numToArray[0] != '0') {
			System.out.println(-1);
			return;
		}
		
		for(int i = 0 ; i < leng; i++) {
			sum += Integer.parseInt(numToArray[i]+"");
		}
		
		if(sum%3 ==0) {
			for(int i = leng-1 ; i >=0 ; i--) {
				temp += numToArray[i];
			}
			System.out.println(temp);
		}else {
			System.out.println(-1);
			return;
		}		
		
    }    
}
