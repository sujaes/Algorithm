package git;

//10845¹ø ¹®Á¦
import java.util.*;
class Q10845{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		String str;
		int last=0;
		Queue<Integer> queue = new LinkedList<Integer>();
		for( int i=0;i<a;i++){
			str = sc.next();
		
			if(str.equals("push")){
				last = sc.nextInt();
				queue.offer(last);
			}else if(str.equals("empty")){
				if(queue.isEmpty()){
					System.out.println(1);
				}else{
					System.out.println(0);
				}
			}else if(str.equals("front")){
				if(!queue.isEmpty()){
					System.out.println(queue.peek());
				}else{
					System.out.println(-1);
				}
			}else if(str.equals("back")){
				if(!queue.isEmpty()){
					System.out.println(last);
				}else{
					System.out.println(-1);
				}
			}else if(str.equals("pop")){
				if(!queue.isEmpty()){
					System.out.println(queue.poll());
				}else{
					System.out.println(-1);
				}
			}else if(str.equals("size")){
				System.out.println(queue.size());
			}
		}
	}		
}