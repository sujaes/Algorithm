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
//                word[i][tmp.charAt(j) - 'a'] = true;	//단어 순서에 해당 문자
//            }
//        }
//        visit = new boolean[26];
//        answer = 0;
//        backtrack(0, 0);
//        System.out.println(answer);
//    }
//
//    private static void backtrack(int index, int depth) {
//        if (depth == k) {				//k개 방문했을때
//            check();					//최대값 구하기
//            return;
//        }
//        for (int i = index; i < 26; i++) {
//            if (!visit[i]) {			//방문한적 없는 알파벳
//                visit[i] = true;		//방문
//                backtrack(i, depth + 1);//다음
//                visit[i] = false;		//방문취소
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
//                if (word[l][i] && !visit[i]) {	//문자가 포함되고	방문한적없을때
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
        		word[i][s.charAt(j) - 'a'] = true;				//단어 순서의 해당하는 문자를 체크
        	}
        }
        backtracking(0,0);										//단어를 처음부터 하나씩 k개 고르기 (조합)
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
    
	public static void check() {								//조합된 문자열로만 배우기 가능하면 증가
		int max = 0;
		boolean flag = true;
		for (int w = 0; w < n; w++) {
			flag = true;
			for (int i = 0; i < 26; i++) {
				if (word[w][i] && !visited[i]) { // 문자가 포함되고 방문한적없을때
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


