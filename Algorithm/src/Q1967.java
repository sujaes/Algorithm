//import java.util.*; 
//
//public class Q1967{
//    public static boolean visit[];
//    public static int n, maxDist;
//    public static Node maxDistNode;
//    public static LinkedList<Node> tree[];
//    public static void main(String args[]){
//    	Scanner sc = new Scanner(System.in);
//    	int i, parent, child, dist;
//    	String line[];
//    	n = sc.nextInt();
//    	tree = new LinkedList[n];
//    	visit = new boolean[n];
//    	for(i=0;i<n;i++) {
//    		tree[i] = new LinkedList<>();
//    	}
//    	for(i=1;i<n;i++){
//    	    parent = sc.nextInt()-1; //����ȣ �ε����� ����� -1��
//    	    child = sc.nextInt()-1; //��
//    	    dist = sc.nextInt();
//    	    tree[parent].add(new Node(child, dist)); //�θ�->�ڽ�
//    	    tree[child].add(new Node(parent, dist)); //�ڽ�->�θ�
//    	}
//        //��Ʈ�� ���� �ִ�Ÿ� ���(maxDistNode) Ž��
//    	for(Node root : tree[0]){
//    	    visit[0] = true;
//    	    dfs(root, root.dist);
//    	    visit[0] = false;
//    	}
//    	maxDist = 0; //���� Ž���� ���� 0���� �ʱ�ȭ
//        //maxDistNode�� ���� �ִ�Ÿ� ��� Ž��. maxDist�� �ִ� �Ÿ����� ����.
//    	dfs(maxDistNode, 0);
//    	System.out.println(String.valueOf(maxDist));
//    }
//
//    private static void dfs(Node curNode, int dist){
//        /* ���� ��� ��Ž�� ����(����� �׷����̱� ����)
//         * ���� �����ָ� 1->2->3->2 �� ���� �ߺ�Ž���ϰ� �� */
//    	visit[curNode.num] = true;
//    	
//        for(Node tmp : tree[curNode.num]){
//    	    if(!visit[tmp.num]){
//        		visit[tmp.num] = true;
//        		dfs(tmp, dist+tmp.dist);
//        		visit[tmp.num] = false;
//    	    }
//    	}
//    	if(dist > maxDist){
//    	    maxDistNode = curNode;
//    	    maxDist = dist;
//    	}
//    	visit[curNode.num] = false;
//    }
//    public static class Node{
//        int num, dist; //��� ��ȣ, �Ÿ�
//        public Node(int num, int dist){
//        	this.num = num;
//        	this.dist = dist;
//        }
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Q1967 {
    static ArrayList<Node>list[] ;
    static int n;
    static int max = 0;
    static boolean visited[];
    static int max_idx = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   
        n = Integer.parseInt(br.readLine());  
        list = new ArrayList[n+1];  
        for(int i=0; i<=n; i++) {
            list[i] = new ArrayList<>();
        }    
        for(int i=0; i<n-1; i++) {
            String [] t = br.readLine().split(" ");
            int parent = Integer.parseInt(t[0]);
            int child = Integer.parseInt(t[1]);
            int weight = Integer.parseInt(t[2]);
            list[parent].add(new Node(child,weight));
            list[child].add(new Node(parent,weight));
        }
        
        visited = new boolean[n+1];
        visited[1] = true;
        dfs(1,0);
        visited = new boolean[n+1];
        visited[max_idx] = true;
        dfs(max_idx,0);
        System.out.println(max);
        
    }
    public static void dfs(int idx, int cnt) {
        if(max < cnt) {
            max = cnt;
            max_idx = idx;
        } 
        for(Node a : list[idx]) {
            if(!visited[a.idx]) {
                visited[a.idx] = true;
                dfs(a.idx, cnt+a.cnt);
            }
        }
    }
}
class Node{
    int idx,cnt;
    Node(int idx, int cnt){
        this.idx = idx;
        this.cnt = cnt;
    }
}
