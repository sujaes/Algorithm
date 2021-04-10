import java.util.Arrays;
import java.util.Scanner;
/*
 * Date 2021.04.08
 * author �����
 * ���ǿ� �˰����� �ڵ�����
 */

public class Ans_Tsp {
	static int n;
	static int min = Integer.MAX_VALUE;
	static int arr[][];
	static boolean visited[];
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		n = sc.nextInt();						//����� ����
		arr = new int[n][n];					//��忡�� ���� ���� ���� �Ÿ�
		visited = new boolean[n];				//���湮�Ǵܿ��� 
		
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				arr[i][j] = sc.nextInt();		//���� �ִ� ���� �Ÿ�
			}
		}
		
		for(int i=0; i<n; i++) {
			dfs(i,i,0,0);
		}
		System.out.println(min);
	}
	public static void dfs(int start, int end, int cnt, int sum) {
		if(cnt == n && start==end) {		//��� ���� �湮�ϰ� ���ƿ� ���
			min = Math.min(min, sum);
			return;
		}
		
		for(int idx=0; idx<n; idx++) {		//��� ��� ��ȸ
			if(arr[end][idx]==0) {			//���� ���°��
				continue;
			}
			if(!visited[end] && arr[end][idx]>0) {	//�湮�������� �����湮��ġ���� ���� �ִ� ���
				visited[end] = true;				//�湮�ϱ�
				sum += arr[end][idx];				//������ֱ�
				dfs(start, idx, cnt+1, sum);		//������ο� ���� �ִ� ��ΰ� ������� ���� ��η�
				visited[end] = false;				//�湮���ϱ�
				sum -= arr[end][idx];				//�滩�ֱ�
			}
		}	
	}
}