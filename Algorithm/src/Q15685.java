import java.util.Scanner;

public class Q15685 {
	static int arr[][] = new int[101][101];
	static boolean visited[][] = new boolean[101][101];
	static int dx[] = {1,0,-1,0};
	static int dy[] = {0,-1,0,1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i < n; i++) {
        	int x = sc.nextInt();
        	int y = sc.nextInt();
        	int d = sc.nextInt();
        	int g = sc.nextInt();
        	int curve_size = 0;
        	int curve[] = new int[1024];
        	curve[curve_size ++] = d;
        	arr[x][y] = 1;
        	
        	for(int  j = 0 ; j < g ; j++) {
        		for(int k = curve_size -1; k>=0; k--) {
        			curve[curve_size++] = (curve[k]+1)%4;
        		}
        	}
        	for(int j = 0 ; j < curve_size;j++) {
        		y = y + dy[curve[j]];
        		x = x + dx[curve[j]];
        		if(x < 0 || y < 0 || x >= 101 || y >= 101) {
        			continue;
        		}
        		arr[x][y] = 1;
        	}
        }
        int res = 0;
        for(int i = 0; i< 100; i++) {
        	for(int j = 0 ; j < 100 ; j++) {
        		if(arr[i][j] ==1 && arr[i+1][j] ==1&&arr[i][j+1] ==1&&arr[i+1][j+1] ==1) {
        			res++;
        		}
        	}
        }
        System.out.println(res);
        
    }
    
}