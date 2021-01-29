import java.util.*;
public class Q4195{
	static int parent[];
	static int level[];
	static int relation[];
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
	    int t = sc.nextInt();	//testcase
	    for(int k = 0 ; k< t;k++) {
	        int f = sc.nextInt();
	        int idx = 1;		//문자열 처리보다 숫자로 처리하는게 간단
	        HashMap<String, Integer> map = new HashMap<>();
	        parent = new int[200001];	//부모
	        level = new int[200001];
	        relation = new int[200001];	//연결갯수
	 
	        for (int i = 1; i < 200001; i++) {
	            parent[i] = i;		//자기자신으로 부모 초기화
	            relation[i] = 1; 	//연결갯수는 1로 초기화
	        }
	 
	        for (int i = 0; i < f; i++) {
	            String a = sc.next();
	            String b = sc.next();
	 
	            if (!map.containsKey(a)) {	//맵에 a가 있지않으면
	            	map.put(a, idx++);		//이름에 인덱스 입력
	            }
	 
	            if (!map.containsKey(b)) {	//맵에 b가 있지않으면
	            	map.put(b, idx++);		//이름에 인덱스 입력
	            }
	 
	            int ai = map.get(a);		//a값의 인덱스
	            int bi = map.get(b);		//b값의 인덱스
	 
	            union(ai, bi);
	        }
	    }
	}
	 
	public static void union(int u, int v) {
	    u = find(u);
	    v = find(v);
	 
	    if (u == v) {			//부모가 같으면 이미 연결된거라서 출력
	        System.out.println(relation[u]);
	        return;
	    }
	    
	    if (level[u] > level[v]) {	//부모 바꿔주기
	        int temp = u;
	        u = v;
	        v = temp;
	    }
	 
	    parent[u] = v;
	    relation[v] += relation[u];
	    System.out.println(relation[v]);
	 
	    if (level[u] == level[v]) {
	        ++level[v];
	    }
	}
	 
	public static int find(int u) {
	    if (u == parent[u]) {
	        return u;
	    }
	    return parent[u] = find(parent[u]);
	}

}
