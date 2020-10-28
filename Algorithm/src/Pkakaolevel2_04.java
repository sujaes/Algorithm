<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Pkakaolevel2_04 {
    public int[] solution(String s) {
        int[] answer;
        Map<String ,Integer> map = new HashMap<String,Integer>();
        String[] str = s.replace("{", "").replace("}", "").split(","); //str배열에 문자열처리해서 넣어줌
        
        for(int i = 0 ; i< str.length;i++) {							//크기만큼돌리면서
        	if(map.get(str[i]) == null) {									// 나온숫자가 없으면 1삽입
            	map.put(str[i],1);
        	}else {														//나온숫자가 존재하면 기존+1 삽입
        		int temp = map.get(str[i]);
        		map.put(str[i],temp+1);
        	}
        }
        
        List<String> list = new ArrayList<>(map.keySet());		//map을 value값으로 정렬
        // 내림차순 //
        Collections.sort(list, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return map.get(o2).compareTo(map.get(o1));
            }
        });
        answer = new int[list.size()];
        for(int i = 0 ; i < list.size();i++) {
           answer[i] = Integer.parseInt(list.get(i));
        }
        
        return answer;
    }
}
=======
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//class Solution {
//    public int[] solution(String s) {
//        int[] answer;
//        Map<String ,Integer> map = new HashMap<String,Integer>();
//        String[] str = s.replace("{", "").replace("}", "").split(","); //str배열에 문자열처리해서 넣어줌
//         
//        for(int i = 0 ; i< str.length;i++) {							//크기만큼돌리면서
//        	if(map.get(str[i]) == null) {									// 나온숫자가 없으면 1삽입
//            	map.put(str[i],1);
//        	}else {														//나온숫자가 존재하면 기존+1 삽입
//        		int temp = map.get(str[i]);
//        		map.put(str[i],temp+1);
//        	}
//        }
//        
//        List<String> list = new ArrayList<>(map.keySet());		//map을 value값으로 정렬
//        // 내림차순 //
//        Collections.sort(list, new Comparator<String>() {
//            public int compare(String o1, String o2) {
//                return map.get(o2).compareTo(map.get(o1));
//            }
//        });
//        answer = new int[list.size()];
//        for(int i = 0 ; i < list.size();i++) {
//           answer[i] = Integer.parseInt(list.get(i));
//        }
//        
//        return answer;
//    }
//}
>>>>>>> branch 'master' of https://github.com/sujaes/Algorithm.git
