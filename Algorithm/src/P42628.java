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


//import java.util.Comparator;
//import java.util.PriorityQueue;
//
//class Solution {
//    public int[] solution(String[] operations) {
//        int[] answer = {0,0};
//        PriorityQueue<Integer> priorityQueueWithMax = new PriorityQueue<>(Comparator.reverseOrder());
//        PriorityQueue<Integer> priorityQueueWithMin = new PriorityQueue<>();
//
//        for (String operation : operations) {
//            String[] splitOther = operation.split(" ");
//
//            if (splitOther[0].equals("I")) {
//                priorityQueueWithMax.add(Integer.parseInt(splitOther[1]));
//                priorityQueueWithMin.add(Integer.parseInt(splitOther[1]));
//            }
//
//            if (splitOther[0].equals("D")) {
//                if (!priorityQueueWithMax.isEmpty()) {
//                    if (splitOther[1].equals("1")) {
//                        int max = priorityQueueWithMax.peek();
//                        priorityQueueWithMax.remove(max);
//                        priorityQueueWithMin.remove(max);
//
//                    } else {
//                        int min = priorityQueueWithMin.peek();
//                        priorityQueueWithMax.remove(min);
//                        priorityQueueWithMin.remove(min);
//                    }
//                }
//            }
//
//        }
//        if (!priorityQueueWithMax.isEmpty()) {
//            answer[0] = priorityQueueWithMax.peek();
//            answer[1] = priorityQueueWithMin.peek();
//
//        }
//        return answer;
//    }
//}



//import java.util.*;
//
//class Solution {
//    static PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
//    static PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
//
//    public int[] solution(String[] operations) {
//        int[] answer = {0,0};
//        
//        for(int i = 0 ; i < operations.length; i++){
//            if(operations[i].charAt(0) == 'I'){     //I일경우
//                int value = Integer.parseInt(operations[i].substring(2,operations[i].length()));
//                minHeap.add(value);
//                maxHeap.add(value);
//            }else{                                  //D일경우
//                if(!maxHeap.isEmpty()){             //비어있지않은경우
//                    int leng = operations[i].length();
//                    String temp = operations[i].substring(2,leng);
//                    if(temp.equals("1")){                  //최대값 삭제
//                        int max = maxHeap.poll();
//                        minHeap.remove(max);
//                    }
//                    else{
//                        int min = minHeap.poll();   //최솟값 삭제
//                        maxHeap.remove(min);       
//                    }
//                }
//            }
//        }
//        if(!maxHeap.isEmpty()){
//            answer[0] = maxHeap.poll();
//            answer[1] = minHeap.poll();
//        }
//
//        return answer;
//    }
//}