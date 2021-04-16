//import java.util.Scanner;
//
//public class Q15685 {
//	static int arr[][] = new int[101][101];
//	static boolean visited[][] = new boolean[101][101];
//	static int dx[] = {1,0,-1,0};
//	static int dy[] = {0,-1,0,1};
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i = 0 ; i < n; i++) {
//        	int x = sc.nextInt();
//        	int y = sc.nextInt();
//        	int d = sc.nextInt();
//        	int g = sc.nextInt();
//        	int curve_size = 0;
//        	int curve[] = new int[1024];
//        	curve[curve_size ++] = d;
//        	arr[x][y] = 1;
//        	
//        	for(int  j = 0 ; j < g ; j++) {
//        		for(int k = curve_size -1; k>=0; k--) {
//        			curve[curve_size++] = (curve[k]+1)%4;
//        		}
//        	}
//        	for(int j = 0 ; j < curve_size;j++) {
//        		y = y + dy[curve[j]];
//        		x = x + dx[curve[j]];
//        		if(x < 0 || y < 0 || x >= 101 || y >= 101) {
//        			continue;
//        		}
//        		arr[x][y] = 1;
//        	}
//        }
//        int res = 0;
//        for(int i = 0; i< 100; i++) {
//        	for(int j = 0 ; j < 100 ; j++) {
//        		if(arr[i][j] ==1 && arr[i+1][j] ==1&&arr[i][j+1] ==1&&arr[i+1][j+1] ==1) {
//        			res++;
//        		}
//        	}
//        }
//        System.out.println(res);   
//    }   
//}




import java.util.Scanner;

public class Q15685 {
	static boolean visited[][];
	static int dragon[];				//각각의 방향을 기억해주는 배열
	static int leng = 0;				//한세대의 길이를 계속 갱신하는 수
	static int dx[] = {1,0,-1,0}; //오위왼아
	static int dy[] = {0,-1,0,1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        visited = new boolean[101][101];
        dragon = new int[1024];
        int n = sc.nextInt();
        for(int i = 0 ; i < n ;i++) {
        	int s = sc.nextInt();
        	int e = sc.nextInt();
        	int d = sc.nextInt();
        	int g = sc.nextInt();					//0(오른쪽) -> 1(위), 1(위) -> 2(왼쪽), 2(왼쪽) -> 3(아래), 3(아래) -> 0(오른쪽)
        	curve(s,e,d,g);
        }
        System.out.println(count());
    }
    public static void curve(int s, int e, int d ,int g) {
    	visited[s][e] = true;								//시작점 방문
    	dragon[0] = d;										//시작점 방향기억
    	leng = 1;											//시작점이 있으므로 leng =1
    	for(int  j = 0 ; j < g ; j++) {						//세대
    		for(int k = leng -1; k>=0; k--) {				//한세대 길이를 끝부터 역순으로
    			dragon[leng++] = (dragon[k]+1)%4;
    		}
    	}
    	for(int i = 0 ; i <leng;i++ ) {
        	int ns = s + dx[dragon[i]];
        	int ne = e + dy[dragon[i]];
        	if( ns >= 0 && ne >= 0 && ns <= 100 && ne <= 100) {
        		visited[ns][ne] =true;
        		s = ns;
        		e = ne;
        	}

    	}
    }
    public static int count() {
    	int res = 0;
    	for(int i = 0 ; i < 100;i++) {
    		for(int j = 0 ; j < 100 ;j++) {
    			if(visited[i][j] && visited[i+1][j+1] && visited[i+1][j] && visited[i][j+1]) {
    				res++;
    			}
    		}
    	}
    	return res;
    }
    
}