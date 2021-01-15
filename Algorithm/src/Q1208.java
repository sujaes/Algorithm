import java.io.*;
import java.util.*;
public class Q1208 {
    static int n,s;
    static long cnt=0;
    static int arr[];
    static ArrayList<Integer> left = new ArrayList<>();
    static ArrayList<Integer> right = new ArrayList<>();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] t = br.readLine().split(" ");
        n = Integer.parseInt(t[0]);
        s = Integer.parseInt(t[1]);
        arr = new int[n];
        
        String[] input = br.readLine().split(" ");
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        dfs(0,n/2,0,left);
        dfs(n/2,n,0,right);
        Collections.sort(left);
        Collections.sort(right);
 
        int left_idx =0;
        int right_idx = right.size()-1;
        
        
        while(left_idx<left.size() && right_idx>=0) {
            int left_sum = left.get(left_idx);
            int right_sum = right.get(right_idx);
            long left_cnt =0;
            long right_cnt = 0;
            if(left_sum+right_sum == s) {
                while(left_idx<left.size() && left.get(left_idx)==left_sum) {
                    left_idx++;
                    left_cnt++;
                }
                while(right_idx>=0 && right.get(right_idx)==right_sum) {
                    right_cnt++;
                    right_idx--;
                }
                cnt+=left_cnt*right_cnt;
                
            }
            else if(left_sum+right_sum>s) {
                right_idx--;
            }
            else if(left_sum+right_sum<s) {
                left_idx++;
            }
        }
        if(s==0) {
            cnt-=1;
        }
        System.out.println(cnt);
    }
    public static void dfs(int level, int end, int sum ,ArrayList<Integer>list) {
        if(level == end) {
            list.add(sum);
            return ;
        }
        dfs(level+1,end,sum+arr[level],list);
        dfs(level+1,end,sum,list);
    }
}