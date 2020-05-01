import java.util.*;
public class Q1963{
	static Queue<Integer> q;
	static boolean visited[];
	static int dp[] ;
	static List<Integer> list = new ArrayList<Integer>();
	static boolean check;
	
	public static void prime(){
		for(int k=1000;k<10000;k++){
			boolean flag = true;
			for (int i = 2; i < (int) Math.sqrt(k); i++) {
				if (k % i == 0) {
					flag = false;
					break;
				}
			}
			if(flag){
				list.add(k);
			}
		}
	}
	
	public static void bfs(int s,int e){
		q.offer(s);
		visited[s] = true;
		while(!q.isEmpty()){
//			System.out.println("q»çÀÌÁî = " + q.size());
			int num = q.poll();
			if(num==e){
				check = true;
               break; 
			}
			for(int i = 0 ; i <4; i++){
				for(int j=0;j<=9;j++){
					if(i==0 && j==0){
						continue;
					}
					StringBuilder sb= new StringBuilder(String.valueOf(num));
					sb.setCharAt(i,(char)(j+'0'));					
					int temp = Integer.parseInt(sb.toString());
					if(list.contains(temp) && !visited[temp]){
						dp[temp] = dp[num]+1;
//						System.out.println("temp  = " + temp);
//						System.out.println("dp[temp] = "+ dp[temp]);
						visited[temp] = true;
						q.add(temp);
						
					}
				}
			}
		}
		
		
		
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		prime();
		
		for(int i = 0 ; i < t; i++){
			int start = sc.nextInt();
			int end = sc.nextInt();
			dp = new int[10000];
			visited = new boolean[10000];
			q = new LinkedList<Integer>();
			check = false;
			bfs(start,end);
			if(!check){
				System.out.println("Impossible");
			}else{
				System.out.println(dp[end]);
			}

		}
		
	}
}