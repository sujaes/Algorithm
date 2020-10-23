import java.util.*;
class Solution {
    static Queue<Pair> q;
    static int max = 0;
    static int num = 0;
    static int sm;
    static int sn;
    static long spicture[][];
    public static void bfs(){
        int count  = 0;
        int dx[] = {1,0,0,-1};
        int dy[] = {0,1,-1,0};
        while(!q.isEmpty()){
            count++;
            Pair p =q.poll();
            long colorFix = p.color;
            for(int i = 0 ; i < 4; i++){
                int nx = p.x +dx[i];
                int ny = p.y +dy[i];
                if( nx <0 || ny <0 || nx >= sm || ny >= sn){
                    continue;
                }
                if(spicture[nx][ny] == colorFix){
                    // System.out.println("dfs¾È¿¡ "+p.x + " " + p.y+ "  ----> " + nx + " " + ny);
                    spicture[nx][ny] = 0;
                    q.add(new Pair(nx,ny,colorFix));
                }
            }
        }
        if(max < count ){
            max = count;
        }
    }
    public static int[] solution(int m, int n, int[][] picture) {
        max = 0;
        num = 0;
        sm = m;
        sn = n;
        spicture = new long[sm][sn];
        
        for(int i = 0 ; i < m; i++){
            for(int j  = 0 ; j< n; j++){
                spicture[i][j] = (long) picture[i][j];
            }
        }              
        q = new LinkedList<Pair>();
        int area = 0 ;
        long k = 0;
        
        for(int i = 0 ; i < m; i++){
            for(int j  = 0 ; j< n; j++){
                if(spicture[i][j] != 0){
                    k = spicture[i][j];
                    // System.out.println("----------------");
                    // System.out.println(i + " "+j);
                    spicture[i][j] = 0;
                    q.add(new Pair(i,j,k));
                    area ++;
                    bfs();
                }
            }
        }
        
        int[] answer = new int[2];
        answer[0] = area;
        answer[1] = max; 
        return answer;
    }
}
class Pair{
    int x;
    int y;
    long color;
    public Pair(int x, int y, long color){
        this.x = x;
        this.y = y;
        this.color = color;
    }
}