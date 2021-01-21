//import java.util.Arrays;
//import java.util.Scanner;
//public class Q2470 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int arr[] = new int[n];
//		int s = 0;
//		int e = n-1;
//		int max = 2000000000;
//		int answer[] = new int[2];
//		
//		for(int i = 0 ; i < n; i++) {
//			arr[i] = sc.nextInt();
//		}
//		Arrays.sort(arr);
//		
//		answer[0] = arr[0];
//		answer[1] = arr[n-1];
//		
//		while(s<e) {
//			int sum = arr[s] + arr[e];
//			
//			if(Math.abs(sum) < max) {
//				
//				answer[0] = arr[s];
//				answer[1] = arr[e];
//				max = Math.abs(sum);
//			}
//			if(sum > 0) {
//				e--;
//			}else {
//				s++;
//			}
//		}
//		for(int i = 0; i <2; i++) {
//			System.out.print(answer[i]+" ");
//		}
//	}
//}


import java.util.*;
import java.io.*;
  
class Q2470 {
    static int stoi(String s) {
        return Integer.parseInt(s);
    }
 
    static int pick1 = -1;
    static int pick2 = -1;
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
 
        int n = stoi(br.readLine());
        int[] arr = new int[n];
 
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++)
            arr[i] = stoi(st.nextToken());
 
        Arrays.sort(arr);
 
        solution(n, arr);
 
        System.out.println(pick1 + " " + pick2);
    }
 
    static void solution(int n, int[] arr) {
        int left = 0;
        int right = n-1;
        int max = 2000000000;
 
        while(left < right) {
            int sum = arr[left] + arr[right];
 
            // 두 용액 갱신
            if(Math.abs(sum) < max) {
                pick1 = arr[left];
                pick2 = arr[right];
                max = Math.abs(sum);
            }
 
            if(sum > 0)
                right--;
            else
                left++;
        }
    }
}

