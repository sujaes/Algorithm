//import java.util.*;
//
//ũ�罺Į ���
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
//            parent[i] = i;			//������ �θ�� �������� ����
//        }
//        for(int i=0; i<m; i++) {
//        	int s = sc.nextInt();
//        	int e = sc.nextInt();
//        	int w = sc.nextInt();
//            pq.add(new Edge(s,e,w));
//        }    
//        //�������� �������� �ֻ��� ��带 ã�Ƽ� ��ġ�� ����Ŭ�� ����� ���̹Ƿ� continue�� �Ѵ�.
//        //�ƴϸ� union�� ���� �����ϰ� v �� �����ش�.
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
//    //ũ�罺Į�� �⺻ union find!! �ܿ��δ°� ���ϴ�.
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
////���� class
////�켱���� ť�� ����ϱ� ���ؼ� Comparable�� ���� ���� �켱������ ���ߴ�. (V ����)
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
 //�����˰��� ���
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
        for(int i = 0 ; i < m ; i++) {						//����� ��� edge�� ��庰�� �߰�����
        	int s = sc.nextInt();
        	int e = sc.nextInt();
        	int w = sc.nextInt();
        	list[s].add(new Edge(e,w));
        	list[e].add(new Edge(s,w));
        }
        
        q.add(1);			//���۳��
        while(!q.isEmpty()) {
        	int node = q.poll();
        	visited[node] =true;	//��� �湮ó��
        	for(int i = 0 ; i < list[node].size(); i++) {	//���� ����ȸ�� edge�湮
        		Edge temp = list[node].get(i);
        		if(!visited[temp.e]) {						//����� node�� �湮������ ������
        			pq.add(new Edge(temp.e,temp.v));		//�켱����ť�� �ֱ�
        		}
        	}
        	while(!pq.isEmpty()) {							//�켱����ť ���� �湮
        		Edge temp = pq.poll();
        		if(!visited[temp.e]) {						//�湮����������
        			visited[temp.e] = true;					//�湮
        			q.add(temp.e);							//ť�� ����
        			answer += temp.v;
            		
        		}
        	}
        }
        System.out.println(answer);
        
    }
}
//���� class
//�켱���� ť�� ����ϱ� ���ؼ� Comparable�� ���� ���� �켱������ ���ߴ�. (V ����)
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


