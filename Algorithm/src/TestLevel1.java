import java.util.*;

public class TestLevel1 {
    public int[] solution(int []arr) {
        int[] temp = new int[arr.length];
        int count = 1;
        temp[0] = arr[0];
        for(int i = 0 ; i < arr.length-1;i++){
            if(arr[i] == arr[i+1]){
                continue;
            }else{
                temp[count] = arr[i+1];
                count++;                
            }
        }
        if(arr[arr.length-1] != arr[arr.length -2]){
            temp[count] = arr[arr.length-1];
            count++;
        }

        int answer[] = new int[count];
        for(int i = 0 ; i < count;i++){
            answer[i] = temp[i];
        }

        return answer;
    }
}