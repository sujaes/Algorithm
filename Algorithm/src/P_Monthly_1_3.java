import java.util.*;

class P_Monthly_1_3 {
    static PriorityQueue<Node> pq = new PriorityQueue<Node>();
    static List<Integer> list[];
    public static void main(String[] args) {
    	int a[] = {-5,0,2,1,2};
    	int edges[][] = {{0,1},{3,4},{2,3},{0,3}};
    	solution(a,edges);
    }
    public static long solution(int[] a, int[][] edges) {
        long answer = 0;
        long sum = 0;
        long arr[];
        int connect[] = new int[a.length];
        boolean visited[] = new boolean[a.length];
        list = new List[a.length];
        arr = new long[a.length];
        for(int i = 0 ; i < a.length; i++){
            arr[i] = a[i];
            sum += a[i];
            list[i] = new LinkedList<Integer>();
        }
        
        if(sum !=0){
            return -1;
        }
        
        for( int i = 0 ; i < edges.length ; i++){
            int s = edges[i][0];
            int e = edges[i][1];
            list[s].add(e);
            list[e].add(s);
            connect[s]++;
            connect[e]++;
        }
        
        for(int i = 0 ; i <a.length;i++){
            pq.add(new Node(i,a[i],connect[i]));
        }
        
        while(pq.size()!=2){
            Node node = pq.poll();//연결노드가 제일 작은놈
            // System.out.println("index = " + node.index);
            visited[node.index] = true;
            for(int j = 0 ; j < list[node.index].size();j++){
                int t = list[node.index].get(j);
                // System.out.println("t = " + t);
                if(!visited[t]){
                    // System.out.println("a[node.index] = " + Math.abs(a[node.index]));
                    answer += Math.abs(arr[node.index]);
                    a[t] += a[node.index];
                    a[node.index] = 0;
                }
            }
        }
        
        Node node = pq.poll();
        
        long tt= Math.abs(a[node.index]);
        // System.out.println("tt  = "+ tt);
        answer += tt;
        System.out.println(answer);
        return answer;
    }
    public static class Node implements Comparable<Node>{
        int index;	//인덱스
        int weight;	//가중치
        int connect;//연결된 노드수
        public Node(int index,int weight, int connect){
            this.index = index;
            this.weight = weight;
            this.connect = connect;
        }
        public int compareTo(Node o){
            return (this.connect - o.connect);
        }
    }
}