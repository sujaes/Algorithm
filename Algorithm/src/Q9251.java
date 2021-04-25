import java.util.*;
public class Q9251{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();		
		int lena = a.length();
		int lenb = b.length();
		int arr[][] = new int[lena+1][lenb+1];
		for(int i = 1 ; i <=lena;i++){
			for(int j = 1 ; j<=lenb;j++){
				
				if(a.charAt(i-1) == b.charAt(j-1)){
					arr[i][j] = arr[i-1][j-1]+1;
				}else{
					arr[i][j] = Math.max(arr[i-1][j],arr[i][j-1]);
				}
			}
		}
		System.out.println(arr[lena][lenb]);
		
	}
}