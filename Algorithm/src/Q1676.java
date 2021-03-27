import java.util.*;
public class Q1676 {
	 
    public static void main(String[] args){

    	Scanner sc  =new Scanner(System.in);
    	int n = sc.nextInt();
    	int input=1;
    	int five=0;
	
    	for(int i=1; i<=n; i++) {
		
    		input = i; 
	
    		while (input % 2 == 0 || input % 5 == 0) {
    			if(input % 2 ==0) {
    				input /= 2;
    			}
    			if(input % 5 ==0) {
    				input /=5;
    				five++;
    			}
    		}
		
    	}
    	System.out.println(five);
	}	
}