import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
 
public class Q1525 {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = 0;
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                int k = scan.nextInt();
                if(k == 0) { //0�� 9�� �ٲ�
                    k = 9;
                }
                start = (start*10) +k; //2�����迭�� �ϳ��� ������ ��Ÿ���� ���ؼ�
            }
        }
        
        Queue<Integer> q = new LinkedList<>();
        Map<Integer, Integer> m = new HashMap<>();
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};
        
        m.put(start, 0);
        q.add(start);
        
        while(!q.isEmpty()) {
            int nowNum = q.poll();
            String now = String.valueOf(nowNum); 
            int nine = now.indexOf("9"); //9�� �ε����� ã�´�.
            int x = nine / 3; // 9�� 2�����迭���� �� ��° ������ ���
            int y = nine % 3; // 9�� 2�����迭���� �� ��° ������ ���
            for(int i=0; i<4; i++) {
                int nx = x+dx[i]; //�̵��� �����¿��� �� ���
                int ny = y+dy[i]; //�̵��� �����¿��� �� ���
                int move = nx*3+ny; //�̵��� �����¿��� 1�����迭������ �ε���
                if (nx >= 0 && nx < 3 && ny >= 0 && ny < 3) {
                    StringBuilder next = new StringBuilder(now);
                    //9�� �̵��� �����¿� �����ϱ�
                    char temp = next.charAt(move);
                    next.setCharAt(move, '9'); //�̵��� �ε����� 9��
                    next.setCharAt(nine, temp); //���� 9�ڸ��� �̵��� ���� ����
                    int nextNum = Integer.parseInt(next.toString());
                    if(!m.containsKey(nextNum)) { //�ʿ� �� ���̵��ߴ��� ����
                        m.put(nextNum, m.get(nowNum)+1);
                        q.add(nextNum);
                    }
                }
            }
        }
        if(m.containsKey(123456789)) {
            System.out.println(m.get(123456789));
        }
        else
            System.out.println(-1);
    }
}