package git;

//11653¹ø ¹®Á¦
import java.util.*;
class Q11653{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		List <Integer> list= new ArrayList<Integer>();
		for(int i =  2; i<=a;i++){
			while(a%i==0){
				list.add(i);
				a/=i;
			}
		}
		for(int i =0 ; i <list.size();i++){
			System.out.println(list.get(i));
		}

	}
}
