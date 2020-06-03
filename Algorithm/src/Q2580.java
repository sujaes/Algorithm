import java.util.*;




public class Q2580 {
	static int check[][] = new int[9][9]; // 9X9 크기의 스도쿠 판을 생성한다.
	
    // 빈 칸의 정보를 가지고 있는 객체를 저장 할 ArrayList이다.
	static ArrayList<xy> arrayList = new ArrayList<>(); 
    
	//DFS를 수행 할 메소드이다. ArrayList와 인덱스 값을 인자로 전달받는다.
	static void dfs(ArrayList<xy> arr,int idx) { 
	
		if(idx == arrayList.size()) { // 재귀호출 종료 부
			for(int i=0;i<9;i++) {
				for(int j=0;j<9;j++) {
					System.out.print(check[i][j]+" "); // 스도쿠 판 출력
				}
				System.out.println("");
			}
			System.exit(0); // 여러가지의 스도쿠 판을 출력하지 않게 프로그램 종료
			
		}
		
		
		for(int i=1;i<10;i++) { // 1~9 까지 적합한지 유망성 검사하기 위한 반복
        
        
			// 유망한 숫자를 고르기 위해 3가지 체크 메소드에 전달하여 검사
			if(checkRow(arr,idx,i)==true && checkCol(arr,idx,i)==true && checkBox(arr,idx,i)==true) {	
				
				check[arr.get(idx).x][arr.get(idx).y] = i;
				dfs(arr,idx+1);				
			}
            
            // i가 9인채로 반복문이 종료되게 되면 이전에 저장되었던 번호를 지운 후 새로운 스도쿠 판을 생성
			if(i==9)
				check[arr.get(idx).x][arr.get(idx).y] = 0;
			
		}

		
		
	}
	
	
	
    // 스도쿠에서 빈칸이 포함되어 있는 가로행에 중복검사
	static boolean checkRow(ArrayList<xy> arr,int idx,int pro) {
		
		for(int i=0;i<9;i++) { // 가로행의 0~8번 인덱스를 검사				
			if(arr.get(idx).y == i) continue; // 빈칸의 열은 건너뛴다.
			
            // 후보로 전달 된 정수가 이미 스도쿠 판에 존재하는 숫자와 일치하면
            // 유망하지 않은 정수이므로 false 리턴
			if( check[arr.get(idx).x][i] == pro) return false;
		}
		return true;
	}
	
    // 스도쿠에서 빈칸이 포함되어 있는 세로열에 중복검사
	static boolean checkCol(ArrayList<xy> arr,int idx,int pro) {
    
		for(int i=0;i<9;i++) { // 세로 열의 0~8번 인덱스를 검사
			if(arr.get(idx).x == i) continue; // 빈칸의 행은 건너뛴다.
            
            // 후보로 전달 된 정수가 이미 스도쿠 판에 존재하는 숫자와 일치하면
            // 유망하지 않은 정수이므로 false 리턴
			if(check[i][arr.get(idx).y] == pro) return false;
		}
		return true;
	}
	
    // 스도쿠에서 빈칸이 포함되어 있는 3x3박스의 중복검사
	static boolean checkBox(ArrayList<xy> arr,int idx,int pro) {
    	
        // (0,0)이 빈칸인 경우, (0,0) ~ (2,2)를 검사해야 한다.
        // (1,4)가 빈칸인 경우, (0,3) ~ (2,5)를 검사해야 한다. 
        // 각 좌표를 3으로 나눠 준 후 *3을 해주면 해당 좌표가 속한 박스의 시작점이 나온다. 
		int a = arr.get(idx).x/3;
		int b = arr.get(idx).y/3;
		a*=3;
		b*=3;
		
        // 3x3크기의 박스이므로 시작점으로 부터 +3보다 작은 경우만을 반복 
		for(int i=a;i<a+3;i++) {
			for(int j=b;j<b+3;j++) {
            	// 빈 칸의 좌표는 스킵한다.
				if(i == arr.get(idx).x && j == arr.get(idx).y) continue;
                 // 후보로 전달 된 정수가 이미 스도쿠 판에 존재하는 숫자와 일치하면
           		 // 유망하지 않은 정수이므로 false 리턴
				if(check[i][j]!=0 &&check[i][j] == pro) return false;
			}
		}
		return true;
		
	}
	
	public static void main(String[] args)   {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<9;i++) { // 스도쿠 입력 부
			for(int j=0;j<9;j++) {
				check[i][j] = sc.nextInt();
			}
		}
		
		
		for(int i=0;i<9;i++) { // 스도쿠 빈칸을 ArrayList에 저장
			for(int j=0;j<9;j++) {
				if(check[i][j]==0){
					arrayList.add(new xy(i,j));
				}
			}
		}
		
		
		dfs(arrayList,0); //ArrayList와 함께 0번째 인덱스부터 스도쿠 판을 채워간다.
		
	}
	
	public static class xy{ // 입력 된 스도쿠 판의 빈 칸의 행, 열 정보를 저장 할 클래스이다.
		int x;
		int y;
		
		public xy(int x,int y) {
			this.x = x;
			this.y = y;
			
		}
	}
	
}