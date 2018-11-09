package git;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
 
class Pair{     //ť��  x,y ¦�� �����ϱ� ���� class
    int x,y;
    Pair(int x, int y){
        this.x=x;
        this.y=y;
    }
}
 
public class Q2146 {
    static int[][] map; //�� ����
    static int[][] visit;   //dfs�� ���� �迭
    static int N;
    static int dx[]={0,0,1,-1};
    static int dy[]={1,-1,0,0};
    static int Min;
    static int bridge[][];  //�ٸ� ���̸� ����ϱ� ���� �迭
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
        for(int i=0;i<N;i++){        //������ ���� ���ڸ� �ٸ��� �ٿ���(�ٸ� ������ Ȯ���ϱ� ����)
            for(int j=0;j<N;j++){
                if(map[i][j]==1&&visit[i][j]==0){
                    dfs_map(i,j,cnt);
                    cnt++;  //dfs �ѹ� �������� cnt ����
                }
            }
        }
        visit=new int[N][N];
        for(int i=0;i<N;i++){    //���� Ȯ���ϱ� ���� ���� �ε����� ť�� ����
            for(int j=0;j<N;j++){
                if(map[i][j]!=0){
                    q.add(new Pair(i,j));
                }
            }
        }
         
        bridge=new int[N][N];
        bfs_expand();   //�� Ȯ���� ���� bfs
         
        for(int i=0;i<N;i++){        //�ٸ� ���� ������ �κп��� bridge[][]�� ���ϸ� �� ���̿� �ʿ��� �ٸ� ���̸� �� �� ����
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
                    if(bridge[cx][cy]==0 && map[cx][cy]==0){    //���� Ȯ������ ���� �ٴ��̸�
                        bridge[cx][cy]=bridge[tmp.x][tmp.y]+1;  //bridge �迭�� ����  +1 �ؼ� �־���
                        map[cx][cy]=map[tmp.x][tmp.y];  //�� Ȯ��
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

