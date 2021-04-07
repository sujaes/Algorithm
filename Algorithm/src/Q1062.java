import java.util.Scanner;

public class Q1062 {
    static int n, k, answer;
    static boolean[][] word;
    static boolean[] visit;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); 
        k = sc.nextInt(); 
        word = new boolean[n][26];
        for (int i = 0; i < n; i++) {
            String tmp = sc.next();
            for (int j = 0; j < tmp.length(); j++) {
                word[i][tmp.charAt(j) - 'a'] = true;	//�ܾ� ������ �ش� ����
            }
        }
        visit = new boolean[26];
        answer = 0;
        backtrack(0, 0);
        System.out.println(answer);
    }

    private static void backtrack(int index, int depth) {
        if (depth == k) {				//k�� �湮������
            check();					//�ִ밪 ���ϱ�
            return;
        }
        for (int i = index; i < 26; i++) {
            if (!visit[i]) {			//�湮���� ���� ���ĺ�
                visit[i] = true;		//�湮
                backtrack(i, depth + 1);//����
                visit[i] = false;		//�湮���
            }
        }

    }

    private static void check() {
        int ret = 0;

        boolean flag = true;
        for (int l = 0; l < n; l++) {
            flag = true;
            for (int i = 0; i < 26; i++) {
                if (word[l][i] && !visit[i]) {	//���ڰ� ���Եǰ�	�湮����������
                    flag = false;
                    break;
                }
            }
            if (flag)
                ret++;
        }

        answer = Math.max(ret, answer);
    }
}

