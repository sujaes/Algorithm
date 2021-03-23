//class Solution {
//    public int solution(int n, int[][] computers) {
//        int answer = 0;
//        boolean check[] = new boolean[n];
//        
//        for(int i = 0 ; i < n ; i++){
//            if(!check[i]){
//                dfs(computers, check, i);
//                answer++;
//            }
//        }
//        return answer;
//    }
//    public void dfs(int[][] computers,boolean[] check, int i){
//        check[i] = true;
//        for(int j = 0 ; j <computers.length; j++){
//            if(computers[i][j]==1 && !check[j]){
//                dfs(computers,check,j);
//            }
//        }
//    }
//}