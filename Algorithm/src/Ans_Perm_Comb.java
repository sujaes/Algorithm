import java.util.LinkedList;
import java.util.Scanner;
/*
 * Date 2021.03.08
 * author 장수제
 * 순열,중복순열,조합,중복조합 코드정리
 */
public class Ans_Perm_Comb {
    static int n,r; //크기
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        r = sc.nextInt();
        
        //순열
        System.out.println("***순열 출력***");
        LinkedList<Integer> perArr = new LinkedList<Integer>();
        int perCheck[] = new int[n];
        permutation(n,r,perArr,perCheck);
        
        //중복순열
        System.out.println("***중복순열 출력***");
        LinkedList<Integer> rePerArr = new LinkedList<Integer>();
        rePermutation(n,r,rePerArr);
        
        //조합
        System.out.println("***조합 출력***");
        int comArr[] = new int[r];
        combination(n,r,comArr,0,0);
        
        //중복조합
        System.out.println("***중복조합 출력***");
        int reComArr[] = new int[r];
        reCombination(n,r,reComArr,0,0);
    }
    
    //순열 코드
    public static void permutation(int n , int r , LinkedList<Integer> perArr , int perCheck[]) {
    	//r개를 모두 다 뽑아서 리스트에 있는것을 출력하고 종료 
    	if(perArr.size()== r) {
    		for(int i =0 ; i < perArr.size();i++) {
    			System.out.print(perArr.get(i));
    		}
    		System.out.println();
    		return;
    	}
    	//r개를 뽑았다 안뽑았다 하면서 추가(재귀)
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

    //중복순열 코드(자기자신 포함하는 순열)
    public static void rePermutation(int n , int r , LinkedList<Integer> rePerArr) {
    	//r개를 모두 다 뽑아서 리스트에 있는것을 출력하고 종료 
    	if(rePerArr.size()== r) {
    		for(int i =0 ; i < rePerArr.size();i++) {
    			System.out.print(rePerArr.get(i));
    		}
    		System.out.println();
    		return;
    	}
    	//r개를 뽑았다 안뽑았다 하면서 추가(재귀)
    	for(int i = 0 ; i < n ;i++) {
  			rePerArr.add(i);
   			rePermutation(n, r, rePerArr);
   			rePerArr.removeLast();
    	}
    }
    
    
    //조합 코드
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
    	combination(n, r-1, comArr, index+1, target+1); //뽑는경우
    	combination(n, r  , comArr, index  , target+1);//안뽑는경우
    }
    
    //중복조합 코드
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