import java.util.Scanner;

public class Q2839 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //요구 kg

        sc.close();

        if(n>=3 & n<=5000){ //입력 값 범위 체크

            if(n%5 == 0){ //5kg 봉지만 사용해도 운반 가능할때

                System.out.println(n/5);

                return;

            }else{ //5kg 봉지만으로는 운반 못할 때

                //5kg 봉지와 3kg 봉지 합쳐서 운반 가능할 때

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

            if(n%3 ==0)//3kg 봉지만으로 운반가능할 때

                System.out.println(n/3);

            else //운반 불가

                System.out.println(-1);

        }

        return;

    }

}
