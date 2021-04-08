import java.util.Scanner;
/*
 * Date 2021.04.08
 * author �����
 * ��Ʈ��ŷ �˰��� �ڵ�����
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
        		word[i][s.charAt(j) - 'a'] = true;				//�ܾ� ������ �ش��ϴ� ���ڸ� üũ
        	}
        }
        backtracking(0,0);										//�ܾ ó������ �ϳ��� k�� ���� (����)
        System.out.println(answer);
    }
    
    public static void backtracking(int index , int depth) {	//��Ʈ��ŷ �˰���
    	if(depth == k-5) {
    		check();
    		return;
    	}
    	for(int i = index ; i <26;i++) {
    		if(!visited[i]) {
    			visited[i] = true;								//���ڿ��� �ִ´ٰ� ����
    			backtracking(i, depth+1);						//�ش繮�ڸ� �����ϰ� ������ ����
    			visited[i] = false;								//���ڿ��� �ȳִ´ٰ� ����
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