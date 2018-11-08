package git;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Q2178 {
    static int[][] a=new int[100][100];
    static int[][] visit=new int[100][100];
    static int dx[]={0,0,1,-1};
    static int dy[]={-1,1,0,0}; //왼쪽, 오른쪽, 위, 아래
    static int MIN=10000;
    static int n,m;
     
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        for(int i=0;i<n;i++){
            String str = sc.next();
            char ch[]=str.toCharArray();
            for(int j=0;j<ch.length;j++){
                a[i][j]=ch[j]-'0';
            }
        }
        a[0][0]=2;
        bfs(0,0);
        System.out.println(a[n-1][m-1]-1);
    }
     
         
    static void bfs(int x, int y){
        Queue<Integer> qx = new LinkedList<Integer>();
        Queue<Integer> qy = new LinkedList<Integer>();
 
        qx.add(x);
        qy.add(y);
         
        while(!qx.isEmpty() && !qy.isEmpty()){
            x=qx.poll();
            y=qy.poll();
            for(int k=0;k<4;k++){
                int nx=x+dx[k];
                int ny=y+dy[k];
                if(nx>=0 && nx<n && ny>=0 && ny<m){
                    if(a[nx][ny]==1){
                        qx.add(nx);
                        qy.add(ny);
                        a[nx][ny]=a[x][y]+1;
                    }
                }
            }
        }
 
    }
}