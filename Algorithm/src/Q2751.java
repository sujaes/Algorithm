
//2751�� ���� �ð��ʰ� ������Ʈ�� �ؾ��ϳ���
import java.util.*;
public class Q2751{
  public static void main(String[] args){
  	Scanner sc  =new Scanner(System.in);
  	int n = sc.nextInt();
  	List<Integer> list = new ArrayList<Integer>();
  	for(int i = 0;i<n;i++){
  		list.add(sc.nextInt());
  		Collections.sort(list);
  	}
  	for(int i =0;i<n;i++){
  		System.out.println(list.get(i));
  	}
  }	
}
