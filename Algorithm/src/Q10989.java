
//10989번 문제 시간초과
//import java.util.*;
//public class Main {
//  public static void main(String[] args){
//  	Scanner sc  =new Scanner(System.in);
//  	long n = sc.nextLong();
//  	int a[] = new int[(int) n];
//  	for(int i  = 0 ; i <n;i++){
//  		a[i] = sc.nextInt();
//  	}
//  	Arrays.sort(a);   	
//  	for(int i = 0 ; i <n;i++){
//  		System.out.println(a[i]);
//  	}
//	}	
//}

//10989번 문제 
import java.util.*;
public class Q10989{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n=Integer.parseInt(sc.nextLine());
      int tmp[]=new int[n];
      for(int i=0;i<n;i++){
          tmp[i]=sc.nextInt();
      }
      Arrays.sort(tmp);
      StringBuffer sb=new StringBuffer();
      for(int i=0;i<tmp.length;i++){
          sb.append(tmp[i]+"\n");
      }
      System.out.println(sb);
  }    
}
