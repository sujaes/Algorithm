package git;

//1212�� ���� ���̶����� String ���� �޾ƾ��ҵ� ��Ÿ�ӿ���
//import java.util.*;
//public class Main {
//public static void main(String args[]){
//    Scanner sc = new Scanner(System.in);        
//    int num = sc.nextInt();
//    String res="";
//    String ind="";
//    Stack<Integer> stack = new Stack<Integer>();
//    int len=1;
//    int one;
//    int check;
//    while(num/10!=0){
//  	  stack.push(num%10);
//  	  num/=10;
//  	  len++;
//    }if(num/10==0){
//  	  stack.push(num%10);
//    }
//    for(int i = 0 ; i<len;i++){
//  	  one =stack.pop();
//  	  ind="";
//  	  if(4<=one&&one<8){
//  		  ind = ind+Integer.toString(one/2/2%2)+Integer.toString(one/2%2)+Integer.toString(one%2);
//  	  }
//  	  if(2<=one&&one<4){
//  		  ind="0";
//  		  ind = ind+Integer.toString(one/2%2)+Integer.toString(one%2);
//  	  }
//  	  if(0<=one&&one<2){
//  		  ind="00";
//  		  ind=ind+Integer.toString(one);
//  	  }
//  	  res= res+ind;
//    }
//    System.out.print(res);
//}
//}

//1212�� �ð��ʰ�
//import java.util.*;
//public class Main {
//public static void main(String args[]){
//    Scanner sc = new Scanner(System.in);        
//    String num = sc.next();
//    String res="";
//    String ind="";
//    Stack<Character> stack = new Stack<Character>();
//    int one;
//    int check;
//    for(int i = num.length()-1 ; i>=0;i--){
//  	  stack.push(num.charAt(i));    	        
//    }
//    for(int i = 0 ; i<num.length();i++){
//  	  one =stack.pop()-'0';
//  	  ind="";
//  	  if(4<=one&&one<8){
//  		  ind = ind+Integer.toString(one/2/2%2)+Integer.toString(one/2%2)+Integer.toString(one%2);
//  	  }
//  	  if(2<=one&&one<4){
//  		  ind="0";
//  		  ind = ind+Integer.toString(one/2%2)+Integer.toString(one%2);
//  	  }
//  	  if(0<=one&&one<2){
//  		  ind="00";
//  		  ind=ind+Integer.toString(one);
//  	  }
//  	  res= res+ind;
//    }
//    System.out.print(res);
//}
//}

//1212�� ���� ��
import java.util.Scanner;
public class Q1212 {
  public static void convert8_2(StringBuilder OCT) {

      StringBuilder result = new StringBuilder();
      result.setLength(0); // �ʱ�ȭ
      for (int i = 0; i < OCT.length(); i++) {
          int temp = (int) (OCT.charAt(i) - '0');
          StringBuilder BIN = new StringBuilder();
          while (temp > 0) {
              BIN.insert(0, temp % 2);
              temp = temp / 2;
          }
          if (i != 0) {
              if (BIN.length() % 3 == 1) {
                  BIN.insert(0, "00");
              } else if (BIN.length() % 3 == 2) {
                  BIN.insert(0, "0");
              }
              if (BIN.length() == 0) {
                  BIN.insert(0, "000");
              }
          } 
          result.append(BIN);
      }
      System.out.println(result);
  }
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      StringBuilder N = new StringBuilder(sc.nextLine());// 8����
      convert8_2(N);
  }
}
