import java.util.*;
import java.util.PriorityQueue;
import java.util.Arrays;

public class Q1719{
	public static int n, m, map[][];
	public static int INF = Integer.MAX_VALUE;
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int i, from, to, w;
		
		n = sc.nextInt();
		m = sc.nextInt();
		map = new int[n][n];
		
		for(i=0;i<m;i++) {
			from = sc.nextInt()-1;
			to = sc.nextInt()-1;
			w = sc.nextInt();
			map[from][to] = map[to][from] = w;
		}
		for(i=0;i<n;i++) {
			dijkstra(i);
		}
	}
	
	private static void dijkstra(int s) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.offer(s);
		int cur =0 ;
		int d[] = new int[n];	//�ش簪
		int trace[] = new int[n];	//N���� �鸮�� ��
		Arrays.fill(d, INF);
		d[s] = 0; trace[s] = s;	//�������� 0 ���������� �鸮�� ���� �����ڽ�
		
		while(!pq.isEmpty()) {
			cur = pq.poll();
			for(int i=0;i<n;i++) {
				if(map[cur][i]==0) {
					continue; //��ΰ� ���� ��� ����
				}else if(d[i]>map[cur][i]+d[cur]) {
					d[i] = map[cur][i] + d[cur];
					trace[i] = cur; //i�� ���� ���ؼ� �ݵ�� ������ cur�� ��ó�� �ȴ�!
					pq.offer(i);
				}
			}
		}
		tracert(s, trace);
	}
	
	private static void tracert(int s, int t[]) {
		int j, v = -1;
		for(int i=0;i<n;i++) {
			if(i==s) {
				System.out.print("- ");
				continue;
			}
			v=i+1;
			for(j=t[i];j!=s;j = t[j]) {
				v = j+1;
			}
			System.out.print(v+" ");
		}
		System.out.println();
	}
}
