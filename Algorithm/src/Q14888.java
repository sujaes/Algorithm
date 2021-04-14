//import java.util.Scanner;
//
//class Q14888 {
//    static int number[] = new int[11];
//    static int oper[] = new int[4];
//    static int max =Integer.MIN_VALUE;
//    static int min = Integer.MAX_VALUE;
//    static int n;
//    public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       n = sc.nextInt();
//       for(int i = 0 ; i < n; i++) {
//    	   number[i] = sc.nextInt();
//       }
//       for(int i = 0; i < 4 ;i++) {
//    	   oper[i] = sc.nextInt();
//       }
//       
//       dfs(number[0] , 0);
//       System.out.println(max);
//       System.out.println(min);
//    
//    }
//    public static void dfs(int result,int count) {
//    	if(count == n - 1) {
//    		if(min > result) {
//    			min  = result;
//    		}
//    		if(max <result) {
//    			max = result;
//    		}
//    		return;
//    	}
//    	for(int i = 0 ; i <4; i++) {
//    		if(oper[i] != 0) {
//    			oper[i]--;
//    			if(i ==0) {
//    				dfs(result + number[count+1],count +1 );
//    			}else if(i==1) {
//    				dfs(result - number[count+1],count +1 );
//    			}else if(i==2) {
//    				dfs(result * number[count+1],count +1 );
//    			}else if(i==3) {
//    				dfs(result / number[count+1],count +1 );
//    			}
//    			
//    			oper[i]++;
//    		}
//    	}
//    }
//}




import java.util.Scanner;

class Q14888 {
    static int max =Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;
    static int arr[],oper[];
    static int n;
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       n = sc.nextInt();
       arr = new int[n];
       oper = new int[4];
       for(int i=0 ; i < n ; i++) {
    	   arr[i] = sc.nextInt();					//����� �� �迭
       }
       for(int i = 0 ; i < 4; i++) {
    	   oper[i] = sc.nextInt();					// ������ +,-,*,/ ���ʷ� ����
       }
       backtracking(arr[0],0);						//ù ������ backtracking
       System.out.println(max);
       System.out.println(min);
    }
    public static void backtracking(int res,int count) {
    	if(count == n-1) {							//������ ������ n-1�� �̸� �׸�
    		if(min > res) {
    			min = res;
    		}
    		if(max<res) {
    			max = res;
    		}
    		return;
    	}
    	
    	for(int i = 0 ; i < 4; i++) {
     	   if(oper[i] != 0) {
     		   oper[i]--;							//������ ���
     		   if(i==0) {		// +
     			   backtracking(res + arr[count+1],count+1);	//���, ���� ������
     		   }else if(i==1) {	// -
     			   backtracking(res - arr[count+1],count+1);
     		   }else if(i==2) {	// *
     			   backtracking(res * arr[count+1],count+1);
     		   }else if(i==3) {	// /
     			   backtracking(res / arr[count+1],count+1);
     		   }
     		  oper[i]++;							//������ �����Ҷ��� �����ֱ�
     	   }
        }
    }
    
}