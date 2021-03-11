//import java.util.*;
//class Solution {
//    static int n,m;
//    static int answer;
//    static boolean visited[][];
//    static int map[][];
//    static int dx[] = {0,0,1,-1};
//    static int dy[] = {1,-1,0,0};
//    public int solution(int[][] maps) {
//        map = maps;
//        n = maps.length;
//        m = maps[0].length;
//        visited = new boolean[n][m];
//        bfs();
//        if(visited[n-1][m-1]){
//            return answer;
//        }else{
//            return -1;
//        }
//        
//    }
//    public void bfs(){
//        Queue<Node> q = new LinkedList<Node>();
//        q.add(new Node(0,0,1));
//        visited[0][0] = true;
//        
//        while(!q.isEmpty()){
//            Node node = q.poll();
//            if(node.x == n-1 && node.y == m-1){
//                answer = node.level;
//                break;
//            }
//            for(int i = 0 ; i < 4; i ++){
//                int nx = node.x + dx[i];
//                int ny = node.y + dy[i];
//                
//                if(nx < 0 || nx >= n || ny < 0 || ny >= m){
//                    continue;
//                }
//                if(!visited[nx][ny] && map[nx][ny] == 1){
//                    q.add(new Node(nx,ny,node.level+1));
//                    visited[nx][ny] = true;
//                }
//            }
//        }
//    
//    }
//    public static class Node{
//        int x;
//        int y;
//        int level;
//        public Node(int x ,int y, int level){
//            this.x = x;
//            this.y = y;
//            this.level = level;
//        }
//    }
//}