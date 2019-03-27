package git;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Q2583{
	static int arr[][];
	static int m,n,k,temp;
	static ArrayList<Integer >area;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		n = sc.nextInt();
		k = sc.nextInt();
		temp=0;
		area = new ArrayList<Integer>();
		arr = new int [m][n];
		for(int i = 0 ; i <k;i++){
			int a= sc.nextInt();
			int b= sc.nextInt();
			int c= sc.nextInt();
			int d= sc.nextInt();
			for(int j = b;j<d;j++){
				for(int l = a; l<c;l++){
					arr[j][l] = 1;
				}				
			}	
		}
		
		//main동작
		for(int i = 0;i<m;i++){
			for(int j = 0 ; j<n;j++){
				if(arr[i][j]==0){
					dfs(i,j);
					area.add(temp);
					temp=0;
				}
			}
		}
		
		//결과값
		Collections.sort(area);
		System.out.println(area.size());
		for(int i = 0 ; i <area.size();i++){
			System.out.print(area.get(i)+" ");
		}		
	}
	
	
	//dfs알고리즘
	public static void dfs(int s,int e){
		arr[s][e] = 3;	
		temp++;
		int dx[] = {1,0,0,-1};
		int dy[] = {0,1,-1,0};
		for(int i = 0 ; i <4; i++){
			if(s+dx[i]>=0 &&s+dx[i]<m &&e+dy[i]>=0 && e+dy[i]<n){
				if(arr[s+dx[i]][e+dy[i]]==0){
					dfs(s+dx[i],e+dy[i]);
				}				
			}	
		}
		
		
	}
}