//import java.util.*;
//
//class Solution {
//    static int[][] array;
//    public int[] solution(int rows, int columns, int[][] queries) {
//        array = new int[rows][columns]; 
//        int[] answer = new int[queries.length]; 
//        
//        for(int i = 0; i < rows; i++){  
//            for(int j = 0; j < columns; j++){
//                array[i][j] = i*columns + j + 1;
//            }
//        }
//        
//        for(int i = 0; i < queries.length; i++){ 
//            answer[i] = rotate(queries[i]);
//        }
//        
//        return answer;
//    }
//    
//    public int rotate(int[] query){
//        int r1 = query[0]-1; 
//        int c1 = query[1]-1;
//        int r2 = query[2]-1;
//        int c2 = query[3]-1;
//        
//        int temp = array[r1][c1]; 
//        int min = temp;                 
//        for(int i = r1; i < r2; i++){ 
//            array[i][c1] = array[i+1][c1];
//            if(min > array[i][c1]) {
//            	min = array[i][c1];
//            }
//        }
//        for(int i = c1; i < c2; i++){ 
//            array[r2][i] = array[r2][i+1];
//            if(min > array[r2][i]) {
//            	min = array[r2][i];
//            }
//        }
//        for(int i = r2; i > r1; i--){ 
//            array[i][c2] = array[i-1][c2];
//            if(min > array[i][c2]) {
//            	min = array[i][c2];
//            }
//        }
//        for(int i = c2; i > c1; i--){
//            array[r1][i] = array[r1][i-1];
//            if(min > array[r1][i]) {
//            	min = array[r1][i];
//            }
//        }
//        array[r1][c1+1] = temp;
//        
//        return min;
//    }
//    
//}