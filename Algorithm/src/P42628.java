//import java.util.*;
//class Solution {
//    public int[] solution(String[] operations) {
//        int[] answer = {0,0};
//
//        PriorityQueue<Integer> dpq = new PriorityQueue<>(new Comparator<Integer>() {
//			//내림차순
//            public int compare(Integer w1, Integer w2) {
//				return w2.compareTo(w1); //descendant order
//			}
//		});
//        
//		PriorityQueue<Integer> apq = new PriorityQueue<>(new Comparator<Integer>() {
//			//오름차순
//		public int compare(Integer w1, Integer w2) {
//				return w1.compareTo(w2);
//			}
//		});
//        char dir = 'a';
//
//        for(int i = 0 ; i < operations.length; i++){
//            
//            char oper = operations[i].charAt(0);
//            //삽입
//            int size = operations[i].length();
//            int num = Integer.parseInt(operations[i].substring(2,size));
//
//            if(oper == 'I'){
//                if(dir == 'a'){
//                    System.out.println(num+ " 오름차순에 삽입");
//                    apq.add(num);
//                }else{
//                    System.out.println(num+ " 내림차순에 삽입");
//                    dpq.add(num);
//                }
//            }else{ //삭제
//                if(num < 0){ //최소값삭제
//                    if(apq.isEmpty()){ //내림차순정렬되어있을때
//                        if(!dpq.isEmpty()){
//                            reversequeue(dpq,apq); //오름차순정렬로 변경
//                            dir = 'a';
//                        }
//                    }
//                    if(!apq.isEmpty()){ //오름차순 큐가 차있을때
//                        int temp = apq.poll();
//                        dir = 'a';
//                        System.out.println(temp+" 오름차순에서 삭제");
//
//                    }
//                }else{ //최대값 삭제
//                    if(dpq.isEmpty()){ //오름차순정렬되어있을때
//                        if(!apq.isEmpty()){                     
//                            reversequeue(apq,dpq); //내림차순정렬로 변경
//                            dir = 'd';
//
//                        }
//                    }
//                    if(!dpq.isEmpty()){ //내림차순 큐가 차있을때
//                        int temp = dpq.poll();
//                        dir = 'd';
//                        System.out.println(temp+" 내림차순에서 삭제");
//
//                    }
//                }
////                 if(!dpq.isEmpty()){
////                 System.out.println("삭제후 내림차순 최저 "+dpq.peek());
////                 }else{
////                 System.out.println("삭제후 오름차순 최고 "+apq.peek());
////                 }
//                
//            }
//            
//            
//        }
//        
//        
//        if(apq.isEmpty() && dpq.isEmpty()){
//            answer[0] = 0;
//            answer[1] = 0;
//        }else{
//            if(!apq.isEmpty()){
//                answer[1] = apq.poll();
//                reversequeue(apq,dpq);
//                answer[0] = dpq.poll();
//            }else{
//                answer[1] = dpq.poll();
//                reversequeue(dpq,apq);
//                answer[0] = apq.poll();
//            }
//        }
//        
//        return answer;
//    }
//    public static void reversequeue(Queue<Integer> queue1,Queue<Integer> queue2){ 
//        Stack<Integer> stack = new Stack<>(); 
//        while (!queue1.isEmpty()) { 
//            stack.add(queue1.peek()); 
//            queue1.remove(); 
//        } 
//        while (!stack.isEmpty()) { 
//            queue2.add(stack.peek()); 
//            stack.pop(); 
//        } 
//    } 
//}