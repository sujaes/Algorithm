//class Solution {
//    static int n;
//    static int count = 0 ;
//    static int arr[];
//    public int solution(int n) {
//        this.n = n;
//        arr = new int[n];
//        backtrack(0);
//        
//        return count;
//    }
//    
//    public static void backtrack(int depth){
//        if(depth ==n){
//            count++;
//            return;
//        }
//        for(int i = 0 ;  i < n ; i++){
//            arr[depth] = i;
//            if(check(depth)){
//                backtrack(depth+1);
//            }
//        }
//    }
//    public static boolean check(int y){
//        for(int i = 0 ; i < y; i++){
//            if(arr[y] == arr[i]){           //세로
//                return false;
//            }else if(Math.abs(y-i) == Math.abs(arr[y]- arr[i])){ //대각선
//                return false;
//            }
//        }
//        return true;
//    }
//}