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
		
		N = Integer.parseInt(st.nextToken()); // ��
		M = Integer.parseInt(st.nextToken()); // ��
		R = Integer.parseInt(st.nextToken()); // ���� �� 
		
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
			// �����ϱ�
			st = new StringTokenizer(br.readLine()," ");
			int Ar = Integer.parseInt(st.nextToken())-1;
			int Ac = Integer.parseInt(st.nextToken())-1;
			char direct = st.nextToken().charAt(0);
			
			Attack(Ar,Ac,direct);
			
			// �����ϱ�
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
		// Ư�� ����
		// 1. �̹� �Ѿ��� ���̳밡 �ִ� ĭ�� ������ ��� �ƹ��ϵ� �� �Ͼ��.
		// 2. �Ѿ����� ���� ���̳� ������� �ƹ��ϵ� ���Ͼ��.
		
		// ����
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
		int height = map[r][c]; // �ش� ���̳��� ���� 
		int nr = r;
		int nc = c;
		while( height > 0 ) {
			// ������ �ִٸ�
			if ( map[nr][nc] > 0 ) {
				height = Math.max(height, map[nr][nc]);
				height --;
				map[nr][nc] =0 ; // �����߸���
				answer ++;

			}
			// ������ �ִ���
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