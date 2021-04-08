
//10820번 문제 런타임오류
//import java.util.*;
//class Main{
//	public static void main(String[] args){
//		Scanner sc=new Scanner(System.in);
//		int stopper=0;
//		int num[] = new int[4];
//		while(stopper==0){
//			String s = sc.nextLine();
//			if(s.equals("")){
//				stopper=1;
//				break;
//			}
//			for(int i = 0 ; i <4;i++){
//				num[i]=0;
//			}
//			for( int i =0 ; i<s.length();i++){
//				if('a'<=s.charAt(i)&&s.charAt(i)<='z'){
//					num[0]++;
//				}else if('A'<=s.charAt(i)&&s.charAt(i)<='Z'){
//					num[1]++;
//				}else if('0'<=s.charAt(i)&&s.charAt(i)<='9'){
//					num[2]++;
//				}else if(s.charAt(i)==' '){
//					num[3]++;
//				}
//			}
//			for(int i = 0 ;i<4;i++){
//				System.out.print(num[i]+" ");
//			}
//			System.out.println();
//		}
//	}		
//}

//10820번 문제
import java.util.*;
class Q10820{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int num[] = new int[4];
		while(sc.hasNextLine()){
			String s = sc.nextLine();
			for(int i = 0 ; i <4;i++){
				num[i]=0;
			}
			for( int i =0 ; i<s.length();i++){
				if('a'<=s.charAt(i)&&s.charAt(i)<='z'){
					num[0]++;
				}else if('A'<=s.charAt(i)&&s.charAt(i)<='Z'){
					num[1]++;
				}else if('0'<=s.charAt(i)&&s.charAt(i)<='9'){
					num[2]++;
				}else if(s.charAt(i)==' '){
					num[3]++;
				}
			}
			for(int i = 0 ;i<4;i++){
				System.out.print(num[i]+" ");
			}
			System.out.println();
		}
	}		
}