import java.util.*;
class Solution{
  public String solution(String m, String[] musicinfos) {
      
      int len[] = new int[musicinfos.length];
      String title[] = new String[musicinfos.length];
      String sheet[] = new String[musicinfos.length];
      String start;
      String end;
      String answer = "(None)";
      String temp = "";
      int check1=0,check2=0;
      //자료형 저장
      for(int i =0; i < musicinfos.length;i++){
          StringTokenizer st = new StringTokenizer(musicinfos[i],",");
          start =  st.nextToken(); 
          end = st.nextToken();
          StringTokenizer timeStart = new StringTokenizer(start,":");
          StringTokenizer timeEnd = new StringTokenizer(end,":");
          len[i] = (Integer.parseInt(timeEnd.nextToken()) - Integer.parseInt(timeStart.nextToken()))*60 + ( Integer.parseInt(timeEnd.nextToken()) - Integer.parseInt(timeStart.nextToken()));
          title[i] = st.nextToken();
          sheet[i] = st.nextToken();     
      }
      
      //멜로디 변경(#있는 멜로디 변경)
      
      for( int j = 0 ; j < m.length();j++){
          if(m.charAt(j)=='#'){
              if(j==1){ 
                  m = m.substring(0,1).toLowerCase() + m.substring(1,m.length());
              }else if(j == m.length()-1){
                  m = m.substring(0,j-1) + (m.charAt(j-1)+"").toLowerCase() + m.substring(j,m.length());
              }else{
                  m = m.substring(0,j-1)+(m.charAt(j-1)+"").toLowerCase()+m.substring(j,m.length());
              }
          }
      }
      //#삭제
      m = m.replace("#","");      
      
      
      
      for(int i = 0 ; i < musicinfos.length; i++){
          for(int j = 0 ; j < sheet[i].length();j++){
              if(sheet[i].charAt(j)=='#'){
                  if(j==1){ // 첫음부터 #이면
                      sheet[i] = sheet[i].substring(0,1).toLowerCase() + sheet[i].substring(1,sheet[i].length());
                  }else if(j == sheet[i].length()-1){ //마지막음이 #이면
                      sheet[i]= sheet[i].substring(0,j-1) + (sheet[i].charAt(j-1)+"").toLowerCase() + sheet[i].substring(j,sheet[i].length());
                  }else{//나머지음이 #이면
                      sheet[i]= sheet[i].substring(0,j-1)+(sheet[i].charAt(j-1)+"").toLowerCase()+sheet[i].substring(j,sheet[i].length());
                  }
              }
          }
          //#삭제
          sheet[i] = sheet[i].replace("#",""); 
      }
      
      
      //자료형 처리
      for(int i =0; i < musicinfos.length;i++){
          if(sheet[i].length() > len[i]){  //멜로디가 재생시간보다 길면
              sheet[i] = sheet[i].substring(0,len[i]);
          }else if(sheet[i].length() <len[i]){ //재생시간이 멜로디보다 길면
              temp = sheet[i];
              for(int j= 1 ; j < len[i]/sheet[i].length();j++){
                  temp = temp + sheet[i];  //되도록 concat사용
              }//되도록 concat사용
              sheet[i] = temp;
              sheet[i] = sheet[i] + sheet[i].substring(0, len[i]%sheet[i].length());
          }
          System.out.println(sheet[i]);
      }
      
      
      
      //확인
      for(int i = 0 ; i < musicinfos.length;i++){
          // System.out.println(sheet[i]);
          if(sheet[i].contains(m)){
              if(answer.equals("(none)")){
                  answer = title[i];
                  check1 = len[i];
                  check2 = i;
              }else{
                  if(len[i]>check1){
                      check1 = len[i];
                      answer = title[i];
                  }else if(len[i]==check1){
                      if(i < check2){
                          check1 = len[i];
                          answer  = title[i];
                          check2 = i;
                      }
                  }
              }
              
              
          }
      }
      return answer;
  }
}