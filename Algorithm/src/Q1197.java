//import java.util.*;
//
//크루스칼 사용
//
//public class Q1197 {
//    static int n,m;
//    static int[] parent;
//    static PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
//    static int result = 0;
//    public static void main(String[] args) throws Exception{
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        m = sc.nextInt();
//        parent = new int[n+1];
//        for(int i=0; i<n+1; i++) {
//            parent[i] = i;			//본인의 부모는 본인으로 설정
//        }
//        for(int i=0; i<m; i++) {
//        	int s = sc.nextInt();
//        	int e = sc.nextInt();
//        	int w = sc.nextInt();
//            pq.add(new Edge(s,e,w));
//        }    
//        //시작점과 종료점의 최상위 노드를 찾아서 겹치면 사이클이 생기는 것이므로 continue를 한다.
//        //아니면 union을 통해 연결하고 v 를 더해준다.
//        for(int i=0; i<m; i++) {
//            Edge tmp = pq.poll();
//            int a = find(tmp.s);
//            int b = find(tmp.e);
//            
//            if(a==b) {
//            	continue;
//            }
//            union(a,b);
//            result += tmp.v;
//        }
//        
//        System.out.println(result);
//    }
//    
//    //크루스칼의 기본 union find!! 외워두는게 편하다.
//    public static int find(int a) {
//        if(a == parent[a]) {
//        	return a;
//        }
//        parent[a] = find(parent[a]);
//        return parent[a];
//    }
//    
//    public static void union(int a,int b) {
//        int aRoot = find(a);
//        int bRoot = find(b);
//        
//        if(aRoot != bRoot) {
//            parent[aRoot] = b;
//        } else {
//            return;
//        }
//    }
//}
// 
////간선 class
////우선순위 큐를 사용하기 위해서 Comparable을 통해 정렬 우선순위를 정했다. (V 기준)
//class Edge implements Comparable<Edge>{
//    int s;
//    int e;
//    int v;
//    
//    public Edge(int s,int e,int v) {
//        this.s = s;
//        this.e = e;
//        this.v = v;
//    }
// 
//    @Override
//    public int compareTo(Edge o) {
//        // TODO Auto-generated method stub
//        return  this.v - o.v;
//    }
//}



import java.util.*;
 //프림알고리즘 사용
public class Q1197 {
    static int n,m;
    static Queue<Integer> q = new LinkedList<Integer>();
    static PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
    static List<Edge> list[];
    static boolean visited[];
    static int answer = 0;
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        list = new LinkedList[n+1];
        visited = new boolean[n+1];
        
        for(int i = 1 ; i <= n ; i++) {
        	list[i] = new LinkedList<Edge>();
        }
        for(int i = 0 ; i < m ; i++) {						//연결된 모든 edge를 노드별로 추가해줌
        	int s = sc.nextInt();
        	int e = sc.nextInt();
        	int w = sc.nextInt();
        	list[s].add(new Edge(e,w));
        	list[e].add(new Edge(s,w));
        }
        
        q.add(1);			//시작노드
        while(!q.isEmpty()) {
        	int node = q.poll();
        	visited[node] =true;	//노드 방문처리
        	for(int i = 0 ; i < list[node].size(); i++) {	//노드와 연결된모든 edge방문
        		Edge temp = list[node].get(i);
        		if(!visited[temp.e]) {						//연결된 node가 방문한적이 없으면
        			pq.add(new Edge(temp.e,temp.v));		//우선순위큐에 넣기
        		}
        	}
        	while(!pq.isEmpty()) {							//우선순위큐 전부 방문
        		Edge temp = pq.poll();
        		if(!visited[temp.e]) {						//방문한적없으면
        			visited[temp.e] = true;					//방문
        			q.add(temp.e);							//큐에 삽입
        			answer += temp.v;
            		
        		}
        	}
        }
        System.out.println(answer);
        
    }
}
//간선 class
//우선순위 큐를 사용하기 위해서 Comparable을 통해 정렬 우선순위를 정했다. (V 기준)
class Edge implements Comparable<Edge>{
    int e;
    int v;
    
    public Edge(int e,int v) {
        this.e = e;
        this.v = v;
    }
 
    @Override
    public int compareTo(Edge o) {
        // TODO Auto-generated method stub
        return  this.v - o.v;
    }
}


