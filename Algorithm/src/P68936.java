//class Solution {
//    static int zero = 0 ;
//    static int one = 0;
//    public int[] solution(int[][] arr) {
//        int answer[] = new int[2];
//        int leng = arr.length;
//        recur(arr, 0, 0, leng);
//        answer[0] = zero;
//        answer[1] = one;
//        return answer;
//    }
// 
//    public void recur(int[][] arr, int a, int b, int len) {
//        if(len == 1) {  //���� ���� ������ �ɰ������ ������ �����ش�.
//            if(arr[a][b] == 0) {
//                zero++;
//            }else {
//                one++;
//            }
//            return;
//        }
//        
//        int temp = arr[a][b];   //ù��
//        boolean flag = true;    //��� ���������� Ȯ���ϴ� flag
//        a:for (int i = a; i < a + len; i++) {
//            for (int j = b; j < b + len; j++) {
//                if (temp != arr[i][j]) {
//                    flag = false;
//                    break a; 
//                }
//            }
//        }
// 
//        if (flag) {                    
//            if (temp == 1) {
//                one++;
//            } else {
//                zero++;
//            }
//        } else {
//            len = len/2;
//            
//            recur(arr, a, b, len);
//            recur(arr, a + len, b, len);
//            recur(arr, a, b + len, len);
//            recur(arr, a + len, b + len, len);
//        }
// 
//    }
//}