import java.util.Scanner;

public class Q10942 {

    public static boolean[][] answerAry;
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] inputAry = new int[n+1];
        for(int i = 1; i <= n; i++) {
            inputAry[i] = sc.nextInt();
        }
		
        answerAry = new boolean[n+1][n+1];
        for(int i = 1; i <= n; i++) {
            answerAry[i][i] = true;			
        }
        for(int i = 1; i < n; i++) {
            if(inputAry[i] == inputAry[i+1])
                answerAry[i][i+1] = answerAry[i+1][i] = true;
        }
		
        makeAnswerAry(inputAry, n);
		
        int testCase = sc.nextInt();
        for(int i = 0; i < testCase; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int answer = 0;
            if(answerAry[start][end])
                answer = 1;
            System.out.println(answer);
        }
    }
    public static void makeAnswerAry(int[] inputAry, int n) {
        for(int i = 2; i < n; i++) {
            for(int j = 1; j <= n - i; j++) {
                if(inputAry[j] == inputAry[j+i] && answerAry[j+1][j+i-1]) {
                    answerAry[j][j+i] = answerAry[j+i][j] = true;
                }					
            }
        }
    }
}