package programmers;

import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        HashMap<String , String> map = new HashMap<String,String>();
        ArrayList<String> list =new ArrayList<String>();
        ArrayList<String> list1 =new ArrayList<String>();
        String answer[];
        int len  = record.length;
        for(int i =0 ;  i < len ; i++){
            StringTokenizer st = new StringTokenizer(record[i]," ");
            while(st.hasMoreTokens()) {
                String temp = st.nextToken();
                if(temp.equals("Enter")){
                    String uid = st.nextToken();
                    String name = st.nextToken();
                    String status = "���Խ��ϴ�.";
                    map.put(uid,name);
                    list1.add(status);
                    list.add(uid);
                }else if(temp.equals("Leave")){
                    String uid = st.nextToken();
                    String status = "�������ϴ�.";
                    list1.add(status);
                    list.add(uid);
                }else if(temp.equals("Change")){
                    String uid = st.nextToken();
                    String name = st.nextToken();
                    map.put(uid,name);
                }
            }
        }
        answer = new String[list.size()];
        for(int j = 0 ; j < list.size();j++){
            String name = map.get(list.get(j));
            String status = list1.get(j);
            answer[j] = (name+"���� "+status);
        }
        return answer;
    }
}