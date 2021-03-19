import java.util.*;
public class Q20300 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long arr[] = new long[n];
		Arrays.sort(arr);
		for(int i = 0 ; i < n ; i++) {
			arr[i] = sc.nextLong();
		}
		int s = 0;
		int e = n-1;		
		long max = 0;
        
        if(n%2 ==1) {			//4 5 7 9 12 13 18
      		max = arr[e];
			while(s < e) {
				if(arr[s] + arr[e-1] > max) {
					max = arr[s] + arr[e-1];
				}
				s++;
				e--;
			}
			System.out.println(max);
		}else {					////4 5 7 9 14 15 16 17
       		max =arr[s] + arr[e];
			while(s < e) {
				if(arr[s] + arr[e] > max) {
					max = arr[s] + arr[e];
				}
				s++;
				e--;
			}
			System.out.println(max);
		}
	}
}

//
//import java.util.*;
//public class Q20300 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		long arr[] = new long[n];
//		
//		for(int i = 0 ; i < n ; i++) {
//			arr[i] = sc.nextLong();
//		}
//		Arrays.sort(arr);
//
//		long max = 0;
//        
//        if(n%2 ==1) {			//4 5 7 9 12 15 16
//      		max = arr[n-1];
//			for(int i = 0 ; i < (n-1)/2 ;i++) {
//                max = Math.max(max,arr[i] + arr[n-2-i]);
//			}
//			System.out.println(max);
//		}else {
//       		max =arr[0] + arr[n-1];
//			for(int i = 1; i <n/2 ;i++){
//                max = Math.max(max,arr[i] + arr[n-1-i]);
//            }
//			System.out.println(max);
//		}
//	}
//}