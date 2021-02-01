//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class Q5567 {
//
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st;
//		
//		final int N = Integer.parseInt(br.readLine());
//		final int M = Integer.parseInt(br.readLine());
//	
//		boolean[][] friend = new boolean[N+1][N+1];
//		boolean[] invited = new boolean[N+1];
//		boolean[] myFriend = new boolean[N+1];
//		
//		for (int i = 0; i < M; i++) {
//			st = new StringTokenizer(br.readLine());
//			
//			int tempA = Integer.parseInt(st.nextToken());
//			int tempB = Integer.parseInt(st.nextToken());
//			
//			friend[tempA][tempB] = true;
//			friend[tempB][tempA] = true;
//			if(tempA == 1) {
//				myFriend[tempB] = true;
//				invited[tempB] = true;
//			}
//		}
//		
//		for (int i = 2; i <= N; i++) {
//			if(myFriend[i]) {
//				for (int j = 0; j < myFriend.length; j++) {
//					if(friend[i][j] == true) invited[j] = true;
//				}
//			}
//		}
//		
//		int count = 0;
//		for (int i = 2; i <= N; i++) {
//			if(invited[i]) 
//				count++;
//		}
//	
//		System.out.println(count);
//	}
//}


/*
반례
6
5
1 5
1 6
5 3
6 4
4 3
 
 * */

//import java.util.*;
//public class Q5567 {
//	public static void main(String[] args){
//		Scanner sc =new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		int arr[][] = new int[n+1][n+1];
//		int count[] = new int[n+1];
//		int answer =0;
//		int s = 0;
//		int e = 0;
//		Queue<Integer> q = new LinkedList<Integer>();
//		
//		for(int i = 0 ; i < m ; i++) {
//			s = sc.nextInt();
//			e = sc.nextInt();
//			arr[s][e] = arr[e][s] =1;
//		}
//		q.add(1);
//		
//		while(!q.isEmpty()) {
//			s = q.poll();
//			for(int i = 2 ; i <= n;i++) {
//				if(arr[s][i] == 1 && count[i] == 0) {
//					count[i] = count[s]+1;
//					q.add(i);
//				}
//			}
//		}
//		
//		for(int i = 2; i <=n ;i++) {
//			System.out.println( " count" +count[i]);
//			if(count[i] <2) {
//				answer++;
//			}
//		}
//		System.out.println(answer);
//	}
//	
//}



import java.util.*;

public class Q5567 {
	public static int arr[][];		// 친구 관계
	public static boolean visit[];	// 방문 여부
	public static int n;	// 동기 수
	public static int m;	// 리스트 길이
	public static int count = 0;	// 초대할 친구 수

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		
		arr = new int[n+1][n+1];
		visit = new boolean[n+1];

		for(int i=0; i<m; i++) {
			int a = sc.nextInt();
			
			int b = sc.nextInt();
			
			arr[a][b] = arr[b][a] = 1;	// 친구 관계 표시
		}

		for(int i=2; i<=n; i++) {
			if(arr[1][i] == 1) {	 // 상근이와 친구인 경우
				if(!visit[i]) {		 // 상근이와 친구인데 아직 방문하지 않은 경우
					count ++;		 // 초대
					visit[i] = true; // 방문 표시
				}

				// 상근이 친구의 친구 찾기 - 상근이와 연결된 정점에 연결되어 있는 정점 찾기.
				for(int j=2; j<=n; j++) {
					if(arr[i][j] == 1 && !visit[j]) {
						count ++;			// 상근이 친구의 친구도 초대
						visit[j] = true;	// 방문 표시
					}
				}
			}
		}

		System.out.println(count);
	}

}
