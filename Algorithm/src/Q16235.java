import java.util.*;
 
public class Q16235 {
    static int n,m,k;
    static int arr[][], map[][];
    static int dx[] = {0,1,1,1,0,-1,-1,-1};
    static int dy[] = {-1,-1,0,1,1,1,0,-1};
    static ArrayList<Integer> arrList[][];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();
        
        arr = new int[n+1][n+1];
        map = new int[n+1][n+1];
        
        arrList = new ArrayList[n+1][n+1];
        for(int i=1; i<=n; i++)
            for(int j=1; j<=n; j++)
                arrList[i][j] = new ArrayList<>();
        
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++)
                map[i][j] = 5;
        }
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) 
                arr[i][j] = sc.nextInt();
                
        }
        for(int l=1; l<=m; l++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int age = sc.nextInt();
            arrList[u][v].add(age);
        }
        int b = 0;
        while(b<k) {
            
            // 봄 + 여름
            for(int i=1; i<=n; i++) {
                for(int j=1; j<=n; j++) {
                    if(arrList[i][j].size() > 0) {
                        int end = 0;
                        Collections.sort(arrList[i][j]);
                        
                        ArrayList<Integer> tmp = new ArrayList<>();
                        for(int q=0; q<arrList[i][j].size(); q++) {
                            int age = arrList[i][j].get(q);
                            if(map[i][j] >= age) {
                                map[i][j] -= age;
                                tmp.add(age+1);
                            }else {
                                end += age/2;
                            }
                        }
                        arrList[i][j] = new ArrayList<>();
                        for(int val : tmp)
                            arrList[i][j].add(val);
                        
                        map[i][j] += end;
                    }
                }
            }
            
            /// 가을
            for(int i=1; i<=n; i++) {
                for(int j=1; j<=n; j++) {
                    if(arrList[i][j].size() > 0) {
                        
                        for(int q=0; q<arrList[i][j].size(); q++) {
                            int age = arrList[i][j].get(q);
                            if(age % 5 == 0) {
                                for(int d=0; d<8; d++) {
                                    int nx = j + dx[d];
                                    int ny = i + dy[d];
                                    if(0<nx && nx<=n && 0<ny && ny<=n) {
                                        arrList[ny][nx].add(1);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            
            /// 겨울
            for(int i=1; i<=n; i++)
                for(int j=1; j<=n; j++)
                    map[i][j] += arr[i][j];
            
            
            b++;
        }
        int result = 0;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                result += arrList[i][j].size();
            }
        }
        System.out.println(result);
    }
}