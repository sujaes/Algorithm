package git;

import java.util.*;
public class Q3985{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a,b;
		//end-start ��밪
		int max = 0;
		//��밪�� ���� �迭�� �ε���
		int maxindex=-1;
		a = sc.nextInt();
		b = sc.nextInt();
		//���� �迭
		int arr[] = new int[a];
		//��밪�� ������ �迭
		int init[] = new int[b];
		//�������� ������ ������ �迭
		int realindex[] = new int [b];
		//���������� ���ؼ� �ִ밪�� �ε����� ������ ����
		int realmaxindex= 0;
		
		for(int i = 1 ; i <=b;i++){
			int start = sc.nextInt();
			int end = sc.nextInt();
			init[i-1] = end-start;
			if(init[i-1]>max){
				max = init[i-1];
				maxindex = i;
			}
			//�迭�� ������ �Է��ϱ�
			while(start<=end){
				if(arr[start-1]==0){
					arr[start-1]=i;

				}
				start++;
			}
		}		
		
		
		for(int i = 0 ; i < a;i++){
			for(int j = 1 ; j <=b;j++){
				if(arr[i]==j){
					realindex[j-1]++;
				}
			}
		}
		max = 0 ;
		for(int i = 1 ; i <= b; i++){
			if(realindex[i-1]>max){
				max = realindex[i-1];
				realmaxindex = i;
			}
		}
	
		System.out.println(maxindex);
		System.out.println(realmaxindex);
	}
}