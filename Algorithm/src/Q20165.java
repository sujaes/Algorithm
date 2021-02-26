import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q20165 {

	static int[][] map, temp;
	static int[] dr = {-1, 0, 1, 0};
	static int[] dc = { 0, 1, 0, -1};
	static int answer;
	static int N, M, R;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine()," ");
		
		N = Integer.parseInt(st.nextToken()); // 행
		M = Integer.parseInt(st.nextToken()); // 열
		R = Integer.parseInt(st.nextToken()); // 라운드 수 
		
		map = new int[N][M];
		temp = new int[N][M];
		
		for( int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine()," ");
			for( int j=0; j<M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for( int i=0; i<N; i++) {
			for( int j=0; j<M; j++) {
				temp[i][j] = map[i][j];
			}
		}
		
		
		for( int r=0; r<R; r++) {
			// 공격하기
			st = new StringTokenizer(br.readLine()," ");
			int Ar = Integer.parseInt(st.nextToken())-1;
			int Ac = Integer.parseInt(st.nextToken())-1;
			char direct = st.nextToken().charAt(0);
			
			Attack(Ar,Ac,direct);
			
			// 수비하기
			st = new StringTokenizer(br.readLine()," ");
			int Dr = Integer.parseInt(st.nextToken())-1;
			int Dc = Integer.parseInt(st.nextToken())-1;
			int t = temp[Dr][Dc];
			map[Dr][Dc] = t;
		}
		
		System.out.println(answer);
		for( int[] output : map) {
			for( int out : output) {
				System.out.print(out>=1 ? "S " : "F ");
			}
			System.out.println();
		}
	}
	private static void Attack(int r, int c, char direct) {
		// 특이 사항
		// 1. 이미 넘어진 도미노가 있는 칸을 공격한 경우 아무일도 안 일어난다.
		// 2. 넘어지지 않은 도미노 세우려면 아무일도 안일어난다.
		
		// 방향
		int direction =0;
		switch( direct) {
		case 'E' : 
			direction = 1;
			break;
		case 'W' :
			direction = 3;
			break;
		case 'S' :
			direction = 2;
			break;
		case 'N' :
			direction = 0;
			break;
		default:
			break;
		}
		int height = map[r][c]; // 해당 도미노의 높이 
		int nr = r;
		int nc = c;
		while( height > 0 ) {
			// 세워져 있다면
			if ( map[nr][nc] > 0 ) {
				height = Math.max(height, map[nr][nc]);
				height --;
				map[nr][nc] =0 ; // 쓰러뜨리기
				answer ++;

			}
			// 눕혀져 있더라도
			else {
				height --;
			}
			nr = nr + dr[direction];
			nc = nc + dc[direction];
			
			if ( !isIn(nr,nc)) break;
		}

	}
	private static boolean isIn(int r , int c ) {
		if ( r>=0 && r<N && c>=0 && c<M) return true;
		
		return false;
	}
}