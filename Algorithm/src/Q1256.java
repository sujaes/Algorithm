import java.util.*;
public class Q1256 {
	static String str;
	static ArrayList<String> res = new ArrayList<String>();
	static int n,m,k;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		str = "";
		n = sc.nextInt();
		m = sc.nextInt();
		k = sc.nextInt();		
		for(int i = 0 ; i < n ;i++) {
			str +="a";
		}
		for(int i = 0 ; i < m ;i++) {
			str +="z";
		}		
		int check[] = new int[n+m];
		LinkedList<Character> list = new LinkedList<Character>();
		per(n+m,n+m,list,check);
		System.out.println(res.get(k-1));
	}
	
	public static void per(int n, int r, LinkedList<Character> list, int check[]) {
		if(list.size()==r) {
			String temp = "";
			for(int i = 0 ; i < list.size();i++) {
				temp += list.get(i)+"";
			}
			if(!res.contains(temp)) {
				res.add(temp);
			}
			return;
		}
		
		for(int i = 0 ; i < n ;i++) {
			if(check[i] == 0) {
				list.add(str.charAt(i));
				check[i] =1;
				per(n, r, list, check);
				check[i] =0;
				list.removeLast();
			}
		}
	}
}
