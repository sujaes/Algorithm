import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Q1316 {
    static int n;
    static int count;
    static boolean visited[];
    static java.util.List<Character> list;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        count =0;
        for(int i = 0 ; i < n ; i++) {
        	String s = sc.next();
            list = new ArrayList<Character>();
        	if(check(s)) {
        		count++;
        	}
        }
        System.out.println(count);
    }
    public static boolean check(String s) {
    	for(int i = 0 ; i < s.length();i++) {
    		if(!list.contains(s.charAt(i))) {
    			list.add(s.charAt(i));
    		}else {
    			if(s.charAt(i-1) != s.charAt(i)) {
    				return false;
    			}
    		}
    	}
    	return true;
    }
}
