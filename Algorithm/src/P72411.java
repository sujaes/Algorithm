//import java.util.HashMap;
//import java.util.Map;
//import java.util.ArrayList;
//import java.util.*;
//
//class Solution {
//    static int[] visit=new int[11];
//    static int[] count=new int[11];
//    static Map<String,Integer> map=new HashMap<>();
//    static Map<Integer,Integer> cou=new HashMap<>();
//    static Set<String> set = new HashSet<String>();
//    static ArrayList<Character> list = new ArrayList<Character>();
//    
//    public String[] solution(String[] orders, int[] course) {
//        for(int i=0;i<course.length;i++)
//            cou.put(course[i],1);
//        for(int i=0;i<orders.length;i++){
//            recur(0,orders[i]);
//        }
//       
//        List<String> menuList = new ArrayList<>(set);
//        List<String> m = new ArrayList<>();
//        Collections.sort(menuList);
//        
//        for(int i=0;i<menuList.size();i++){
//            int len=menuList.get(i).length();
//            if(count[len]<2 || cou.containsKey(len)==false) continue;
//            if(count[len]==map.get(menuList.get(i))){
//                m.add(menuList.get(i));
//            }
//        }
//        
//        String[] answer = new String[m.size()];
//        for(int i=0;i<m.size();i++){
//            answer[i]=m.get(i);
//        }
//        Arrays.sort(answer);
//       
//        return answer;
//    }
//    static String listToString(ArrayList<Character> copy_list){
//        String str="";
//        for(int i=0;i<copy_list.size();i++)
//            str+=copy_list.get(i);
//        return str;
//    }
//    
//    static void CombMenuCounting(ArrayList<Character> copy_list){
//        String combMenu=listToString(copy_list);
//        if(map.containsKey(combMenu)==false) map.put(combMenu,1);
//        else
//            map.put(combMenu,map.get(combMenu)+1);
//        
//        set.add(combMenu);
//        int len=combMenu.length();
//        int cnt=map.get(combMenu);
//        if(count[len]<cnt) count[len]=cnt;
//    }
//        
//    static void recur(int idx,String order){
//        if(list.size()>order.length()) return;
//        if(list.size()>1){
//          ArrayList<Character> copy_list = new ArrayList<Character>();
//          copy_list.addAll(list);
//          copy_list.sort(null);
//          CombMenuCounting(copy_list);
//        }
//        
//        for(int i=idx;i<order.length();i++){
//            if(visit[i]==1) continue;
//            visit[i]=1;
//            list.add(order.charAt(i));
//            recur(i+1,order);
//            list.remove(list.size()-1);
//            visit[i]=0;
//        }
//    }
//    
//    
//}

 
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.PriorityQueue;
// 
//class Menu {
//    String name;
//    int count;
//    
//    Menu(String name, int count) {
//        this.name = name;
//        this.count = count;
//    }
//}
// 
//public class P72411 {
// 
//    public static boolean[] v = new boolean[20];
//    public static Map<String, Integer> map = new HashMap<String, Integer>();
//    
//    public static void comb(String menu, int before, int count, int courseCount, String order) {
//        if(count>=courseCount) {
//            if(map.containsKey(menu)) map.put(menu, map.get(menu)+1);
//            else map.put(menu, 1);
//            return;
//        }
//        
//        for(int i=before+1; i<order.length(); i++) {
//            if(!v[i]) {
//                v[i] = true;
//                comb(menu+order.charAt(i), i, count+1, courseCount, order);
//                v[i] = false;
//            }
//        }
//    }
//    
//    public static String sortString(String s) {
//        char[] ch = s.toCharArray();
//        Arrays.sort(ch);
//        StringBuilder sb = new StringBuilder();
//        for(int i=0; i<ch.length; i++) sb.append(ch[i]);
//        return sb.toString();
//    }
//    
//    public static String[] solution(String[] orders, int[] course) {
//        PriorityQueue<Menu> pq = new PriorityQueue<Menu>(new Comparator<Menu>() {
//            @Override
//            public int compare(Menu arg0, Menu arg1) {
//                return Integer.compare(arg1.count, arg0.count);
//            }
//        });
//        List<String> list = new ArrayList<String>();
//        //주문 순서 정렬
//        for(int i=0; i<orders.length; i++) {
//        	orders[i] = sortString(orders[i]);
//        }
//        //
//        for(int i=0; i<course.length; i++) {
//            for(int j=0; j<orders.length; j++) {
//                if(orders[j].length()<course[i]) {
//                	continue;
//                }
//                comb("", -1, 0, course[i], orders[j]);
//            }
//            int max = Integer.MIN_VALUE;
//            for(String key : map.keySet()) {
//                int count = map.get(key);
//                if(max<=count) {
//                    max = count;
//                    pq.add(new Menu(key, count));
//                }
//            }
//            while(max!=1 && !pq.isEmpty()) {
//                Menu menu = pq.poll();
//                if(menu.count==max) list.add(menu.name);
//                else break;
//            }
//            pq.clear();
//            map.clear();
//        }
//        String[] answer = new String[list.size()];
//        for(int i=0; i<list.size(); i++) answer[i] = list.get(i);
//        Arrays.sort(answer);
//        return answer;
//    }
//    
//    public static void main(String[] args) {
//        String[] orders = {"ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH"};
//        int[] course = {2, 3, 4};
//        String[] answer = solution(orders, course);
//        for(int i=0; i<answer.length; i++) System.out.println(answer[i]);
//    }
//}
