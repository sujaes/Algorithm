//class Solution {
//  public int solution(String dartResult) {
//      int k = 0 ; 
//      int temp[] = new int[3];
//      int answer = 0;
//      
//      for(int i = 0 ; i < dartResult.length();i++){
//          //���ڰ� ������
//          if( '0' <=dartResult.charAt(i) && dartResult.charAt(i)<= '9' ){
//              //���ڰ� 0�̸�
//              if(dartResult.charAt(i)=='0'){
//                  if(i!=0){ // ù��° �ε����� �ƴϸ�
//                      if(dartResult.charAt(i-1)=='1'){ //���� �ε��� Ȯ���ؼ� 1�̸� 10�� ��
//                          temp[k-1] = 10;
//                          continue; // k���� ���ϰ� �������� �Ѿ����
//                      }
//                  }
//              }//���ڰ� 0�� �ƴϸ� ���ڸ� �ְ� k������Ŵ.
//              temp[k] = Integer.parseInt(dartResult.charAt(i)+"");
//              k++;
//          }else if(dartResult.charAt(i)=='S'){
//              temp[k-1] = (int)Math.pow(temp[k-1],1);
//          }else if(dartResult.charAt(i)=='D'){
//              temp[k-1] = (int)Math.pow(temp[k-1],2);
//          }else if(dartResult.charAt(i)=='T'){
//              temp[k-1] = (int)Math.pow(temp[k-1],3);
//          }else if(dartResult.charAt(i)=='*'){
//              if((k-1)==0){
//                  temp[k-1] = temp[k-1]*2;
//              }else{
//                  temp[k-2] = temp[k-2]*2;
//                  temp[k-1] = temp[k-1]*2;
//              }
//          }else if(dartResult.charAt(i)=='#'){
//              temp[k-1] = temp[k-1]*(-1);
//          }
//          
//          
//      }      
//      for(int i = 0 ; i < temp.length; i++){
//          System.out.println(temp[i]);
//          
//          answer += temp[i];
//      }
//      
//      
//      return answer;
//  }
//}