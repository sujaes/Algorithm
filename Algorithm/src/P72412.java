//import java.util.*;
//class Solution {
//    public int[] solution(String[] info, String[] query) {
//        int[] answer = new int[query.length];
//        int count = 0;
//        boolean flag = false;
//        String table[][] = new String[info.length][5];
//        String pass[][] = new String[query.length][5];
//        //����������
//        for(int i = 0 ; i < info.length;i++){
//            table[i] = info[i].split(" ");
//        }
//        
//        //�հݱ�������
//        for(int i = 0 ; i < query.length;i++){
//            query[i] = query[i].replaceAll(" and","");            
//            pass[i] = query[i].split(" ");
//        }
//        
//        //�հݱ���
//        for(int i = 0 ; i < query.length ;i++){
//            count = 0;
//            //�����������
//            for(int j = 0 ; j < info.length; j++){
//                flag = false;
//                //4���� ���
//                for(int k = 0 ; k< 4; k++){
//                    if(pass[i][k].equals("-")){
//                        // System.out.println(j+"��° �����ڰ� "+ i+"���� "+k+"�׸� �����н�����.");
//                        continue;
//                    }
//                    if(pass[i][k].equals(table[j][k])){
//                        continue;
//                    }else{
//                        flag = true;
//                        break;
//                    }   
//                }
//                //����
//                if(Integer.parseInt(pass[i][4]) <= Integer.parseInt(table[j][4])){
//                    // System.out.println("���� ���!!");
//                }else{
//                    flag = true;
//                }
//                
//                if(!flag){
//                    count++;
//                }
//            }
//            answer[i] = count;
//        }
//        
//        
//        
//        return answer;
//    }
//}