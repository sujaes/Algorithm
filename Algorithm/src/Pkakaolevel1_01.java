<<<<<<< HEAD
import java.util.Stack;
class Pkakaolevel1_01 {
    public static Stack<Integer> stack = new Stack<Integer>();
    public static int answer = 0;
    public int solution(int[][] board, int[] moves) {
        for(int i = 0 ; i < moves.length; i++){
            if(checkNull(board,moves[i]-1)){
                board = pickAndUpdate(board,moves[i]-1);
            }
        }
        return answer;
    }
    public boolean checkNull(int[][] board,int n){
        for(int i = 0 ; i < board.length ; i++){
            if(board[i][n]!=0){
                return true;
            }
        }
        return false;
    }
    public int[][] pickAndUpdate(int[][] board,int n){
        for(int i = 0 ; i < board.length ; i++){
            if(board[i][n]!=0){                         //������ ����ã��
                if(!stack.isEmpty()){                   //������ ��������
                    if(stack.peek() == board[i][n]){    //���� top�̶� �����̶� ������
                        stack.pop();                    //���� ���� ����
                        answer+=2;                       //����
                    }else{
                        stack.push(board[i][n]);        //���� top�̶� �����̶� �ٸ��� �׳� ���ÿ� ����
                    }
                }else{                                  
                    stack.push(board[i][n]);            //������ ��������� �׳� ���ÿ� ����
                }
                board[i][n] = 0;                        //���� ã���� ���ֱ�
                return board;
            }
        }
        return board;                                   //������ �ƹ��͵� ������
    }
}
=======
//import java.util.Stack;
//class Solution {
//    public static Stack<Integer> stack = new Stack<Integer>();
//    public static int answer = 0;
//    public int solution(int[][] board, int[] moves) {
//        for(int i = 0 ; i < moves.length; i++){
//            if(checkNull(board,moves[i]-1)){
//                board = pickAndUpdate(board,moves[i]-1);
//            }
//        }
//        return answer;
//    }
//    public boolean checkNull(int[][] board,int n){
//        for(int i = 0 ; i < board.length ; i++){
//            if(board[i][n]!=0){
//                return true;
//            }
//        }
//        return false;
//    }
//    public int[][] pickAndUpdate(int[][] board,int n){
//        for(int i = 0 ; i < board.length ; i++){
//            if(board[i][n]!=0){                         //������ ����ã��
//                if(!stack.isEmpty()){                   //������ ��������
//                    if(stack.peek() == board[i][n]){    //���� top�̶� �����̶� ������
//                        stack.pop();                    //���� ���� ����
//                        answer+=2;                       //����
//                    }else{
//                        stack.push(board[i][n]);        //���� top�̶� �����̶� �ٸ��� �׳� ���ÿ� ����
//                    }
//                }else{                                  
//                    stack.push(board[i][n]);            //������ ��������� �׳� ���ÿ� ����
//                }
//                board[i][n] = 0;                        //���� ã���� ���ֱ�
//                return board;
//            }
//        }
//        return board;                                   //������ �ƹ��͵� ������
//    }
//}
>>>>>>> branch 'master' of https://github.com/sujaes/Algorithm.git
