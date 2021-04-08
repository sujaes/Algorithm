
//10866¹ø ¹®Á¦
import java.util.*;
class Q10866{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		String next;
		Deque<Integer> dq = new LinkedList<Integer>();
		for(int i = 0;i<a;i++){
			next =sc.next();
			if(next.equals("push_front")){
				dq.offerFirst((sc.nextInt()));
			}else if(next.equals("push_back")){
				dq.offerLast(sc.nextInt());
			}else if(next.equals("pop_front")){
				if(dq.isEmpty()){
					System.out.println(-1);
				}else{
					System.out.println(dq.pollFirst());
				}
			}else if(next.equals("pop_back")){
				if(dq.isEmpty()){
					System.out.println(-1);
				}else{
					System.out.println(dq.pollLast());
				}
			}else if(next.equals("size")){
				System.out.println(dq.size());
			}else if(next.equals("empty")){
				if(dq.isEmpty()){
					System.out.println(1);
				}else{
					System.out.println(0);
				}
			}else if(next.equals("front")){
				if(dq.isEmpty()){
					System.out.println(-1);
				}else{
					System.out.println(dq.peekFirst());
				}
			}else if(next.equals("back")){
				if(dq.isEmpty()){
					System.out.println(-1);
				}else{
					System.out.println(dq.peekLast());
				}
			}
		}
	}		
}
