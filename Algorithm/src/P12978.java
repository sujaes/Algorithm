//import java.util.*;
//
//class Solution {
//    public static ArrayList<Edge>[] eList; 
//    public static int[] dist; 
//    public int solution(int N, int[][] road, int K) {
//        int answer =0;
//        eList = new ArrayList[N+1];
//        dist = new int[N+1];
//        Arrays.fill(dist, Integer.MAX_VALUE);
//        for (int i = 1; i <= N; i++) {
//            eList[i] = new ArrayList<Edge>();
//        }
//        for (int i = 0; i < road.length; i++) {
//            eList[road[i][0]].add(new Edge(road[i][1], road[i][2]));
//            eList[road[i][1]].add(new Edge(road[i][0], road[i][2]));
//        }
//        dist[1] = 0;
//        
//        d();
//        for (int i = 1; i< dist.length;i++) {
//            if (dist[i] <= K) {
//                answer++;
//            }
//        }
//        return answer;
//    }
//
//    public static void d() {
//        PriorityQueue<Edge> q = new PriorityQueue<Edge>();
//        q.add(new Edge(1, 0));
//        while (!q.isEmpty()) {
//            Edge edge = q.poll();
//            int v = edge.v;
//            int w = edge.w;
//            if (dist[v] < w) {
//                continue;
//            }
//            for (int i = 0; i < eList[v].size(); i++) { //연결된 도시
//                int v2 = eList[v].get(i).v;         //연결된 도시들의 도시  a->b->c
//                int w2 = eList[v].get(i).w + w;     // 연결된 도시들의 도시까지 가는 시간
//                if (dist[v2] > w2) {                //   a->c > a->b->c
//                    dist[v2] = w2;
//                    q.add(new Edge(v2, w2));
//                }
//            }
//        }
//    }
//    private static class Edge implements Comparable<Edge> {
//        int v;
//        int w;
//        public Edge(int v, int w) {
//            this.v = v;
//            this.w = w;
//        }
//        public int compareTo(Edge o) {
//            return this.w - o.w;
//        }
//    }
//}

//
//import java.util.*;
//class Solution {
//    public int solution(int N, int[][] road, int K) {
//        int[][] map = new int[N][N];  
//        int answer =0;
//        for (int i = 0; i < map.length; i++) {
//            for (int j = 0; j < map[0].length; j++) {
//                if (i == j) {                                                
//                    map[i][j] = 0;
//                    continue;
//                }
//                map[i][j] = 500001;                                           
//            }
//        }
// 
//        for (int i = 0; i < road.length; i++) {
//            if(map[road[i][0] - 1][road[i][1] - 1] < road[i][2]){
//               continue; 
//            }
//            map[road[i][0] - 1][road[i][1] - 1] = road[i][2];
//            map[road[i][1] - 1][road[i][0] - 1] = road[i][2];
//        }
//        
//        for (int k = 0; k < N; k++) {
//            for (int i = 0; i < N; i++) {
//                for (int j = 0; j < N; j++) {
//                    if(i == j){
//                        continue;
//                    }
//                    if (map[i][j] > map[i][k] + map[k][j]) {
//                        map[i][j] = map[i][k] + map[k][j];
//                    }
//                }
//            }
//        }
//  
//        for (int i = 0; i < map[0].length; i++) {
//            if (map[0][i] <= K) 
//                answer++;
//        }
//        
//        return answer;
//    }
//
//}