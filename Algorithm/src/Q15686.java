//import java.util.ArrayList;
//import java.util.Scanner;
//import java.util.Stack;
//public class Q15686 {
//
//	static int N; // ���� ũ��
//	static int M; // ġŲ�� ����
//
//	static ArrayList<Point> homes; // ��
//	static ArrayList<Point> chickens; // ġŲ��
//	static Stack<Point> selectChickens;
//
//	static int MIN_CHICKEN_DIST = Integer.MAX_VALUE;
//
//	public static void main(String[] args) {
//
//		Scanner sc = new Scanner(System.in);
//		N = sc.nextInt();
//		M = sc.nextInt();
//
//		homes = new ArrayList<>();
//		chickens = new ArrayList<>();
//		selectChickens = new Stack<>();
//
//		for (int x = 1; x <= N; x++) {
//			for (int y = 1; y <= N; y++) {
//				int number = sc.nextInt();
//
//				if (number == 1) {
//					homes.add(new Point(x, y));
//				} else if (number == 2) {
//					chickens.add(new Point(x, y));
//				}
//			}
//		}
//
//		sc.close();
//
//		select(0, 0);
//		System.out.println(MIN_CHICKEN_DIST);
//	}
//
//	// M�� ��ŭ�� ġŲ���� ������  
//	public static void select(int start, int count) {
//
//		if (count == M) {
//			calcChckenDist();
//			return;
//		}
//
//		for (int i = start; i < chickens.size(); i++) {
//			selectChickens.push(chickens.get(i));
//			select(i + 1, count + 1);
//			selectChickens.pop();
//		}
//	}
//
//	// ������ ġŲ�Ÿ� ��� 
//	public static void calcChckenDist() {
//
//		int sum = 0;
//		for (Point home : homes) {
//
//			int min = Integer.MAX_VALUE;
//			for (Point chicken : selectChickens) {
//				int dist = Math.abs(chicken.x - home.x) + Math.abs(chicken.y - home.y);
//				min = Math.min(min, dist);
//			}
//
//			sum += min;
//
//			if (sum > MIN_CHICKEN_DIST)
//				return;
//		}
//
//		MIN_CHICKEN_DIST = Math.min(MIN_CHICKEN_DIST, sum);
//	}
//}
//
//class Point {
//	public int x;
//	public int y;
//
//	public Point(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
//
//	@Override
//	public String toString() {
//		return String.format("(%d, %d)", x, y);
//	}
//}


import java.util.*;
public class Q15686{
	static int n,m,answer = Integer.MAX_VALUE;;					//ġŲ���� �ٲ㰡�鼭 ġŲ�Ÿ� �ּҰ��� ��(����)
	static int arr[][];											// Map
	static ArrayList<Point> chicken = new ArrayList<Point>();	//ġŲ�� ��ǥ
	static ArrayList<Point> house = new ArrayList<Point>();		//�� ��ǥ
	static int min =Integer.MAX_VALUE;							//ġŲ�� m�� ���ڿ� �ش� ġŲ������ ġŲ�Ÿ��� �ּ���
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[n][n];
		
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				arr[i][j] = sc.nextInt();
				if(arr[i][j] == 2) {
					chicken.add(new Point(i,j));				//ġŲ�� ��ǥ �ֱ�
				}else if(arr[i][j] ==1) {					
					house.add(new Point(i,j));					//�� ��ǥ �ֱ�	
				}
			}
		}
		int r = chicken.size();

		Point[] com = new Point[m];
		comb(r,m,com,0,0);										
		System.out.println(answer);
	}
	public static void comb(int n, int r,Point[] com,int target,int index) {
		if(r == 0) {											//ġŲ�� m�� �ٰ���
			int temp  = calc(com);								//ġŲ�Ÿ� ���
			if(answer > temp) {									//���� ġŲ�Ÿ��պ��� ������ ����
				answer = temp;
			}
			return;
		}
		if(target == n) {
			return;
		}
		
		com[index] = chicken.get(target);
		comb(n,r-1,com,target+1,index+1);
		comb(n,r,com,target+1,index);
	}
	public static int calc(Point p[]) {
		int res = 0;
		for(int i = 0 ; i < house.size();i++) {
			min = Integer.MAX_VALUE;
			int hx = house.get(i).x;
			int hy = house.get(i).y;
			for(int j = 0 ; j < p.length;j++) {
				int cx = p[j].x;
				int cy = p[j].y;
				if(min > Math.abs(cx - hx) + Math.abs(cy - hy)) {
					min = Math.abs(cx - hx) + Math.abs(cy - hy);
				}
			}
			res += min;
		}
		return res;
	}
	public static class Point{
		int x;
		int y;
		public Point(int x,int y) {
			this.x = x;
			this.y = y;
		}
	}
}