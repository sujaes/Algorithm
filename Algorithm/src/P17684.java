//import java.util.*;
//class Solution {
//    static Map<String,Integer> map;
//    static ArrayList<Integer> list;
//    public int[] solution(String msg) {
//        int index=0;
//        int count = 27;
//        String temp = "";
//        String beforetemp = "";
//        list =  new ArrayList<Integer>();
//        map = new HashMap<String,Integer>();
//        for(int i = 1 ; i <= 26; i++){
//            map.put(String.valueOf((char)('A'+(i-1))),i);
//        }        
//        
//        while(index < msg.length()){
//            beforetemp = temp;
//            temp += msg.charAt(index)+"";
// 
//            if(map.containsKey(temp)){                      //map�� �ִ� ���ڸ� index ���������ֱ�
//                index++;
//            }else{                                          
//                map.put(temp,count);                        //map�� ���� ���ڸ� map�� �߰��ϱ�
//                list.add(map.get(beforetemp));              //map�� ���� ���� �־��ֱ�
//                count++;
//                temp = "";
//                beforetemp = "";
//            }            
//            if(index == msg.length()){                      //������ �����̸� ���������� �߰����ֱ�
//                list.add(map.get(temp));
//            }
//        }
//
//        int[] answer = new int[list.size()];
//        for(int i = 0 ; i < list.size();i++){
//            answer[i] = list.get(i);
//        }
//        return answer;
//    }
//}