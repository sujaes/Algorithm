//import java.util.*;
//public class Solution {
//
//   public int solution(int[] A) {
//       int result = 1;
//       Arrays.sort(A);
//
//       Set<Integer> set = new HashSet<>();
//       for (int i : A){
//           set.add(i);
//       } 
//
//       for (int i=1; i<=set.size(); i++) {
//           if (!set.contains(i)) {
//               result = 0;
//               break;
//           }
//       }
//
//       return result;
//   }
//}