//class Solution {
//    public String solution(String play_time, String adv_time, String[] logs) {
//        String parr[] = play_time.split(":");
//        String aarr[] = adv_time.split(":");
//        int count[] = new int[360001];
//        int log[][] = new int[logs.length][2];
//        int ptime = 0;
//        int atime = 0;
//        int second = 3600;
//        for(int i = 0 ; i < 3; i++){
//            ptime += Integer.parseInt(parr[i]) * second;
//            atime += Integer.parseInt(aarr[i]) * second;
//            second /= 60;
//        }
//        int slog[][] = new int[logs.length][2];
//        for(int i = 0 ; i < logs.length; i++){
//            String stemp[] = logs[i].split("-");
//            for(int k=0 ; k < 2; k++){
//                String larr[] = stemp[k].split(":");
//                second = 3600;
//                int ltime = 0;
//                for(int j = 0 ; j < 3; j++){
//                    ltime += Integer.parseInt(larr[j]) * second;
//                    second /= 60;
//                }
//                slog[i][k] = ltime;   
//            }
//        }
//        
//        for(int i = 0 ; i < slog.length;i++){
//            int s1 = slog[i][0];
//            int s2 = slog[i][1];
//            for(int j = s1; j < s2; j++){
//                count[j] += 1;
//            }
//        }
//        int stime = 0;
//        int etime = atime;
//        long sum = 0;
//        for (int i = stime; i < etime; i++) {
//            sum += count[i];
//        }
//        
//        long max = sum;
//        int start = 0;
//        while (etime <= ptime) {
//            sum -= count[stime];
//            sum += count[etime];
//            if(sum > max) {
//                max = sum;
//                start = stime + 1;
//            }
//            stime++;
//            etime++;
//        }
//        System.out.println(start);
//        
//        
//        String answer = "";
//        if(start/3600 ==0){
//            answer +="00:";
//        }else if(start/3600 < 10){
//            answer = answer + "0"+start/3600 +":";
//        }else{
//            answer = answer + start/3600 + ":";
//        }
//        start = start%3600;
//        
//        if(start/60 ==0){
//            answer +="00:";
//        }else if(start/60 < 10){
//            answer = answer + "0"+start/60 +":";
//        }else{
//            answer = answer + start/60 + ":";
//        }        
//        start = start%60;
//        
//        if(start ==0){
//            answer +="00";
//        }else if(start < 10){
//            answer = answer + "0"+start;
//        }else{
//            answer = answer + start;
//        }   
//        return answer;
//    }
//}