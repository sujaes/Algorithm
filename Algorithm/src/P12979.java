//class Solution {
//    static boolean arr[];
//    public int solution(int n, int[] stations, int w) {
//        int answer = 0;
//        int left = 0;
//        int right = 0;
//        int start = 1;
//        int dist = 0;
//        for(int i = 0 ; i < stations.length; i++){
//            int temp = stations[i];
//            left = temp -w; //�������� �� �� �ִ� �ִ�    
//            right =temp +w; //���������� �� �� �ִ� �ִ�
//            
//            dist = left - start;
//            if(dist> 0){
//                answer+=getNum(dist,w);
//            }
//            start = right + 1;
//        }
//        if(start == n){ //�� ����� �ϳ�������
//            answer++;
//        }else if( start < n){ //�ټ���� ������
//            dist = n-start+1;
//            answer += getNum(dist,w);
//        }
//        return answer;
//        
//    }
//    public static int getNum(int dist, int w){
//        if(dist % ((2*w)+1)==0){            //������ ���°� �������� �� ��ȯ
//            return dist / ((2*w)+1);
//        }else{                              //�������� �� ������ +1 ��ȯ
//            return dist / ((2*w)+1) +1; 
//        }
//    }
////}