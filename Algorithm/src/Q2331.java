
import java.util.*;
public class Q2331{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
         
        int A=sc.nextInt();
        int P=sc.nextInt();
         
        map.put(A, 0);
        int cnt=1;
        int tmp=A;
        while(true){
        	int D=0;
            while(tmp!=0){  //다음 D 구하기
                D+=Math.pow(tmp%10,P);
                tmp/=10;
            }
            if(map.containsKey(D)){
                System.out.println(map.get(D));
                return;
            }
            map.put(D, cnt++);
            tmp=D;
        }
    }
}