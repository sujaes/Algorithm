import java.util.Queue;
import java.util.LinkedList;
class Solution {
    static Queue<Integer> q;
    static int arr[][];
    static boolean visited[];
    public int solution(int n, int[][] edge) {
        int answer = 0;
        q = new LinkedList<Integer>();
        visited = new boolean[n+1];
        arr= new int[n+1][n+1];
        for(int i = 0 ; i < edge.length;i++){
            arr[edge[i][0]][edge[i][1]] = arr[edge[i][1]][edge[i][0]]  = 1;
        }
        for(int i = 1 ; i <= n ; i ++){
            for(int j = 1 ; j <= n ; j++){
                System.out.print(arr[i][j]);
            }System.out.println();
        }
        bfs(1,n);
        return answer;
    }
    public static void bfs(int s,int n){
        q.offer(s);
        visited[s] = true;
        while(!q.isEmpty()){
            int next = q.poll();
            for(int i = 0 ; i < n ; i++){
                if(arr[next][i]==1 && !visited[i]){
                    q.offer(i);
                }
            }
        }
    }
}