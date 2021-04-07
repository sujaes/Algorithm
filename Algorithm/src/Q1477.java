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
		arr[0] = 0;		//시작점
		for(int i = 1 ; i <= now; i++) {
			arr[i] = sc.nextInt();
		}
		arr[now+1] = len;	//끝점
		Arrays.sort(arr);		
		
		while(left<=right) {
			mid = (left+right)/2;	//거리를 구해주기(편의점 세울 거리)
			int temp =0;			//세울거리에 따라서 세울수 있는 편의점갯수를 저장
			for(int i=1; i <arr.length;i++) {
				int dist = arr[i]- arr[i-1];	//사이 거리에 
				temp += (dist/mid);				//세울수 있는 편의점 갯수
				if(dist%mid ==0) {				//나누어떨어지면 이미 있는 편의점과 겹치는것
					temp--;
				}
			}
			if(temp >next) {					//더 많이세워지면 기존간격보다 넓혀야함.
				left =mid+1;
			}else {
				right = mid-1;					
			}
		}
		System.out.println(left);
		
	}
}
