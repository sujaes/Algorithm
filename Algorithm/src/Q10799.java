//package git;
//
////10799�� ����
//import java.util.*;
//class Q10799{
//	public static void main(String[] args){
//		Scanner sc=new Scanner(System.in);
//		String a = sc.next();
//		int sum=0;
//		Stack<Character> stack = new Stack<Character>();
//		for(int j = 0 ; j<a.length();j++){
//			if((a.charAt(j)=='(')){
//				stack.push(a.charAt(j));
//			}else{
//				if(a.charAt(j-1)=='('){
//					stack.pop();
//					sum = sum+stack.size();
//				}else{
//					sum = sum+1;
//					stack.pop();
//				
//				}
//			}
//		}
//		System.out.println(sum);
//	}		
//}


import java.util.Scanner;
public class Q10799 { 
	public static void main(String[] args) { 
		int st = 0;
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		String bracket = scan.nextLine();
		char[] bracketToArray = bracket.toCharArray();
		for (int i = 0; i < bracketToArray.length; i++) {
			if (bracketToArray[i] == '(') {
				st = st + 1;
			}
			else {
				if (bracketToArray[i - 1] == '(') {
					st = st - 1;
					sum = sum + st; 
				} 
				else {
					sum = sum + 1;
					st = st - 1;
				}
			}
		}
		System.out.println(sum);
	} 
}