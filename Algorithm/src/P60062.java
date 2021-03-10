//import java.util.*;
//class Solution {
//    static int MinCnt;
//	static final int MAX = 987654321;
//    static int N;
//    static int Weak[];
//    static int Dist[];
//    public static int solution(int n, int[] weak, int[] dist) {
//		N = n;
//        Weak = weak;
//        Dist = dist;
//		Arrays.sort(Dist);
//		
//		MinCnt = MAX;
//		
//		for(int i = 0 ; i <Weak.length;i++) {
//			solve(1,i,0);
//		}
//		
//		if(MinCnt == MAX) {
//			return -1;
//		}
//		
//		return MinCnt;
//	}
//	public static void solve(int cnt, int pos, int visited) {	//사람수,위치,방문체크
//		
//		if(cnt > Dist.length) {//사람수를 넘으면 찾을필요없음.
//			return;
//		}
//		if(cnt >= MinCnt) {	//같거나 크면 찾을필요없음.
//			return;
//		}
//		
//		for(int i = 0; i <Weak.length;i++) {
//			int nextPos = (pos + i) % Weak.length;
//			int diff = Weak[nextPos] - Weak[pos];
//			if(nextPos < pos) { //다음 지점이 원점을 지나갔을때
//				diff = N+diff;
//			}
//			
//			if(diff > Dist[Dist.length - cnt]) {	//이동가능 거리보다 크면 break;
//				break;
//			}
//			
//			visited |= 1<<nextPos; //or연산( 1을 nextPos만큼 or연산하면 해당 인덱스가 켜짐)
//			
//		}
//		
//		if(visited == (1<<Weak.length) -1 ) {
//			MinCnt = Math.min(MinCnt,cnt);
//			return;
//		}
//		
//		for(int i = 0 ; i < Weak.length;i++) {
//			if((visited & (1<<i)) !=0 ) {	//이미방문한곳을 시작위치로 사용할 필요없음.
//                // System.out.println(visited + "    " +i);
//
//				continue;
//			}
//			solve(cnt+1,i,visited);
//		}
//	}
//}