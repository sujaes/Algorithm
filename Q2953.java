package git;

import java.util.*;

public class Q2953{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int usernum=0;
		int user[] = new int[5];
		for(int i = 0 ; i <5; i++){
			int sum = 0 ;
			for( int j=0;j<4;j++){
				sum+=sc.nextInt();
			}
			user[i]= sum;
			if(max<user[i]){
				max= user[i];
				usernum = i+1;
			}
		}
		System.out.println(usernum+" "+max);
	}
}
