import java.util.Scanner;
import java.util.Stack;
public class Q10773 {
	static int n;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int sum = 0;
		Stack<Integer> stack = new Stack<Integer>();
		for(int i = 0 ; i < n ; i++) {
			int temp = sc.nextInt();
			if(temp == 0) {
				stack.pop();

			}else {
				stack.push(temp);
			}
		}
		
		int size =  stack.size();
		for(int i = 0 ; i <size; i++) {
			int temp  = stack.pop();

			sum += temp;
		}
		
		System.out.println(sum);
	}
}