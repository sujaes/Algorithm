import java.util.*;
public class Q1389 {
	 
    static int[][] relation;
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        relation = new int[n+1][n+1];
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n;j++) {
                if(i==j){
                	relation[i][j] = 0;
                }
                else{
                	relation[i][j] = 10001;
                }
            }
        }
        
        for(int i=0;i<m;i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            relation[x][y] = 1;
            relation[y][x] = 1;
        }
        
        for(int k=1;k<=n;k++) {
            for(int i=1;i<=n;i++) {
                for(int j=1;j<=n;j++) {
                    if(relation[i][j] > relation[i][k]+relation[k][j]) {
                        relation[i][j] = relation[i][k]+relation[k][j];
                    }
                }
            }
        }
        
        int min = 10001;
        int ans = 0;
        for(int i=1;i<=n;i++) {
            int sum =0;
            for(int j=1;j<=n;j++) {
                if(relation[i][j]!=10001)
                    sum+=relation[i][j];
            }
            if(sum<min) {
                min = sum;
                ans = i;
            }
        }
        System.out.println(ans);
    }
 
}