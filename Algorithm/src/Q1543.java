import java.util.*;
public class Q1543 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String find = sc.nextLine();
		int fleng =find.length();
		int answer = 0;
		int i = 0;
		while(i <= s.length()-fleng) {
			if(s.substring(i,i+fleng).equals(find)){
//				System.out.println("index = " + i);
				answer++;
				i = i+fleng;
				continue;
			}
			i++;
		}
		
		System.out.println(answer);
	}

}
