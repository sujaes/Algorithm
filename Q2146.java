package git;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
 
class Pair{     //큐에  x,y 짝을 저장하기 위한 class
    int x,y;
    Pair(int x, int y){
        this.x=x;
        this.y=y;
    }
}
 
public class Q2146 {
    static int[][] map; //섬 지도
    static int[][] visit;   //dfs를 위한 배열
    static int N;
    static int dx[]={0,0,1,-1};
    static int dy[]={1,-1,0,0};
    static int Min;
    static int bridge[][];  //다리 길이를 계산하기 위한 배열
    static Queue<Pair> q= new LinkedList<Pair>();
     
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        map=new int[N][N];
        visit=new int[N][N];
        Min=N;
         
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                map[i][j]=sc.nextInt();
            }
        }
        int cnt=1;
        for(int i=0;i<N;i++){        //각각의 섬의 숫자를 다르게 붙여줌(다른 섬인지 확인하기 위해)
            for(int j=0;j<N;j++){
                if(map[i][j]==1&&visit[i][j]==0){
                    dfs_map(i,j,cnt);
                    cnt++;  //dfs 한번 돌때마다 cnt 증가
                }
            }
        }
        visit=new int[N][N];
        for(int i=0;i<N;i++){    //섬을 확장하기 위해 섬의 인덱스를 큐에 저장
            for(int j=0;j<N;j++){
                if(map[i][j]!=0){
                    q.add(new Pair(i,j));
                }
            }
        }
         
        bridge=new int[N][N];
        bfs_expand();   //섬 확장을 위한 bfs
         
        for(int i=0;i<N;i++){        //다른 섬과 인접한 부분에서 bridge[][]를 더하면 섬 사이에 필요한 다리 길이를 알 수 있음
            for(int j=0;j<N;j++){
                    for(int k=0;k<4;k++){
                        int cx=dx[k]+i;
                        int cy=dy[k]+j;
                        if(cx>=0 && cx<N && cy>=0 && cy<N && map[i][j]!=map[cx][cy]){
                                int tmp=bridge[i][j]+bridge[cx][cy];
                                if(Min>tmp)
                                    Min=tmp;               
                        }
                    }
            }
        }
        System.out.println(Min);
    }
     
    static void bfs_expand(){
         
        while(!q.isEmpty()){
            Pair tmp=q.remove();
             
            for(int i=0;i<4;i++){
                int cx=dx[i]+tmp.x;
                int cy=dy[i]+tmp.y;
                if(cx>=0 && cx<N && cy>=0 && cy<N ){
                    if(bridge[cx][cy]==0 && map[cx][cy]==0){    //아직 확장하지 않은 바다이면
                        bridge[cx][cy]=bridge[tmp.x][tmp.y]+1;  //bridge 배열의 값을  +1 해서 넣어줌
                        map[cx][cy]=map[tmp.x][tmp.y];  //섬 확장
                        q.add(new Pair(cx,cy));
                    }      
                }
            }
        }
         
    }
     
    static void dfs_map(int x, int y, int cnt){
        visit[x][y]=1;
        map[x][y]=cnt;
         
        for(int i=0;i<4;i++){
            int cx=dx[i]+x;
            int cy=dy[i]+y;
            if(cx>=0 && cx<N && cy>=0 && cy<N ){
                if( visit[cx][cy]==0 && map[cx][cy]==1)
                    dfs_map(cx,cy,cnt);
            }
        }
    }
}

