import java.util.Scanner;

class Q15649 {
	static int n,m;
	static boolean visited[];
	static int arr[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        visited = new boolean[n];
        arr = new int[m];

        comb(1,0);
        
    }
    public static void comb(int start,int depth) {
    	
    	if(depth == m) {
    		for(int i = 0; i < m ;i++) {
            	System.out.print(arr[i]+" ");
    		}
    		System.out.println();
    		return;
    	}
    	for(int i = 0; i <n; i++) {
    		if(!visited[i]) {
            	visited[i] = true;
            	arr[depth] = i+1;  //해당 깊이를 인덱스로 하여 i+1저장
            	comb(i+1 , depth+1);
            	visited[i] = false;
    		}
    	}
    }


}
