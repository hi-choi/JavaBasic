package hi_choi.basic.day14;

import java.util.Scanner;

public class EX07 {
    public static void main(String[] args) {
        // 두수를 입력받아 두 사이의 모든 값의
        // 총합을 구하는 코드 작성
        // ex1) 10, 3 => 3, 4, 5, 6, 7, 8, 9, 10에 대한 총합
        // ex2) 3, 10 => 3, 4, 5, 6, 7, 8, 9, 10에 대한 총합

        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자는? ");
        int num1 = sc.nextInt();
        System.out.print("두번째 숫자는? ");
        int num2 = sc.nextInt();


        int begin = num1;
        int end = num2;

        if (num1 > num2) {
            begin = num2; end = num1;
        }

        int sum = 0;

        for (int i=begin; i <= end ; ++i)
            sum +=i;

        String fmt = "%d와 %d 사이의 합은 %d";
        System.out.printf(fmt, num1, num2, sum);
        System.out.println("");

        // 가우스 덧셈공식을 이용
        sum = (num1 + num2) * (Math.abs(num1 - num2) + 1 ) / 2;
        System.out.printf(fmt, num1, num2, sum);
        System.out.println("");

        /*
        sum=0;
        int std=0;

        if (num1 >= num2) {
            std = num1;
            while(std >= num2){
                sum = sum + num2;
                num2++;
            }
        }
        else {
            std = num2;
            while(std >= num1){
                sum = sum + num1;
                num1++;
            }
        }

        String fmt = "%d와 %d 사이의 합은 %d";
        System.out.printf(fmt, num1, num2, sum);
*/
    }
}
