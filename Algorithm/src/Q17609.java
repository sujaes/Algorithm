//import java.util.Scanner;
//
//public class Q17609 {
//	static String s;
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int Tcase = sc.nextInt();
//		for(int i = 0 ; i <Tcase ;i++) {
//			s = sc.next();
//			
//			if(checkPal(s)) {	//회문일경우
//				System.out.println(0);
//			}else {			//회문아닐경우
//				if(checkPseudo()) {	//유사회문일 경우
//					System.out.println(1);
//				}else {		//일반문자일경우
//					System.out.println(2);
//				}
//			}
//			
//			
//			if(s.length()%2 ==0) {
//				
//			}
//			
//		}
//	}
//	public static boolean checkPal(String temp) {
//		int leng = temp.length();
//		if(leng %2 == 0) {
//			for(int i = 0 ; i < temp.length()/2 ; i++) {
//				if(temp.charAt(i) != temp.charAt(leng-1-i)) {
//					return false;
//				}
//			}
//			return true;
//		}else {		//0 1 2 3 4    
//			for(int i = 0 ; i < (temp.length()-1)/2 ;i++) {
//				if(temp.charAt(i) != temp.charAt(leng-1-i)) {
//					return false;
//				}
//			}
//			return true;
//		}
//	}
//
//	public static boolean checkPseudo() {
//		String temp = "";
//		int leng = s.length();
//		for(int i = 0 ; i < s.length();i++) {							
//			temp = s.substring(0,i) + s.substring(i+1,leng); 
//			if(checkPal(temp)) {
//				return true;
//			}else {
//				continue;
//			}
//		}
//		return false;
//	}
//}

import java.util.*;
public class Q17609 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i = 0 ; i < t; i++) {
            String str=sc.next();
            char ch[]=str.toCharArray() ;
            int ans=isPalindrome(ch);
           	System.out.println(ans);
        }
    }
    public static int isPalindrome(char[] ch){
        int ans=0;
        int L=0;
        int R=ch.length-1;
        
        while (L<=R){
            if(ch[L]==ch[R]){
                L++;
                R--;
            }else{           // 유사회문이면 여기위에서 종료, 아니면 밑으로
                int l=L+1; // 왼쪽을 기점으로 1칸 건너 뛰어서 생각.
                int r=R;
                while (l<=r){
                    if(ch[l]==ch[r]){
                        l++;
                        r--;
                    }else {
                      // 회문이 아님에 대해 +1
                        ans++;
                        break;
                    }
                }
                
                l=L;
                r=R-1; // 왼쪽을 건너 뛰어서도 아니면 오른쪽에 한칸을 띄우고 시작
                while (l<=r){
                    if(ch[l]==ch[r]){
                        l++;
                        r--;
                    }else {
                      // 회문이 아님에 대해 +1
                        ans++;
                        break;
                    }
                }
                return ans;
            }
        }
      // 회문 ,유사회문이 아니면 +1 ,+1 이 되어 2가 출력.
        return ans;
    }
}