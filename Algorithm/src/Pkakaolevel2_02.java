//class Solution {
//    int answer = 1001;	                                //문자열 길이
//    String res = "";
//    public int solution(String s) {
//    	if( s.length() ==1) {
//    		return 1;
//    	}
//        for(int i = 1 ; i <=s.length()/2; i++){         	//처음 s길이 반만큼 쪼갤수있음            
//        	res="";
//        	String temp = convert(s,i);                   		//압축한 문자 길이
//            if (temp.length() < answer) {
//                answer = temp.length();
//            }
//        }
//        return answer;
//    }
//    public String convert(String s,int k){
//        for(int i =0; i<s.length() ;i = i+k) {			//쪼개는 크기에 따라서 횟수가 달라짐
//        	String saveStr = "";        	
//        	
//        	int count = 1;
//
//        	if(i+k >= s.length()) {							//쪼개는데 길이가 마지막이랑 같거나 커지면 오버되므로 끝에서 짜르기
//        		saveStr = s.substring(i,s.length());
//        	}else {
//        		saveStr = s.substring(i,i+k);				//k만큼 짜르기
//        	}
//        	for(int j = i+k ; j<s.length(); j = j+k) {
//        		String saveStr2 = "";
//        		if(j+k >= s.length() ) {					//쪼개는데 길이가 마지막이랑 같거나 커지면 오버되므로 끝에서 짜르기
//        			saveStr2 = s.substring(j,s.length());
//        		}else {
//        			saveStr2 = s.substring(j,j+k);
//        		}
//        		
//        		if(saveStr.equals(saveStr2)) {				//같으면 같은 문자이기때문에
//        			count++;								//count를 해주고
//        			i = j;									//for문에서 같은문자를 비교하지않게 기존문자를 건너뜀
//        		}else {										//다르면 바로뒤에 문자열과 다르므로 break해서 넘어감
//        			break;
//        		}
//        	}
//        	
//        	if(count ==1) {
//        		res += saveStr;
//        	}else {
//        		res += count+""+saveStr;
//        	}
//        }
//        System.out.println(res);
//		return res;
//    }
//}