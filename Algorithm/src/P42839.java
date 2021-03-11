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



//import java.util.*;
//
//class Solution {
//    static int count = 0;
//    static int arr[];
//    static ArrayList<Integer> cont = new ArrayList<Integer>();
//    public int solution(String numbers) {
//        LinkedList<Integer> list = new LinkedList<Integer>();
//        int check[] = new int[numbers.length()];
//        arr = new int[numbers.length()];
//        for(int i = 0 ; i < numbers.length();i++){
//            arr[i] = Integer.parseInt(numbers.charAt(i)+"");
//        }
//        for(int i = 1 ; i <= numbers.length();i++){
//            System.out.println(i+"자리 구하기");
//            perm(numbers.length(),i,list,check);
//        }
//        return count;
//    }
//    
//    public boolean isPrime(int num){
//        if(num == 0 || num ==1){
//            return false;
//        }
//        System.out.println(num);
//        for (int i = 2; i < num; i++) {
//            // 1과 num 자신 외에 나누어지는 수가 있는지 검사할 조건문
//            if (num % i == 0) {
//                // 나누어지는 수가 있을 경우 isPrime의 값을 true로 바꾼다.
//                return false;
//                // 한 번이라도 이 조건문이 실행될 경우 num은 소수가 아니므로 반복문을 빠져나온다.
//            }
//        }
//        return true;
//    }
//    
//    public void perm(int n, int r, LinkedList<Integer> list, int check[]){
//        String temp = "";
//        if(list.size() == r){
//            for(int i = 0 ; i < r; i++){
//                temp += list.get(i)+"";
//            }
//            if(temp.charAt(0) == '0'){
//                return;
//            }
//            int checkValue = Integer.parseInt(temp);
//            
//            if(cont.contains(checkValue)){
//                return;
//            }else{
//                cont.add(checkValue);
//                if(isPrime(checkValue)){
//                    count++;
//                }
//            }
//        }
//        for(int i = 0 ; i < n ;i++){
//            if(check[i]==0){
//                check[i] = 1;
//                list.add(arr[i]);
//                perm(n,r,list,check);
//                list.removeLast();
//                check[i] = 0;
//            }
//        }      
//    }
//}