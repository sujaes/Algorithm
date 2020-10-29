import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Q2161 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0 ; i < n ; i++) {
			list.add(i+1);
		}
		while(list.size()!=0) {
			System.out.print(list.remove(0) + " ");
			if(list.size()!=0) {
				int temp = list.get(0);
				list.remove(0);
				list.add(temp);
			}
		}
		
		
	}
}
