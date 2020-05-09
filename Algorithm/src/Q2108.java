import java.util.*;



public class Q2108 {
	static int avg(int[] arr) { //산술평균 메소드
		double result =0; // 계산 후 반올림을 위해 double형
		double sum=0;
		for(int x : arr) { // 모두 더한다.
			sum+=x;
		}
		result = Math.round(sum / arr.length); // 반올림 후 저장
		
		return (int)Math.ceil(result); // int형으로 타입 캐스트
	}
	
	static int middle(int[] arr) { // 중앙값을 구하는 메소드
		
		return arr[(arr.length/2)]; // 그냥 2로 나눠주면 된다.
	}
	
	static int manny(int[] arr) { // 최빈값을 구하는 메소드
		int cnt[] = new int [8001]; // 절대값 4000까지의 정수를 저장해야하므로 총 8000개를 만들었는데, 런타임 에러가 나서 +1 해줬다.
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		int max = Integer.MIN_VALUE; // 최빈값을 찾기위한 비교변수
		for(int x:arr) {
			
			if(x<0) { // 음수의 경우 4000을 더해서 해당 인덱스를 증가
				cnt[Math.abs(x)+4000]++;
			}else cnt[x]++; // 나머지는 인덱스만 증가
           
		}
		
	
		int idx =0;
		for(int i=0;i<cnt.length;i++) {
			if(cnt[i]!=0 && cnt[i]>max) {	//카운트 배열에서 최빈값을 찾는다.			
				max = cnt[i];
				idx = i;				
			}
		}

		for(int i=0;i<cnt.length;i++) {
			int x=i;
			if(cnt[i]==max) { // 카운트 배열의 값들과 최빈값과 일치하면,
				if(i>4000) { // 4000이상은 음수를 바꿔준것이므로 다시 원래의 숫자로 바꿔준다
					x-=4000;
					x*=-1;
					arrayList.add(x); // 어레이 리스트에 추가
				}else
					arrayList.add(i); // 나머지는 그냥 i값을 추가
			}
		}
		Collections.sort(arrayList); // 추가 된 최빈값들이 다수 존재하면 오름차순 정렬
		
		if(arrayList.size()>1) return arrayList.get(1); // 최빈값이 여러개 존재한다면, 가장 작은 숫자에서 두 번째 숫자를 반환
		else return 	arrayList.get(0); // 그외에는 그냥 최빈값을 반환
	}
	
	static int range(int[] arr) { // 범위 메소드
		return arr[arr.length-1] - arr[0]; // 정렬 후 마지막 숫자와 첫 번째 숫자를 빼준다.
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int n= sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr); // 입력받은 정수를 오름차순 정렬
		
		//각 메소드 호출 부
		System.out.println(avg(arr));
		System.out.println(middle(arr));
		System.out.println(manny(arr));
		System.out.println(range(arr));
//		
		
	}
	
}