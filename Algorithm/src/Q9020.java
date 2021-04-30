import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;
public class Q9020{
	 
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        boolean[] findingPrimeNum = new boolean[5082]; 
        Arrays.fill(findingPrimeNum, true);
        findingPrimeNum[0] = false;
        findingPrimeNum[1] = false;
        for(int i=2; i*i<=5081; i++) {
            
            if(findingPrimeNum[i]) {
                for(int j=i*i; j<=5081; j+=i) {
                    findingPrimeNum[j] = false;
                }
            }
        }
        for(int t=0; t<T; t++) {
            st = new StringTokenizer(br.readLine());
            int givenNum = Integer.parseInt(st.nextToken());
            int firstPartitian = givenNum/2;
            int secondPartitian = givenNum/2;
            
            while(true) {
                if(findingPrimeNum[firstPartitian] && findingPrimeNum[secondPartitian]) { 
                    break;
                }
                firstPartitian--;
                secondPartitian++;
            }
            bw.write(firstPartitian +" "+ secondPartitian+"\n");
        }
        bw.flush();
    }
 
}
 

