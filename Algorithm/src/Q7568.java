//import java.util.Scanner;
//public class Q7568{
//	
//	public static void main(String[] args){
//		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int person[][] = new int[n][2];
//		int rank[] = new int[n];
//		for(int i = 0 ; i < n; i++){
//			rank[i] = 1;
//			person[i][0] = sc.nextInt();
//			person[i][1] = sc.nextInt();
//		}
//		
//		for(int i = 0 ; i < n ; i++) {
//			for(int j = 0; j <n ; j++) {
//				if(person[i][0] > person[j][0] && person[i][1] > person[j][1]) {
//					rank[j]++;
//				}
//			}
//		}
//		
//		for(int i=0; i<n;i++) {		
//			System.out.print(rank[i]+" ");
//		}
//	
//	}
//}

import java.util.Scanner;
public class Q7568 {
    static int n;
    static Body arr[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new Body[n];
        int count = 1;
        for(int i = 0 ; i < n ; i++) {
        	int x = sc.nextInt();
        	int y = sc.nextInt();
        	arr[i] = new Body(x,y);
        }
        
        for(int i = 0 ; i < n ; i++) {
        	count = 1;
        	for(int j = 0 ; j < n ; j++) {
        		if(arr[i].x < arr[j].x) {
        			if(arr[i].y < arr[j].y) {
        				count++;
        			}else {
        				continue;
        			}
        		}else {
        			continue;
        		}
        	}
        	
        	System.out.print(count+" ");
        }
        

    }
}
class Body{
	int x;
	int y;
	public Body(int x , int y) {
		this.x = x;
		this.y = y;
	}
}



