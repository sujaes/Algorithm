import java.util.Scanner;

public class Q2531 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	//���� �� 
		int d = sc.nextInt();	//�ʹ� ������
		int k = sc.nextInt();	//���� �Դ¼�
		int c = sc.nextInt();	//������ȣ
		int sum = 0;
		int arr[] = new int[N];
		int eat[] = new int[d+1];
		
		for(int i = 0 ;i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int count = 0, max;
		 
        for (int i = 0; i < k; i++) {
            if (eat[ arr[i] ] == 0) {
            	count++; // ó�� �Ծ�� ������ �ʹ��̶�� ī��Ʈ + 1
            }
            eat[ arr[i] ]++;
        }
        max = count;	//���� �ʹ䰡����
 
        for (int i = 1; i < N; i++) {
            if (max <= count) {
                if (eat[ c ] == 0) {
                	max = count + 1;	//�����ț����� max +1
                }
                else {
                	max = count;
                }
            }
            							//��� �ʹ��� �����Ǽ� ����� ����
            eat[ arr[i - 1] ]--;
            if (eat[ arr[i - 1] ] == 0) {
            	count--;
            }
 
            if (eat[ arr[(i + k - 1) % N]] == 0) {
            	count++;
            }
            eat[ arr[(i + k - 1) % N]]++;
        }
		
		
        System.out.println(max);
	}
}


//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class Main {
//	public static void main(String[] args) throws Exception {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		int N = Integer.parseInt(st.nextToken()); // ���� ��
//		int d = Integer.parseInt(st.nextToken()); // �ʹ� ���� ��
//		int k = Integer.parseInt(st.nextToken()); // �����ؼ� �Ծ���ϴ� ���� ��
//		int c = Integer.parseInt(st.nextToken()); // ���� ��ȣ
//		
//		int[] input = new int[N+k]; // ȸ���ʹ产Ʈ
//		for (int i = 0; i < N; i++) {
//			input[i] = Integer.parseInt(br.readLine());
//		}
//		int idx = 0;
//		for (int i = N; i < N+k; i++) { // ȸ����Ʈ�ϱ� k����ŭ �ڿ� �߰����ֱ�
//			input[i] = input[idx];
//			idx++;
//		}
//		
//		int[] sushi = new int[d+1]; // ���� ���� ���� ����
//		int[] result = new int[N];	// �� ��ġ�� ���� k�� ��ŭ �Ծ��� �� �������ִ� �ʹ� ������ ���� ����
//		int cnt = 0; 				// ���� �������ִ� �ʹ��� ���� ����
//		
//		for (int i = 0; i < N+k; i++) {

//			if(i >= k) {
//				result[i-k] = cnt;		// ���� ���ִ� �ʹ��� ���� ���� ����
//				if(sushi[c] == 0){		// ������ �޾��� �� ���� ���� ���� �����̸� ���� 1 ����
//					result[i-k]++;
//				}

//				int prev = input[i-k];	// ���� ó���� ���� �ʹ�
//				if(sushi[prev] == 1) {	// �ѹ��� �Ծ �ʹ� ������ cnt--
//					cnt--;
//				}
//				sushi[prev]--; 			// �ȸԾ��ٰ� üũ
//			}
//			

//			int now = input[i]; 		// ���� ���� �ʹ�

//			if(sushi[now] == 0) {		// �ѹ��� �ȸԾ �ʹ� ������ cnt++
//				cnt++;
//			}

//			sushi[now]++;				// now��° �ʹ��� �Ծ��ٰ� üũ
//		}
//		
//		int max = 0;
//		for (int i = 0; i < N; i++) {
//			if(max < result[i])
//				max = result[i];
//		}
//		
//		System.out.println(max);
//	}
//}




//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//
//public class Main {
//	public static void main(String[] args) throws Exception {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String[] input = br.readLine().split(" ");
//
//		int N = Integer.parseInt(input[0]); // ���� ��
//		int d = Integer.parseInt(input[1]); // �ʹ��� ������
//		int k = Integer.parseInt(input[2]); // �������� �Ծ�� �ϴ� ���� ��
//		int c = Integer.parseInt(input[3]); // �� ���� �ִ� ���� ��ȣ
//		int size = N + k - 1;
//		int[] plates = new int[size];
//		int[] count = new int[d + 1];
//
//		for (int i = 0; i < N; i++) {
//			plates[i] = Integer.parseInt(br.readLine());
//		}

//		for (int i = N; i < size; i++) {
//			plates[i] = plates[i - N];
//		}
//
//		count[c] = 1; // �������� �ִ°Ŵ� �԰� ����
//
//		int eat = 1;
//		for (int i = 0; i < k; i++) { // �ʱⰪ ����
//			if (++count[plates[i]] == 1) { // 0 -> 1 �̸� ���� ������ // 2 �̻��� �ߺ�
//				eat++;
//			}
//		}
//
//		int max = eat;

//		for (int i = k; i < size; i++) {
//			if (--count[plates[i - k]] == 0) { // 1 -> 0 �̸� �ȸ����� ��
//				eat--;
//			}

//			if (++count[plates[i]] == 1) {
//				eat++;
//			}

//			max = Math.max(max, eat);
//		}
//		System.out.println(max);
//	}
//}