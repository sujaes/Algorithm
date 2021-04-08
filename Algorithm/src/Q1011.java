//package git;
//
////시간초과뜸
//import java.util.Scanner;
//class Q1011{
//	static int s,e,cnt,k,k1;
//	public static void main(String[] args){
//		Scanner sc =new Scanner(System.in);
//		int tc = sc.nextInt();
//		
//		for(int i =0; i <tc;i++){
//			s = sc.nextInt();
//			e = sc.nextInt();
//			k=0;
//			k1=0;
//			cnt=0;
//			int skip=0;
//			for(int j = 0; j<Math.pow(2, 16);j++){
//				if(j*(j+1)>=e-s+1){
//					skip = j-1;
//					break;
//				}
//			}
//			cnt = 0+(skip*2);
//			k=skip;
//			s=s+(skip*(skip+1));
//			go();
//		}
//	}
//	public static void go(){
//		while(true){
//			if(s+k+1<=e){
//				s= s+k+1;
//				k=k+1;
//				cnt++;
//			}else if(s+k<=e){
//				s=s+k;
//				cnt++;
//			}else if(s+k-1<=e){
//				s=s+k-1;
//				k=k-1;
//				cnt++;
//			}
//			if(s==e){
//				System.out.println(cnt);
//				break;
//			}
//			if(e-k1-1>=s){
//				e =e-k1-1;
//				k1=k1+1;
//				cnt++;
//			}else if(e-k1>=s){
//				e= e-k1;
//				cnt++;
//			}else if(s-k1+1>=s){
//				e=e-k1+1;
//				k1=k1-1;
//				cnt++;
//			}
//			if(s==e){
//				System.out.println(cnt);
//				break;
//			}
//		}
//	}
//}
//
//
////1011 정답
////import java.util.Scanner;
////public class Main {
////	public static void main(String[] args) {
////		Scanner scan = new Scanner(System.in);
////		int num = scan.nextInt();
////		int[] result = new int[num];
////		for (int i = 0; i < num; i++) {
////			int x = scan.nextInt();
////			int y = scan.nextInt();
////			int dist = y - x;
////			int n = (int)Math.ceil(Math.sqrt(dist));
////			int maxDist =(int)Math.pow(Math.ceil(Math.sqrt(dist)),2);
////			int maxNum = n*2 -1 ;
////			int numberOfTimes = maxNum ;
////			if(dist <= maxDist-n) {
////				numberOfTimes = maxNum-1;
////			}
////			result[i] = numberOfTimes;
////		}
////		for(int res : result) {
////			System.out.println(res);
////		}
////	}
////}