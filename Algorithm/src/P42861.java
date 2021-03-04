//import java.util.*;
//class Solution {
//    public int solution(int n, int[][] costs) {
//        int answer = 0;
//        Arrays.sort(costs, new Comparator<int[]>(){
//            public int compare(int[] t1,int[] t2){                       
//                return t1[2] - t2[2];
//            }
//        });
//        // for(int i = 0 ; i < costs.length; i++){
//        //     System.out.print(costs[i][0] + " ");
//        //     System.out.print(costs[i][1] + " ");
//        //     System.out.println(costs[i][2]);
//        // }
//        
//        //부모노드
//        int[] parent = new int[n];
//        for(int i = 0 ; i < n; i++){
//            parent[i] = i;
//        }
//        for(int i = 0 ; i < costs.length ; i++){
//            int from = costs[i][0];
//            int to = costs[i][1];
//            int weight = costs[i][2];
//            // 사이클이 생성되면 패스
//            if(check(parent,from,to)){
//                continue;
//            }else{
//                //사이클이 없으면 합치고 가중치증가
//                answer += weight;
//                union(parent,from,to);
//            }
//        }
//        return answer;
//    }
//    public static boolean check(int[] parent,int from, int to){
//        from = getParent(parent,from);
//        to = getParent(parent,to);
//        if(from == to){ //사이클 생성
//            return true;
//        }else{  //사이클 아직 생성안됨.
//            return false;
//        }
//    }
//    public static void union(int[] parent,int from, int to){
//        from = getParent(parent,from);
//        to = getParent(parent,to);
//        if(from < to){
//            parent[to] = from;
//        }else{
//            parent[from] = to;
//        }
//    }
//    public static int getParent(int[] parent,int k){
//        if(parent[k] == k){
//            return k;
//        }else{
//            return getParent(parent,parent[k]);
//        }
//    }
//    
//}