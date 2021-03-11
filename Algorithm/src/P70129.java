//class Solution {
//    static int cnt = 0;
//    static int roop = 0;
//    public int[] solution(String s) {
//        int[] answer = {0,0};
//        while(true){
//            roop++;
//            int leng = s.length();
//            for(int i = 0 ; i < leng;i++){
//                s = s.replaceAll("0","");
//            }
//            int leng1 = s.length();
//            cnt += leng - leng1;
//            if(leng1 ==1){
//                break;
//            }else{
//                s = conv(leng1+"");
//            }
//        }
//        answer[0] = roop;
//        answer[1] = cnt;        
//        return answer;
//    }
//    public String conv(String s){
//        String res ="";
//        int tmp = Integer.parseInt(s);
//        while(tmp!=0){
//            res += tmp %2;
//            tmp = tmp/2;
//        }  
//        StringBuffer sb = new StringBuffer(res);
//        String reversedStr = sb.reverse().toString();
//        System.out.println(reversedStr);
//        return reversedStr;
//    }
//    
//}