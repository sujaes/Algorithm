import java.util.Scanner;
 
public class Q2458 {
    static boolean [][] g,rg;
    static boolean [] visited,rvisited;
    static int cnt,ans,n,m;
    static void dfs(int now) {
        cnt++;
        visited[now]=true;
        for(int i=1;i<=n;i++) {
            if(!visited[i] && g[now][i])
                dfs(i);
        }
    }
    static void rdfs(int now) {
        cnt++;
        rvisited[now]=true;
        for(int i=1;i<=n;i++) {
            if(!rvisited[i] && rg[now][i])
                rdfs(i);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        
        g = new boolean [n+1][n+1];
        rg = new boolean [n+1][n+1];
        
        for(int i=0;i<m;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            g[a][b] = true;
            rg[b][a] = true;
        }
        
        for(int i=1;i<=n;i++) {
            
            visited = new boolean[n+1];
            rvisited = new boolean[n+1];
            cnt = 0;
            dfs(i);
            rdfs(i);
            if(cnt == n+1) ans++;
        }
        System.out.println(ans);
    }
}