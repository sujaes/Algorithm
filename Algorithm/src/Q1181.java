//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//import java.util.Scanner;
//
//public class Q1181 {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		List<String> filter = new ArrayList<String>();
//		List<Dic> list = new ArrayList<Dic>();
//		Dic dic;
//		String temp;
//		int n = sc.nextInt();
//		
//		for(int i = 0 ; i < n ; i++) {
//			temp = sc.next();
//			if(!filter.contains(temp)) {
//				filter.add(temp);
//			}
//		}
//		
//		
//		for(int i = 0 ; i < filter.size() ; i++) {
//			dic = new Dic(filter.get(i).length(),filter.get(i));
//			list.add(dic);
//		}
//		
//		Com comp = new Com();
//		Collections.sort(list,comp);
//		
//		
//		for(int i = 0 ; i < list.size();i++) {
//			System.out.println(list.get(i).word);
//		}
//		
//	}
//
//}
//class Dic{
//	int length;
//	String word;
//	public Dic(int length, String word) {
//		this.word = word;
//		this.length = length;
//	}
//}
//
//class Com implements java.util.Comparator<Dic>{
//
//	@Override
//	public int compare(Dic o1, Dic o2) {
//		// TODO Auto-generated method stub
//		if(o1.length > o2.length) {
//			return 1;
//		}else if(o1.length < o2.length) {
//			return -1;
//		}else {
//			if(o1.word.compareTo(o2.word)>0) {
//				return 1;
//			}else if(o1.word.compareTo(o2.word)<0) {
//				return -1;
//			}else {
//				return 0;
//			}
//		}
//
//	}
//	
//}


import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;
public class Q1181 {
    public static void main(String[] args){
        PriorityQueue<Node> pq = new PriorityQueue<Node>();
        ArrayList<String> list = new ArrayList<String>();
    	Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
        	String temp = sc.next();
        	if(!list.contains(temp)) {
            	list.add(temp);
        		Node nn = new Node(temp.length(),temp);
               	pq.add(nn);
        	}

        }
        
        while(!pq.isEmpty()) {
        	Node n = pq.poll();
        	System.out.println(n.y);
        }
 
    }
    
    public static class Node implements Comparable<Node>{
    	int x;
    	String y;
    	public Node(int x ,String y) {
    		this.x = x;
    		this.y = y;
    	}
    	public int compareTo(Node o) {
    		if(this.x == o.x) {
    			return y.compareTo(o.y);
    		}else {
    			return this.x - o.x;
    		}
    	}
    }
 
}




