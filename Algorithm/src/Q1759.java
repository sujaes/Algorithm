//import java.util.Arrays;
//import java.util.Scanner;
// 
//public class Q1759 {
//    public static boolean check(String password) {
//        int ja = 0;
//        int mo = 0;
//        for (char x : password.toCharArray()) {
//            if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
//                mo += 1;
//            } else {
//                ja += 1;
//            }
//        }
//        return ja >= 2 && mo >= 1;
//    }
//    
//    public static void go(int n, String [] alpha, String password, int i) {
//        if(password.length() == n) { 
//            if(check(password)) { //모음 자음 개수 검사
//                System.out.println(password);
//            }
//            return;
//        }
//        if(alpha.length <= i) 
//            return;
//        
//        go(n, alpha, password+alpha[i], i+1); //사용하는 경우
//        go(n, alpha, password, i+1); //사용하지 않는 경우
//    }
// 
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int c = scan.nextInt();
//        scan.nextLine();
//        String [] alpha = scan.nextLine().split(" ");
//        
//        Arrays.sort(alpha);
//        go(n, alpha, "", 0);
//    }
//}



import java.util.*;
public class Q1759 {
	static String arr[];
    public static boolean check(String comarr[]) {
    	int count = 0;
    	int count1 = 0;    	
        for(int i = 0 ; i < comarr.length; i++) {
        	if( comarr[i].equals("a") || comarr[i].equals("e")||comarr[i].equals("i")||comarr[i].equals("o")||comarr[i].equals("u")) {
        		count++;
        	}else {
        		count1++;
        	}
        	if(count >=1 && count1 >=2 ) {
        		return true;
        	}
        }
    	if(count < 1 || count1 < 2) {
        	return false;
    	}else {
    		return true;
    	}
    }
    
    public static void comb(int n , int r, String comarr[],int target,int index) {
    	String answer = "";
    	if(r == 0) {
    		if(check(comarr)) {
    			for(int i = 0 ; i < comarr.length;i++) {
    				answer += comarr[i];
    			}
    			System.out.println(answer);
    		}
    		return;
    	}
    	if( target >= n) {
    		return;
    	}
    	
    	comarr[index] = arr[target];
    	comb(n,r-1,comarr,target+1,index+1);
    	comb(n,r,comarr,target+1,index);
    	
    	
    	
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        arr = s.split(" ");
        Arrays.sort(arr);
        String comarr[] = new String[n];
        comb(c,n,comarr,0,0);
                
    }
}


