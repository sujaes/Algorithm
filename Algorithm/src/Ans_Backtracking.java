import java.util.Scanner;
/*
 * Date 2021.04.08
 * author 장수제
 * 백트래킹 알고리즘 코드정리
 */

public class Ans_Backtracking {
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
    
    public static void backtracking(int index , int depth) {	//백트래킹 알고리즘
    	if(depth == k-5) {
    		check();
    		return;
    	}
    	for(int i = index ; i <26;i++) {
    		if(!visited[i]) {
    			visited[i] = true;								//문자열에 넣는다고 생각
    			backtracking(i, depth+1);						//해당문자를 포함하고 다음을 진행
    			visited[i] = false;								//문자열에 안넣는다고 생각
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