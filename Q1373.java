package git;

//1373¹ø ¹®Á¦
import java.util.Scanner;
public class Q1373{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String binary = sc.nextLine();
		while (binary.length() % 3 != 0) {
			binary = " " + binary;
		}	
		StringBuilder ans = new StringBuilder();
		for (int i = 0; i < binary.length(); i += 3) {
			int c = 0;
			if (binary.charAt(i) == '1') {
				c += 4;
			}
			if (binary.charAt(i + 1) == '1') {
				c += 2;
			}
			if (binary.charAt(i + 2) == '1') {
				c += 1;
			}
			ans.append(c);
		}
		ans.append('\n');
		System.out.print(ans);
		sc.close();
	}
}
