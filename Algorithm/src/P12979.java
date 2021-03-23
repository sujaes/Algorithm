//class Solution {
//    static boolean arr[];
//    public int solution(int n, int[] stations, int w) {
//        int answer = 0;
//        int left = 0;
//        int right = 0;
//        int start = 1;
//        int dist = 0;
//        for(int i = 0 ; i < stations.length; i++){
//            int temp = stations[i];
//            left = temp -w; //왼쪽으로 갈 수 있는 최대    
//            right =temp +w; //오른쪽으로 갈 수 있는 최대
//            
//            dist = left - start;
//            if(dist> 0){
//                answer+=getNum(dist,w);
//            }
//            start = right + 1;
//        }
//        if(start == n){ //다 세우고 하나남으면
//            answer++;
//        }else if( start < n){ //다세우고도 남으면
//            dist = n-start+1;
//            answer += getNum(dist,w);
//        }
//        return answer;
//        
//    }
//    public static int getNum(int dist, int w){
//        if(dist % ((2*w)+1)==0){            //범위에 딱맞게 떨어지면 몫만 반환
//            return dist / ((2*w)+1);
//        }else{                              //범위보다 좀 남으면 +1 반환
//            return dist / ((2*w)+1) +1; 
//        }
//    }
////}