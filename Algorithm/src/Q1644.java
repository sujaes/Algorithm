import java.io.*;
import java.util.*;

public class Q1644 {
	static int n, answer;
	static boolean nPrime[];
	static ArrayList<Integer> al = new ArrayList<Integer>();
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		answer = 0;
		nPrime = new boolean[n+1];
		
		primeNumber();
		solve();
		System.out.println(answer);
	}
	
	public static void primeNumber() {
		for(int i = 2; i <= (n+1)/2; i++) {
			for(int j = 2; j*i <= n; j++)
				nPrime[j*i] = true;
		}
		nPrime[1] = true; 
		
		for(int i = 2; i <= n; i++)
			if(!nPrime[i])
				al.add(i);
	}
	
	public static void solve() {
		int sum;
		for(int i = 0; i < al.size(); i++) {
			sum = 0;
			for(int j = 0; j+i < al.size(); j++) {
				sum += al.get(i+j);
				if(sum == n) {
					answer++;
					break;
				}
				else if(sum > n)
					break;
			}
		}
	}

}