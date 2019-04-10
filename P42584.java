package programmers;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = {};
        int len = prices.length;
        int[] temp = new int[len];
        int count = 0;
        temp[len-1] = 0;
        for(int i = 0 ; i <len-1;i++ ){
            // System.out.println(" i= " +  i);
            count = 1 ;
            for(int j = i+1 ; j < len;j++){
                if(prices[i]<=prices[j]){
                    temp[i]++;
                    // count ++;
                }else{
                    // System.out.println(" i = "+i+" j = "+ j + " count = " + count );
                    // temp[i] =count;
                    temp[i]++;
                    break;
                }
            }
        }
        answer= temp;
        return answer;
    }
}