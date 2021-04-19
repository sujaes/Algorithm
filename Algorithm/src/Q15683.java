import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Q15683 {
    static int n,m;
    static int[][] arr;
    static List<Pair> list = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 세로 크기
        m = sc.nextInt(); // 가로 크기
        arr = new int[n][m];
        copy = new int[n][m];
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                arr[i][j] = sc.nextInt();
                if(arr[i][j]>0&&arr[i][j]<6)
                    list.add(new Pair(i,j,arr[i][j],0));
            }
        }
        // cctv를 돌리면서 모든 경우를 살펴보자
        result = 100;
        solve(0);
        System.out.println(result);
    }
    
    
    static int[][] copy;
    private static void init() {
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++)
                copy[i][j] = arr[i][j];
        }
    }
    
    // 우 하 좌 상
    static int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};
    private static void check(Pair t) {
        int tx = t.x,ty = t.y;
        switch (t.n) {
        case 1: // 한쪽
            while(true) {
                tx = tx+dir[t.r][0];
                ty = ty+dir[t.r][1];
                if(tx<0 || ty<0 || tx>=n || ty>=m) break;
                // 감시구역 바꿔주기
                if(copy[tx][ty]==0) copy[tx][ty]=-1;
                // 벽 만날경우 종료
                else if(copy[tx][ty]==6) break;
            }
            break;
        case 2: // 양쪽
            for(int i=0;i<3;i+=2) {
                tx = t.x; ty = t.y;
                while(true) {
                    tx = tx+dir[(t.r+i)%4][0];
                    ty = ty+dir[(t.r+i)%4][1];
                    if(tx<0 || ty<0 || tx>=n || ty>=m) break;
                    // 감시구역 바꿔주기
                    if(copy[tx][ty]==0) copy[tx][ty]=-1;
                    // 벽 만날경우 종료
                    else if(copy[tx][ty]==6) break;
                }
            }
            break;
        case 3: // ㄴ
            for(int i=0;i<2;i++) {
                tx = t.x; ty = t.y;
                while(true) {
                    tx = tx+dir[(t.r+i)%4][0];
                    ty = ty+dir[(t.r+i)%4][1];
                    if(tx<0 || ty<0 || tx>=n || ty>=m) break;
                    // 감시구역 바꿔주기
                    if(copy[tx][ty]==0) copy[tx][ty]=-1;
                    // 벽 만날경우 종료
                    else if(copy[tx][ty]==6) break;
                }
            }
            break;
        case 4: // ㅗ
            for(int i=0;i<3;i++) {
                tx = t.x; ty = t.y;
                while(true) {
                    tx = tx+dir[(t.r+i)%4][0];
                    ty = ty+dir[(t.r+i)%4][1];
                    if(tx<0 || ty<0 || tx>=n || ty>=m) break;
                    // 감시구역 바꿔주기
                    if(copy[tx][ty]==0) copy[tx][ty]=-1;
                    // 벽 만날경우 종료
                    else if(copy[tx][ty]==6) break;
                }
            }
            break;
        case 5: // +
            for(int i=0;i<4;i++) {
                tx = t.x; ty = t.y;
                while(true) {
                    tx = tx+dir[(t.r+i)%4][0];
                    ty = ty+dir[(t.r+i)%4][1];
                    if(tx<0 || ty<0 || tx>=n || ty>=m) break;
                    // 감시구역 바꿔주기
                    if(copy[tx][ty]==0) copy[tx][ty]=-1;
                    // 벽 만날경우 종료
                    else if(copy[tx][ty]==6) break;
                }
            }
            break;
        }
    }
    
    static int result;
    private static void solve(int idx) {
        // idx가 끝에 도달하면 정해진 값들로 범위 파악
        if(idx>=list.size()) {
            // copy 배열 초기화
            init();
            for(Pair t: list)
                check(t);
            int cnt = 0;
            for(int i=0;i<n;i++) {
                for(int j=0;j<m;j++) 
                    if(copy[i][j]==0) cnt++;
            }
            result = Math.min(result, cnt);
            return;
        }
        
 
        // 방향을 0 1 2 3으로 조정
        for(int i=0;i<=3;i++) {
            list.get(idx).r=i;
            solve(idx+1);
        }
    }
    
    static class Pair{
        private int x,y,n,r;
        Pair(int x,int y,int n,int r){
            this.x = x;
            this.y = y;
            this.n = n;
            this.r = r;
        }
    }
}