import java.util.Scanner;

public class Q2531 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	//접시 수 
		int d = sc.nextInt();	//초밥 가지수
		int k = sc.nextInt();	//연속 먹는수
		int c = sc.nextInt();	//쿠폰번호
		int sum = 0;
		int arr[] = new int[N];
		int eat[] = new int[d+1];
		
		for(int i = 0 ;i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		int count = 0, max;
		 
        for (int i = 0; i < k; i++) {
            if (eat[ arr[i] ] == 0) {
            	count++; // 처음 먹어보는 종류의 초밥이라면 카운트 + 1
            }
            eat[ arr[i] ]++;
        }
        max = count;	//먹은 초밥가지수
 
        for (int i = 1; i < N; i++) {
            if (max <= count) {
                if (eat[ c ] == 0) {
                	max = count + 1;	//쿠폰안썻으면 max +1
                }
                else {
                	max = count;
                }
            }
            							//계속 초밥이 생성되서 생기는 문제
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
//		int N = Integer.parseInt(st.nextToken()); // 접시 수
//		int d = Integer.parseInt(st.nextToken()); // 초밥 종류 수
//		int k = Integer.parseInt(st.nextToken()); // 연속해서 먹어야하는 접시 수
//		int c = Integer.parseInt(st.nextToken()); // 쿠폰 번호
//		
//		int[] input = new int[N+k]; // 회전초밥벨트
//		for (int i = 0; i < N; i++) {
//			input[i] = Integer.parseInt(br.readLine());
//		}
//		int idx = 0;
//		for (int i = N; i < N+k; i++) { // 회전벨트니까 k개만큼 뒤에 추가해주기
//			input[i] = input[idx];
//			idx++;
//		}
//		
//		int[] sushi = new int[d+1]; // 현재 먹은 스시 저장
//		int[] result = new int[N];	// 각 위치에 부터 k개 만큼 먹었을 때 먹을수있는 초밥 종류의 개수 저장
//		int cnt = 0; 				// 현재 먹을수있는 초밥의 종류 개수
//		
//		for (int i = 0; i < N+k; i++) {

//			if(i >= k) {
//				result[i-k] = cnt;		// 먹을 수있는 초밥의 종류 개수 저장
//				if(sushi[c] == 0){		// 쿠폰을 받았을 때 아직 먹지 않은 종류이면 개수 1 증가
//					result[i-k]++;
//				}

//				int prev = input[i-k];	// 제일 처음에 먹은 초밥
//				if(sushi[prev] == 1) {	// 한번만 먹어본 초밥 종류면 cnt--
//					cnt--;
//				}
//				sushi[prev]--; 			// 안먹었다고 체크
//			}
//			

//			int now = input[i]; 		// 현재 먹을 초밥

//			if(sushi[now] == 0) {		// 한번도 안먹어본 초밥 종류면 cnt++
//				cnt++;
//			}

//			sushi[now]++;				// now번째 초밥을 먹었다고 체크
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
//		int N = Integer.parseInt(input[0]); // 접시 수
//		int d = Integer.parseInt(input[1]); // 초밥의 가짓수
//		int k = Integer.parseInt(input[2]); // 연속으로 먹어야 하는 접시 수
//		int c = Integer.parseInt(input[3]); // 한 접시 주는 쿠폰 번호
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
//		count[c] = 1; // 쿠폰으로 주는거는 먹고 시작
//
//		int eat = 1;
//		for (int i = 0; i < k; i++) { // 초기값 세팅
//			if (++count[plates[i]] == 1) { // 0 -> 1 이면 새로 먹은거 // 2 이상은 중복
//				eat++;
//			}
//		}
//
//		int max = eat;

//		for (int i = k; i < size; i++) {
//			if (--count[plates[i - k]] == 0) { // 1 -> 0 이면 안먹은거 됨
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