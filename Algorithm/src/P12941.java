//class Solution
//{
//   public static int solution(int []A, int []B)
//		    {
//		        int answer = 0;
//		        min_arr(A);
//		        max_arr(B);
//		        for(int i=0;i<A.length;i++) {
//		        	//���ʴ�� ������ ���� �����Ѵ�.
//		        		answer=answer+(A[i]*B[i]);
//		        	
//		        }
//		        System.out.println(answer);
//
//		        return answer;
//		    }
//		//�������� ���� Ŭ����
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
//         //������������ Ŭ����
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