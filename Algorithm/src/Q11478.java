import java.util.*;
public class Q11478 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Map<String,Integer> map= new HashMap<String,Integer>();
		String s = sc.next();
		int count = 0;
		for(int i = 0 ; i < s.length();i++) {
			for(int j = i ; j <= s.length();j++) {
				if(i==j) {
					continue;
				}
				String temp = s.substring(i,j);
				if(temp.length() > 1 && !check(temp)) {
					continue;
				}
				if(map.containsKey(temp)) {
					map.put(temp,1);
				}else {
					map.put(temp,1);
				}
			}
		}
		
		Iterator<String> iter = map.keySet().iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			int val = map.get(key);
			if(val == 1) {
				System.out.println(key);
				count++;
			}
		}
		System.out.println(count);
	}
	public static boolean check(String s) {
		Set<Character> set = new HashSet<Character>();
		for(int i = 0 ; i <s.length();i++) {
			set.add(s.charAt(i));
		}
		if(set.size()== s.length()) {
			return true;
		}else {
			return false;
		}
	}
	
}
