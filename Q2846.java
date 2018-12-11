package git;

import java.util.*;

public class Q2846 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int up= 0;
		int max = 0;
		int arr[] = new int[a];
		for( int i=0;i<a;i++){
			arr[i]=sc.nextInt();
		}
		for( int i = 0 ; i <a-1;i++){
			for(int j=i+1;j<a;j++){
				if(arr[i]>=arr[j]){
					if(max<up){
						max =up;
					}
					up=0;
					break;
				}else{
					up+=arr[j]-arr[i];
					if(max<up){
						max =up;
					}
					break;
				}
			}
		}
		System.out.println(max);
		
	}
}