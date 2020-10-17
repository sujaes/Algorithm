import java.util.Scanner;

class Q14889 {
	static int n;
	static int arr[][];
	static int min = Integer.MAX_VALUE;
	static boolean visited[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n+1][n+1];
        visited = new boolean[n+1];
        
        for(int i = 1; i <=n ;i++) {
        	for(int j =1; j<=n ;j++) {
        		arr[i][j] = sc.nextInt();
        	}
        }
        
        comb(1,0);
        System.out.println(min);
    }
    public static void comb(int start,int depth) {
    	if(depth == n/2) {
    		min = Math.min(min, getAbilityDifference());
    		return;
    	}
    	for(int i =start; i<=n; i++) {
    		if(!visited[i]) {
    			visited[i] = true;
    			comb(i+1 , depth+1);
    			visited[i] = false;
    		}
    	}
    }
    public static int getAbilityDifference() {
    	int start= 0;
    	int link = 0;
    	
    	for(int i = 1; i <= n; i++) {
    		for(int j = 1; j<=n ;j++) {
    			if(visited[i] && visited[j]) {
    				start += arr[i][j];
    			}else if(!visited[i] && !visited[j]){
    				link += arr[i][j];
    			}
    		}
    	}
    	return Math.abs(start - link);
    }

}
