import java.util.*;
public class Q2884{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int total = h*60+m;
		total = total - 45;
		if(total<0){
			total += 60*24;
		}
		h = total/60;
		m = total%60;
		
		System.out.print(h + " " + m);
	}
}