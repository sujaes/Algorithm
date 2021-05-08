//import java.util.Scanner;
//
//class Q14889 {
//	static int n;
//	static int arr[][];
//	static int min = Integer.MAX_VALUE;
//	static boolean visited[];
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        arr = new int[n+1][n+1];
//        visited = new boolean[n+1];
//        
//        for(int i = 1; i <=n ;i++) {
//        	for(int j =1; j<=n ;j++) {
//        		arr[i][j] = sc.nextInt();
//        	}
//        }
//        
//        comb(1,0);
//        System.out.println(min);
//    }
//    public static void comb(int start,int depth) {
//    	if(depth == n/2) {
//    		min = Math.min(min, getAbilityDifference());
//    		return;
//    	}
//    	for(int i =start; i<=n; i++) {
//    		if(!visited[i]) {
//    			visited[i] = true;
//    			comb(i+1 , depth+1);
//    			visited[i] = false;
//    		}
//    	}
//    }
//    public static int getAbilityDifference() {
//    	int start= 0;
//    	int link = 0;
//    	
//    	for(int i = 1; i <= n; i++) {
//    		for(int j = 1; j<=n ;j++) {
//    			if(visited[i] && visited[j]) {
//    				start += arr[i][j];
//    			}else if(!visited[i] && !visited[j]){
//    				link += arr[i][j];
//    			}
//    		}
//    	}
//    	return Math.abs(start - link);
//    }
//
//}


import java.util.*;
class Q14889 {
	static int n,min=Integer.MAX_VALUE;
	static int arr[][];
	static boolean visited[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n][n];
        for(int i = 0 ; i < n ;i++) {
        	for(int j = 0 ; j < n ;j++) {
        		arr[i][j] = sc.nextInt();
        	}
        }
        int a[] = new int[n/2];
        comb(1,0);
        System.out.println(min);
    }
    public static void comb(int start,int depth) {
		if(depth == n/2) {
			min = Math.min(min, diff());
			return;
		}
		for(int i =start; i<=n; i++) {		//1부터 시작해서 n까지 n/2개 고르기
			if(!visited[i]) {
				visited[i] = true;
				comb(i+1 , depth+1);
				visited[i] = false;
			}
		}
    }

    public static int diff() {				//n/2개 고를때마다 차이 확인
    	int start= 0;
    	int link = 0;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j<=n ;j++) {
				if(visited[i] && visited[j]) {	//둘다 고른숫자면 start팀에 포함
					start += arr[i][j];
				}else if(!visited[i] && !visited[j]){	//둘다 안고른 숫자면 link팀에 포함
					link += arr[i][j];
				}
			}
		}
		return Math.abs(start - link);			//두수의 차이를 min과 비교해야함
    }

}
