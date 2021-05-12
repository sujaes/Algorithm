//import java.util.*;
//
//public class Q1021 {
//	static Deque<Integer> d = new ArrayDeque<Integer>();
//	static Deque<Integer> d1 = new ArrayDeque<Integer>();
//	static Deque<Integer> d2 = new ArrayDeque<Integer>();
//	static int n,m;
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		n = sc.nextInt();
//		m = sc.nextInt();
//		int count = 0;
//		for(int i = 1;  i <=n ;i++) {
//			d.add(i);
//		}
//		
//		for(int i = 0; i < m; i++) {
//			int k = sc.nextInt();
//			count += getnum(k);
//		}
//		System.out.println(count);
//		
//	}
//	public static int getnum(int k) {
//		int ans = 0;
//		if(d.peekFirst() == k) {
//			d.pollFirst();
//		}else if(d.peekLast() == k) {
//			d.pollLast();
//		}else {
//			ans = getmin(k);
//		}
//		return ans;
//	}
//	public static void copy(int number) {
//		int size = d.size();
//		int size1 = d1.size();
//		int size2 = d2.size();
//
//		if( number ==1 ) {
//			d1 = new ArrayDeque<Integer>(size);
//			for(int i= 0 ; i <size;i++) {
//				int temp = d.poll();
//				System.out.println("temp = "+temp);
//				d1.add(temp);
//				d.add(temp);
//			}
//		}else if(number ==2) {
//			d2 = new ArrayDeque<Integer>(size);
//			for(int i= 0 ; i <size;i++) {
//				int temp = d.poll();
//				d2.add(temp);
//				d.add(temp);
//			}
//		}else if( number ==3 ) {
//			d = new ArrayDeque<Integer>(size1);
//			for(int i= 0 ; i <size;i++) {
//				int temp = d1.poll();
//				d.add(temp);
//			}
//		}else {
//			d = new ArrayDeque<Integer>(size2);
//			for(int i= 0 ; i <size;i++) {
//				int temp = d2.poll();
//				d.add(temp);
//			}
//		}
//		
//	}
//	public static int getmin(int k) {
//		int ans = 0;
//		int t1 = left(k);
//		int t2 = right(k);
//		System.out.println("t1 = " + t1 + " t2 = "+ t2);
//		if( t1 > t2) {
//			ans = t2;
//			copy(4);
//		}else {
//			ans = t1;
//			copy(3);
//		}
//		return ans;
//	}
//	public static int left(int k) {
//		copy(1);
//		int ans = 0;
//		while(d1.peekFirst() != k) {
//			ans++;
//			d1.add(d1.poll());
//		}
//		return ans;
//	}
//	public static int right(int k) {
//		copy(2);
//		int ans = 0;
//		while(d2.peekLast() != k) {
//			ans++;
//			d2.addFirst(d2.pollLast());
//		}
//		return ans;
//	}
//
//}


//메모리초과
//import java.util.*;
//
//public class Q1021 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);	
//		int n = sc.nextInt(); 
//		int m = sc.nextInt(); 
//		int count = 0;
//		LinkedList<Integer> list = new LinkedList<Integer>();
//
//		for(int i=1;i<=n;i++) {
//			list.add(i+1);
//		}
//		
//		for(int i=0;i<m;i++) {
//			int num = sc.nextInt();
//			int idx = list.indexOf(num);
//			int half_index = list.size()/2;
//			if(idx <= half_index) {
//				while(num != list.getFirst()) {
//					list.add(list.removeFirst());
//					count++;
//				}
//			}else {
//				while(num!=list.getFirst()) {
//					list.addFirst(list.removeLast());
//					count++;
//				}
//			}
//			list.remove();
//		}
//		System.out.println(count);
//	}
//}



import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Q1021 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int count = 0;
		Deque q = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			q.add(i);
		}
		for (int i = 0; i < k; i++) {
			int num = sc.nextInt();
			while (true) {
				int index = 0; // 몇번쨰 인덱스인지 찾기
				Iterator it = q.iterator();
				while (it.hasNext()) {
					if ((int)it.next() == num) {
						break;
					}
					index++;
				}
				if (index == 0) {
					q.pollFirst();
					break;
				}else if (index > q.size() / 2) {
					q.addFirst(q.removeLast());
					count++;
				}else {
					q.addLast(q.removeFirst());
					count++;
				}
			}
		}
		System.out.println(count);
	}
}