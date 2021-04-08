import java.util.LinkedList;
import java.util.Scanner;
/*
 * Date 2021.03.08
 * author �����
 * ����,�ߺ�����,����,�ߺ����� �ڵ�����
 */
public class Ans_Perm_Comb {
    static int n,r; //ũ��
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        r = sc.nextInt();
        
        //����
        System.out.println("***���� ���***");
        LinkedList<Integer> perArr = new LinkedList<Integer>();
        int perCheck[] = new int[n];
        permutation(n,r,perArr,perCheck);
        
        //�ߺ�����
        System.out.println("***�ߺ����� ���***");
        LinkedList<Integer> rePerArr = new LinkedList<Integer>();
        rePermutation(n,r,rePerArr);
        
        //����
        System.out.println("***���� ���***");
        int comArr[] = new int[r];
        combination(n,r,comArr,0,0);
        
        //�ߺ�����
        System.out.println("***�ߺ����� ���***");
        int reComArr[] = new int[r];
        reCombination(n,r,reComArr,0,0);
    }
    
    //���� �ڵ�
    public static void permutation(int n , int r , LinkedList<Integer> perArr , int perCheck[]) {
    	//r���� ��� �� �̾Ƽ� ����Ʈ�� �ִ°��� ����ϰ� ���� 
    	if(perArr.size()== r) {
    		for(int i =0 ; i < perArr.size();i++) {
    			System.out.print(perArr.get(i));
    		}
    		System.out.println();
    		return;
    	}
    	//r���� �̾Ҵ� �Ȼ̾Ҵ� �ϸ鼭 �߰�(���)
    	for(int i = 0 ; i < n ;i++) {
    		if(perCheck[i] == 0) {
    			perArr.add(i);
    			perCheck[i] = 1;
    			permutation(n, r, perArr, perCheck);
    			perCheck[i] = 0;
    			perArr.removeLast();
    		}
    	}
    }

    //�ߺ����� �ڵ�(�ڱ��ڽ� �����ϴ� ����)
    public static void rePermutation(int n , int r , LinkedList<Integer> rePerArr) {
    	//r���� ��� �� �̾Ƽ� ����Ʈ�� �ִ°��� ����ϰ� ���� 
    	if(rePerArr.size()== r) {
    		for(int i =0 ; i < rePerArr.size();i++) {
    			System.out.print(rePerArr.get(i));
    		}
    		System.out.println();
    		return;
    	}
    	//r���� �̾Ҵ� �Ȼ̾Ҵ� �ϸ鼭 �߰�(���)
    	for(int i = 0 ; i < n ;i++) {
  			rePerArr.add(i);
   			rePermutation(n, r, rePerArr);
   			rePerArr.removeLast();
    	}
    }
    
    
    //���� �ڵ�
    public static void combination(int n , int r , int comArr[] , int index , int target) {
    	if(r==0) {
    		for(int i = 0 ; i < comArr.length;i++) {
    			System.out.print(comArr[i] + " ");
    		}
    		System.out.println();
    		return;
    	}
    	if(target == n) {
    		return;
    	}   	
    	comArr[index] = target;
    	combination(n, r-1, comArr, index+1, target+1); //�̴°��
    	combination(n, r  , comArr, index  , target+1);//�Ȼ̴°��
    }
    
    //�ߺ����� �ڵ�
    public static void reCombination(int n , int r , int reComArr[] , int index, int target) {
    	if(r == 0) {
    		for(int i = 0 ; i < reComArr.length;i++) {
    			System.out.print(reComArr[i] + " ");
    		}
    		System.out.println();
    		return;
    	}
    	if(target == n) {
    		return;
    	}
    	reComArr[index] = target;
    	reCombination(n, r-1, reComArr, index+1, target);
    	reCombination(n, r  , reComArr, index  , target+1);
    	
    }
}