//class Solution {
//    public int solution(String name) {
//        int answer = 0;
//        int n = name.length();
//        int min = n+1; // 오른쪽으로 계속 이동하는 경우
//        for(int i=0;i<n;i++){
//            char ch=name.charAt(i);
//            if(ch!='A'){
//                answer += Math.min(ch-'A', 'Z'-ch+1);    
//            } 
//            int next = i+1;
//            // i 다음 문자가 A로 시작한다면 A가 끝나는 위치 찾기
//            while(next<n && name.charAt(next)=='A'){            //범위체크
//                next++;    
//            }
//            min=Math.min(min, i+i+n-next);      //간거리 + 돌아온거리 + (전체- A가 반복된 거리) 
//        }
//        answer+=min;
//        return answer;
//    }
//}