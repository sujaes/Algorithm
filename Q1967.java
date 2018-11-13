package git;

import java.util.Scanner;
import java.util.LinkedList;

public class Q1967 {
	static int nodeNum;
	static int[][] route;
	static LinkedList<Node> queue = new LinkedList<Node>();
	
	static class Node {
		int node, sum;
		
		Node (int node, int sum) {
			this.node = node;
			this.sum = sum;
		}
	}
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		nodeNum = sc.nextInt();
		route = new int[nodeNum+1][nodeNum+1];
		
		for (int i = 1; i < nodeNum; i++) {
			int s = sc.nextInt();
			int d = sc.nextInt();
			int w = sc.nextInt();			
			route[s][d] = w;
			route[d][s] = w;
		}
		
		Node node1  = maxLeng(1);
		Node result = maxLeng(node1.node); 
		
		System.out.println(result.sum);
	}
	
	public static Node maxLeng(int startNode) {
		boolean[] isVisited = new boolean[nodeNum+1];
		for (int i = 0; i <= nodeNum; i++) {
			isVisited[i] = false;
		}
		
		Node maxNode = new Node(startNode, 0);
		queue.add(maxNode); 
		while (!queue.isEmpty()){
			Node tmpNode = queue.pollFirst();
			isVisited[tmpNode.node] = true;
			
			for (int i = 1; i <= nodeNum; i++) {
				if (isVisited[i] == false && route[tmpNode.node][i] != 0) {
					queue.add(new Node(i, tmpNode.sum + route[tmpNode.node][i]));
				}
			}
		
			if (maxNode.sum < tmpNode.sum) {
				maxNode = tmpNode;
			}
		}
		return maxNode;
	}
}