import java.util.Scanner;

public class Q1722_TimeFail {
	static int n;
	static int arr[];
	static int temp[] ;
	static int opt ;
	static int count;
	static int num;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n];
		temp = new int[n];
		count =0;
		int save[] = new int[n];
		boolean visited[] = new boolean[n];
		
		for(int i = 0 ;i  < n ; i++) {
			arr[i]= i+1;
		}
		opt = sc.nextInt();
		if(opt ==1 ) {
			num = sc.nextInt();
		}else if(opt ==2) {
			for(int i = 0 ; i < n ; i++) {
				temp[i] = sc.nextInt();
			}
		}
		perm(save,visited,0,n);
		
	}
	static void perm(int[] output, boolean[] visited, int depth, int r) {
	    if (depth == r) {
	    	count++;
	    	if(opt == 1) {
		    	if( count == num) {
		    		for(int i = 0 ; i < n ; i++) {
			    		System.out.print(output[i] + " ");
			    	}
		    		return;
		    	}else {
		    		return;
		    	}
	    	}else {
	    		for(int i = 0 ; i < n ; i++) {
	    			if(temp[i]!= output[i]) {
	    				return;
	    			}
	    		}
	    		System.out.println(count);
	    	}
	    	return;
	    }
	 
	    for (int i=0; i<n; i++) {
	        if (visited[i] != true) {
	            visited[i] = true;
	            output[depth] = arr[i];
	            perm(output, visited, depth + 1, r);       
	            output[depth] = 0;
	            visited[i] = false;;
	        }
	    }
	}
}