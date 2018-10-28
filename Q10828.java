package git;

//10828¹ø ¹®Á¦
import java.util.*;
class Q10828{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		String str;
		String pushcon[];
		str = sc.nextLine();

		List<Integer> stack = new ArrayList<Integer>(); 
		for(int i=0;i<a;i++){
			str = sc.nextLine();
			if(str.contains("push")){
				pushcon = str.split(" ");
				stack.add(Integer.parseInt(""+pushcon[1]));
			}else if(str.equals("empty")){
				if(stack.isEmpty()){
					System.out.println(1);
				}else{
					System.out.println(0);
				}
			}else if(str.equals("top")){
				if(stack.isEmpty()){
					System.out.println(-1);
				}else{
					System.out.println(stack.get(stack.size()-1));
				}
			}else if(str.equals("pop")){
				if(stack.isEmpty()){
					System.out.println(-1);
				}else{
					System.out.println(stack.get(stack.size()-1));
					stack.remove(stack.size()-1);
				}
			}else if(str.equals("size")){
				System.out.println(stack.size());
			}
		}
	}		
}