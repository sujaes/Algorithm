import java.util.Scanner;
import java.util.Stack;
public class Q10773{
	 
    public static void main(String[] args){
        Stack<Integer> st = new Stack<Integer>();
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = 0;
        int sum = 0;
        for(int i = 0 ; i < n ;i++){
        	temp = sc.nextInt();
        	if(temp !=0){
            	st.push(temp);	
        	}else{
        		st.pop();
        	}
        }
        int size = st.size();
        
        for(int i = 0 ; i < size;i++){
        	sum += st.pop();
        }
        System.out.println(sum);
        
    }
 
}
 

