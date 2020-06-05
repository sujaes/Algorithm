import java.util.Arrays;
import java.util.Scanner;
 
public class Q1759 {
    public static boolean check(String password) {
        int ja = 0;
        int mo = 0;
        for (char x : password.toCharArray()) {
            if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
                mo += 1;
            } else {
                ja += 1;
            }
        }
        return ja >= 2 && mo >= 1;
    }
    
    public static void go(int n, String [] alpha, String password, int i) {
        if(password.length() == n) { 
            if(check(password)) { //���� ���� ���� �˻�
                System.out.println(password);
            }
            return;
        }
        if(alpha.length <= i) 
            return;
        
        go(n, alpha, password+alpha[i], i+1); //����ϴ� ���
        go(n, alpha, password, i+1); //������� �ʴ� ���
    }
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int c = scan.nextInt();
        scan.nextLine();
        String [] alpha = scan.nextLine().split(" ");
        
        Arrays.sort(alpha);
        go(n, alpha, "", 0);
    }
}
