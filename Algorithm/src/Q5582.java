import java.util.Scanner;
 
public class Q5582 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char [] a = sc.nextLine().toCharArray();
        char [] b = sc.nextLine().toCharArray();
        int [][] lcs = new int[a.length+1][b.length+1];
        
        int ans = 0;
        for(int i=1; i<=a.length; i++) {
            for(int j=1; j<=b.length; j++) {
                if(a[i-1] == b[j-1]) {
                    lcs[i][j] = lcs[i-1][j-1]+1;
                    ans = Math.max(ans, lcs[i][j]);
                }
            }
        }
        System.out.println(ans);
    }
}