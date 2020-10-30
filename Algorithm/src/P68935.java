class P68935 {
    public int solution(int n) {
        int answer = 0;
        int k =1;
        String s = "";
        while(n!=0){
            s= (n%3) + s;
            n= n/3;
        }        
        for(int i = 0 ; i< s.length() ; i++){
            answer += k * Integer.parseInt(s.charAt(i)+"");
            k= k*3;
        }
        
        return answer;
    }
}