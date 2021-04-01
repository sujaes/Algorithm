//import java.util.*;
//class Solution{
//    static Queue<Character> q = new LinkedList<Character>();
//    public int solution(String s)
//    {
//        int answer = 0;
//        char temp;
//        char temp2;
//        int check=0;
//        int count=0;
//        for(int i = 0 ; i < s.length();i++){
//            q.add(s.charAt(i));
//        }
//        
//        if(q.size()%2 ==1){
//            return 0;
//        }
//        temp = q.poll();    //자연수이므로 첫번째는 무조껀 나옴
//        
//        while(!q.isEmpty()){
//            check = q.size();
//            temp2 = q.poll();
//            if(temp == temp2){  //같은경우
//                if(!q.isEmpty()){
//                    count = 0;
//                    temp = q.poll();
//                }else{      //문자 삭제후 큐가 비어있으면 모두삭제가능
//                    return 1;
//                }
//                continue;
//            }else{              //다른경우
//                count++;
//                q.add(temp);
//                temp =temp2;
//            }
//            if(count>check){
//                return 0;
//            }
//        }
//        return 1;
//    }
//}


//import java.util.*;
//class Solution{
//   public static int solution(String s) {
//		int answer = 0;
//		Stack<Character> stack = new Stack<Character>();
//        
//        if(s.length()%2 == 1){
//            return 0;
//        }
//       
//		for (int i = s.length()-1; i >= 0; i--) {
//			if (stack.isEmpty()) { 
//				stack.push(s.charAt(i));
//			} else if (!stack.isEmpty() && stack.peek() == s.charAt(i)) {
//				stack.pop();
//			} else if(!stack.isEmpty() && stack.peek() != s.charAt(i)){
//                stack.push(s.charAt(i));
//            }
//		}
//		if (stack.isEmpty()) {
//			answer = 1;
//		}else{
//            answer = 0;
//        }
//		return answer;
//	}
//}