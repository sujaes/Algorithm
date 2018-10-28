package git;

//6588번 문제 런타임오류
import java.util.*;
class Q6588{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		while(true){
			int a= sc.nextInt();
			int t = 1;
			Deque<Integer> deq= new LinkedList<Integer>();
			
			if(a==0){
				break;
			}
			if(a%2==0&&a>=4){
				for(int i = 3 ; i <=a; i++){				
					int k =0;
					for(int j=2; j<i;j++){
						if(i%j==0){
							k=1;
						}
					}
					if(k!=1){
						deq.push(i);			
					}
				}
			}
			while(t!=0){
				int first= deq.pollLast();
				int last = a-first;
				if(deq.contains((last))){
					System.out.println(a +" = "+ first + " + " +last);
					t=0;
				}
				if(deq.isEmpty()){
					System.out.println("Goldbach's conjecture is wrong.");
				}
			}
		}
	}
}
