//import java.util.Scanner;
//
//public class Q1062 {
//    static int n, k, answer;
//    static boolean[][] word;
//    static boolean[] visit;
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt(); 
//        k = sc.nextInt(); 
//        word = new boolean[n][26];
//        for (int i = 0; i < n; i++) {
//            String tmp = sc.next();
//            for (int j = 0; j < tmp.length(); j++) {
//                word[i][tmp.charAt(j) - 'a'] = true;	//�ܾ� ������ �ش� ����
//            }
//        }
//        visit = new boolean[26];
//        answer = 0;
//        backtrack(0, 0);
//        System.out.println(answer);
//    }
//
//    private static void backtrack(int index, int depth) {
//        if (depth == k) {				//k�� �湮������
//            check();					//�ִ밪 ���ϱ�
//            return;
//        }
//        for (int i = index; i < 26; i++) {
//            if (!visit[i]) {			//�湮���� ���� ���ĺ�
//                visit[i] = true;		//�湮
//                backtrack(i, depth + 1);//����
//                visit[i] = false;		//�湮���
//            }
//        }
//    }
//    private static void check() {
//        int ret = 0;
//
//        boolean flag = true;
//        for (int l = 0; l < n; l++) {
//            flag = true;
//            for (int i = 0; i < 26; i++) {
//                if (word[l][i] && !visit[i]) {	//���ڰ� ���Եǰ�	�湮����������
//                    flag = false;
//                    break;
//                }
//            }
//            if (flag)
//                ret++;
//        }
//
//        answer = Math.max(ret, answer);
//    }
//}
//





import java.util.Scanner;

public class Q1062 {
	static int n,k,answer;
	static boolean word[][];
	static boolean visited[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); 
        k = sc.nextInt();
        answer = 0;
        word = new boolean[n][26];
        visited = new boolean[26];
        visited['a' -'a'] = true;
        visited['n' -'a'] = true;
        visited['t' -'a'] = true;
        visited['i' -'a'] = true;
        visited['c' -'a'] = true;
        
        for(int i = 0 ; i < n ; i++) { 
        	String s = sc.next();
        	for(int j = 0 ; j < s.length(); j++) {
        		word[i][s.charAt(j) - 'a'] = true;				//�ܾ� ������ �ش��ϴ� ���ڸ� üũ
        	}
        }
        backtracking(0,0);										//�ܾ ó������ �ϳ��� k�� ���� (����)
        System.out.println(answer);
    }
    
    public static void backtracking(int index , int depth) {
    	if(depth == k-5) {
    		check();
    		return;
    	}
    	for(int i = index ; i <26;i++) {
    		if(!visited[i]) {
    			visited[i] = true;
    			backtracking(i, depth+1);
    			visited[i] = false;
    		}
    	}
    }
    
	public static void check() {								//���յ� ���ڿ��θ� ���� �����ϸ� ����
		int max = 0;
		boolean flag = true;
		for (int w = 0; w < n; w++) {
			flag = true;
			for (int i = 0; i < 26; i++) {
				if (word[w][i] && !visited[i]) { // ���ڰ� ���Եǰ� �湮����������
					flag = false;
					break;
				}
			}
			if (flag) {
				max++;
			}
		}
		answer = Math.max(max, answer);
	}
}


