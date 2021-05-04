import java.util.*;
public class Q2493 {
	static int n;
	static int arr[];
	static Stack<Integer> hight = new Stack<Integer>();
	static Stack<Integer> index = new Stack<Integer>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n];
		
		for(int i=0 ; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		hight.push(arr[0]);
		index.push(0);
		System.out.print(0);
		for (int i = 1; n > i; ++i) {
			while (true) {
				if (!hight.isEmpty()) {
					int top = hight.peek();
					if (top > arr[i]) {
						System.out.print(" " + (index.peek()+1));
						hight.push(arr[i]);
						index.push(i);
						break;
					} else {
						hight.pop();
						index.pop();
					}
				} else {
					System.out.print(" " + 0);
					hight.push(arr[i]);
					index.push(i);
					break;
				}
			}
		}
		
		
		
	}

}
