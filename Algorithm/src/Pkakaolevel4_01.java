import java.util.HashMap;
 
public class Pkakaolevel4_01 {
 
    public static HashMap<Long, Long> m = new HashMap<Long, Long>();   
 
    public static long getParent(long a) {
		if(!m.containsKey(a)) {
			m.put(a, a + 1);
			return a;
		}
		m.put(a, getParent(m.get(a)));
		return m.get(a);
	}
 
    public static long[] solution(long k, long[] room_number) {
        int len = room_number.length;
        long[] answer = new long[len];
        for (int i = 0; i < len; i++) {
            long go=room_number[i];
 
            answer[i] = getParent(go);
        }
//        System.out.println(Arrays.toString(answer));
        return answer;
    }
 
    public static void main(String[] args) {
        System.out.println(solution(10,new long[]{1,3,4,1,3,1}));
    }
}