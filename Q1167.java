package git;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q1167 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Edge>[] list = new ArrayList[n+1];
        for (int i = 1; i <= n; i++) {
            list[i] = new ArrayList<>();
        }
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            while(true) {
                int index = sc.nextInt();

                if(index == -1) break;
                else {
                    list[num].add(new Edge(index, sc.nextInt()));
                }
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        int max = 0;
        int maxVertex = 0;
        int[] visited = new int[n+1];

        while(!queue.isEmpty()) {
            int num = queue.poll();

            for (int i = 0; i < list[num].size(); i++) {
                Edge next = list[num].get(i);
                if(next.index == 1) continue;

                if(visited[next.index] == 0) {
                    visited[next.index] = visited[num] + next.distance;
                    if(max < visited[next.index]) {
                        maxVertex = next.index;
                        max = visited[next.index];
                    }
                    queue.add(next.index);
                }
            }
        }

        queue.add(maxVertex);
        visited = new int[n+1];
        max = 0;
        while(!queue.isEmpty()) {
            int num = queue.poll();

            for (int i = 0; i < list[num].size(); i++) {
                Edge next = list[num].get(i);
                if(next.index == maxVertex) continue;

                if(visited[next.index] == 0) {
                    visited[next.index] = visited[num] + next.distance;
                    if(max < visited[next.index]) {
                        max = visited[next.index];
                    }
                    queue.add(next.index);
                }
            }
        }
        System.out.println(max);
    }

    static class Edge {
        int index, distance;
        public Edge (int index, int distance) {
            this.index = index;
            this.distance = distance;
        }
    }
}
