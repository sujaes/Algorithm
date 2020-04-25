import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q2164 {
	static int n;	
	static int temp1;
	public static void main(String[] args)   {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<Integer>();
		n=sc.nextInt();
		for(int i = 1;  i <=n ;i++) {
			q.add(i);
		}
		
		while(!q.isEmpty()) {
			temp1 = q.poll();
			if(!q.isEmpty()) {
				int temp = q.poll();
				q.add(temp);
			}
		}

		System.out.println(temp1);
	}
	
}