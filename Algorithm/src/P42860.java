//class Solution {
//    public int solution(String name) {
//        int answer = 0;
//        int n = name.length();
//        int min = n+1; // ���������� ��� �̵��ϴ� ���
//        for(int i=0;i<n;i++){
//            char ch=name.charAt(i);
//            if(ch!='A'){
//                answer += Math.min(ch-'A', 'Z'-ch+1);    
//            } 
//            int next = i+1;
//            // i ���� ���ڰ� A�� �����Ѵٸ� A�� ������ ��ġ ã��
//            while(next<n && name.charAt(next)=='A'){            //����üũ
//                next++;    
//            }
//            min=Math.min(min, i+i+n-next);      //���Ÿ� + ���ƿ°Ÿ� + (��ü- A�� �ݺ��� �Ÿ�) 
//        }
//        answer+=min;
//        return answer;
//    }
//}