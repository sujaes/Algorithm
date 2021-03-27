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
		while(true) {	//Ŀ�� �ð� �迭��ŭ
			if(pq.size()<n && i < coffee_times.length) {	//pq�� �ڸ����ְ� ��� Ŀ�ǽð��� �� ������ �������
				System.out.println("ť�� ���� " +coffee_times[i] );
				pq.add(new Coffee(i,coffee_times[i]));
				i++;
				count++;
			}else {
				int spt = pq.peek().spendingtime;
				int sptind= pq.peek().index;
				int size = pq.size();
				for(int k = 0 ; k < size; k++) {		//ť �����ŭ
					if(spt == pq.peek().spendingtime) {
						Coffee c = pq.poll();
						System.out.println("ť���� ���� " +c.spendingtime );

						answer[ind] = c.index +1;
						ind++;
					}else {
						Coffee c = pq.poll();
						System.out.println("ť���� �ð����� " + (c.spendingtime - spt) );

						pq.add(new Coffee(c.index,c.spendingtime- spt));
					}
				}
			}
			
			if(pq.isEmpty() && count == coffee_times.length) {
				System.out.println("pq�� ����ְ�  ��� ���� ť�� �����");
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
//		System.out.println("���� �� ť���� ����" +pq.peek().spendingtime );
//		answer[ind] = pq.peek().index;
//		ind++;
//		pq.poll();
//	}else {
//		int size = pq.size();
//		for(int j = 0 ; j < size;j++) {
//			Coffee c = pq.poll();
//			System.out.println("ť �ð� ���� " + c.spendingtime +" -> " + (c.spendingtime-min));
//			pq.add(new Coffee(c.index,c.spendingtime- min));
//		}
//		break;
//	}
//}
