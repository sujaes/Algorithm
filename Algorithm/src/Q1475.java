import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Q1475 {
    static String n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.next();
        int max = 0;
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i = 0 ; i< n.length();i++) {
        	if(n.charAt(i) == '9') {
        		n= n.replace('9','6');
        	}
        }
        
        for(int i = 0 ; i< n.length();i++) {
        	char key = n.charAt(i);
        	if(map.containsKey(key)) {
            	int  temp = map.get(key);
                map.put(key,temp + 1);
        	}else {
        		map.put(key,1);
        	}
        }
        

        for(int i = 0 ; i< n.length();i++) {
        	char key = n.charAt(i);
        	if(key == '6') {
        		int temp = map.get(key);
        		if(max  < ((temp + 1 )/2) ) {
        			max = ((temp + 1 )/2);
        		}
        	}else {
        		int temp = map.get(key);
        		if(max  < temp ) {
        			max = temp;
        		}
        	}
        }
        System.out.println(max);
        
        
        
	}
}
