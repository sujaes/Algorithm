import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Q5014 {
	static int f = 0;
	static int s = 0;
	static int g = 0;
	static int u = 0;
	static int d = 0;
	
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        f = sc.nextInt();
        s = sc.nextInt();
        g = sc.nextInt();
        u = sc.nextInt();
        d = sc.nextInt();
        int count = 0;
        
        
        while(true) {
            if(g>s) {//올라가야함
            	if(u == 0) {
            		System.out.println("use the stairs");
        			return;
            	}
            	if(s+u > 1000001) {
            		System.out.println("use the stairs");
        			return;
        		}
            	
            	if((s+u) <= g) {	//올라갈 층이 목적지거나 목적지보다 작을때
            		s=s+u;
            		count++;
            	}else{				//올라갈 층이 목적지보다 클때
            		if(!list.contains(s+u)) {
            			s = s+u;
            			count++;
            			list.add(s);
            		}else {
            			System.out.println("use the stairs");
            			return;
            		}
            	}
            }else if(g<s) {//내려가야함
            	if(d ==0) {
            		System.out.println("use the stairs");
        			return;
            	}
            	if(s-d < 1) {
            		System.out.println("use the stairs");
        			return;
        		}
            	if((s-d) >= g) {
            		s=s-d;
            		count++;
            	}else{
            		if(!list.contains(s-d)) {
            			s = s-d;
            			count++;
            			list.add(s);
            		}else {
            			System.out.println("use the stairs");
            			return;
            		}
            	}
            }else {
            	System.out.println(count);
            	return;
            }

        }        
    } 
}
