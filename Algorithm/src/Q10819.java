import java.util.Scanner;
 
public class Q10819 {
    
    static int max=0;
    static int count;
    static int N; //크기
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N =  sc.nextInt();
        
        int[] val = new int[N];
        
        for(int i=0; i<N; ++i){
        	val[i] = sc.nextInt();
        }
                
        f(val, 0);
        System.out.println(max);
    
    }
    //순열 알고리즘(팩토리얼)
    public static void f(int[] arr, int d){
        
        if(d == N){
            return;
        }
        
        for(int i=d; i<N; ++i){
            swap(arr, d, i);
            f(arr, d+1);
            findMax(arr);
            swap(arr, d, i); //제자리 정렬이므로 원상 복구
        }
    }
    
    //스왑
    public static void swap(int[] arr, int d, int i){
        int temp = arr[i];
        arr[i] = arr[d];
        arr[d] = temp;
    }
  //최댓값 찾기
    public static void findMax(int[] arr){
        
        int temp=0; 
        int sum=0;
        
        for(int i=0; i<N-1; ++i){
            temp=arr[i]-arr[i+1];
            if(temp < 0){
                temp*=-1;
            }
            sum+=temp;
        }
        
        if(sum > max){
            max = sum; 
        }
    }
}