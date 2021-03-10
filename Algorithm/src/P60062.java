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
//	public static void solve(int cnt, int pos, int visited) {	//�����,��ġ,�湮üũ
//		
//		if(cnt > Dist.length) {//������� ������ ã���ʿ����.
//			return;
//		}
//		if(cnt >= MinCnt) {	//���ų� ũ�� ã���ʿ����.
//			return;
//		}
//		
//		for(int i = 0; i <Weak.length;i++) {
//			int nextPos = (pos + i) % Weak.length;
//			int diff = Weak[nextPos] - Weak[pos];
//			if(nextPos < pos) { //���� ������ ������ ����������
//				diff = N+diff;
//			}
//			
//			if(diff > Dist[Dist.length - cnt]) {	//�̵����� �Ÿ����� ũ�� break;
//				break;
//			}
//			
//			visited |= 1<<nextPos; //or����( 1�� nextPos��ŭ or�����ϸ� �ش� �ε����� ����)
//			
//		}
//		
//		if(visited == (1<<Weak.length) -1 ) {
//			MinCnt = Math.min(MinCnt,cnt);
//			return;
//		}
//		
//		for(int i = 0 ; i < Weak.length;i++) {
//			if((visited & (1<<i)) !=0 ) {	//�̹̹湮�Ѱ��� ������ġ�� ����� �ʿ����.
//                // System.out.println(visited + "    " +i);
//
//				continue;
//			}
//			solve(cnt+1,i,visited);
//		}
//	}
//}