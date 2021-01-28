//import java.util.*;
//public class Q1976 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();		//node수
//		int m = sc.nextInt();		//여행경로 수
//		int arr[] = new int[n+1];
//		for(int i = 1; i <=n ;i++) {
//			arr[i] = i;
//		}
//
//		for(int i = 1 ; i <= n ; i++) {
//			for(int j = 1; j <=n ;j++) {
//				int num = sc.nextInt();
//				if(num == 1) {
//					unionP(arr,i,j);
//				}
//			}
//		}
//		
////		for(int i = 1 ; i <= n ; i++) {
////			System.out.println(arr[i]);
////		}
//		
//		int k = sc.nextInt();
//		int temp;
//		for(int i = 1; i <m; i++) {
//			temp = sc.nextInt();
//			if(!findP(arr, k,temp)) {
//				System.out.println("NO");
//				return;
//			}
//			 k = temp; 
//			
//		}
//		System.out.println("YES");
//		
//		
//	}
//	public static int getP(int arr[],int a) {
//		if(arr[a] == a) {
//			return a;
//		}
//		else {
//			arr[a] = getP(arr,arr[a]);
//			return arr[a];
//		}
//	}
//	
//	public static void unionP(int arr[],int a, int b) {		
//		int x = getP(arr,a);
//		int y = getP(arr,b);		
//		if(x<y) {
//			arr[b] = x;
//		}else {
//			arr[a] = y;
//		}
//	}
//	public static boolean findP(int arr[],int a,int b) {
//		int x = getP(arr,a);
//		int y = getP(arr,b);
//		System.out.println(a+"와 "+b +"를 연결되어있는지 확인함" + "a의 부모 = "+x + " b의 부모 = "+ y);
//		if(x == y) {
//			return true;
//		}else {
//			return false;
//		}		
//	}
//	
//	
//}




import java.util.Scanner;

public class Q1976 {

    private static int[] join;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[][] map = new int[N + 1][N + 1];

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N ; j++) {
                map[i][j] = scanner.nextInt();
            }
        }

        int[] route = new int[M + 1];
        for (int i = 1; i <= M; i++) {
            route[i] = scanner.nextInt();
        }

        join = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            join[i] = i;
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (map[i][j] == 1) {
                    if (i < j) {
                        union(j, i);
                    } else {
                        union(i, j);
                    }
                }
            }
        }

        int index = find(route[1]);
        for (int i = 2; i < route.length; i++) {
            if (index != find(route[i])) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }

    private static int find(int city) { //부모찾기
        if (join[city] == city) {
            return city;
        }

        int p = find(join[city]);
        join[city] = p;

        return p;
    }

    private static void union(int city1, int city2) {	//합치기
        int x = find(city1);
        int y = find(city2);

        if (x != y) {
            join[x] = y;
        }
    }
}