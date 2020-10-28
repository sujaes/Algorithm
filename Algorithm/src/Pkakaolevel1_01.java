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
            if(board[i][n]!=0){                         //위부터 인형찾기
                if(!stack.isEmpty()){                   //스택이 차있으면
                    if(stack.peek() == board[i][n]){    //스택 top이랑 인형이랑 같으면
                        stack.pop();                    //스택 맨위 빼기
                        answer+=2;                       //증가
                    }else{
                        stack.push(board[i][n]);        //스택 top이랑 인형이랑 다르면 그냥 스택에 삽입
                    }
                }else{                                  
                    stack.push(board[i][n]);            //스택이 비어있으면 그냥 스택에 삽입
                }
                board[i][n] = 0;                        //인형 찾은거 없애기
                return board;
            }
        }
        return board;                                   //인형이 아무것도 없을때
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
//            if(board[i][n]!=0){                         //위부터 인형찾기
//                if(!stack.isEmpty()){                   //스택이 차있으면
//                    if(stack.peek() == board[i][n]){    //스택 top이랑 인형이랑 같으면
//                        stack.pop();                    //스택 맨위 빼기
//                        answer+=2;                       //증가
//                    }else{
//                        stack.push(board[i][n]);        //스택 top이랑 인형이랑 다르면 그냥 스택에 삽입
//                    }
//                }else{                                  
//                    stack.push(board[i][n]);            //스택이 비어있으면 그냥 스택에 삽입
//                }
//                board[i][n] = 0;                        //인형 찾은거 없애기
//                return board;
//            }
//        }
//        return board;                                   //인형이 아무것도 없을때
//    }
//}
>>>>>>> branch 'master' of https://github.com/sujaes/Algorithm.git
