import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q1427 {
	static int n;	
	
	public static void main(String[] args)   {
		Scanner sc = new Scanner(System.in);
		List <Integer> list = new ArrayList<Integer>();
		n=sc.nextInt();
		while(n!=0) {
			list.add(n%10);
			n = n/10;
		}
		Collections.sort(list);
		Collections.reverse(list);
		
		for(int i = 0 ; i < list.size();i++) {
			System.out.print(list.get(i));
		}
		
		
	}
	
}