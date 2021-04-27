//
//import java.util.Scanner;
//import java.util.Stack;
//class Q11725{
//	public static void main(String args[]){
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int root[] = new int[a+1];
//		root[1] = 1;
//		Stack<int[]> stack1 = new Stack<int[]>();
//		Stack<int[]> stack2 = new Stack<int[]>();
//		
//		for( int i =  0 ; i <a-1; i++){
//			int num1 = sc.nextInt();
//			int num2 = sc.nextInt();
//			if(root[num1]==0&&root[num2]==0){
//				int[] arr = {num1,num2};
//				stack1.push(arr);
//			}else if(root[num1]!=0){
//				root[num2] = num1;
//			}else if(root[num2]!=0){
//				root[num1] = num2;
//			}
//		}
//		while(!stack1.isEmpty()||!stack2.isEmpty()){
//			while(!stack1.isEmpty()){
//				int[] arr = stack1.pop();
//				int num1 = arr[0];
//				int num2 = arr[1];
//				if(root[num1]==0&&root[num2]==0){
//					arr[0] = num1;
//					arr[1] = num2;
//					stack2.push(arr);
//				}else if(root[num1]!=0){
//					root[num2]= num1;
//				}else{
//					root[num1] = num2;
//				}
//			}
//			while(!stack2.isEmpty()){
//				int[] arr = stack2.pop();
//				int num1 = arr[0];
//				int num2 = arr[1];
//				if(root[num1]==0&&root[num2]==0){
//					arr[0] = num1;
//					arr[1] = num2;
//					stack1.push(arr);
//				}else if(root[num1]!=0){
//					root[num2]= num1;
//				}else{
//					root[num1] = num2;
//				}
//			}
//		}
//		for(int i =2;i<=a;i++){
//			System.out.println(root[i]);
//		}
//	}
//}



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q11725 {
    static int n ;
    static ArrayList<Integer>[] list;
    static int[] parents;
    static boolean[] check;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        list = new ArrayList[n+1];
        parents = new int[n+1];
        check = new boolean[n+1];

        for (int i = 1; i <= n; i++) {
            list[i] = new ArrayList<Integer>();
        }
        for (int j = 1; j <n ; j++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            list[a].add(b);
            list[b].add(a);
        }

        for (int k = 1; k <=n ; k++) {
            if(!check[k]){
                dfs(k);					//1부터시작
            }
        }
        for (int i = 2; i <=n ; i++) {
            System.out.println(parents[i]);
        }

    }

    private static void dfs(int v){
        if(check[v]){
            return;
        }
        check[v] =true;
        for (int vv: list[v]) {						//연결된 애들
            if(!check[vv]){							//연결된애들 
                parents[vv] = v;					//이전노드가 부모노드
                dfs(vv);							//다음노드 탐색
            }

        }

    }

}