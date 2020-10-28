import java.util.*;
class P42583 {
    static Queue<Truck> q = new LinkedList<Truck>();
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int count = 0;
        int sum = 0;
        int i = 0;
     
        if(bridge_length ==1){
            return truck_weights.length;
        }
        
        while(true){
            count = count + 1;
            if(q.isEmpty()){  
                if(i == 0){     //ó�� �ٸ��� �ǳʴ� Ʈ���� ���
                    System.out.println("ó�� �ٸ��ǳʴ� Ʈ�� : " +truck_weights[i]);
                    sum += truck_weights[i];
                    q.offer(new Truck(count,truck_weights[i]));
                    i++;
                }else{
                    break;
                }
            }else{              
                Truck t = q.peek();
                if(t.count + bridge_length <= count ){
                    System.out.println("�ٸ����� Ʈ�� : " + t.truck_weight + " ����ð� " + count);
                    sum -= t.truck_weight;
                    q.poll();
                }
                
                if( i<truck_weights.length && truck_weights[i] + sum <= weight  && q.size() < bridge_length){
                    sum += truck_weights[i];
                    q.offer(new Truck(count,truck_weights[i]));
                    i++;
                }
            }
        }    
        return count-1;
    }

}
class Truck{
    int count;
    int truck_weight;
    public Truck(int count , int truck_weight){
        this.count = count;
        this.truck_weight = truck_weight;
    }
}

//import java.util.*;
//class Solution {
//    static Queue<Truck> q = new LinkedList<Truck>();
//    public int solution(int bridge_length, int weight, int[] truck_weights) {
//        int count = 0;
//        int sum = 0;
//        int i = 0;
//     
//        if(bridge_length ==1){
//            return truck_weights.length;
//        }
//        
//        while(true){
//            count = count + 1;
//            if(q.isEmpty()){  
//                if(i == 0){     //ó�� �ٸ��� �ǳʴ� Ʈ���� ���
//                    System.out.println("ó�� �ٸ��ǳʴ� Ʈ�� : " +truck_weights[i]);
//                    sum += truck_weights[i];
//                    q.offer(new Truck(count,truck_weights[i]));
//                    i++;
//                }else{
//                    break;
//                }
//            }else{              
//                Truck t = q.peek();
//                if(t.count + bridge_length <= count ){
//                    System.out.println("�ٸ����� Ʈ�� : " + t.truck_weight + " ����ð� " + count);
//                    sum -= t.truck_weight;
//                    q.poll();
//                }
//                
//                if( i<truck_weights.length && truck_weights[i] + sum <= weight  && q.size() < bridge_length){
//                    sum += truck_weights[i];
//                    q.offer(new Truck(count,truck_weights[i]));
//                    i++;
//                }
//            }
//        }    
//        return count-1;
//    }
//
//}
//class Truck{
//    int count;
//    int truck_weight;
//    public Truck(int count , int truck_weight){
//        this.count = count;
//        this.truck_weight = truck_weight;
//    }
//}
