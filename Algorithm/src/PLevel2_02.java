class Main{

    public static void main(String[] args){
    	Solution s = new Solution();
    	int []arr = {1,1,1,1,1};
    	System.out.println(s.solution(arr, 3));
    	
    	
    }
   
}
class Solution {
    static int answer=0;
    
    public static void rec(int[] numbers, int target, int index){
    	
        //Á¾°á
        if(index == numbers.length){
            int sum = 0;
            for(int num : numbers) {
            	sum += num;
            }
            if(sum == target) {
            	answer++;
            }
        }else {
        	numbers[index] *= 1;
            rec(numbers, target, index+1);
            numbers[index] *= -1;
            rec(numbers,target ,index+1);
        }
    
    }
    
    public int solution(int[] numbers, int target) {
        rec(numbers, target, 0);
        return answer;

    }
}