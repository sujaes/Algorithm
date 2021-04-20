//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Scanner;
//
//public class Q16236 {
//
//    private static int[] dx = {1, 0, -1, 0};
//    private static int[] dy = {0, 1, 0, -1};
//    private static int N;
//    private static int[][] map;
//    private static int[][] dist;
//    private static int sharkSize = 2;
//    private static int eatingCount = 0;
//    private static int count = 0;
//    private static int sharkX = -1;
//    private static int sharkY = -1;
//    private static int minX;
//    private static int minY;
//    private static int minDist;
//
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        N = scanner.nextInt();
//        map = new int[N + 1][N + 1];
//
//        for (int i = 1; i <= N; i++) {
//            for (int j = 1; j <= N; j++) {
//                map[i][j] = scanner.nextInt();
//
//                if (map[i][j] == 9) {
//                    sharkX = i;
//                    sharkY = j;
//                    map[i][j] = 0;
//                }
//            }
//        }
//
//        while (true) {
//            dist = new int[N + 1][N + 1];
//            minX = Integer.MAX_VALUE;
//            minY = Integer.MAX_VALUE;
//            minDist = Integer.MAX_VALUE;
//
//            bfs(sharkX, sharkY);
//
//            if (minX != Integer.MAX_VALUE && minY != Integer.MAX_VALUE) {
//                eatingCount++;
//                map[minX][minY] = 0;
//                sharkX = minX;
//                sharkY = minY;
//                count += dist[minX][minY];
//
//                if (eatingCount == sharkSize) {
//                    sharkSize++;
//                    eatingCount = 0;
//                }
//            } else {
//                break;
//            }
//        }
//
//        System.out.println(count);
//    }
//
//    private static void bfs(int x, int y) {
//        Queue<Point> queue = new LinkedList<>();
//        queue.add(new Point(x, y));
//
//        while (!queue.isEmpty()) {
//            Point p = queue.poll();
//
//            for (int i = 0; i < 4; i++) {
//                int newX = p.x + dx[i];
//                int newY = p.y + dy[i];
//
//                if (isInArea(newX, newY) && isAbleToMove(newX, newY) && dist[newX][newY] == 0) {
//                    dist[newX][newY] = dist[p.x][p.y] + 1;
//
//                    if (isEatable(newX, newY)) {
//                        if (minDist > dist[newX][newY]) {
//                            minDist = dist[newX][newY];
//                            minX = newX;
//                            minY = newY;
//                        } else if (minDist == dist[newX][newY]) {
//                            if (minX == newX) {
//                                if (minY > newY) {
//                                    minX = newX;
//                                    minY = newY;
//                                }
//                            } else if (minX > newX) {
//                                minX = newX;
//                                minY = newY;
//                            }
//                        }
//                    }
//
//                    queue.add(new Point(newX, newY));
//                }
//            }
//        }
//    }
//
//    private static boolean isAbleToMove(int x, int y) {
//        return map[x][y] <= sharkSize;
//    }
//
//    private static boolean isEatable(int x, int y) {
//        return map[x][y] != 0 && map[x][y] < sharkSize;
//    }
//
//    private static boolean isInArea(int x, int y) {
//        return x <= N && x > 0 && y <= N && y > 0;
//    }
//
//
//    private static class Point {
//        private int x;
//        private int y;
//
//        private Point(int x, int y) {
//            this.x = x;
//            this.y = y;
//        }
//    }
//}


//import java.util.*;
//public class Q16236{
//	static int n;
//	static int dx[] = {-1,0,0,1};//위 왼쪽 오른쪽 아래
//	static int dy[] = {0,-1,1,0}; 
//	static int[][] arr;
//	static int[][] times;
//	static int size;
//	static int count;
//	static int time;
//	static int lastx;
//	static int lasty;
//	static boolean visited[][];
//	static Queue<Node> q = new LinkedList<Node>();
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		n = sc.nextInt();
//		size = 2;
//		time = 0;
//		count = 0;
//		arr = new int[n][n];
//		times = new int[n][n];
//		visited = new boolean[n][n];
//		for(int i = 0 ; i < n ; i++) {
//			for(int j = 0 ; j <n ;j++) {
//				arr[i][j] = sc.nextInt();
//				if(arr[i][j] == 9) {
//					q.add(new Node(i,j));
//					lastx = i;
//					lasty = j;
//				}
//			}
//		}
//		search();
//		System.out.println(time);
//	}
//	
//	public static void search() {
//		while(!q.isEmpty()) {
//			Node node = q.poll();
//			int x = node.x;
//			int y = node.y;
//			visited[x][y] = true;
//			for(int i = 0 ; i < 4; i++) {
//				int nx = x + dx[i];
//				int ny = y + dy[i];
//				if(nx < 0 || ny < 0 || nx >= n || ny >= n || visited[nx][ny]) {
//					continue;
//				}
//				times[nx][ny] = times[x][y] +1;
//				if(arr[nx][ny]>size) {
//					continue;
//				}else if(arr[nx][ny] < size && arr[nx][ny] !=0 && !visited[nx][ny]){
//					arr[lastx][lasty] = 0;																//이전값 0
//					arr[nx][ny] = 9;																	//해당값 9
//					count++;
//					System.out.println(x + " "+ y +" -> " + nx+" "+ny +" 잡아먹기 size = " + size + " count = "+count);
//					if(count == size) {																	//상어키우기					
////						System.out.println("사이즈 증가 ");	
//						size++;	
//						count = 0;
//					}							
//					time += times[nx][ny];								//잡아먹을 고기가 있는 것이니까 걸린시간을 최종시간에 더하기
//					System.out.println("걸린시간 : " + time);
////					print();
//					lastx = nx;
//					lasty = ny;
//					q.clear();
//					q.add(new Node(nx,ny));																//방문
//					visited = new boolean[n][n];														//방문 초기화
//					times = new int[n][n];
//					break;
//				}else if(arr[nx][ny] == size || arr[nx][ny] == 0 && !visited[nx][ny]) {					//크기가 같으면
//					System.out.println(x + " "+ y +" -> " + nx+" "+ny +"방문");
//					visited[nx][ny] = true;
//					q.add(new Node(nx,ny));
//																							//그냥 방문
//				}
//			}
//		}
//	}
//	public static void print() {
//		for(int i = 0 ; i < n ; i++) {
//			for(int j = 0 ; j <n ;j++) {
//				System.out.print(arr[i][j] + " ");
//			}System.out.println();
//		}
//		
//	}
//	
//	public static class Node{
//		int x;
//		int y;
//		public Node(int x, int y) {
//			this.x = x;
//			this.y = y;
//		}
//	}
//}
