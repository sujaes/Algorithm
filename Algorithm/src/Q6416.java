import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Q6416 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set;
        int[] income;
        int testcase = 0;
        int root;
        boolean flag;		//�������� üũ
        int edge; // ������ ����

        while(true) {
            set = new HashSet<>();
            income = new int[1001];
            root = 0;
            testcase++;
            flag = false;
            edge = 0;

            while(true) {
                int start = sc.nextInt();
                int end = sc.nextInt();

                if (start == 0 && end == 0) {		//testcase �Ѱ� ������
                	break;
                }
                if (start == -1 && end == -1) {	//���α׷� �����ϱ�
                	return;
                }

                set.add(start);
                set.add(end);
                income[end]++;
                edge++;
            }
            if(set.size()==0) { //��Ʈ���� Ʈ��
                System.out.println("Case "+ testcase +" is a tree.");
                continue;
            }

            Iterator iter = set.iterator();
            while(iter.hasNext()) {
                int num = (int)iter.next();
                if(income[num]==0) {	//�� Ʈ���� ������ ������ �׷�����.
                	root++; 
                }
                if(income[num]>1) {
                	flag = true; // ���԰���>2�̸�
                    break;
                }
            }

            if(flag || root!=1 || set.size()-edge!=1) { // ���԰���>2 or ��Ʈ�� ������ or ���-����!=1
                System.out.println("Case "+ testcase +" is not a tree.");
            }else {
                System.out.println("Case "+ testcase +" is a tree.");
            }
        }
    }
}