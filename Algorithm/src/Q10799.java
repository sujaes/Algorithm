//package git;
//
////10799¹ø ¹®Á¦
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