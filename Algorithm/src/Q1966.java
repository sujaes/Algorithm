import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q1966 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		Queue queue = new LinkedList();

		for (int i = 0; i < testCase; i++) {

			int docuCount = sc.nextInt(); // 문서의 갯수
			int docuNumber = sc.nextInt(); // 조회를 원하는 문서의 번호

			for (int j = 0; j < docuCount; j++) {
				int pri = sc.nextInt();
				queue.add(new Document(j, pri)); // 문서의 번호와 그 문서의 우선순위 부여
			} 

			int result = 1;

			while (!queue.isEmpty()) {
				Document currentDocu = (Document) queue.poll(); // 가장 앞에있는 문서를 꺼냄
				boolean check = true; // 문서의 우선순위를 확인하는 변수

				Iterator it = queue.iterator();
				while (it.hasNext()) {
					Document value = (Document) it.next();
					if (currentDocu.pri < value.pri) { // 현재 문서의 우선순위보다 우선순위가 큰 문서가 있다면,
						check = false;
						break; // 이터레이터 탐색을 종료함

					}
				}

				if (check == false) { // 현재문서보다 높은 우선순위를 가진 문서를 발견했다면
					queue.add(currentDocu); // 현재 문서를 맨 뒤로 보냄
				}

				else {
					if (currentDocu.docuNumber == docuNumber) { // 현재 문서의 번호와 찾으려는 문서의 번호가 동일하다면
						System.out.println(result);
					} else {
						result++;
					}

				}

			}

		}

	}

}

class Document {
	int docuNumber; // 문서의 문서번호
	int pri; // 우선순위

	public Document(int docuNumber, int pri) {
		this.docuNumber = docuNumber;
		this.pri = pri;
	}
}