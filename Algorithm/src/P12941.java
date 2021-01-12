//class Solution
//{
//   public static int solution(int []A, int []B)
//		    {
//		        int answer = 0;
//		        min_arr(A);
//		        max_arr(B);
//		        for(int i=0;i<A.length;i++) {
//		        	//차례대로 곱한후 누적 저장한다.
//		        		answer=answer+(A[i]*B[i]);
//		        	
//		        }
//		        System.out.println(answer);
//
//		        return answer;
//		    }
//		//오름차순 정렬 클래스
//		 static int[] min_arr(int[] A) {
//			 int min=A[0];
//			for(int i=0;i<A.length;i++) {
//				for(int j=i+1;j<A.length;j++) {
//				if(A[i]<A[j]) {
//					min=A[i];
//					A[i]=A[j];
//					A[j]=min;
//					
//				}}
//			}
//			return A;
//		 }
//         //내림차순정렬 클래스
//		 static int[] max_arr(int[] A) {
//			 int max=A[0];
//			for(int i=0;i<A.length;i++) {
//				for(int j=i+1;j<A.length;j++) {
//				if(A[i]>A[j]) {
//					max=A[i];
//					A[i]=A[j];
//					A[j]=max;
//					
//				}}
//			}
//			return A;
//		 }
//		 
//}