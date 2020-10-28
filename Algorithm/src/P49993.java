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