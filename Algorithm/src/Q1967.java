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
//    	    parent = sc.nextInt()-1; //노드번호 인덱스로 취급해 -1함
//    	    child = sc.nextInt()-1; //상동
//    	    dist = sc.nextInt();
//    	    tree[parent].add(new Node(child, dist)); //부모->자식
//    	    tree[child].add(new Node(parent, dist)); //자식->부모
//    	}
//        //루트로 부터 최대거리 노드(maxDistNode) 탐색
//    	for(Node root : tree[0]){
//    	    visit[0] = true;
//    	    dfs(root, root.dist);
//    	    visit[0] = false;
//    	}
//    	maxDist = 0; //다음 탐색을 위해 0으로 초기화
//        //maxDistNode로 부터 최대거리 노드 탐색. maxDist에 최대 거리값이 담긴다.
//    	dfs(maxDistNode, 0);
//    	System.out.println(String.valueOf(maxDist));
//    }
//
//    private static void dfs(Node curNode, int dist){
//        /* 현재 노드 재탐색 방지(양방향 그래프이기 때문)
//         * 만일 안해주면 1->2->3->2 와 같이 중복탐색하게 됨 */
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
//        int num, dist; //노드 번호, 거리
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
