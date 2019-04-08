package git;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Q5430{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		b:for(int i = 0 ; i < num; i++) {
			Deque<Integer> deque = new ArrayDeque<Integer>();
			String s = sc.next();
			int b =sc.nextInt();
			String arr = sc.next();
			int dir= 0;
			arr = arr.substring(1,arr.length()-1);
			StringTokenizer st = new StringTokenizer(arr, ",");
			while(st.hasMoreElements()){
				deque.add(Integer.parseInt(st.nextToken()+""));
			}
			for(int j=0; j<s.length();j++){
				if(s.charAt(j)=='R'){
					dir++;
				}else{
					if(deque.isEmpty()){
						System.out.println("error");
						continue b;
					}else{
						if(dir%2 ==0){
							deque.pollFirst();
						}else{
							deque.pollLast();
						}
					}
				}
			}
			System.out.print("[");
				if(dir%2 ==0){
					while(!deque.isEmpty()){
						System.out.print(deque.poll());
						if(!deque.isEmpty()){
							System.out.print(",");
						}
					}
				}else{
					while(!deque.isEmpty()){
						System.out.print(deque.pollLast());
						if(!deque.isEmpty()){
							System.out.print(",");
						}
					}
				}
				System.out.println("]");
			

		}		
	}
}