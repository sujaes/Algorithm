import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
 
public class Q1197 {
    static int n,m;
    static int[] parent;
    static PriorityQueue<edge> pq = new PriorityQueue<edge>();
    static int result = 0;
    
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        parent = new int[n+1];
        
        for(int i=0; i<n+1; i++) {
            parent[i] = i;
        }
        
        for(int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            pq.add(new edge(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));
        }
        
        //시작점과 종료점의 최상위 노드를 찾아서 겹치면 사이클이 생기는 것이므로 continue를 한다.
        //아니면 union을 통해 연결하고 v 를 더해준다.
        for(int i=0; i<m; i++) {
            edge tmp = pq.poll();
            
            int a = find(tmp.s);
            int b = find(tmp.e);
            
            if(a==b) continue;
            union(a,b);
            result += tmp.v;
        }
        
        System.out.println(result);
    }
    
    //크루스칼의 기본 union find!! 외워두는게 편하다.
    public static int find(int a) {
        if(a == parent[a]) return a;
        parent[a] = find(parent[a]);
        return parent[a];
    }
    
    public static void union(int a,int b) {
        int aRoot = find(a);
        int bRoot = find(b);
        
        if(aRoot != bRoot) {
            parent[aRoot] = b;
        } else {
            return;
        }
    }
}
 
//간선 class
//우선순위 큐를 사용하기 위해서 Comparable을 통해 정렬 우선순위를 정했다. (V 기준)
class edge implements Comparable<edge>{
    int s;
    int e;
    int v;
    
    public edge(int s,int e,int v) {
        this.s = s;
        this.e = e;
        this.v = v;
    }
 
    @Override
    public int compareTo(edge arg0) {
        // TODO Auto-generated method stub
        return arg0.v >= this.v ? -1:1;
    }
}
