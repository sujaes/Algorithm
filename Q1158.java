package git;

//1158¹ø ¹®Á¦
import java.util.*;
	class Q1158{
		public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			int queuesize =a;
			int count=1;
			int temp1;
			Deque<Integer> cir = new LinkedList<Integer>();
			Deque<Integer> temp = new LinkedList<Integer>();
			for(int i = 0 ;i<a;i++){
				cir.offer(i+1);
			}
			while(queuesize!=0){
				temp1 = cir.poll();
				if(count%b==0){
					temp.offer(temp1);
					queuesize--;
				}else{
					cir.offer(temp1);
				}
				count++;
			}
			System.out.print("<");
			for(int i = 0 ;i<a;i++){
				if(i!=a-1){
					System.out.print(temp.poll()+", ");
				}else{
					System.out.print(temp.poll());
				}
			}
			System.out.print(">");
		}		
	}