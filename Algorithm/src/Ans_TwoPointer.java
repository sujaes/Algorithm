//import java.util.Arrays;
//import java.util.Scanner;
/*
 * Date 2021.04.09
 * author �����
 * �������� �˰��� �ڵ�����
 * Ư�� ���� �� (�糡�� ����)
 */
//public class Ans_TwoPointer {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int arr[] = new int[n];
//		int count = 0;
//		for(int i = 0 ; i < n; i++) {
//			arr[i] = sc.nextInt();
//		}
//		int x = sc.nextInt();
//		Arrays.sort(arr);				//������������
//		int s = 0;						//�糡 ��
//		int e = n-1;					//�糡 ��
//		
//		while(s <=e) {
//			if(arr[s] + arr[e] == x) {	//������ �߰�
//				count++;
//				s++;					//s����
//			}else if(arr[s] + arr[e] > x ) { //ũ�� e�� ����
//				e--;
//			}else if(arr[s] + arr[e] < x) {	//������ s�� ����
//				s++;
//			}
//		}
//		
//		System.out.println(count);
//	}
//}


//import java.util.Scanner;
//
/*
 * Date 2021.04.09
 * author �����
 * �������� �˰��� �ڵ�����
 * ���� �� (0,0 ����)
 */
//public class Q1806 {
//    private static int[] arr;
//    private static int n;
//    private static long s;
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        s = sc.nextLong();
//        arr = new int[n];
//        for (int i = 0; i <n ; i++) {
//            arr[i] = sc.nextInt();
//        }
// 
//        int ans = 100001, sum = 0;
//        int left = 0, right =0;
//        //  left, right �����ͷ� ���� s�̻� �϶� right-left�� ���� �������� ã�´�.
//        while(true){
//            if(sum >= s){// s�� ã�ƾ��ϴµ� ���ݱ��� �����ؼ� ���� �κ����� �� ũ�ٸ� leftpointer�� �Ű��ְ�, �Ű����Ƿ� sum���� ���ش�.
//                sum -= arr[left];
//                ans = Math.min(ans, (right- left));
//                left++;
//            } else if(right == n) {
//                break;
//            }else{
//                sum += arr[right];
//                right++;
//            }
//        }
// 
//        if(ans == 100001){ // ó���� �ʱ�ȭ�� ���� �״�ζ�� �̾߱�� ���ǿ� �����ϴ°� ���ٴ� ��, �׷��Ƿ� 0���
//            System.out.println(0);
//        }else {
//            System.out.println(ans);
//        }
//    }
//}
