package git;

import java.util.*;
public class Q1773 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      int a= sc.nextInt();
      int b= sc.nextInt();
      int c,temp=0,count= 0;
      int ar[] =new int[a];
      int arr[] = new int[b];
      for(int i = 0;i<a;i++){
         ar[i]=sc.nextInt();
      }
      for(int i= 0; i<a;i++){
         temp = ar[i];
         while(temp<=b){
            arr[temp-1] = 1;
            temp = temp+ar[i];
         }
      }
      for(int i = 0 ; i <b; i++){
         if(arr[i]==1){
            count++;
         }
      }
      System.out.println(count);
   }

}
