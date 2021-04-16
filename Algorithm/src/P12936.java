//시간초과 코드
//import java.util.*;
//class Solution {    
//    static int count = 0;
//    static long k;
//    static int[] answer;
//    public int[] solution(int n, long k) {
//        this.k = k;
//        boolean visited[] = new boolean[n+1];
//        LinkedList<Integer> list = new LinkedList<Integer>();
//        answer= new int[n];
//
//        perm(n,n,list,visited);
//        return answer;
//    }
//    public static void perm(int a, int b, LinkedList<Integer> li, boolean visited[]){
//        if(li.size() == b){
//            count++;
//            if(count == k){
//                for(int i = 0 ; i < li.size();i++){
//                    answer[i] = li.get(i);
//                }
//            }
//            return;
//        }
//        for(int i = 1 ; i <= a; i++){
//            if(!visited[i]){
//                visited[i] = true;
//                li.add(i);
//                perm(a,b,li,visited);
//                visited[i] = false;
//                li.removeLast();
//            }
//        }
//    }
//}

//
//import java.util.LinkedList;
//
//class Solution {
//    public int[] solution(int n, long k) {
//        int[] answer = new int[n];
//        LinkedList<Integer> list = new LinkedList<>();
//        long factorial = 1;
//        for (int i = 1; i <= n; i++) {
//            list.add(i);
//            factorial *= i;
//        }
//        System.out.println( " list = "+list);
//        
//
//        int i = 0;
//        long left = k - 1;// k가 1부터 시작하므로
//        System.out.println("left = " + left);
//        while (i < n) {
//            factorial = factorial / (n - i);   // (n-1)!~ 1!까지
//            System.out.println("fact = " + factorial);
//            long value = left / factorial;   // 첫자리가 value만큼은 쓰인것
//            System.out.println("value = " + value);
//            answer[i] = list.get((int)value);       //get은 index가 0부터니까 value그대로사용
//            i++;
//            list.remove((int)value);                //쓴 숫자 삭제
//            left = left % factorial;                //남은 수들로 다음수 결정
//        }
//
//        return answer;
//    }
//}