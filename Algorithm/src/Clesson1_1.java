class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        String str = convert(N);
        char[] arr = str.toCharArray();
        char[] reversedArr = new char[arr.length];
        int zero = 0;
        int max = 0;
        int one = 0;
        for(int i=0; i<arr.length; i++){
            reversedArr[arr.length-1-i] = arr[i];
        }
        str = new String(reversedArr);
        // System.out.println(str);
        
        for(int i=0;i<str.length();i++) {
        	if(str.charAt(i) == '0'){
        		zero++;
        	}else if(str.charAt(i) == '1') {
        		one++;
        		if(max < zero) {
        			max = zero;
        		}
        		zero = 0;
        	}
        }
        
        if(one < 2) {
        	return 0;
        }else {
        	return max;
        }       
    }
    public String convert(int N){
        String str = "";
        while(N!=0){
            str += N%2;
            N = N/2;
        }
        return str;
    }
}