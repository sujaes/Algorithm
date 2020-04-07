import java.util.Scanner;
public class Q7568{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int person[][] = new int[n][2];
		int rank[] = new int[n];
		for(int i = 0 ; i < n; i++){
			rank[i] = 1;
			person[i][0] = sc.nextInt();
			person[i][1] = sc.nextInt();
		}
		
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0; j <n ; j++) {
				if(person[i][0] > person[j][0] && person[i][1] > person[j][1]) {
					rank[j]++;
				}
			}
		}
		
		for(int i=0; i<n;i++) {		
			System.out.print(rank[i]+" ");
		}
	
	}
}

