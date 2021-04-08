import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;
/*
 * Date 2021.04.08
 * author �����
 * ��ü���� �ڵ�����
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
    
    public static class Node implements Comparable<Node>{	//Ŭ���� ���� �� ���� ���� ���ϱ�
    	int index;
    	int x;
    	String y;
    	public Node(int index,int x ,String y) {
    		this.index = index;
    		this.x = x;
    		this.y = y;
    	}
    	public int compareTo(Node o) {						
    		if(this.x == o.x) {								//x�� ������ index������ ������������
    			return this.index - o.index;
    		}else {
    			return this.x - o.x;						//x�� �ٸ��� x������ ������������
    		}
    	}
    }
 
}

