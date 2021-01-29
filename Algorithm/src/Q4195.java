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
	        int idx = 1;		//���ڿ� ó������ ���ڷ� ó���ϴ°� ����
	        HashMap<String, Integer> map = new HashMap<>();
	        parent = new int[200001];	//�θ�
	        level = new int[200001];
	        relation = new int[200001];	//���᰹��
	 
	        for (int i = 1; i < 200001; i++) {
	            parent[i] = i;		//�ڱ��ڽ����� �θ� �ʱ�ȭ
	            relation[i] = 1; 	//���᰹���� 1�� �ʱ�ȭ
	        }
	 
	        for (int i = 0; i < f; i++) {
	            String a = sc.next();
	            String b = sc.next();
	 
	            if (!map.containsKey(a)) {	//�ʿ� a�� ����������
	            	map.put(a, idx++);		//�̸��� �ε��� �Է�
	            }
	 
	            if (!map.containsKey(b)) {	//�ʿ� b�� ����������
	            	map.put(b, idx++);		//�̸��� �ε��� �Է�
	            }
	 
	            int ai = map.get(a);		//a���� �ε���
	            int bi = map.get(b);		//b���� �ε���
	 
	            union(ai, bi);
	        }
	    }
	}
	 
	public static void union(int u, int v) {
	    u = find(u);
	    v = find(v);
	 
	    if (u == v) {			//�θ� ������ �̹� ����ȰŶ� ���
	        System.out.println(relation[u]);
	        return;
	    }
	    
	    if (level[u] > level[v]) {	//�θ� �ٲ��ֱ�
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
