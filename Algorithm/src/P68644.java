import java.util.*;
 
class P68644 {
    static List<Integer> list = new ArrayList<Integer>();
    //n°³Áßr°³ »Ì±â
    public int[] solution(int[] numbers) {
        int[] answer = {};
        int n = numbers.length;
        int r = 2;
        boolean[] visited = new boolean[n];
        comb(numbers, visited, 0, n, r);
        answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
    
    static void comb(int[] numbers, boolean[] visited, int depth, int n, int r) {
        if (r == 0) {
            cal(numbers, visited, n);
            return;
        }
        
        if (depth == n) {
            return;
        }
 
        visited[depth] = true;
        comb(numbers, visited, depth + 1, n, r - 1);
 
        visited[depth] = false;
        comb(numbers, visited, depth + 1, n, r);
    }
    
    static void cal(int[] arr, boolean[] visited, int n){
        int num = 0;
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                num += arr[i];
            }
        }
        if(!list.contains(num)) {
             list.add(num);
          }
        
    }
}
