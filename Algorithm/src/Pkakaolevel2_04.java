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
        String[] str = s.replace("{", "").replace("}", "").split(","); //str�迭�� ���ڿ�ó���ؼ� �־���
        
        for(int i = 0 ; i< str.length;i++) {							//ũ�⸸ŭ�����鼭
        	if(map.get(str[i]) == null) {									// ���¼��ڰ� ������ 1����
            	map.put(str[i],1);
        	}else {														//���¼��ڰ� �����ϸ� ����+1 ����
        		int temp = map.get(str[i]);
        		map.put(str[i],temp+1);
        	}
        }
        
        List<String> list = new ArrayList<>(map.keySet());		//map�� value������ ����
        // �������� //
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
//        String[] str = s.replace("{", "").replace("}", "").split(","); //str�迭�� ���ڿ�ó���ؼ� �־���
//         
//        for(int i = 0 ; i< str.length;i++) {							//ũ�⸸ŭ�����鼭
//        	if(map.get(str[i]) == null) {									// ���¼��ڰ� ������ 1����
//            	map.put(str[i],1);
//        	}else {														//���¼��ڰ� �����ϸ� ����+1 ����
//        		int temp = map.get(str[i]);
//        		map.put(str[i],temp+1);
//        	}
//        }
//        
//        List<String> list = new ArrayList<>(map.keySet());		//map�� value������ ����
//        // �������� //
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
