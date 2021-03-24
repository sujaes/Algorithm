//import java.util.*;
//class Solution {
//    public String solution(int n, int t, int m, String[] timetable) {
//        
//        String answer = "";
//        List<Integer> list = new ArrayList<Integer>();
//        int firstbus = 9*60;
//        int lastbus = 9*60 + (n-1)*t;
//        int min =0;
//        int bustime = 540-t;  //버스 시간(뒤에서 처리하기 편하게)
//        int crew = 0;
//        
//        for(int i = 0 ; i < timetable.length;i++){
//            StringTokenizer st = new StringTokenizer(timetable[i],":");
//            //timetable의 시간을 분으로 바꾸어서 list에 저장
//            min = Integer.parseInt(st.nextToken())*60 + Integer.parseInt(st.nextToken());
//            //막차시간 보다 늦으면 버스못탐.
//            if(min <= lastbus){
//                list.add(min);
//            }
//        }
//        //리스트 정렬
//        Collections.sort(list);
//        
//        for(int i = 0 ; i < n-1; i++){  //막차 전까지 운행하는 버스
//            if(list.size()==0){
//                break;
//            }
//            bustime = bustime + t;  //버스 시간
//            for(int j =0 ; j < m; j++){
//                if(list.get(0) <= bustime){
//                    list.remove(0);
//                    crew++;
//                }
//                if(crew == m || list.size() == 0){
//                    break;
//                }
//            }
//        }
//        
//        if(list.size() >= m){ //막차인데 자리없는경우
//            answer = getTime(list.get(m-1) -1);
//        }else{                  //막차인데 비어있는 경우 
//            answer = getTime(lastbus);
//        }
//        
//        
//        return answer;
//    }
//    
//    public String getTime(int a){
//      int hour = a / 60;
//      int min = a % 60;
//      String shour = "";
//      String smin = "";
//      if(hour<10){
//          shour = "0" + hour;
//      }else{
//          shour = ""+hour;
//      }
//      if(min<10){
//          smin = "0" + min;
//      }else{
//          smin = ""+min;
//      }
//      
//      return shour+":"+smin;
//  }
//    
//}