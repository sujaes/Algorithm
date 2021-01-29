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
            
            // ����Ŭ�� �����Ǵ��� Ȯ��
            if(!union(a, b)) {
                res = i;
                break;
            }
        }
        
        System.out.println(res);
    }
 
    private static boolean union(int a, int b) {
        int aRoot = find(a); // a�� root ���
        int bRoot = find(b); // b�� root ���
        // a�� b�� root ��尡 ���ٸ� ����Ŭ ����
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
