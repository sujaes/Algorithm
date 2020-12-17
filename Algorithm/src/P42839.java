//import java.util.*;
//
//class Solution {
//    static TreeSet<String> set = new TreeSet<String>();
//    static int count =0;
//    public int solution(String numbers) {
//        int size = numbers.length();
//        
//        List<Character> arr = new ArrayList<Character>();
//        for(int i = 0 ; i  < size; i++){
//            arr.add(numbers.charAt(i));
//        }
//        
//        List<Character> result = new ArrayList<Character>();
//        for(int i = 0 ; i < size; i++){
//            permutation(arr, result, size , i+1);
//        }
//        return count;    
//    }
//    public static boolean isPrime(int n){
//        int i;
//        int sqrt = (int) Math.sqrt(n);
//        
//        if(n ==2){
//            return true;
//        }
//        if(n%2 ==0 || n ==1 ){
//            return false;
//        }
//        for(i = 3; i <= sqrt ; i = i +2){
//            if(n % i == 0){
//                return false;
//            }
//        }
//        return true;
//    }
//    public static void permutation(List<Character> arr, List<Character> result, int n , int r){
//        if( r== 0){
//             if(result.get(0)!='0'){
//                 String str = "";
//                 int size = result.size();
//                 for(int i = 0 ; i < size; i++){
//                     str += result.get(i);
//                 }
//                 int num = 0 ;
//                 if(!set.contains(str)){
//                     num = Integer.parseInt(str);
//                     set.add(str);
//                     if(isPrime(num)){
//                         count++;
//                     }
//                 }
//             }
//            return;
//        }
//        for(int i = 0 ; i < n ; i++){
//            result.add(arr.remove(i));
//            permutation(arr,result,n-1 , r-1);
//            arr.add(i,result.remove(result.size()-1));
//        }
//        
//        
//    }
//    
//    
//}