//import java.util.ArrayList;
//import java.util.Collections;
// 
//public class Solution {
//    boolean[] visited;                    //�湮���� �������� üũ�ϴ� visited�迭
//    ArrayList<String> answers;
// 
//    public String[] solution(String[][] tickets) {
//        visited = new boolean[tickets.length];    
//        answers = new ArrayList<String>();
//        int count = 0;                                    //��� ������ ��ȴ��� �˷��ִ� ī��Ʈ
//        dfs(count, "ICN", "ICN",tickets);                
//        Collections.sort(answers);                        //��� �� ���� ���ĺ����� ���� �迭��� ����
//        String[] answer = answers.get(0).split(" ");    //���� ���� �迭�� �̾Ƽ� String�� �迭�� ����
//        return answer;
//    }
//    public void dfs(int count, String present, String answer, String[][]ticktes) {
//        if(count == ticktes.length) {            //��� ������ ��ȴٸ�
//            answers.add(answer);                //answers�� �߰�
//            return;
//        }
//        for(int i = 0; i < ticktes.length; i++) {
//            if(!visited[i] && ticktes[i][0].equals(present)) {        //present�� ���� �鸮�� ���� ������ ã��
//                visited[i] = true;                                    
//                dfs(count+1, ticktes[i][1],answer+" "+ticktes[i][1] , ticktes);    //ī��Ʈ +1 ���� ������ present�� �־��ְ� answer�� ���������� �߰����ش�.
//                visited[i] = false;
//            }
//        }
//        return;
//    }
//}