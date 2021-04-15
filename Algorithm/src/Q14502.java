//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Scanner;
//
//class Node {
//    int x;
//    int y;
//    Node(int x, int y) {
//        this.x = x;
//    this.y = y;
//    }
//}
//public class Q14502 {
//    public static final int BLANK = 0;
//    public static final int WALL = 1;
//    public static final int VIRUS = 2;
//    public static final int[] dx = {0,0,1,-1};
//    public static final int[] dy = {1,-1,0,0};
//	
//    public static int n, m;
//    public static int[][] inputAry;
//    public static int[][] map;
//    public static int answer = Integer.MIN_VALUE;
//	
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        m = sc.nextInt();
//		
//        inputAry = new int[n][m];
//        map = new int[n][m];
//		
//        for(int i = 0; i < n; i++) {
//            for(int j = 0 ; j < m; j++) {
//            	inputAry[i][j] = map[i][j] = sc.nextInt();
//
//            }
//        }
//		
//        for(int i = 0; i < n; i++) {
//            for(int j = 0 ; j < m; j++) {
//                if(inputAry[i][j] == BLANK) {
//                    map[i][j] = WALL;
//                    dfs(1);
//                    map[i][j] = BLANK;
//                }
//            }
//        }
//        System.out.println(answer);
//    }
//    //벽 기둥 3개를 세우기 위한 함수
//    public static void dfs(int cnt) {
//        if(cnt == 3) {
//            bfs();
//            return;
//        }
//        for(int i = 0; i < n; i++) {
//            for(int j = 0 ; j < m; j++) {
//                if(map[i][j] == BLANK) {
//                    map[i][j] = WALL;
//					dfs(cnt+1);
//                    map[i][j] = BLANK;
//                }
//            }
//        }
//    }
//    public static void bfs() {
//        int[][] virusMap = new int[n][m];
//        for(int i = 0; i < n; i++) {
//            for(int j = 0; j < m; j++) {
//            	virusMap[i][j] = map[i][j];
//            }
//        }
//                
//        Queue<Node> q = new LinkedList<Node>();
//        for(int i = 0; i < n; i++) {
//            for(int j = 0; j < m; j++) {
//                if(virusMap[i][j] == VIRUS) {
//                    q.add(new Node(i,j));
//                }
//            }
//        }
//
//        while(!q.isEmpty()) {
//            Node p = q.remove();
//            int x = p.x;
//            int y = p.y;
//            for(int i = 0; i < 4; i++) {
//                int nx = x + dx[i];
//                int ny = y + dy[i];
//                if(nx >= 0 && ny >= 0 && nx < n && ny < m) {
//                    if(virusMap[nx][ny] == BLANK) {
//                        virusMap[nx][ny] = VIRUS;
//                        q.add(new Node(nx, ny));
//                    }
//                }
//            }
//        }
//        calAnswer(virusMap);
//    }
//
//    public static void calAnswer(int[][] virusMap) {
//        int cnt = 0;
//        for(int i = 0; i < n; i++) {
//            for(int j = 0; j < m; j++) {
//                if(virusMap[i][j] == BLANK) {
//                	cnt++;
//                }
//            }
//        }
//        answer = Math.max(cnt, answer);
//    }
//}




import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q14502 {
    static final int[] dx = {0,0,1,-1};
    static final int[] dy = {1,-1,0,0};
	static int arr[][];									//기본 상태
	static int virus[][];								//벽을 세운후 상태
    static int n, m,max = 0;
    static Queue<Node> vq = new LinkedList<Node>();		//바이러스 좌표 넣는 큐

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
		arr = new int[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0 ; j < m; j++) {
            	arr[i][j] = sc.nextInt();
            }
        }
        setblock(3);
        System.out.println(max);
    }
    public static void setblock(int r) {
    	if(r == 0) {    		
    		dfs();
            print();
    		return;
    	}
    	for(int i = 0 ; i < n ; i++) {
    		for(int j = 0 ; j < m ; j++) {
    			if(arr[i][j]==0) {
        	    	arr[i][j] = 1;
        	    	setblock(r-1);
        	    	arr[i][j] = 0;
        		}
    		}	
    	}
    }
    
    
    public static void dfs() {
    	virus = new int[n][m];		//바이러스 방문
    	for(int i = 0 ; i < n ; i++) {
    		for(int j = 0 ; j < m ; j++) {
    			virus[i][j] = arr[i][j];
    			if(virus[i][j] == 2) {
    	    		vq.add(new Node(i,j));	//바이러스 큐
    	    	}
    		}
    	}
    	
    	
    	while(!vq.isEmpty()) {
    		Node node = vq.poll();
    		int x = node.x;
    		int y = node.y;
        	for(int i = 0 ; i < 4; i++) {
        		int nx = x + dx[i];
        		int ny = y + dy[i];
        		if(nx<0 || ny<0 || nx>=n || ny >=m) {
        			continue;
        		}
        		if(virus[nx][ny] == 0 ) {
        			vq.add(new Node(nx,ny));
        			virus[nx][ny] =  2;
        		}
        	}
    	}
    }
    
    public static void print() {
    	int count = 0 ;
    	for(int i = 0; i < n; i++) {
    		for(int j = 0 ; j < m ; j++) {
    			if(virus[i][j] == 0) {
    				count++;
    			}
    		}
    	}
    	if(max < count) {
    		max = count;
    	}
    }
    
	public static class Node {
		int x;
		int y;
		Node(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}    
}
