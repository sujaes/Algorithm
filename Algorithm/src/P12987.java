//import java.util.*;
//class Solution {
//    public int solution(int[] A, int[] B) {
//        int answer = 0;
//        Arrays.sort(A); //1357
//        Arrays.sort(B); //2268
//        int a = 0;  //a�ε���
//        int b = 0;  //b�ε���
//        while(true) {
//            if(b == B.length){
//                break;
//            }
//            if (A[a] > B[b]) {      //a�� ��ũ�� b�ε��� ����
//                b++;
//            } else if (A[a] == B[b]) {  //������ a�ε��� ����
//                b++;
//            } else {                //b�� �� ũ�� �Ѵ������ϰ� ���� �ø���
//                a++;
//                b++;
//                answer++;
//            }
//        }
//        return answer;
//    }
//}