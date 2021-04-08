//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.Scanner;
//
//public class Q10814 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		List<Info> list = new ArrayList<Info>();
//		Info info;
//		int n=sc.nextInt();
//		
//		for(int i =0 ;  i < n; i++) {
//			info = new Info(sc.nextInt(),i,sc.next());
//			list.add(info);
//		}
//		Compa comp = new Compa();
//		Collections.sort(list,comp);
//		
//		for(int i = 0 ; i < n; i++) {
//			System.out.println(list.get(i).age + " " + list.get(i).name);
//		}
//	}
//
//}
//
//class Info{
//	int age;
//	int index;
//	String name;
//	public Info(int age, int index,String name) {
//		this.age = age;
//		this.index = index;
//		this.name = name;
//	}
//}
//
//class Compa implements java.util.Comparator<Info>{
//	@Override
//	public int compare(Info o1,Info o2) {
//		// TODO Auto-generated method stub
//		if(o1.age > o2.age) {
//			return 1;
//		}else if(o1.age<o2.age) {
//			return -1;
//		}else {
//			if(o1.index>o2.index) {
//				return 1;
//			}else if(o1.index<o2.index) {
//				return -1;
//			}else {
//				return 0;
//			}
//		}
//	}
//}



import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;
public class Q10814 {
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
    
    public static class Node implements Comparable<Node>{
    	int index;
    	int x;
    	String y;
    	public Node(int index,int x ,String y) {
    		this.index = index;
    		this.x = x;
    		this.y = y;
    	}
    	public int compareTo(Node o) {
    		if(this.x == o.x) {
    			return this.index - o.index;
    		}else {
    			return this.x - o.x;
    		}
    	}
    }
 
}

