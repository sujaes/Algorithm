//class Solution {
//    int answer = 1001;	                                //���ڿ� ����
//    String res = "";
//    public int solution(String s) {
//    	if( s.length() ==1) {
//    		return 1;
//    	}
//        for(int i = 1 ; i <=s.length()/2; i++){         	//ó�� s���� �ݸ�ŭ �ɰ�������            
//        	res="";
//        	String temp = convert(s,i);                   		//������ ���� ����
//            if (temp.length() < answer) {
//                answer = temp.length();
//            }
//        }
//        return answer;
//    }
//    public String convert(String s,int k){
//        for(int i =0; i<s.length() ;i = i+k) {			//�ɰ��� ũ�⿡ ���� Ƚ���� �޶���
//        	String saveStr = "";        	
//        	
//        	int count = 1;
//
//        	if(i+k >= s.length()) {							//�ɰ��µ� ���̰� �������̶� ���ų� Ŀ���� �����ǹǷ� ������ ¥����
//        		saveStr = s.substring(i,s.length());
//        	}else {
//        		saveStr = s.substring(i,i+k);				//k��ŭ ¥����
//        	}
//        	for(int j = i+k ; j<s.length(); j = j+k) {
//        		String saveStr2 = "";
//        		if(j+k >= s.length() ) {					//�ɰ��µ� ���̰� �������̶� ���ų� Ŀ���� �����ǹǷ� ������ ¥����
//        			saveStr2 = s.substring(j,s.length());
//        		}else {
//        			saveStr2 = s.substring(j,j+k);
//        		}
//        		
//        		if(saveStr.equals(saveStr2)) {				//������ ���� �����̱⶧����
//        			count++;								//count�� ���ְ�
//        			i = j;									//for������ �������ڸ� �������ʰ� �������ڸ� �ǳʶ�
//        		}else {										//�ٸ��� �ٷεڿ� ���ڿ��� �ٸ��Ƿ� break�ؼ� �Ѿ
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