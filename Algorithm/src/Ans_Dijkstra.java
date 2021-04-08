import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
/*
 * Date 2021.04.08
 * author 장수제
 * 다익스트라 최단거리 알고리즘 코드정리
 */
class Ans_Dijkstra {
	static int e,v,k,k1;
    static boolean visited[];
    static int dist[];
    static ArrayList<Node> list[];
	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       v = sc.nextInt();
       e = sc.nextInt();
       visited = new boolean[v+1];
       dist = new int[v+1];
       list = new ArrayList[v+1];
       
       for(int i = 1; i <= v; i++) {
    	   list[i] = new ArrayList<Node>();
       }
       
       Arrays.fill(dist,Integer.MAX_VALUE);						//가중치 배열
       
       for(int i = 1 ;i <= e; i++) {
    	   int u = sc.nextInt();
    	   int v = sc.nextInt();
    	   int w = sc.nextInt();
    	   list[u].add(new Node(v,w));							//목적지,가중치
       }
       k = sc.nextInt();
       k1 = sc.nextInt();
       dist[k] =0;												//처음 본인에서 본인에게 가는 가중치 0으로 초기화

       dijkstra();
       
       System.out.println(dist[k1]);
       
    }
	public static void dijkstra() {								//다익스트라
		PriorityQueue<Node> pq = new PriorityQueue<Node>();
    	pq.add(new Node(k,0));									//처음 본인에서 본인으로 가는것 큐에 추가
		while(!pq.isEmpty()) {
			Node node = pq.poll();			
			
			if(visited[node.end]) {								//다음 방문지점이 이미 방문한 곳이면 패스
				continue;
			}
			visited[node.end]= true;							//방문체크해주기
			
			for(int i = 0 ; i < list[node.end].size();i++) {	//다음 방문가능한 곳 길이만큼 돌리기
				Node o = list[node.end].get(i);					//방문하는곳 순서대로 node로 빼주기
				if(dist[o.end] > dist[node.end] + o.weight) {	//다음방문하는곳의 dist가 (현재방문한곳dist+다음방문하는곳가중치)보다 크면 갱신해줌
					dist[o.end]  = dist[node.end] + o.weight;
                	pq.add(new Node(o.end,dist[o.end]));		//다음방문지, 다음방문지 dist로 객체만들어주고 넣기
				}
			}
		}
	}
    
    public static class Node implements Comparable<Node>{			//가중치 오름차순 정렬
    	int end,weight;
    	public Node(int end,int weight){
    		this.end = end;
    		this.weight = weight;
    	}
    	public int compareTo(Node o) {
    		return this.weight-o.weight;
    	}

    }
}