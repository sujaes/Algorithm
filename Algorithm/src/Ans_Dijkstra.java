import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
/*
 * Date 2021.04.08
 * author �����
 * ���ͽ�Ʈ�� �ִܰŸ� �˰��� �ڵ�����
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
       
       Arrays.fill(dist,Integer.MAX_VALUE);						//����ġ �迭
       
       for(int i = 1 ;i <= e; i++) {
    	   int u = sc.nextInt();
    	   int v = sc.nextInt();
    	   int w = sc.nextInt();
    	   list[u].add(new Node(v,w));							//������,����ġ
       }
       k = sc.nextInt();
       k1 = sc.nextInt();
       dist[k] =0;												//ó�� ���ο��� ���ο��� ���� ����ġ 0���� �ʱ�ȭ

       dijkstra();
       
       System.out.println(dist[k1]);
       
    }
	public static void dijkstra() {								//���ͽ�Ʈ��
		PriorityQueue<Node> pq = new PriorityQueue<Node>();
    	pq.add(new Node(k,0));									//ó�� ���ο��� �������� ���°� ť�� �߰�
		while(!pq.isEmpty()) {
			Node node = pq.poll();			
			
			if(visited[node.end]) {								//���� �湮������ �̹� �湮�� ���̸� �н�
				continue;
			}
			visited[node.end]= true;							//�湮üũ���ֱ�
			
			for(int i = 0 ; i < list[node.end].size();i++) {	//���� �湮������ �� ���̸�ŭ ������
				Node o = list[node.end].get(i);					//�湮�ϴ°� ������� node�� ���ֱ�
				if(dist[o.end] > dist[node.end] + o.weight) {	//�����湮�ϴ°��� dist�� (����湮�Ѱ�dist+�����湮�ϴ°�����ġ)���� ũ�� ��������
					dist[o.end]  = dist[node.end] + o.weight;
                	pq.add(new Node(o.end,dist[o.end]));		//�����湮��, �����湮�� dist�� ��ü������ְ� �ֱ�
				}
			}
		}
	}
    
    public static class Node implements Comparable<Node>{			//����ġ �������� ����
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