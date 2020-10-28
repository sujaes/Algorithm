//class Solution {
//  public int solution(String dartResult) {
//      int k = 0 ; 
//      int temp[] = new int[3];
//      int answer = 0;
//      
//      for(int i = 0 ; i < dartResult.length();i++){
//          //숫자가 나오면
//          if( '0' <=dartResult.charAt(i) && dartResult.charAt(i)<= '9' ){
//              //숫자가 0이면
//              if(dartResult.charAt(i)=='0'){
//                  if(i!=0){ // 첫번째 인덱스가 아니면
//                      if(dartResult.charAt(i-1)=='1'){ //이전 인덱스 확인해서 1이면 10이 됨
//                          temp[k-1] = 10;
//                          continue; // k증가 안하고 다음껄로 넘어가도록
//                      }
//                  }
//              }//숫자가 0이 아니면 숫자를 넣고 k증가시킴.
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