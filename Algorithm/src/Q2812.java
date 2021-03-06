//import java.util.*;
//public class Q2812 {
//	static int n,k;
//	static String m;
//	static ArrayList<Integer> list = new ArrayList<Integer>();
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		n = sc.nextInt();
//		k = sc.nextInt();
//		m = sc.next();
//		int arr[] = new int[n-k];
//		comb(n,n-k,arr,0,0);
//
//		
//		Collections.sort(list);
//		System.out.println(list.get(list.size()-1));
//		
//	}
//	public static void comb(int n ,int r, int[] arr,int target, int index) {
//		if(r == 0) {
//			String temp = "";
//			for(int i = 0 ; i < arr.length;i++) {
//				temp += arr[i];
//			}
//			list.add(Integer.parseInt(temp));
//			return;
//		}
//		if(target == n) {
//			return;
//		}
//		arr[index] = Integer.parseInt(m.charAt(target)+"");
//		comb(n,r-1,arr,target+1,index+1);
//		comb(n,r,arr,target+1,index);
//		
//	}
//	
//
//}


//import java.util.Scanner;
//
//public class Q2812{
//	public static void main(String[] args){
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();	//숫자자리수
//	    int k = sc.nextInt();	//뺄수
//	    int t = 0;				
//	    char c;
//	    char s[] = new char[n];
//		String str = sc.next();	//들어온수
//		while(n-- > 0){
//			do{
//				c = str.charAt(str.length()-n-1);
//			} while (c < 48 || 57 < c);
//			while (k > 0 && t > 0 && s[t - 1] < c) {
//				t--;
//				k--;
//			}
//			s[t++] = c;
//		}
//		t-=k;
//		for(k=0;k<t;k++) {
//			System.out.print(s[k]);
//		}
//	}
//}


import java.util.*;
public class Q2812 {
    static int n,k;
    static String number;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
    	n = sc.nextInt();      
        k = sc.nextInt();      
        number = sc.next();
        Stack<Character> stack = new Stack<Character>();
        stack.push(number.charAt(0));
        int cnt = 0;
        boolean flag = true;							//숫자 빼는지 확인하는 플래그
        for (int i = 1; i < number.length(); i++) {
            char c = number.charAt(i);
            
            while (!stack.isEmpty() && flag) {
                if (cnt == k) {							//숫자를 다빼면
                    flag = false;
                    break;
                }
                if (stack.peek() < c) {               	// 스택에 들어있는 값보다 c가 큰 경우 기존값 제거
                    stack.pop();
                    cnt += 1;
                }else if (stack.peek() >= c) {			//작은경우 빠져나오기
                    break;
                }   
            }
            stack.push(c);    
        }
        StringBuilder sb = new StringBuilder();
        // 반복문을 돌았지만 제거해야될 숫자 갯수를 충족하지 못할 경우
        if (cnt < k) {
            // 스택 사이즈에 남은 수를 뺸만큼만 추가
            int gap = k - cnt;
            for (int i = 0; i < stack.size() - gap; i++) {
                sb.append(stack.get(i));
            }
        } else {
            for (int i = 0; i < stack.size(); i++) {
                sb.append(stack.get(i));
            }
        }
        System.out.println(sb.toString());
    } 
}
