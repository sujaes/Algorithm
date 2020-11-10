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

			int docuCount = sc.nextInt(); // ������ ����
			int docuNumber = sc.nextInt(); // ��ȸ�� ���ϴ� ������ ��ȣ

			for (int j = 0; j < docuCount; j++) {
				int pri = sc.nextInt();
				queue.add(new Document(j, pri)); // ������ ��ȣ�� �� ������ �켱���� �ο�
			} 

			int result = 1;

			while (!queue.isEmpty()) {
				Document currentDocu = (Document) queue.poll(); // ���� �տ��ִ� ������ ����
				boolean check = true; // ������ �켱������ Ȯ���ϴ� ����

				Iterator it = queue.iterator();
				while (it.hasNext()) {
					Document value = (Document) it.next();
					if (currentDocu.pri < value.pri) { // ���� ������ �켱�������� �켱������ ū ������ �ִٸ�,
						check = false;
						break; // ���ͷ����� Ž���� ������

					}
				}

				if (check == false) { // ���繮������ ���� �켱������ ���� ������ �߰��ߴٸ�
					queue.add(currentDocu); // ���� ������ �� �ڷ� ����
				}

				else {
					if (currentDocu.docuNumber == docuNumber) { // ���� ������ ��ȣ�� ã������ ������ ��ȣ�� �����ϴٸ�
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
	int docuNumber; // ������ ������ȣ
	int pri; // �켱����

	public Document(int docuNumber, int pri) {
		this.docuNumber = docuNumber;
		this.pri = pri;
	}
}