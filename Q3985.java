package git;

import java.util.*;
public class Q3985{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a,b;
		//end-start 기대값
		int max = 0;
		//기대값을 가진 배열의 인덱스
		int maxindex=-1;
		a = sc.nextInt();
		b = sc.nextInt();
		//기존 배열
		int arr[] = new int[a];
		//기대값을 저장할 배열
		int init[] = new int[b];
		//실제값을 갯수를 저장할 배열
		int realindex[] = new int [b];
		//실제갯수를 비교해서 최대값의 인덱스를 저장할 변수
		int realmaxindex= 0;
		
		for(int i = 1 ; i <=b;i++){
			int start = sc.nextInt();
			int end = sc.nextInt();
			init[i-1] = end-start;
			if(init[i-1]>max){
				max = init[i-1];
				maxindex = i;
			}
			//배열에 실제값 입력하기
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