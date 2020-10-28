import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1722{
	
	static int n;
	static int[] arr;
	static long[] perm;
	static long k;
	
	static void getKth() {
		//k번째 순열 찾기
		boolean check[] = new boolean[n+1];
		//check[i]가 true면 이미 쓰인거임
		for (int i=0 ; i<n ; i++) { //i번째자리에 채워넣기
			for (int j=1 ; j<=n ; j++) {//후보 : j
				if(check[j]==true)
					continue;
				if (k>perm[n-i-1]) { //나머지 뒤에서 얻을 수 있는 경우의 수보다 k가 크면? 그 숫자보다 더 큰걸 쓰면 됨. 
					k-=perm[n-i-1];
				} else {
					arr[i]=j;
					check[j] = true;
					break;
				}
			}
		}
	}
	
	static long findK() {
		long k=0l;
		boolean check[] = new boolean[n+1]; //체크용 배열
		for (int i=0 ; i<n ; i++) {//i번째 자리 체크하기
			for (int j=1 ; j<=n ; j++) { //i번째자리에 올 수 있는 후보들을 앞에서부터 세 줌
				if (check[j]) continue; //이미 쓴거면 필요없음 
				if (arr[i]!=j) { //앞에서부터 셌는데 이게 아니라면, 이거만큼 그 다음이라는 얘기
					k += perm[n-i-1];
				} else {
					check[j] = true; //찾았으면 다음자리수로 넘어가 
					break;
				}
			}
		}
		return k+1;//첫번째자리부터 세줌
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		perm = new long[21];
		perm[0]=1l;
		for (int i=1 ; i<=20 ; i++) {
			perm[i] = perm[i-1]*(long)i;
		}
		
		n = Integer.parseInt(br.readLine());
		StringTokenizer token = new StringTokenizer(br.readLine());
		int probNum = Integer.parseInt(token.nextToken());
		arr = new int[n+1];
		if(probNum == 1) {
			k = Long.parseLong(token.nextToken());
			getKth();
			StringBuilder stb = new StringBuilder();
			for (int i=0 ; i<n ; i++)
				stb.append(arr[i]+ " ");
			System.out.println(stb);
				
		} else {
			for (int i=0 ; i<n ; i++)
				arr[i] = Integer.parseInt(token.nextToken());
			System.out.println(findK());
		}
	}
}