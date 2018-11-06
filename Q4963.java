package git;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Q4963 {
    static int a[][];
    static int dx[] = {-1,-1,-1,0,0,1,1,1};
    static int dy[] = {-1,0,1,-1,1,-1,0,1};
    static int cnt=2;
    static int n,m;
     
     
    static void bfs(int x, int y){
        a[x][y]=cnt;
        Queue<Integer> qx=new LinkedList<Integer>();
        Queue<Integer> qy=new LinkedList<Integer>();
        qx.add(x);
        qy.add(y);
        while(!qx.isEmpty() && !qy.isEmpty()){
            x=qx.peek();
            y=qy.peek();
            qx.poll();
            qy.poll();
 
            for(int i=0;i<8;i++){
                int cx=x+dx[i];
                int cy=y+dy[i];
                if(cx<n && cx>=0 && cy<m && cy>=0){
                    if(a[cx][cy]==1){
                        a[cx][cy]=cnt;
                        qx.add(cx);
                        qy.add(cy);
                    }
                }
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            cnt=2;
            m=sc.nextInt();
            n=sc.nextInt();
            if(n==0 && m==0)
                break;
            a=new int[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++)
                    a[i][j]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(a[i][j]==1){
                        bfs(i,j);
                        cnt++;
                    }
                }
            }
            System.out.println(cnt-2);    
        }
    }
}
