//import java.util.*;
//class P12985{
//	public static void main(String[] args) {
//		System.out.println(solution(8,4,7));
//	}
//	
//    public static int solution(int n, int a, int b){
//        Queue<Integer> q = new LinkedList<Integer>();
//        int answer =1;
//        int count = 0;
//        int num1 = -1;
//        int num2 = -2;
//        if(Math.abs(a-b) == 1 && a/2 != b/2){         //1234 
//            return answer;
//        }
//        for(int i = 1; i <= n ; i++){
//            q.add(i);
//        }        
//        while(!q.isEmpty()){
//            if(count == n/2){
//                count = 0;
//                n = n/2;
//                answer++;
//            }
//            num1 = q.poll();
//            num2 = q.poll();
//            count++;
//            
//            if( (num1 == a && num2 == b) || (num1 == b && num2 == a) ){
//                return answer;
//            }else if( (num1 ==a && num2 != b) || (num1 ==b && num2 != a) ){
//                q.add(num1);
//            }else {
//                q.add(num2);
//            }
//        }
//        return answer;
//    }
//}