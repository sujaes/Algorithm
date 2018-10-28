package git;

//11576번 문제 틀렷다는데 모르겟음.. 
import java.util.*;
public class Q11576{
  public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int num = sc.nextInt();
      int pow=1;
      int sum=0;
      int rest;
      int size;
      int arr[]= new int[num];
      Stack<Integer> stack = new Stack<Integer>();
      for(int i = 0 ; i <num;i++){
      	arr[i]= sc.nextInt();
      }
      for(int i=num-1;i>=0;i--){
      	sum+=arr[i]*pow;
      	pow*=a;
      }
      do{
      	rest = sum%b;
      	sum = sum/b;
      	stack.push(rest);
      }
      while(sum>b);
      stack.push(sum);
      size = stack.size();
      for(int i=0;i<size;i++){
        	System.out.print(stack.pop()+" ");
      }
  }
}
