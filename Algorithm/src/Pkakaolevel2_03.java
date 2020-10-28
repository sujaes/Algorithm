//import java.util.*;
//
//class Solution {
//  public int solution(String str1, String str2) {
//      Map<String,Integer> map1 = new HashMap<String,Integer>();
//      Map<String,Integer> map2 = new HashMap<String,Integer>();
//      List<String> list = new ArrayList<String>();
//      
//      int temp = 0;
//      int intersection = 0;
//      int union = 0;
//      int answer = 0;
//      double rate = 0.0;
//      
//      //소문자로
//      str1 = str1.toLowerCase();
//      str2 = str2.toLowerCase();
//      
//      //맵1에 문자 2개만인것만 추가
//      for(int i = 0 ; i < str1.length()-1 ; i++){
//          if('a' <= str1.charAt(i) && str1.charAt(i) <= 'z' && 'a' <= str1.charAt(i+1) && str1.charAt(i+1) <= 'z'){
//              if(map1.containsKey(str1.substring(i,i+2))){
//                  temp = map1.get(str1.substring(i,i+2));
//                  map1.put(str1.substring(i,i+2),temp+1);
//              }else{
//                  map1.put(str1.substring(i,i+2),1);
//              }
//          }
//      }
//      
//      //맵2에 문자 2개만인것만 추가
//      for(int i = 0 ; i < str2.length()-1 ; i++){
//          if('a' <= str2.charAt(i) && str2.charAt(i) <= 'z' && 'a' <= str2.charAt(i+1) && str2.charAt(i+1) <= 'z'){
//              if(map2.containsKey(str2.substring(i,i+2))){
//                  temp = map2.get(str2.substring(i,i+2));
//                  map2.put(str2.substring(i,i+2),temp+1);
//              }else{
//                  map2.put(str2.substring(i,i+2),1);
//              }
//          }
//      }
//      
//      //map1 해시셋 합집합은 일단 모두더함.
//      Set<Map.Entry<String, Integer>> entries1 = map1.entrySet();
//      for(Map.Entry<String, Integer> entry1 : entries1) {
//          union += entry1.getValue(); //합집합은 큰값
//          // System.out.println(entry1.getKey());
//          list.add(entry1.getKey());
//      }
//      
//      //map2 해시셋 합집합은 일단 모두 더하고 작은값을 빼줌, 교집합은 작은값만 더해줌.
//      Set<Map.Entry<String, Integer>> entries2 = map2.entrySet();      
//      for(Map.Entry<String, Integer> entry2 : entries2) {
//          if(list.contains(entry2.getKey())){              
//              intersection +=Math.min(entry2.getValue(),map1.get(entry2.getKey()));
//              union -= Math.min(entry2.getValue(),map1.get(entry2.getKey()));
//          }
//          // System.out.println(entry2.getKey());
//
//          union += entry2.getValue(); //합집합은 큰값
//      }
//      
//      if(intersection==0 && union ==0){
//          rate = 1;
//      }else{
//          rate = (double)intersection / union;
//      }
//      // System.out.println(rate);
//      
//      answer = (int)(rate*65536);
//      
//      // System.out.println("intersection = "+ intersection + " union = "+union);
//       
//      return answer;
//  }
//}