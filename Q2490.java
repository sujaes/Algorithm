package git;

import java.util.*;

public class Q2490 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		for(int i = 0 ; i <3; i++){
			int sum = 0;
			char st=' ';
			for(int j = 0;j<4;j++){
				sum = sum+sc.nextInt();
			}
			if(sum==0){
				st = 'D';
			}else if(sum==1){
				st='C';
			}else if(sum==2){
				st='B';
			}else if(sum==3){
				st='A';
			}else if(sum==4){
				st='E';
			}
			System.out.println(st);
		}
	}
}
