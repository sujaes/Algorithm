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


//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.HashMap;
//
//
//class Solution {
//    public ArrayList<Integer> solution(String[] info, String[] query) {
//
//        HashMap<String,Integer> map = new HashMap();
//
//        map.put("cpp", 0);
//        map.put("java", 1);
//        map.put("python", 2);
//        map.put("backend", 0);
//        map.put("frontend", 1);
//        map.put("junior", 0);
//        map.put("senior", 1);
//        map.put("chicken", 0);
//        map.put("pizza", 1);
//
//        ArrayList<Integer> list [][][][] = new ArrayList[3][2][2][2];
//
//        for(int a = 0 ; a<3 ; a++) {
//            for(int b = 0 ; b<2 ; b++) {
//                for(int c = 0 ; c<2 ; c++) {
//                    for(int d = 0 ; d<2 ; d++) {
//                        list[a][b][c][d] = new ArrayList();
//                    }
//                }   
//            }
//        }
//
//        for(int i = 0 ; i<info.length ; i++) {
//            String temp[] = info[i].split(" ");
//            list[map.get(temp[0])][map.get(temp[1])][map.get(temp[2])][map.get(temp[3])].add(Integer.parseInt(temp[4]));
//        }
//
//
//        int score[][][][][] = new int[3][2][2][2][100001];
//        for(int a = 0 ; a<3 ; a++) {
//            for(int b = 0 ; b<2 ; b++) {
//                for(int c = 0 ; c<2 ; c++) {
//                    for(int d = 0 ; d<2 ; d++) {
//                        Collections.sort(list[a][b][c][d]);
//                        Arrays.fill(score[a][b][c][d], list[a][b][c][d].size());
//
//                        if(list[a][b][c][d].size() == 1) {
//                            for(int e = list[a][b][c][d].get(0)+1 ; e < 100001 ; e++ ) {
//                                score[a][b][c][d][e]=0;
//                            }
//
//                        }else {
//                            for(int e = 0 ; e < list[a][b][c][d].size() ; e++) {
//                                if(list[a][b][c][d].get(e)+1 <= 100000)
//                                    score[a][b][c][d][list[a][b][c][d].get(e)+1]--;
//                            }
//
//                            int t = list[a][b][c][d].size();
//                            int t1 = 0;
//                            for(int e = 1; e < 100001; e++) {
//                                if(score[a][b][c][d][e] != t) {
//
//                                    t1 = t1+(t-score[a][b][c][d][e]);
//                                    score[a][b][c][d][e]= t;
//                                }
//                                score[a][b][c][d][e] -= t1;
//                            }
//
//                        }
//
//                    }
//                }   
//            }
//        }
//
//
//        ArrayList<Integer> answer = new ArrayList();
//        for(int i = 0 ; i< query.length ; i++) {
//            String temp = query[i];
//            temp = temp.replace(" and", "");
//            String temp1[] = temp.split(" ");
//
//            ArrayList<Integer> t1 = new ArrayList();
//            ArrayList<Integer> t2 = new ArrayList();
//            ArrayList<Integer> t3 = new ArrayList();
//            ArrayList<Integer> t4 = new ArrayList();
//
//            if(temp1[0].equals("-")) {
//                t1.add(0);
//                t1.add(1);
//                t1.add(2);
//            }else {
//                t1.add(map.get(temp1[0]));
//            }
//
//            if(temp1[1].equals("-")) {
//                t2.add(0);
//                t2.add(1);
//            }else {
//                t2.add(map.get(temp1[1]));
//            }
//
//            if(temp1[2].equals("-")) {
//                t3.add(0);
//                t3.add(1);
//            }else {
//                t3.add(map.get(temp1[2]));
//            }
//
//            if(temp1[3].equals("-")) {
//                t4.add(0);
//                t4.add(1);
//            }else {
//                t4.add(map.get(temp1[3]));
//            }
//
//            int ans = 0;
//            for(int a = 0 ; a<t1.size() ; a++) {
//                for(int b = 0 ; b<t2.size() ; b++) {
//                    for(int c = 0 ; c<t3.size() ; c++) {
//                        for(int d = 0 ; d<t4.size() ; d++) {
//                            ans = ans + score[t1.get(a)][t2.get(b)][t3.get(c)][t4.get(d)][Integer.parseInt(temp1[4])];
//                        }
//                    }   
//                }
//            }
//
//            answer.add(ans);
//        }
//
//        return answer;
//    }
//}