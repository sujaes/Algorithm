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
		//k��° ���� ã��
		boolean check[] = new boolean[n+1];
		//check[i]�� true�� �̹� ���ΰ���
		for (int i=0 ; i<n ; i++) { //i��°�ڸ��� ä���ֱ�
			for (int j=1 ; j<=n ; j++) {//�ĺ� : j
				if(check[j]==true)
					continue;
				if (k>perm[n-i-1]) { //������ �ڿ��� ���� �� �ִ� ����� ������ k�� ũ��? �� ���ں��� �� ū�� ���� ��. 
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
		boolean check[] = new boolean[n+1]; //üũ�� �迭
		for (int i=0 ; i<n ; i++) {//i��° �ڸ� üũ�ϱ�
			for (int j=1 ; j<=n ; j++) { //i��°�ڸ��� �� �� �ִ� �ĺ����� �տ������� �� ��
				if (check[j]) continue; //�̹� ���Ÿ� �ʿ���� 
				if (arr[i]!=j) { //�տ������� �ôµ� �̰� �ƴ϶��, �̰Ÿ�ŭ �� �����̶�� ���
					k += perm[n-i-1];
				} else {
					check[j] = true; //ã������ �����ڸ����� �Ѿ 
					break;
				}
			}
		}
		return k+1;//ù��°�ڸ����� ����
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