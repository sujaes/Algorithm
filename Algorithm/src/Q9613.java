import java.util.Scanner;
public class Q9613 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);        
        int num = sc.nextInt();      
        for(int i = 0 ; i <num;i++){
        	long sum=0;
        	int cycle = sc.nextInt();
        	int a[] = new int[cycle];
        	for(int j=0 ;j<cycle;j++){
        		a[j]=sc.nextInt();
        	}
        	for(int j=0;j<cycle;j++){
        		for(int k=0;k<j;k++){
        			sum+=gcd(a[j],a[k]);
        		}
        	}
        	System.out.println(sum);
        } 
    }
    public static int gcd(int a, int b){
    	int max =a;
    	int min =b;
    	int temp;
    	if(b>a){
    		max = b;
    		min = a;
    	}
    	while(min!=0){
    		temp = min;
    		min = max%min;
    		max = temp;
    	}
		return max;
    	
    }
}