import java.util.Scanner;
public class Q2875{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //����
		int m = sc.nextInt(); //����
		int k = sc.nextInt(); //�����ϴ� �ο�

		while(k!=0) {
			//���ڰ� ��������
			if(n > m*2) {
				n--;
			}else if(n< m*2){//���ڰ� ��������
				m--;
			}else {//���ڿ��� ���� ������
				n--;
			}
			k--;
		}
		
		if(n >= m*2) {
			System.out.println(m);
		}else {
			System.out.println(n/2);
		}
		
		
    }    
}
