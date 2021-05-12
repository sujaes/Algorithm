import java.util.*;
public class Q1935 {
	static int n;
	static String str = "";
	static Map<Character,Integer> map = new HashMap<Character, Integer>();
	static Stack<Double> stack = new Stack<Double>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		str = sc.next();
		
		for(int i = 0 ; i < n ; i++) {
			map.put((char)('A'+i), sc.nextInt());
		}
		
		for(int i=0 ;i < str.length();i++) {
			char temp = str.charAt(i);
			if(temp<'A' || temp > 'Z') {
				double num1 = stack.pop();
				double num2 = stack.pop();
				if(temp == '+') {
					stack.add(num1+num2);
				}else if(temp =='-') {
					stack.add(num2-num1);
				}else if(temp == '*') {
					stack.add(num1*num2);
				}else {
					stack.add(num2/num1);
				}
			}else {
				stack.add(Double.parseDouble(map.get(temp)+""));
			}
		}
		System.out.printf("%.2f",stack.pop());	
	}
}
