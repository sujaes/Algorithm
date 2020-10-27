class Pkakaolevel2_07 {
  static int[] dx = {0,0,1,1};
  static int[] dy = {0,1,0,1};
    
  public static void down(int m, int n, char[][] arr) {
      for (int i = m-1; i >= 0 ; i--) {
          for (int j = 0; j < n; j++) {
              if(arr[i][j] == 'x'){
                  continue;
              }
              int nx = i;
              char c = arr[i][j];
              arr[i][j] = 'x';
              while(true) {
                  if(nx+1 >= m || arr[nx+1][j] != 'x'){
                      break;
                  }
                  nx++;
              }
              arr[nx][j] = c;
          }
      }
  }  
  public int solution(int m, int n, String[] board) {
      int answer = 0;
      char[][] arr = new char[m][n];
      boolean[][] visited;
      for (int i = 0; i < m; i++) {
          arr[i] = board[i].toCharArray();
      }
      while(true) {
          visited = new boolean[m][n];
          int cnt = 0;
        
          for (int i = 0; i < m-1; i++) {
              for (int j = 0; j < n-1; j++) {

                  char c = arr[i][j];
                
                  if(c == 'x'){
                      continue;
                  }
                  //c가 .이 아닐경우
                  boolean same = true;

                  //4개 모두 같은지 확인하기
                  for (int k = 0; k < 4; k++) {
                      if(arr[i+dx[k]][j+dy[k]] != c) {
                          same = false;
                          break;
                          //다른경우가있으면 same을 false로함
                      }
                  }
                  //same이 false이므로 다시 4개중 하나라도 다른경우임
                  if(!same){
                      continue;
                  } 
                  //모두 같은경우 4블록에 해당되나 방문하지 않은 점을 방문했다고 해줌.
                  //카운트 해줌.
                  //이점을 통해서 처리해줄 경우의수를 1/4로 줄임
                  for (int k = 0; k < 4; k++) {
                      int nx = i+dx[k];
                      int ny = j+dy[k];
                      if(!visited[nx][ny]){
                          cnt++;
                      } 
                      visited[nx][ny] = true;
                  }
              }
          }
        
          //방문된 것을 x로 표현해줌 
          for (int i = 0; i < m; i++) {
              for (int j = 0; j < n; j++) {
                  if(visited[i][j]){
                      arr[i][j] = 'x';
                  }  
              }
          }
          if(cnt == 0){
              break;
          }
          
          answer += cnt;
        
          down(m,n,arr);
      }
      return answer;
  } 
}