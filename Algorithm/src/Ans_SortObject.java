import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;
/*
 * Date 2021.04.08
 * author 장수제
 * 객체정렬 코드정리
 */

public class Ans_SortObject {
    public static void main(String[] args){
        PriorityQueue<Node> pq = new PriorityQueue<Node>();
    	Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
        	int age = sc.nextInt();
        	String name = sc.next();
       		Node nn = new Node(i,age,name);
          	pq.add(nn);
        }
        
        while(!pq.isEmpty()) {
        	Node n = pq.poll();
        	System.out.println(n.x + " "+n.y);
        }
 
    }
    
    public static class Node implements Comparable<Node>{	//클래스 생성 및 정렬 순서 정하기
    	int index;
    	int x;
    	String y;
    	public Node(int index,int x ,String y) {
    		this.index = index;
    		this.x = x;
    		this.y = y;
    	}
    	public int compareTo(Node o) {						
    		if(this.x == o.x) {								//x가 같으면 index순서로 오름차순정렬
    			return this.index - o.index;
    		}else {
    			return this.x - o.x;						//x가 다르면 x순서로 오름차순정렬
    		}
    	}
    }
 
}

