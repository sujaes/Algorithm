//import java.util.*;
//class Solution {
//    public int[] solution(String[] operations) {
//        int[] answer = {0,0};
//
//        PriorityQueue<Integer> dpq = new PriorityQueue<>(new Comparator<Integer>() {
//			//��������
//            public int compare(Integer w1, Integer w2) {
//				return w2.compareTo(w1); //descendant order
//			}
//		});
//        
//		PriorityQueue<Integer> apq = new PriorityQueue<>(new Comparator<Integer>() {
//			//��������
//		public int compare(Integer w1, Integer w2) {
//				return w1.compareTo(w2);
//			}
//		});
//        char dir = 'a';
//
//        for(int i = 0 ; i < operations.length; i++){
//            
//            char oper = operations[i].charAt(0);
//            //����
//            int size = operations[i].length();
//            int num = Integer.parseInt(operations[i].substring(2,size));
//
//            if(oper == 'I'){
//                if(dir == 'a'){
//                    System.out.println(num+ " ���������� ����");
//                    apq.add(num);
//                }else{
//                    System.out.println(num+ " ���������� ����");
//                    dpq.add(num);
//                }
//            }else{ //����
//                if(num < 0){ //�ּҰ�����
//                    if(apq.isEmpty()){ //�����������ĵǾ�������
//                        if(!dpq.isEmpty()){
//                            reversequeue(dpq,apq); //�����������ķ� ����
//                            dir = 'a';
//                        }
//                    }
//                    if(!apq.isEmpty()){ //�������� ť�� ��������
//                        int temp = apq.poll();
//                        dir = 'a';
//                        System.out.println(temp+" ������������ ����");
//
//                    }
//                }else{ //�ִ밪 ����
//                    if(dpq.isEmpty()){ //�����������ĵǾ�������
//                        if(!apq.isEmpty()){                     
//                            reversequeue(apq,dpq); //�����������ķ� ����
//                            dir = 'd';
//
//                        }
//                    }
//                    if(!dpq.isEmpty()){ //�������� ť�� ��������
//                        int temp = dpq.poll();
//                        dir = 'd';
//                        System.out.println(temp+" ������������ ����");
//
//                    }
//                }
////                 if(!dpq.isEmpty()){
////                 System.out.println("������ �������� ���� "+dpq.peek());
////                 }else{
////                 System.out.println("������ �������� �ְ� "+apq.peek());
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