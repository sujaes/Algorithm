package git;

import java.util.*;

class Q3052{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a[] = new int [10];
		int count = 1;
		for( int i = 0 ; i <10; i ++){
			a[i]=sc.nextInt()%42;
		}
		Arrays.sort(a);
		for(int i = 0 ; i <9; i++){
			if(a[i]!=a[i+1]){
				count++;
			}
		}
		System.out.println(count);
	}
}