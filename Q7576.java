package git;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Q7576{
    static int a[][];
    static int MAX;
    static int n,m;
    static int dx[]={0,0,1,-1};
    static int dy[]={1,-1,0,0};
     
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        a=new int[n][m];
        int x,y,cx=0,cy=0;
        Queue<Integer> qx=new LinkedList<Integer>();
        Queue<Integer> qy=new LinkedList<Integer>(); 
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
                if(a[i][j]==1){
                    qx.add(i);
                    qy.add(j);
                }
            }
        }
        while(!qx.isEmpty()&&!qy.isEmpty()){
            x=qx.poll();
            y=qy.poll();
            for(int i=0;i<4;i++){
                cx=x+dx[i];
                cy=y+dy[i];
                if(cx>=0 &&cx<n && cy>=0 && cy<m && a[cx][cy]==0){
                    a[cx][cy]=a[x][y]+1;
                    MAX=a[x][y];
                    qx.add(cx);
                    qy.add(cy);
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i][j]==0){
                    System.out.println("-1");
                    return;
                }
            }
        }
        System.out.println(MAX);
    }
}