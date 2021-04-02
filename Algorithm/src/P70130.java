//import java.util.*;
//class Solution {
//    public int solution(int[] a) {
//        int answer = 0;
//        int count[] = new int[a.length +1];
//        for(int i =0 ;i < a.length;i++){
//            count[a[i]]++;
//        }
//        for(int i = 0 ; i < count.length;i++){
//            if(count[i]*2 <= answer ){      //최대 갯수 맞추기
//                continue;
//            }
//            int star= 0;
//            for(int j = 0 ; j < a.length-1;j++){
//                if((a[j]==i || a[j+1]==i) && (a[j] != a[j+1])){
//                    star +=2;
//                    j++;
//                }
//            }
//            answer = Math.max(answer,star);
//        }
//        return answer;
//    }
//}