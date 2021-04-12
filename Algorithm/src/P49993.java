//class Solution {
//    public int solution(String skill, String[] skill_trees) {
//        int answer = 0;
//        boolean flag = false;
//        boolean flag2 = false;
//        for(int i = 0 ; i < skill_trees.length;i++){
//            int leng = skill_trees[i].length();
//            for(int j = 0 ; j < leng;j++){
//                flag = false;
//                for(int k =0; k < skill.length(); k++){
//                    if(skill_trees[i].charAt(j) ==skill.charAt(k) ){
//                        flag = true;
//                        break;
//                    }
//                }
//                if(!flag){
//                    skill_trees[i] = skill_trees[i].replace(skill_trees[i].charAt(j),' ');
//                }
//            }
//            skill_trees[i] = skill_trees[i].replaceAll(" ","");
//            System.out.println(skill_trees[i]);
//            flag2 = false;
//
//            
//            for(int j = 0 ; j < skill_trees[i].length() ; j++){
//                if(skill_trees[i].charAt(j) == skill.charAt(j)){
//                    
//                }else {
//                    flag2 = true;
//                    break;
//                }
//            }
//            if(!flag2){
//                answer++;
//            }
//            
//        }
//        
//        return answer;
//    }
//}
import java.util.*;
class P49993 {
	public static void main(String[] args) {
		System.out.println(solution("CBD", new String[] { "BACDE", "CBADF", "AECB", "BDA" }));
		System.out.println("답 : 2");
		System.out.println();
		System.out.println(solution("CBD", new String[] { "BACDE", "CBADF", "AECB", "BDA", "AQWER" }));
		System.out.println("답 : 3");
		System.out.println();
		System.out.println(solution("CBD", new String[] { "CED" }));
		System.out.println("답 : 0");
		System.out.println();
		System.out.println(solution("ABC", new String[] { "DEF","OPQ" }));
		System.out.println("답 : 2");
		System.out.println();
		System.out.println(solution("CBD", new String[] { "AQBD" }));
		System.out.println("답 : 0");
		System.out.println();
		System.out.println(solution("CBD", new String[] { "C" }));
		System.out.println("답 : 1");
		System.out.println();
		System.out.println(solution("CBD", new String[] { "B" }));
		System.out.println("답 : 0");
		System.out.println();
		System.out.println(solution("CBD", new String[] { "D" }));
		System.out.println("답 : 0");
		System.out.println();
		System.out.println(solution("CBD", new String[] { "CB" }));
		System.out.println("답 : 1");
		System.out.println();
		System.out.println(solution("CBD", new String[] { "CD" }));
		System.out.println("답 : 0");
		System.out.println();
		System.out.println(solution("CBD", new String[] { "BD" }));
		System.out.println("답 : 0");
		System.out.println();
		System.out.println(solution("CABDSER", new String[] { "ANM", "ER", "REWQ", "CL" }));
		System.out.println("답 : 1");
		System.out.println();
		System.out.println(solution("CBD", new String[] { "BC" }));
		System.out.println("답 : 0");
		System.out.println();
	}
    public static int solution(String skill, String[] skill_trees) {
    	int answer = 0;
    	String temp[] = new String[skill_trees.length];
        Arrays.fill(temp,"");
        for(int i = 0 ; i < skill_trees.length;i++){
            for(int j = 0 ; j < skill_trees[i].length(); j++){
                if(skill.contains(skill_trees[i].charAt(j)+"")){
                    temp[i] += skill_trees[i].charAt(j);
                }
            }
        }
        
        for(int i = 1 ; i <= skill.length(); i++){			//여기랑 
            String comp = skill.substring(0,i);
            System.out.println(comp);
            for(int j = 0 ; j < temp.length ; j++){			//여기를 바꿔야 답
                System.out.println("temp = "+temp[j]);
                if(comp.equals(temp[j]) || temp[j].equals("")){
                    answer++;
                    break;
                }
            }   
        }
        return answer;
    }
}