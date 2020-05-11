import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Q1920 {
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine()); // 자연수 N
        String[] beforeAArray = br.readLine().split(" "); // 스트링 배열로 받아지는 특징 때문에 인트배열 담기 전에 생성
        int[] aArray = new int[n];
        
        /* 스트링 배열로 들어온 문자를 인트 배열로 바꿔줌 */
        for(int i=0; i< beforeAArray.length; i++){
            aArray[i] = Integer.parseInt(beforeAArray[i]);
        }
        
        /* 이진탐색을 위한 오름차순으로 정렬 */
        Arrays.sort(aArray);
        
        int m = Integer.parseInt(br.readLine()); // M개의 수
        String[] beforeComArray = br.readLine().split(" ");
        int[] compareArray = new int[m];
        
        /* 스트링 배열로 들어온 문자를 인트 배열로 바꿔줌 */
        for(int j=0; j<beforeComArray.length; j++){
            compareArray[j] = Integer.parseInt(beforeComArray[j]); // 주어질 수에 대한 배열
        }
        
        for(int i =0; i<compareArray.length; i++){ // 지금부터 주어진 수가 aArray 배열에 담긴 수와 일치하는지 반복문을 통해 찾을 것이다.
            int flag = 0;
            
            /* max와 min을 밖에다 선언해주면 while문이 돌지 않는다.(max, min 값을 계속 초기화 해주어야 반복함)*/
            /* 왜냐하면 for문 밖에 max와 min을 선언해두면 while문이 한 번 false가 되었을 때, break 되기 때문에 다시 돌지 않는다*/
            int max = n; // 이진 탐색 결과 후 새 중간값을 구하기 위한 최대값, n을 하는 이유는 배열의 마지막 번째 수인 n-1번째 배열 값을 체크하기 위해서
            int min = -1; // 이진 탐색 결과 후 새 중간값을 구하기 위한 최소값, -1을 하는 이유는 0번째 배열값을 체크하기 위해서
            int middle; 
            
            while(max - min > 1){ // max와 min 차이가 2 이상 나지 않으면 max와 min 사이에 정수가 존재하지 않는다.
                middle = (min+max)/2; // 이진탐색의 중간값
                
                if(compareArray[i] == aArray[middle]){
                    flag = 1; // 주어진 수가 aArray배열 안에 담겨 있으면 1로 break 아니면 0 출력
                    break;
                }
                if(compareArray[i] > aArray[middle]){ // 주어진 수가 중간값보다 크면 중간값이 최소값이 된다.
                    min = middle;
                }else if(compareArray[i] < aArray[middle]){ // 주어진 수가 중간값보다 작으면 중간값이 최대값이 된다.
                    max = middle;
                }
                
            }
            System.out.println(flag);
            
        }
    }
}
