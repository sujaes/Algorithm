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
        
        //�������� �������� �ֻ��� ��带 ã�Ƽ� ��ġ�� ����Ŭ�� ����� ���̹Ƿ� continue�� �Ѵ�.
        //�ƴϸ� union�� ���� �����ϰ� v �� �����ش�.
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
    
    //ũ�罺Į�� �⺻ union find!! �ܿ��δ°� ���ϴ�.
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
 
//���� class
//�켱���� ť�� ����ϱ� ���ؼ� Comparable�� ���� ���� �켱������ ���ߴ�. (V ����)
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
