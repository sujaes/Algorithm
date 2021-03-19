import java.util.*;

public class Q20437 {

	static char[] W;
	static int K;
    static ArrayList<Integer>[] alpha;
    static LinkedList<Integer> list;
    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for(int t = 0; t < T ; t++) {
            W = sc.next().toCharArray(); //받은문자열 -> 문자 배열로 변경
            K = sc.nextInt();	//같은 문자를 포함해야하는 개수
            
            alpha = new ArrayList[26];	//각각 문자가 나온자리의 인덱스를 저장하는 리스트
            for(int i = 0; i < 26; i++) {
                alpha[i] = new ArrayList<>();
            }

            search();
            if(list.size() == 0){
            	System.out.println(-1);
            	continue;
            }

            int shortest = 10001;
            int longest = 0;

            while(!list.isEmpty()){
                int value = list.poll();

                shortest = Math.min(shortest, value);
                longest = Math.max(longest, value);
            }
            System.out.println(shortest);
            System.out.println(longest);
        }
    }

    private static void search(){
        for(int i = 0; i < W.length; i++) {
            alpha[W[i] - 'a'].add(i);	
        }
        list = new LinkedList<>();
        
        for (int i = 0; i < 26; i++) {
            int size = alpha[i].size();
            if (size < K) {			//각각 문자가 나온 인덱스를 저장한 리스트의 길이가 K보다 작으면 넘어가기 
            	continue;
            }
//            System.out.println( alpha[i]+"번째 인덱스에 같은 문자가 나옴" );
            for (int idx = 0; idx < size - K + 1; idx++) {
//            	System.out.println(alpha[i].get(idx + K - 1) - alpha[i].get(idx) + 1 +"가 list에 삽입됨");
                list.offerLast(alpha[i].get(idx + K - 1) - alpha[i].get(idx) + 1);	//
            }
        }
    }
}
