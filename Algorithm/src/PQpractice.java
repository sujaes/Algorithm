import java.util.*;
public class PQpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n = 3;
//		int coffee_times[] = {4,2,2,5,3};
		int n = 1;
		int coffee_times[] = {100,1,50,1,1};
		int answer[] = new int[coffee_times.length];
		PriorityQueue<Coffee> pq = new PriorityQueue<Coffee>();
		int i= 0;
		int ind = 0;
		int count = 0;
		while(true) {	//커피 시간 배열만큼
			if(pq.size()<n && i < coffee_times.length) {	//pq에 자리가있고 모든 커피시간을 다 보내지 않은경우
				System.out.println("큐에 삽입 " +coffee_times[i] );
				pq.add(new Coffee(i,coffee_times[i]));
				i++;
				count++;
			}else {
				int spt = pq.peek().spendingtime;
				int sptind= pq.peek().index;
				int size = pq.size();
				for(int k = 0 ; k < size; k++) {		//큐 사이즈만큼
					if(spt == pq.peek().spendingtime) {
						Coffee c = pq.poll();
						System.out.println("큐에서 삭제 " +c.spendingtime );

						answer[ind] = c.index +1;
						ind++;
					}else {
						Coffee c = pq.poll();
						System.out.println("큐에서 시간갱신 " + (c.spendingtime - spt) );

						pq.add(new Coffee(c.index,c.spendingtime- spt));
					}
				}
			}
			
			if(pq.isEmpty() && count == coffee_times.length) {
				System.out.println("pq가 비어있고  모든 값이 큐에 들어간경우");
				break;
			}
			
		}

		
		for(int j = 0 ; j < coffee_times.length;j++) {
			System.out.print((answer[j]) + " ");
		}
		
	}
	public static class Coffee implements Comparable<Coffee>{
		int index;
		int spendingtime;
		public Coffee(int index, int spendingtime) {
			this.index = index;
			this.spendingtime = spendingtime;
		}
		@Override
		public int compareTo(Coffee o) {
			// TODO Auto-generated method stub
			return this.spendingtime - o.spendingtime;
		}
	}
}





//while(true) {
//	if(pq.peek().spendingtime == min) {
//		System.out.println("같은 값 큐에서 삭제" +pq.peek().spendingtime );
//		answer[ind] = pq.peek().index;
//		ind++;
//		pq.poll();
//	}else {
//		int size = pq.size();
//		for(int j = 0 ; j < size;j++) {
//			Coffee c = pq.poll();
//			System.out.println("큐 시간 수정 " + c.spendingtime +" -> " + (c.spendingtime-min));
//			pq.add(new Coffee(c.index,c.spendingtime- min));
//		}
//		break;
//	}
//}
