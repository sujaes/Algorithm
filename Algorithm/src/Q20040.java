import java.util.Scanner;
 
public class Q20040 {
 
    static int n, m, res, parents[];
    
    public static void main(String[] args){
 
    	Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        m = sc.nextInt(); 
        parents = new int[n];
        for (int i = 0; i < n; i++) {
            parents[i] = i;
        }
        
        for (int i = 1; i <= m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            // 사이클이 형성되는지 확인
            if(!union(a, b)) {
                res = i;
                break;
            }
        }
        
        System.out.println(res);
    }
 
    private static boolean union(int a, int b) {
        int aRoot = find(a); // a의 root 노드
        int bRoot = find(b); // b의 root 노드
        // a와 b의 root 노드가 같다면 사이클 형성
        if(aRoot == bRoot) {
        	return false;
        }
        parents[bRoot] = aRoot;
        return true;
    }
 
    private static int find(int n) {
        if(n == parents[n]) return n;
        return parents[n] = find(parents[n]);
    }
 
}
