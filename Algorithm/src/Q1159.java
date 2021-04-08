import java.util.Arrays;
import java.util.Scanner;

	public class Q1159 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int count=1;
			String s="";
			char c[] = new char[a];
			String first ;
			for(int i = 0 ; i < a;i++){
				first = sc.next();
				c[i]=first.charAt(0);
			}
			Arrays.sort(c);
			System.out.println(c);
			for(int i = 0 ; i <a-1;i++){
				if(c[i]==c[i+1]){
					count++;	
					System.out.println(c[i] +" " +count);

				}else{

					if(count>=5){
						s+=c[i];
					}
					count = 1;
				}
			}
			
			if(s.equals("")){
				System.out.println("PREDAJA");
			}else{
				System.out.println(s);

			}
		}
	}