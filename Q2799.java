package git;
import java.util.Scanner;
public class Q2799 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      int a= sc.nextInt();
      int b = sc.nextInt();
      int res[] = new int[5];
      int count = 0,loop =0;
      int k  =0,l=0;
      String st[] = new String[5*a+1];
      char temp[][] = new char[4*a][b];
      for(int i = 0 ; i <5*a +1 ;i++){
         st[i] = sc.next();
      }
      for(int i = 0 ; i <5*a+1 ;i++){
         if(i%5!=0){
            
            for(int j = 0 ; j < 5*b+1 ;j++){
               if(j%5==1){
                  temp[k][l]=st[i].charAt(j);
                  l++;
               }
            }
            l=0;
            k++;
         }
      }

      for(int j = 0 ; j <b; j++){
    	  for(int i = 0 ; i<4*a;i++){
    		  if(temp[i][j]=='*'){
    			  count++;
    		  }
    		  loop++;
    		  if(loop==4){
    			  res[count]++;
    			  count=0;
    			  loop=0;
    		  }
          }
       }
      
      
      for(int i = 0 ;i<5; i++){
    	  System.out.print(res[i]+" ");
      }
   }
}
