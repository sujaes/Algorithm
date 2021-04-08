
//11652�� ���� �� ���� �˾���
import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class Q11652{
	public static void main(String args[]) throws Exception {
		// ���۸� �̿��ؼ� �Է� ���� ����
		// (���� : Scanner�� �̿��ϸ� �ſ� ������ ����)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		BigInteger[] inputs = new BigInteger[N];

		for (int i = 0; i < N; i++) {
			inputs[i] = new BigInteger(br.readLine());
		}

		br.close();

		// �Է� ������ ������������ ����
		Arrays.sort(inputs);

		// ������ ���� ���� 0�� ���������� ����
		BigInteger preNumber = inputs[0];

		// �������� �ݺ��Ǵ� Ƚ���� ���� �� ����
		int numberCounts = 0;

		// ���� ���� ������ �������� ���� ���� �� ����
		BigInteger withMostNumber = BigInteger.ZERO;

		// ���� ���� ������ �������� �ݺ��Ǵ� Ƚ���� ���� �� ����
		int withMostNumberCounts = 0;

		for (int i = 0; i < N; i++) {
			// ���� ������ ���� ���� ������ ���� ���� ���ڰ� �ƴ϶��
			if (!preNumber.equals(inputs[i])) {
				// ���� ���� �ݺ� Ƚ���� ���� ���� ������ �������� �ݺ� Ƚ�� ���� Ŭ ��쿡��
				if (numberCounts > withMostNumberCounts) {
					// ���� ���� ������ �������� �ݺ� Ƚ���� ����
					withMostNumberCounts = numberCounts;

					// ���� ���� ������ �������� ���� ����
					withMostNumber = preNumber;
				}

				// �������� �ݺ� Ƚ�� �ʱ�ȭ
				numberCounts = 1;

				// ���� ���� ���� ������ ����
				preNumber = inputs[i];
			}

			else {
				numberCounts++;
			}
		}

		// �Է� ���� ������ ������ ���� �񱳵��� �ʰ� ���������Ƿ� ���������� ��
		if (numberCounts > withMostNumberCounts) {
			withMostNumberCounts = numberCounts;
			withMostNumber = preNumber;
		}

		// ��� �� ��� (���� ���� ������ ������ ��)
		System.out.println(withMostNumber);
	}
}
