import java.util.*;
class Q2577{
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int a,b,c,result;
    	int []count= {0,0,0,0,0,0,0,0,0,0};
    	String st;
    	a= sc.nextInt();
    	b= sc.nextInt();
    	c= sc.nextInt();
    	result = a*b*c;
    	st= String.valueOf(result);
    	int in = Integer.parseInt(st);
    	for(int i = 0 ; i<st.length();i++){
    		for(int j =0; j<10;j++){
    			int k = st.charAt(i)-48;
    			if(k==j){
    				count[j]++;
    			}
    		}
    	}
    	for(int i=0;i<10;i++){
    		System.out.println(count[i]);
    	}
    }
}
