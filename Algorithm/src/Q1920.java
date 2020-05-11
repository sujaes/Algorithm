import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Q1920 {
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine()); // �ڿ��� N
        String[] beforeAArray = br.readLine().split(" "); // ��Ʈ�� �迭�� �޾����� Ư¡ ������ ��Ʈ�迭 ��� ���� ����
        int[] aArray = new int[n];
        
        /* ��Ʈ�� �迭�� ���� ���ڸ� ��Ʈ �迭�� �ٲ��� */
        for(int i=0; i< beforeAArray.length; i++){
            aArray[i] = Integer.parseInt(beforeAArray[i]);
        }
        
        /* ����Ž���� ���� ������������ ���� */
        Arrays.sort(aArray);
        
        int m = Integer.parseInt(br.readLine()); // M���� ��
        String[] beforeComArray = br.readLine().split(" ");
        int[] compareArray = new int[m];
        
        /* ��Ʈ�� �迭�� ���� ���ڸ� ��Ʈ �迭�� �ٲ��� */
        for(int j=0; j<beforeComArray.length; j++){
            compareArray[j] = Integer.parseInt(beforeComArray[j]); // �־��� ���� ���� �迭
        }
        
        for(int i =0; i<compareArray.length; i++){ // ���ݺ��� �־��� ���� aArray �迭�� ��� ���� ��ġ�ϴ��� �ݺ����� ���� ã�� ���̴�.
            int flag = 0;
            
            /* max�� min�� �ۿ��� �������ָ� while���� ���� �ʴ´�.(max, min ���� ��� �ʱ�ȭ ���־�� �ݺ���)*/
            /* �ֳ��ϸ� for�� �ۿ� max�� min�� �����صθ� while���� �� �� false�� �Ǿ��� ��, break �Ǳ� ������ �ٽ� ���� �ʴ´�*/
            int max = n; // ���� Ž�� ��� �� �� �߰����� ���ϱ� ���� �ִ밪, n�� �ϴ� ������ �迭�� ������ ��° ���� n-1��° �迭 ���� üũ�ϱ� ���ؼ�
            int min = -1; // ���� Ž�� ��� �� �� �߰����� ���ϱ� ���� �ּҰ�, -1�� �ϴ� ������ 0��° �迭���� üũ�ϱ� ���ؼ�
            int middle; 
            
            while(max - min > 1){ // max�� min ���̰� 2 �̻� ���� ������ max�� min ���̿� ������ �������� �ʴ´�.
                middle = (min+max)/2; // ����Ž���� �߰���
                
                if(compareArray[i] == aArray[middle]){
                    flag = 1; // �־��� ���� aArray�迭 �ȿ� ��� ������ 1�� break �ƴϸ� 0 ���
                    break;
                }
                if(compareArray[i] > aArray[middle]){ // �־��� ���� �߰������� ũ�� �߰����� �ּҰ��� �ȴ�.
                    min = middle;
                }else if(compareArray[i] < aArray[middle]){ // �־��� ���� �߰������� ������ �߰����� �ִ밪�� �ȴ�.
                    max = middle;
                }
                
            }
            System.out.println(flag);
            
        }
    }
}
