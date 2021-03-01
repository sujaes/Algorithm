import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
 
public class Q17281 {
    static int N;
    static int[][] players; // N��° �̴׿��� Ÿ���� �ൿ
    static boolean[] select; // �Ʒ� �������� ���� boolean Ÿ�� �迭
    static int[] lineUp; // Ÿ��
    static int ans;
 
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
 
        players = new int[N + 1][10];
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= 9; j++) {
                players[i][j] = Integer.parseInt(st.nextToken());
            }
        }
 
        select = new boolean[10];
        lineUp = new int[10];
 
        select[4] = true; // 4�� Ÿ�ڴ� 1������ �����Ǿ�����.
        lineUp[4] = 1;
 
        ans = 0;
        perm(2);
 
        bw.write(ans + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
 
    // ����
    public static void perm(int num) {
        if (num == 10) {
            playBaseBall();
            return;
        }
 
        for (int i = 1; i <= 9; i++) {
            if (select[i]) {
                continue;
            }
            select[i] = true;
            lineUp[i] = num;
            perm(num + 1);
            select[i] = false;
        }
    }
 
    // �߱� ��� ����
    public static void playBaseBall() {
        int score = 0;
        int startPlayer = 1; // �̴׿��� ó�� �����ϴ� Ÿ��
        boolean[] base; // Ȩ, 1��, 2��, 3�縦 ǥ��.
 
        for (int i = 1; i <= N; i++) { // N��° �̴ױ��� ���� ����.
            int outCnt = 0;
            base = new boolean[4]; // base�� ���Ӱ� �ʱ�ȭ.
 
            outer: while (true) {
                for (int j = startPlayer; j <= 9; j++) {
                    int hitter = players[i][lineUp[j]]; // j��° Ÿ���� �ൿ.
 
                    switch (hitter) {
                    case 0: // out.
                        outCnt++;
                        break;
                    case 1: // 1��Ÿ
                        for (int k = 3; k >= 1; k--) {
                            if (base[k]) {
                                if (k == 3) { // 3�翡 �ִ� ������ Ȩ���� ����.
                                    score++; // ���ÿ� ���� ȹ��.
                                    base[k] = false; // 3��� ����ְ� ��.
                                    continue;
                                }
 
                                // 1, 2�翡 ��� 1�羿 �����ϰ� ���� �ִ� �ڸ��� ����ְ� ��.
                                base[k] = false;
                                base[k + 1] = true;
                            }
                        }
                        base[1] = true; // Ȩ���� 1��� ����.
                        break;
                    case 2: // 2��Ÿ
                        for (int k = 3; k >= 1; k--) {
                            if (base[k]) {
                                if (k == 3 || k == 2) { // 3�� Ȥ�� 2�翡 �ִ� ������ Ȩ���� ����.
                                    score++; // ���ÿ� ���� ȹ��.
                                    base[k] = false; // 2�� �Ǵ� 3��� ����ְ� ��.
                                    continue;
                                }
 
                                // 1�翡 ��� 2�羿 �����ϰ� ���� �ִ� �ڸ��� ����ְ� ��.
                                base[k] = false;
                                base[k + 2] = true;
                            }
                        }
                        base[2] = true; // Ȩ���� 2��� ����.
                        break;
                    case 3: // 3��Ÿ
                        for (int k = 3; k >= 1; k--) {
                            if (base[k]) { // Ȩ ���� ��� ������ Ȩ���� ����.
                                score++; // ���ÿ� ���� ȹ��.
                                base[k] = false;
                            }
                        }
 
                        base[3] = true; // Ȩ���� 3��� ����.
                        break;
                    case 4: // Ȩ��
                        for (int k = 1; k <= 3; k++) {
                            if (base[k]) { // ��� ��� ���ڰ� Ȩ���� ����.
                                score++; // ���� 1�� �� ���� 1���� ȹ��
                                base[k] = false;
                            }
                        }
                        score++; // Ȩ��ģ Ÿ���� ���� 1�� �߰�.
                        break;
                    }
 
                    if (outCnt == 3) { // �ƿ� ī��Ʈ�� 3�� �� ���
                        // startPlayer�� �� ���� Ÿ�ڷ� �ʱ�ȭ ��.
                        startPlayer = j + 1;
                        if (startPlayer == 10) {
                            startPlayer = 1;
                        }
                        break outer;
                    }
                }
                // startPlayer�� 1�� �ʱ�ȭ�� �ִ� ����
                // 1~9������ Ÿ�ڰ� �� �̴׿� ���� ��Ÿ�� �ļ� �ƿ�ī��Ʈ�� �߻����� �ʰ� �Ǹ�,
                // �� �ݺ����� ���� ������ ���⶧���� startPlayer = 1�� �ʱ�ȭ�ؾ� ��.
                startPlayer = 1;
            }
        }
 
        ans = Math.max(ans, score);
    }
 
}
