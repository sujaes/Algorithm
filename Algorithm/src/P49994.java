//import java.util.*;
//
//class Solution {
//    public int solution(String dirs) {        
//        int answer = 0;
//        int[][][] arr = new int[11][11][4];
//        int[] dx = {-1, 1, 0, 0}; // �� �Ʒ� ������ ����
//        int[] dy = {0, 0, 1, -1}; 
//        int x = 5;
//        int y = 5; 
//        int nx = 0;
//        int ny= 0;
//        for(int i=0; i<dirs.length();i++){
//            if (dirs.charAt(i) == 'U'){
//                // ����
//                if(x+dx[0]>= 0 && x+dx[0]<=10  && y+dy[0] >=0 && y+dy[0] <=10){
//                    nx = x+dx[0];
//                    ny = y+dy[0];
//                    // ���� ��ġ U �ȸ������, ���ο� ��ġ D �ȸ��������
//                    if(arr[x][y][0] == 0 && arr[nx][ny][1] ==0){
//                        answer++;
//                        arr[x][y][0] = 1;
//                        arr[nx][ny][1] = 1;
//                    }
//                    x = nx; y = ny;
//                } 
//            }else if(dirs.charAt(i) == 'D'){
//                if(x+dx[1]>= 0 && x+dx[1]<=10  && y+dy[1] >=0 && y+dy[1] <=10){
//                    nx = x+dx[1];
//                    ny = y+dy[1];
//                    // ���� ��ġ D �ȸ������, ���ο� ��ġ U �ȸ��������
//                    if(arr[x][y][1] == 0 && arr[nx][ny][0] ==0){
//                        answer++;
//                        arr[x][y][1] = 1;
//                        arr[nx][ny][0] = 1;
//                    }
//                    x = nx; y = ny;
//                }   
//            }else if(dirs.charAt(i) == 'R'){
//                if(x+dx[2]>= 0 && x+dx[2]<=10  && y+dy[2] >=0 && y+dy[2] <=10){
//                    nx = x+dx[2];
//                    ny = y+dy[2];
//                    // ���� ��ġ R �ȸ������, ���ο� ��ġ L �ȸ��������
//                    if(arr[x][y][2] == 0 && arr[nx][ny][3] ==0){
//                        answer++;
//                        arr[x][y][2] = 1;
//                        arr[nx][ny][3] = 1;
//                    }
//                    x = nx; y = ny;
//                }   
//            }else if(dirs.charAt(i) == 'L'){
//                if(x+dx[3]>= 0 && x+dx[3]<=10  && y+dy[3] >=0 && y+dy[3] <=10){
//                    nx = x+dx[3];
//                    ny = y+dy[3];
//                    // ���� ��ġ L �ȸ������, ���ο� ��ġ R �ȸ��������
//                    if(arr[x][y][3] == 0 && arr[nx][ny][2] ==0){
//                        answer++;
//                        arr[x][y][3] = 1;
//                        arr[nx][ny][2] = 1;
//                    }
//                    x = nx; y = ny;
//                }   
//            }
//        }
//        return answer;
//    }
//}