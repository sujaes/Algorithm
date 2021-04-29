import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Q6416 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set;
        int[] income;
        int testcase = 0;
        int root;
        boolean flag;		//진입차수 체크
        int edge; // 간선의 갯수

        while(true) {
            set = new HashSet<>();
            income = new int[1001];
            root = 0;
            testcase++;
            flag = false;
            edge = 0;

            while(true) {
                int start = sc.nextInt();
                int end = sc.nextInt();

                if (start == 0 && end == 0) {		//testcase 한개 끝내기
                	break;
                }
                if (start == -1 && end == -1) {	//프로그램 종료하기
                	return;
                }

                set.add(start);
                set.add(end);
                income[end]++;
                edge++;
            }
            if(set.size()==0) { //빈트리도 트리
                System.out.println("Case "+ testcase +" is a tree.");
                continue;
            }

            Iterator iter = set.iterator();
            while(iter.hasNext()) {
                int num = (int)iter.next();
                if(income[num]==0) {	//빈 트리가 여러개 있으면 그래프다.
                	root++; 
                }
                if(income[num]>1) {
                	flag = true; // 진입간선>2이면
                    break;
                }
            }

            if(flag || root!=1 || set.size()-edge!=1) { // 진입간선>2 or 루트가 여러개 or 노드-간선!=1
                System.out.println("Case "+ testcase +" is not a tree.");
            }else {
                System.out.println("Case "+ testcase +" is a tree.");
            }
        }
    }
}