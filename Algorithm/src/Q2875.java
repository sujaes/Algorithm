import java.util.Scanner;
public class Q2875{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //여자
		int m = sc.nextInt(); //남자
		int k = sc.nextInt(); //빼야하는 인원

		while(k!=0) {
			//여자가 더많을때
			if(n > m*2) {
				n--;
			}else if(n< m*2){//남자가 더많을때
				m--;
			}else {//남자여자 비율 같을때
				n--;
			}
			k--;
		}
		
		if(n >= m*2) {
			System.out.println(m);
		}else {
			System.out.println(n/2);
		}
		
		
    }    
}
