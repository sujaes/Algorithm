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
        n = sc.nextInt(); // ���� ũ��
        m = sc.nextInt(); // ���� ũ��
        arr = new int[n][m];
        copy = new int[n][m];
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                arr[i][j] = sc.nextInt();
                if(arr[i][j]>0&&arr[i][j]<6)
                    list.add(new Pair(i,j,arr[i][j],0));
            }
        }
        // cctv�� �����鼭 ��� ��츦 ���캸��
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
    
    // �� �� �� ��
    static int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};
    private static void check(Pair t) {
        int tx = t.x,ty = t.y;
        switch (t.n) {
        case 1: // ����
            while(true) {
                tx = tx+dir[t.r][0];
                ty = ty+dir[t.r][1];
                if(tx<0 || ty<0 || tx>=n || ty>=m) break;
                // ���ñ��� �ٲ��ֱ�
                if(copy[tx][ty]==0) copy[tx][ty]=-1;
                // �� ������� ����
                else if(copy[tx][ty]==6) break;
            }
            break;
        case 2: // ����
            for(int i=0;i<3;i+=2) {
                tx = t.x; ty = t.y;
                while(true) {
                    tx = tx+dir[(t.r+i)%4][0];
                    ty = ty+dir[(t.r+i)%4][1];
                    if(tx<0 || ty<0 || tx>=n || ty>=m) break;
                    // ���ñ��� �ٲ��ֱ�
                    if(copy[tx][ty]==0) copy[tx][ty]=-1;
                    // �� ������� ����
                    else if(copy[tx][ty]==6) break;
                }
            }
            break;
        case 3: // ��
            for(int i=0;i<2;i++) {
                tx = t.x; ty = t.y;
                while(true) {
                    tx = tx+dir[(t.r+i)%4][0];
                    ty = ty+dir[(t.r+i)%4][1];
                    if(tx<0 || ty<0 || tx>=n || ty>=m) break;
                    // ���ñ��� �ٲ��ֱ�
                    if(copy[tx][ty]==0) copy[tx][ty]=-1;
                    // �� ������� ����
                    else if(copy[tx][ty]==6) break;
                }
            }
            break;
        case 4: // ��
            for(int i=0;i<3;i++) {
                tx = t.x; ty = t.y;
                while(true) {
                    tx = tx+dir[(t.r+i)%4][0];
                    ty = ty+dir[(t.r+i)%4][1];
                    if(tx<0 || ty<0 || tx>=n || ty>=m) break;
                    // ���ñ��� �ٲ��ֱ�
                    if(copy[tx][ty]==0) copy[tx][ty]=-1;
                    // �� ������� ����
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
                    // ���ñ��� �ٲ��ֱ�
                    if(copy[tx][ty]==0) copy[tx][ty]=-1;
                    // �� ������� ����
                    else if(copy[tx][ty]==6) break;
                }
            }
            break;
        }
    }
    
    static int result;
    private static void solve(int idx) {
        // idx�� ���� �����ϸ� ������ ����� ���� �ľ�
        if(idx>=list.size()) {
            // copy �迭 �ʱ�ȭ
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
        
 
        // ������ 0 1 2 3���� ����
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