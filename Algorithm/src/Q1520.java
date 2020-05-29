import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
 
public class Q1520 {

    static int vertical; // ����(��)
    static int horizontal; // ����(��)
    static int[][] map; // ����
    static int[][] memoization; // �޸������̼�
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        vertical = sc.nextInt();
        horizontal = sc.nextInt();
        map = new int[vertical][horizontal];
        memoization = new int[vertical][horizontal];
        
        
        for(int i=0; i<vertical; i++) {
            for(int j=0; j<horizontal; j++) {
                map[i][j] = sc.nextInt();
                memoization[i][j] = -1;
            }
        }
        System.out.println(findWay(0,0));
    }
        
        private static int findWay(int x, int y) {
            
            if(x == vertical-1 && y == horizontal-1) { // ���������� �����ϸ� ����� �� 1�� �����Ѵ�
                return 1;
            }
            
            if(memoization[x][y] == -1) { // ����� ���� ���� �� ����, �湮�� �� ���� ��츸 ���
                memoization[x][y] = 0;
                
                // ���� �̵�
                if(x > 0 && map[x][y] > map[x-1][y]) {
                    memoization[x][y] += findWay(x-1, y);
                }
                // �Ʒ��� �̵�
                if(x < vertical-1 && map[x][y] > map[x+1][y]) {
                    memoization[x][y] += findWay(x+1, y);
                }
                // �������� �̵�
                if(y > 0 && map[x][y] > map[x][y-1]) {
                    memoization[x][y] += findWay(x, y-1);
                }
                // ���������� �̵�
                if(y < horizontal-1 && map[x][y] > map[x][y+1]) {
                    memoization[x][y] += findWay(x, y+1);
                }
            }
            return memoization[x][y]; // �̹� �ͺô� ��ζ�� ���� ����� ���� return
            
        }    
    
}