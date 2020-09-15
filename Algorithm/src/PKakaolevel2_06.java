class Solution {
	static char[] replaceNum = {'A','B','C','D','E','F'}; 
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        String ans= "";
        int i = 0;
        while(answer.length()<(t*m)) {
        	answer = answer + n_num(n,i);
        	i++;
        }
        for(int j = p-1 ; j <= answer.length()-1; j= j+m) {
        	ans += answer.charAt(j);
        }
        ans = ans.substring(0,t);
        return ans;
    }
    
    public String n_num(int n , int num){
        String s = "";
        if(n>10) {
        	while((num/n)!=0){
        		if((num%n) >=10) {
        			s = replaceNum[(num%n - 10)]+""+ s;

        		}else {
                    s = (num%n)+""+ s;
        		}
        		
                num = num/n;
            }
        	if(num >= 10) {
                s = replaceNum[num-10]+""+s;
        	}else {
        		s= num +""+s;
        	}
            return s;
        }else {
            while((num/n)!=0){
                s = (num%n)+""+ s;
                num = num/n;
            }
            s = num+""+s;
            return s;
        }
    }
}