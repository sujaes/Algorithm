//import java.util.*;
//class Solution {
//    public String solution(int n, int t, int m, String[] timetable) {
//        
//        String answer = "";
//        List<Integer> list = new ArrayList<Integer>();
//        int firstbus = 9*60;
//        int lastbus = 9*60 + (n-1)*t;
//        int min =0;
//        int bustime = 540-t;  //���� �ð�(�ڿ��� ó���ϱ� ���ϰ�)
//        int crew = 0;
//        
//        for(int i = 0 ; i < timetable.length;i++){
//            StringTokenizer st = new StringTokenizer(timetable[i],":");
//            //timetable�� �ð��� ������ �ٲپ list�� ����
//            min = Integer.parseInt(st.nextToken())*60 + Integer.parseInt(st.nextToken());
//            //�����ð� ���� ������ ������Ž.
//            if(min <= lastbus){
//                list.add(min);
//            }
//        }
//        //����Ʈ ����
//        Collections.sort(list);
//        
//        for(int i = 0 ; i < n-1; i++){  //���� ������ �����ϴ� ����
//            if(list.size()==0){
//                break;
//            }
//            bustime = bustime + t;  //���� �ð�
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
//        if(list.size() >= m){ //�����ε� �ڸ����°��
//            answer = getTime(list.get(m-1) -1);
//        }else{                  //�����ε� ����ִ� ��� 
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