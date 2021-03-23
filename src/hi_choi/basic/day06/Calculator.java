package hi_choi.basic.day06;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // 간단한 계산 프로그램 작성
        // ex) 두 수를 입력받아 더하기를 수행 v1
        /*
        int a, b;

        Scanner sc = new Scanner(System.in);
        System.out.println("두수를 입력해주세요.");
        System.out.print("첫번째 숫자는? ");
        a = sc.nextInt();
        System.out.print("두번째 숫자는? ");
        b = sc.nextInt();

        int sum = a + b;
        String fmt = "입력받은 수는 각각 %d, %d이고, 두 수의 총합은 %d입니다.";
        System.out.printf(fmt, a, b, sum);
        */
        // ex) 두 수를 입력받아 더하기를 수행하는 프로그램 작성 v2
        plusTwo1();

    }
    
    // 두 수를 입력받아 더하기를 수행하는 메서드
    public static void plusTwo1(){
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("두수를 입력해주세요.");
        System.out.print("첫번째 숫자는? ");
        a = sc.nextInt();
        System.out.print("두번째 숫자는? ");
        b = sc.nextInt();

        int sum = a + b;
        String fmt = "입력받은 수는 각각 %d, %d이고, 두 수의 총합은 %d입니다.";
        System.out.printf(fmt, a, b, sum);
    }
}
