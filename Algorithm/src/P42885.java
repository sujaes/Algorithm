//import java.util.*;
//class Solution {
//    public int solution(int[] people, int limit) {
//        Arrays.sort(people);
//        int answer = 0;
//        int index = people.length - 1;
//        for(int i = 0; i <= index; i++, answer++) 
//            while(index > i && people[i] + people[index--] > limit) 
//                answer++;
// 
//        return answer;
//    }
//}



//import java.util.*;
//class Solution {
//    public int solution(int[] people, int limit) {
//        Arrays.sort(people);
//        int answer = 0;
//        int left = 0;
//        int right = people.length-1;
//        int sum = 0;
//        while(left <= right){
//            sum = people[left] + people[right];
//            if(sum <= limit){
//                left++;
//                right--;
//            }else {
//                right--;
//            }
//            answer++;
//        }
//        return answer;
//    }
//}


