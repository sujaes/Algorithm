import java.util.*;
import java.io.*;

class Q14503 {
    static int stoi(String s) {
        return Integer.parseInt(s);
    }

    static int n, m;
    static int[][] map;
    static int r, c, d;
    static int[] dx = {-1, 0, 1, 0};    // 북동남서
    static int[] dy = {0, 1, 0, -1};
    static int turnCount = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        n = stoi(st.nextToken());
        m = stoi(st.nextToken());
        map = new int[n][m];

        st = new StringTokenizer(br.readLine());
        r = stoi(st.nextToken());
        c = stoi(st.nextToken());
        d = stoi(st.nextToken());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = stoi(st.nextToken());
            }
        }

        solution();
    }

    static void solution() {
        /**
         * 0 : 청소하지않은 공간
         * 1 : 벽
         * 2 : 청소한 공간
         */

        while (true) {
            if (turnCount == 4) {
                // 네 방향 모두 청소가 되어있거나 이미 벽이면 후진 후 2번으로
                int backX = r - dx[d];
                int backY = c - dy[d];

                if (map[backX][backY] == 1) {
                    // 벽이면 종료
                    System.out.println(getCleanArea());
                    return;
                } else {
                    // 벽 아니면 후진
                    setRobot(backX, backY, d, 0);
                }
            }

            // 1. 현재 위치 청소
            if (map[r][c] == 0)
                map[r][c] = 2;

            // 2. 현재 방향을 기준으로 왼쪽방향 확인
            int ld = (d + 3) % 4;
            int nx = r + dx[ld];
            int ny = c + dy[ld];

            // 3. 청소공간 있음 -> 한칸 전진 하고 1번으로
            // 4. 청소공간 없음 -> 그 방향으로 회전하고 2번으로
            if (map[nx][ny] == 0) {
                setRobot(nx, ny, ld, 0);
            } else {
                setRobot(r, c, ld, turnCount + 1);
            }
        }
    }

    // r, c, d, count 설정
    static void setRobot(int nextX, int nextY, int nextD, int nextCount) {
        r = nextX;
        c = nextY;
        d = nextD;
        turnCount = nextCount;
    }

    static int getCleanArea() {
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 2)
                    result++;
            }
        }
        return result;
    }
}