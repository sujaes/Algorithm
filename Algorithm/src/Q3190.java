import java.util.*;
public class Q3190{
    public static int[][] map = new int[101][101];
    public static int[] dx = {-1, 0, 1, 0}; // 북, 동, 남, 서
    public static int[] dy = {0, 1, 0, -1};
    public static Deque<Point> q = new LinkedList<Point>();
    public static int n, l, answer = 0;
    public static int[] time;
    public static String[] direction;

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            map[r][c] = 2;  // 사과
        }

        l = sc.nextInt();
        time = new int[l];
        direction = new String[l];
        for (int i = 0; i < l; i++) {
            time[i] = sc.nextInt();
            direction[i] = sc.next();
        }

        q.add(new Point(1, 1));
        map[1][1] = 1;

        playGame(1, 1, 1);

        System.out.println(answer);
    }

    public static void playGame(int x, int y, int d) {
        int i = 0;
        while (true) {
            if (i < l && answer == time[i]) {
                if (direction[i].equals("D")) { // 우회전
                    d = (d + 1) % 4;
                } else if (direction[i].equals("L")) {  // 좌회전
                    d = (d + 3) % 4;
                }
                i++;
            }

            int nx = x + dx[d];
            int ny = y + dy[d];
            q.addFirst(new Point(nx,ny));   // 머리를 다음칸에 위치

            if (nx <= 0 || ny <= 0 || nx > n || ny > n) {   // 밖으로 나가는 경우
                answer++;
                break;
            }

            if (map[nx][ny] == 2) { // 사과가 있다면
                map[nx][ny] = 1;
            } else if (map[nx][ny] == 0) {    // 사과가 없다면
                map[nx][ny] = 1;
                map[q.peekLast().x][q.peekLast().y] = 0;    // 꼬리가 위치한 칸 비워주기
                q.pollLast();
            } else {  // 자기 자신과 부딪힌다면
                answer++;
                break;
            }

            x = nx;			//x값 갱신
            y = ny;			//y값 갱신
            answer++;
        }
    }
    public static class Point{
    	int x;
    	int y;
    	public Point(int x, int y) {
    		this.x = x;
    		this.y = y; 
    	}
    	
    }
}