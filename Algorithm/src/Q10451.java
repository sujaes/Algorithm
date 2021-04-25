import java.util.Scanner;
public class Q10451 {
    static boolean visit[];
    static int arr[];
    static int count;
    
    static void search(int ind){
    	if(visit[ind]){
    		count++;
    		return;
    	}
    	int nextind;
    	visit[ind]=true;
    	nextind = arr[ind]-1;
    	search(nextind);
    }
    
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        for(int i = 0 ; i <num;i++){
        	int size = sc.nextInt();
        	visit = new boolean[size];
        	arr = new int[size];
        	count =0;
        	for(int j=0;j<size;j++){
        		arr[j]=sc.nextInt();
        	}
        	for(int j = 0 ; j<size;j++){
        		if(!visit[j]){
        			search(j);
        		}
        	}
        	System.out.println(count);
        }
    }
}