

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
class Q2293{
	int n,m;
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		int d[]= new int[m+1];
		//√ ±‚»≠
		for(int i=0;i<n;i++){
			list.add(sc.nextInt());
		}
		Collections.sort(list);
		d[0]=1;
		
		for(int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++) {
				if (j >= list.get(i-1)) {
					d[j] += d[j-list.get(i-1)];
				}
			}
		}
		System.out.println(d[m]);
		
	}
}