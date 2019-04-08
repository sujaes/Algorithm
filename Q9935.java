package git;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Q9935{
	static String s,bomb;
	static int len;
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		s = in.readLine();
		bomb = in.readLine();
//		int loop=0;
//		for(int i = 0 ; i < s.length();i++){
//			if(s.charAt(i)==bomb.charAt(0)){
//				loop++;
//			}
//		}
//		for(int i = 0 ; i < loop;i++){
//			s = check(s);
//		}
		do{
			len = s.length();
			s = check(s);
		}
		while(len!=s.length());
		if(s.length()==0){
			s = "FRULA";
		}
		System.out.println(s);
	}
	public static String check(String t){
//		String temp = "";
		StringBuilder temp = new StringBuilder("");
		for(int i =0 ; i < t.length();i++){
			int k = 0;
			if(t.charAt(i)!=bomb.charAt(0)){
				temp.append(t.charAt(i));
//				temp +=t.charAt(i);
			}else{
				for(int j = 0 ; j < bomb.length();j++){
					if(t.charAt(i+j)==bomb.charAt(j)){
						k++;
						if(k==bomb.length()){
							i+=bomb.length()-1;
							break;
						}
						continue;
					}else{
						temp.append(t.charAt(i));
//						temp += t.charAt(i);
						break;
					}
				}
			}
		}
		return 	temp.toString();
	}
}