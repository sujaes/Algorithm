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
            W = sc.next().toCharArray(); //�������ڿ� -> ���� �迭�� ����
            K = sc.nextInt();	//���� ���ڸ� �����ؾ��ϴ� ����
            
            alpha = new ArrayList[26];	//���� ���ڰ� �����ڸ��� �ε����� �����ϴ� ����Ʈ
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
            if (size < K) {			//���� ���ڰ� ���� �ε����� ������ ����Ʈ�� ���̰� K���� ������ �Ѿ�� 
            	continue;
            }
//            System.out.println( alpha[i]+"��° �ε����� ���� ���ڰ� ����" );
            for (int idx = 0; idx < size - K + 1; idx++) {
//            	System.out.println(alpha[i].get(idx + K - 1) - alpha[i].get(idx) + 1 +"�� list�� ���Ե�");
                list.offerLast(alpha[i].get(idx + K - 1) - alpha[i].get(idx) + 1);	//
            }
        }
    }
}
