import java.util.*;
public class Q14891 {
	static int n;
	static int arr[][];
	static int ns[][];
	static boolean visited[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		arr = new int[4][8];
		ns = new int[4][2];
		int answer = 0;
		for(int i = 0 ; i < 4; i++) {
			String s = sc.next();
			for(int j = 0 ; j < 8; j++) {
				arr[i][j] = s.charAt(j)-'0';
			}
		}
		n= sc.nextInt();
		for(int i = 0 ; i < n ; i++) {
			int num = sc.nextInt()-1;
			int dir = sc.nextInt();
			visited = new boolean[4];
			setNS();				//��ϸ� ������ ���� ������ ����س���
			rot(num,dir);
		}
		for(int i =0 ;i<4; i++) {
//			System.out.println(arr[i][0]);
			answer += arr[i][0] * Math.pow(2,i); 
		}
		System.out.println(answer);
	}
	public static void rot(int num,int dir) {
		
		if(num >=0 && num<4&&!visited[num]) {
			visited[num] = true;		//��Ϲ湮
//			System.out.println(num+"�� ��� �湮����.");
			if(dir == 1) {				//�ð������ ���
//				System.out.println(num+"�� ��� �ð�������� ȸ��");
				clock(num);
				if(num ==0) {
					if(ns[num][0] != ns[num+1][1]) {
						rot(num+1,-1);
					}
				}else if(num ==3) {
					if(ns[num][1] != ns[num-1][0]) {
						rot(num-1,-1);
					}
				}else {
					if(ns[num][1]!=ns[num-1][0]) {
						rot(num-1,-1);
					}
					if(ns[num][0]!=ns[num+1][1]) {
						rot(num+1,-1);	
					}
				}
			}else {						//�ݽð������ ���
//				System.out.println(num+"�� ��� �ݽð�������� ȸ��");
				reverse(num);
				if(num ==0) {
					if(ns[num][0]!=ns[num+1][1]) {
						rot(num+1,1);						
					}
				}else if(num ==3) {
					if(ns[num][1]!=ns[num-1][0]) {
						rot(num-1,1);						
					}
				}else {
					if(ns[num][0]!=ns[num+1][1]) {
						rot(num+1,1);
					}
					if(ns[num][1]!=ns[num-1][0]) {
						rot(num-1,1);
					}
				}
			}
		}
	}
	public static void clock(int num) {
		int temp = arr[num][7];
		for(int i = 7 ; i > 0; i--) {
			arr[num][i] = arr[num][i-1];
		}
		arr[num][0] = temp;
	}
	public static void reverse(int num) {
		int temp = arr[num][0];
		for(int i = 0 ; i < 7; i ++) {
			arr[num][i] = arr[num][i+1];
		}
		arr[num][7] = temp;
	}
	public static void setNS() {
		for(int i = 0; i <4; i++) {
			for(int j = 0 ; j < 2; j++) {
				ns[i][j] = arr[i][4*j+2];
			}
		}
	}

}
