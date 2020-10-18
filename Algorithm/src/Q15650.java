import java.util.Scanner;

class Q15650 {
	static int n,m;
	static boolean visited[];
	static int arr[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        visited = new boolean[n];
        arr = new int[m];
        
        comb(0,0);
        return;
    }
    public static void comb(int start, int depth) {
    	if(depth == m) {
    		for(int i =0; i < m;i++) {
        		System.out.print(arr[i] + " ");
    		}
    		System.out.println();
    		return;
    	}
    	
    	for(int i = start ; i < n; i++) {
    		if(!visited[i]) {
    			visited[i] = true;
    			arr[depth] =  i+1;
    			comb(i+1,depth+1);
    			visited[i] = false;
    		}
    	}
    }
    
    


}
