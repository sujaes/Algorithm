//import java.util.*;
//class Solution {
//	public static void main(String[] args) {
//		int[][] arr = {{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};
//		System.out.println(solution(6,4,arr)[0]);
//	}
//    static Queue<Pair> q = new LinkedList<Pair>();
//    static int max = 0;
//    static int num = 0;
//    static int sm;
//    static int sn;
//    static int spicture[][];
//   
//    public static int[] solution(int m, int n, int[][] picture) {
//        sm = m;
//        sn = n;
//        spicture = picture;
//        int area = 0 ;
//        int k = 0;
//        for(int i = 0 ; i < m; i++){
//            for(int j  = 0 ; j< n; j++){
//                if(spicture[i][j] != 0){
//                    k = spicture[i][j];
//                    // System.out.println("----------------");
//                    // System.out.println(i + " "+j);
//                    spicture[i][j] = 0;
//                    q.add(new Pair(i,j,k));
//                    area++;
//                    bfs();
//                }
//            }
//        }
//        
//        int[] answer = new int[2];
//        answer[0] = area;
//        answer[1] = max; 
//        return answer;
//    }
//}
//class Pair{
//    int x;
//    int y;
//    int color;
//    public Pair(int x, int y, int color){
//        this.x = x;
//        this.y = y;
//        this.color = color;
//    }
//}