//import java.util.*;
//class Solution {
//    public int[] solution(String[] info, String[] query) {
//        int[] answer = new int[query.length];
//        int count = 0;
//        boolean flag = false;
//        String table[][] = new String[info.length][5];
//        String pass[][] = new String[query.length][5];
//        //지원자정보
//        for(int i = 0 ; i < info.length;i++){
//            table[i] = info[i].split(" ");
//        }
//        
//        //합격기준정보
//        for(int i = 0 ; i < query.length;i++){
//            query[i] = query[i].replaceAll(" and","");            
//            pass[i] = query[i].split(" ");
//        }
//        
//        //합격기준
//        for(int i = 0 ; i < query.length ;i++){
//            count = 0;
//            //사람정보기준
//            for(int j = 0 ; j < info.length; j++){
//                flag = false;
//                //4가지 목록
//                for(int k = 0 ; k< 4; k++){
//                    if(pass[i][k].equals("-")){
//                        // System.out.println(j+"번째 지원자가 "+ i+"직무 "+k+"항목 프리패스했음.");
//                        continue;
//                    }
//                    if(pass[i][k].equals(table[j][k])){
//                        continue;
//                    }else{
//                        flag = true;
//                        break;
//                    }   
//                }
//                //점수
//                if(Integer.parseInt(pass[i][4]) <= Integer.parseInt(table[j][4])){
//                    // System.out.println("점수 통과!!");
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