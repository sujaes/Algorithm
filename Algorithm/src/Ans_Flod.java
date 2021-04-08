import java.util.*;
/*
 * Date 2021.04.08
 * author 장수제
 * 플로이드와샬 최단거리 알고리즘 코드정리
 */
public class Ans_Flod {
    public static int cityCount;
    public static int[][] distance;
    public static final int INF = 1000000000;
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        
        cityCount = sc.nextInt();
        int busCount = sc.nextInt();
        
        distance = new int[cityCount+1][cityCount+1];
        
        for(int i=1; i <= cityCount; i++) {
            for(int j=1; j <= cityCount; j++) {
                if(i == j) continue;										//본인으로 가는 것 제외
                distance[i][j] = INF;										//나머지 무한으로 초기화
            }
        }
        
        while(busCount-- > 0) {
            
            int start = sc.nextInt();
            int end = sc.nextInt();
            int time = sc.nextInt();
            
            distance[start][end] = Math.min(distance[start][end], time);    //가중치가 작은 것으로 초기화
        }
 
        floyd();
        print();
    }
    
    public static void floyd() {
        // 기준이 되는 거쳐가는 노드 K
        for(int k = 1; k <= cityCount; k++) {
            // 출발하는 노드 i
            for(int i=1; i <= cityCount; i++) {
                // 도착하는 노드 j
                for(int j=1; j <= cityCount; j++) {
                    //i에서 k를 거쳤다가 k에서 j 까지 가는 거리와 i에서 j 까지 가는 거리를 비교해서 작은 값이 최소거리이다.
                    distance[i][j] = Math.min(distance[i][k] + distance[k][j], distance[i][j]);
                }
            }
        }
    }
    
    public static void print() {
        StringBuilder sb = new StringBuilder();
        for(int i=1; i <= cityCount; i++) {
            for(int j=1; j <= cityCount; j++) {
                if(distance[i][j] >= INF) sb.append("0 ");
                else sb.append(distance[i][j] + " ");
            }
            sb.append("\n");
        }
        
        System.out.println(sb.toString());
    }
}
