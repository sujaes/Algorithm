import java.util.*;
public class Q5502{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		String s = sc.next();
		String rs = new StringBuilder(s).reverse().toString();
		
		int arr[][] = new int[len+1][len+1];
		for(int i = 1 ; i <=len;i++){
			for(int j = 1 ; j<=len;j++){
				
				if(s.charAt(i-1) == rs.charAt(j-1)){
					arr[i][j] = arr[i-1][j-1]+1;
				}else{
					arr[i][j] = Math.max(arr[i-1][j],arr[i][j-1]);
				}
			}
		}
		System.out.println(len - arr[len][len]);
		
	}
}
