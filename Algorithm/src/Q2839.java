import java.util.Scanner;

public class Q2839 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //�䱸 kg

        sc.close();

        if(n>=3 & n<=5000){ //�Է� �� ���� üũ

            if(n%5 == 0){ //5kg ������ ����ص� ��� �����Ҷ�

                System.out.println(n/5);

                return;

            }else{ //5kg ���������δ� ��� ���� ��

                //5kg ������ 3kg ���� ���ļ� ��� ������ ��

                int num5 = n/5;

                for(int i = num5; i>0; i--){

                    int left = n - i * 5;

                    if(left % 3 == 0){

                        int num3 = left / 3;

                        System.out.println(num3+i);

                        return;

                    }else

                        continue;

                }

            }

            if(n%3 ==0)//3kg ���������� ��ݰ����� ��

                System.out.println(n/3);

            else //��� �Ұ�

                System.out.println(-1);

        }

        return;

    }

}
