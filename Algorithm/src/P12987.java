//import java.util.*;
//class Solution {
//    public int solution(int[] A, int[] B) {
//        int answer = 0;
//        Arrays.sort(A); //1357
//        Arrays.sort(B); //2268
//        int a = 0;  //a인덱스
//        int b = 0;  //b인덱스
//        while(true) {
//            if(b == B.length){
//                break;
//            }
//            if (A[a] > B[b]) {      //a가 더크면 b인덱스 증가
//                b++;
//            } else if (A[a] == B[b]) {  //같으면 a인덱스 증가
//                b++;
//            } else {                //b가 더 크면 둘다증가하고 점수 올리기
//                a++;
//                b++;
//                answer++;
//            }
//        }
//        return answer;
//    }
//}