import java.util.*;
/*
 * Date 2021.04.08
 * author �����
 * �÷��̵�ͼ� �ִܰŸ� �˰��� �ڵ�����
 */
public class Ans_Flod {
    public static int cityCount;
    public static int[][] distance;
    public static final int INF = 1000000000;
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        
        cityCount = sc.nextInt();
        int busCount = sc.nextInt();
        
        distance = new int[cityCount+1][cityCount+1];
        
        for(int i=1; i <= cityCount; i++) {
            for(int j=1; j <= cityCount; j++) {
                if(i == j) continue;										//�������� ���� �� ����
                distance[i][j] = INF;										//������ �������� �ʱ�ȭ
            }
        }
        
        while(busCount-- > 0) {
            
            int start = sc.nextInt();
            int end = sc.nextInt();
            int time = sc.nextInt();
            
            distance[start][end] = Math.min(distance[start][end], time);    //����ġ�� ���� ������ �ʱ�ȭ
        }
 
        floyd();
        print();
    }
    
    public static void floyd() {
        // ������ �Ǵ� ���İ��� ��� K
        for(int k = 1; k <= cityCount; k++) {
            // ����ϴ� ��� i
            for(int i=1; i <= cityCount; i++) {
                // �����ϴ� ��� j
                for(int j=1; j <= cityCount; j++) {
                    //i���� k�� ���ƴٰ� k���� j ���� ���� �Ÿ��� i���� j ���� ���� �Ÿ��� ���ؼ� ���� ���� �ּҰŸ��̴�.
                    distance[i][j] = Math.min(distance[i][k] + distance[k][j], distance[i][j]);
                }
            }
        }
    }
    
    public static void print() {
        StringBuilder sb = new StringBuilder();
        for(int i=1; i <= cityCount; i++) {
            for(int j=1; j <= cityCount; j++) {
                if(distance[i][j] >= INF) sb.append("0 ");
                else sb.append(distance[i][j] + " ");
            }
            sb.append("\n");
        }
        
        System.out.println(sb.toString());
    }
}
