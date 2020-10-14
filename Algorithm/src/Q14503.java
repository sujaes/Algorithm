import java.util.*;
import java.io.*;

class Q14503 {
    static int stoi(String s) {
        return Integer.parseInt(s);
    }

    static int n, m;
    static int[][] map;
    static int r, c, d;
    static int[] dx = {-1, 0, 1, 0};    // �ϵ�����
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
         * 0 : û���������� ����
         * 1 : ��
         * 2 : û���� ����
         */

        while (true) {
            if (turnCount == 4) {
                // �� ���� ��� û�Ұ� �Ǿ��ְų� �̹� ���̸� ���� �� 2������
                int backX = r - dx[d];
                int backY = c - dy[d];

                if (map[backX][backY] == 1) {
                    // ���̸� ����
                    System.out.println(getCleanArea());
                    return;
                } else {
                    // �� �ƴϸ� ����
                    setRobot(backX, backY, d, 0);
                }
            }

            // 1. ���� ��ġ û��
            if (map[r][c] == 0)
                map[r][c] = 2;

            // 2. ���� ������ �������� ���ʹ��� Ȯ��
            int ld = (d + 3) % 4;
            int nx = r + dx[ld];
            int ny = c + dy[ld];

            // 3. û�Ұ��� ���� -> ��ĭ ���� �ϰ� 1������
            // 4. û�Ұ��� ���� -> �� �������� ȸ���ϰ� 2������
            if (map[nx][ny] == 0) {
                setRobot(nx, ny, ld, 0);
            } else {
                setRobot(r, c, ld, turnCount + 1);
            }
        }
    }

    // r, c, d, count ����
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