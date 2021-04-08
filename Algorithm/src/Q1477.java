import java.util.*;
public class Q1477 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int now = sc.nextInt();
		int next = sc.nextInt();
		int len = sc.nextInt();
		int left = 1;
		int right = len-1;
		int mid = 0;
		int arr[] = new int[now+2];
		arr[0] = 0;		//������
		for(int i = 1 ; i <= now; i++) {
			arr[i] = sc.nextInt();
		}
		arr[now+1] = len;	//����
		Arrays.sort(arr);		
		
		while(left<=right) {
			mid = (left+right)/2;	//�Ÿ��� �����ֱ�(������ ���� �Ÿ�)
			int temp =0;			//����Ÿ��� ���� ����� �ִ� ������������ ����
			for(int i=1; i <arr.length;i++) {
				int dist = arr[i]- arr[i-1];	//���� �Ÿ��� 
				temp += (dist/mid);				//����� �ִ� ������ ����
				if(dist%mid ==0) {				//����������� �̹� �ִ� �������� ��ġ�°�
					temp--;
				}
			}
			if(temp >next) {					//�� ���̼������� �������ݺ��� ��������.
				left =mid+1;
			}else {
				right = mid-1;					
			}
		}
		System.out.println(left);
		
	}
}
