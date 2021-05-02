//import java.util.*;
//public class Solution {
//    static int dx[] = {1,0,-1,0};
//    static int dy[] = {0,-1,0,1};
//    static int n;
//    static int answer;
//    static int solution(int[][] board) {
//        n = board.length;
//        answer = Integer.MAX_VALUE;
//        bfs(0,0,-1,0,board);
//        System.out.println(answer);
//        return answer;
//    }
//    private static void bfs(int x1, int y1,int d1, int w1,int[][] board) {
//        Queue<Node> q = new LinkedList<>();
//        q.add(new Node(x1,y1,d1,w1));
//        while(!q.isEmpty()){
//            Node node = q.remove();
//            int x = node.x;
//            int y = node.y;
//            int dir = node.dir;
//            int w = node.w;
//
//            if(x == n-1 && y == n-1){
//                answer = Math.min(answer, w);
//                continue;
//            }
//
//            for(int i=0; i<4; i++){
//                int nx = x + dx[i];
//                int ny = y + dy[i];
//                int nw = 0;
//                if(nx >= 0 && nx < n && ny >= 0 && ny < n){
//                    if(i == dir || dir == -1){  //시작이거나 방향이 같으면 100원
//                        nw = w + 100;
//                    }
//                    else {                      //방향이 다르면 600원
//                        nw = w + 600;
//                    }
//                    if(board[nx][ny] == 0 || board[nx][ny] >= nw){  //더 작으면 작은값으로 갱신
//                        board[nx][ny] = nw;
//                        q.add(new Node(nx,ny,i,nw));
//                    }
//                }
//            }
//        }
//
//    }
//    static class Node{
//        int x;
//        int y;
//        int dir;
//        int w;
//
//        public Node(int x, int y, int dir, int w) {
//            this.x = x;
//            this.y = y;
//            this.dir = dir;
//            this.w = w;
//        }
//    }
//}