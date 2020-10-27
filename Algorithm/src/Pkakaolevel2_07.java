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
                  //c�� .�� �ƴҰ��
                  boolean same = true;

                  //4�� ��� ������ Ȯ���ϱ�
                  for (int k = 0; k < 4; k++) {
                      if(arr[i+dx[k]][j+dy[k]] != c) {
                          same = false;
                          break;
                          //�ٸ���찡������ same�� false����
                      }
                  }
                  //same�� false�̹Ƿ� �ٽ� 4���� �ϳ��� �ٸ������
                  if(!same){
                      continue;
                  } 
                  //��� ������� 4��Ͽ� �ش�ǳ� �湮���� ���� ���� �湮�ߴٰ� ����.
                  //ī��Ʈ ����.
                  //������ ���ؼ� ó������ ����Ǽ��� 1/4�� ����
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
        
          //�湮�� ���� x�� ǥ������ 
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