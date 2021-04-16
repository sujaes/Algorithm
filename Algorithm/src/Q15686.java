//import java.util.ArrayList;
//import java.util.Scanner;
//import java.util.Stack;
//public class Q15686 {
//
//	static int N; // 도시 크기
//	static int M; // 치킨집 개수
//
//	static ArrayList<Point> homes; // 집
//	static ArrayList<Point> chickens; // 치킨집
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
//	// M개 만큼의 치킨집을 선택함  
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
//	// 도시의 치킨거리 계산 
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
	static int n,m,answer = Integer.MAX_VALUE;;					//치킨집을 바꿔가면서 치킨거리 최소값의 합(최종)
	static int arr[][];											// Map
	static ArrayList<Point> chicken = new ArrayList<Point>();	//치킨집 좌표
	static ArrayList<Point> house = new ArrayList<Point>();		//집 좌표
	static int min =Integer.MAX_VALUE;							//치킨집 m개 고른뒤에 해당 치킨집마다 치킨거리의 최소합
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[n][n];
		
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				arr[i][j] = sc.nextInt();
				if(arr[i][j] == 2) {
					chicken.add(new Point(i,j));				//치킨집 좌표 넣기
				}else if(arr[i][j] ==1) {					
					house.add(new Point(i,j));					//집 좌표 넣기	
				}
			}
		}
		int r = chicken.size();

		Point[] com = new Point[m];
		comb(r,m,com,0,0);										
		System.out.println(answer);
	}
	public static void comb(int n, int r,Point[] com,int target,int index) {
		if(r == 0) {											//치킨집 m개 다고르면
			int temp  = calc(com);								//치킨거리 계산
			if(answer > temp) {									//최종 치킨거리합보다 작으면 갱신
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