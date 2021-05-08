import java.util.*;
public class Q2075 {
	static int n;
	static Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i =0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				pq.add(sc.nextInt());
			}
		}
		for(int i=0; i<n-1; i++) {
			pq.poll();
		}
		System.out.println(pq.peek());
	}
}
