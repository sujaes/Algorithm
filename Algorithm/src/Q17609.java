import java.util.Scanner;

public class Q17609 {
	static String s;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Tcase = sc.nextInt();
		for(int i = 0 ; i <Tcase ;i++) {
			s = sc.next();
			
			if(checkPal(s)) {	//회문일경우
				System.out.println(0);
			}else {			//회문아닐경우
				if(checkPseudo()) {	//유사회문일 경우
					System.out.println(1);
				}else {		//일반문자일경우
					System.out.println(2);
				}
			}
			
			
			if(s.length()%2 ==0) {
				
			}
			
		}
	}
	public static boolean checkPal(String temp) {
		int leng = temp.length();
		if(leng %2 == 0) {
			for(int i = 0 ; i < temp.length()/2 ; i++) {
				if(temp.charAt(i) != temp.charAt(leng-1-i)) {
					return false;
				}
			}
			return true;
		}else {		//0 1 2 3 4    
			for(int i = 0 ; i < (temp.length()-1)/2 ;i++) {
				if(temp.charAt(i) != temp.charAt(leng-1-i)) {
					return false;
				}
			}
			return true;
		}
	}

	public static boolean checkPseudo() {
		String temp = "";
		int leng = s.length();
		for(int i = 0 ; i < s.length();i++) {							
			temp = s.substring(0,i) + s.substring(i+1,leng); 
			if(checkPal(temp)) {
				return true;
			}else {
				continue;
			}
		}
		return false;
	}
}
