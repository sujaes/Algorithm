import java.util.*;
 
public class QTest {
    static ArrayList<Integer> tmp = new ArrayList<Integer>();//ť ó�� ���
    static ArrayList<Integer> list = new ArrayList<Integer>();//�ұ��� �� ����
    
    static long get_unlucky_number(int n) {
        long answer = 0;
        int cnt=0;
        tmp.add(4);
        tmp.add(13);
        
        while(true) {
            if(cnt > n) {
                break;
            }
            int num = tmp.remove(0);
            tmp.add(Integer.parseInt(num+"4"));
            tmp.add(Integer.parseInt(num+"13"));
            list.add(num);
            cnt++;
        }
        Collections.sort(list);//����
        return list.get(n-1);
    }
    public static void main(String[] args) {
        System.out.println(get_unlucky_number(8));
    }
}