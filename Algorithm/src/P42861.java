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
//        //�θ���
//        int[] parent = new int[n];
//        for(int i = 0 ; i < n; i++){
//            parent[i] = i;
//        }
//        for(int i = 0 ; i < costs.length ; i++){
//            int from = costs[i][0];
//            int to = costs[i][1];
//            int weight = costs[i][2];
//            // ����Ŭ�� �����Ǹ� �н�
//            if(check(parent,from,to)){
//                continue;
//            }else{
//                //����Ŭ�� ������ ��ġ�� ����ġ����
//                answer += weight;
//                union(parent,from,to);
//            }
//        }
//        return answer;
//    }
//    public static boolean check(int[] parent,int from, int to){
//        from = getParent(parent,from);
//        to = getParent(parent,to);
//        if(from == to){ //����Ŭ ����
//            return true;
//        }else{  //����Ŭ ���� �����ȵ�.
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