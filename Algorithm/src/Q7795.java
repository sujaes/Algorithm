import java.util.Arrays;
import java.util.Scanner;
public class Q7795 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int Tcase = sc.nextInt();
		int size = 0;
		for(int i = 0 ; i < Tcase;i++) {
			int Asize = sc.nextInt();
			int Bsize = sc.nextInt();
			int answer = 0 ;
			int A[] = new int[Asize];
			int B[] = new int[Bsize];
			for(int j = 0 ; j < Asize; j++) {
				A[j] = sc.nextInt();
			}
			for(int j = 0 ; j < Bsize; j++) {
				B[j] = sc.nextInt();
			}
			Arrays.sort(A);
			Arrays.sort(B);


			for(int j = 0 ; j < Asize; j++) {
				int k =0 ;
				while(k<Bsize && A[j]>B[k]) {
					k++;
				}
				answer += k;
			}
			
			System.out.println(answer);
			
			
		}
	}

}
