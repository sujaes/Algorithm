//class Solution {
//    public int solution(int[] arr) {
//        int leng = arr.length;
//        int temp = 1;
//        for(int i = 0 ; i < leng ;i++){
//            temp = lcm(temp,arr[i]);
//        }
//        return temp;
//    }
//    
//    public int gcd(int a, int b){
//        while(b!=0){
//            int r = a%b;
//            a= b;
//            b= r;
//        }
//        return a;
//    }
//
//    public int lcm(int a, int b){
//        return a * b / gcd(a,b);
//    }
//    
//}