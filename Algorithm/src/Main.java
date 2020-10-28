import java.util.*;
class Main {
	static List<Integer> list = new ArrayList<Integer>();
	static int s1[] = {1,1,3,3,3,6};
	static int s2[] = {6,3,1,3,1,3};
	static int count = 0;
	static int s1Idx = 0;
	static int s2Idx = 0;
	public static void main(String[] args) {
    	int answer[] = new int[2];
    	int n = 0;
    	int min = Integer.MAX_VALUE;
    	for(int i = 0 ; i < s1.length;i++) {
    		if(list.contains(s1[i])) {
    			continue;
    		}else {
    			list.add(s1[i]);
    		}
    	}
    	Collections.sort(list);
    	
    	for(int i = 0 ; i < list.size();i++) {
    		n = list.get(i);
    		count = 0;
    		s1Idx = 0;
    		s2Idx = 0;
    		int temp = solution(n);
    		if(min > temp) {
    			min = temp;
    		}
    	}
    	answer[0] = n;
    	answer[1] = min;
    	System.out.println(answer[0] + " " +answer[1]);
    }
	public static int solution(int a) {
		if(s1Idx == s1.length || s2Idx ==s1.length) {
			return count;
		}
		
		for(int i = 0 ; i < s1.length;i++) {
			if( (s1Idx == s2Idx) && (i==s1.length-1)) {
				return count;
			}else {
				break;
			}
		}
		

		for(int i = s1Idx ; i < s1.length;i++) {
			if(s1[i] == a) {
				s1Idx = i;
				break;
			}
		}
		
		for(int i = s2Idx ; i < s2.length;i++) {
			if(s2[i] == a) {
				s2Idx = i;
				break;
			}
		}
		
		if(s1Idx == s2Idx) {
			s1Idx++;
			s2Idx++;
			solution(a);
		}else {
			count = count + Math.abs(s1Idx - s2Idx);
			s1Idx++;
			s2Idx++;
			solution(a);
		}
		
		System.out.println(s1Idx + " " +s2Idx);
		return count;
		
	}
}
