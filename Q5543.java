import java.util.*;
public class Q5543{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int burger[] = new int[3];
		for(int i = 0 ; i < 3; i++){
			burger[i] = sc.nextInt();
		}
		int burg = (int)Math.min((double)burger[0],(double)burger[1]);
		burg = (int)Math.min((double)burg,(double)burger[2]);
		int bever = (int) Math.min((double)sc.nextInt(),(double)sc.nextInt());
		
		System.out.println(burg + bever -50);
	}
}
