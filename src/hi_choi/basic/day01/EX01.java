package hi_choi.basic.day01;

import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * 
 * @author hi-choi
 * 연습문제 실습
 *
 */
public class EX01 {

	public static void main(String[] args) {
		System.out.println("<1번>");
		//1.
		System.out.println("*   *    **    ****    ****    *   *      /////  ");
		System.out.println("*   *   *  *   *   *   *   *   *   *     ㅣo oㅣ ");
		System.out.println("*****  *    *  ****    ****     * *     (ㅣ ^ ㅣ)");
		System.out.println("*   *  ******  *   *   *   *     *       ㅣ[_]ㅣ ");
		System.out.println("*   *  *    *  *    *  *    *    *        -----  \n\n");
		

		System.out.println("            +---+");
		System.out.println("            │   │");
		System.out.println("        +---+---+");
		System.out.println("        │   │   │");
		System.out.println("    +---+---+---+       /\\_/\\       -----");
		System.out.println("    │   │   │   │      ( ' ' )    / Hello \\");
		System.out.println("+---+---+---+---+      (  -  )   <  Junior │ ");
		System.out.println("│   │   │   │   │       │ │ │     \\ Coder!/ ");
		System.out.println("+---+---+---+---+      (__│__)      -----");
		
		System.out.println("\n<2번>");
		
		//2.
		// 소주와 너나치킨의 갯수, 받은 금액 총 3개의 값을 입력 받음.
		System.out.println("[음식나라]");		
		System.out.println("-----------------");	
		System.out.print("소주  ");
		Scanner one = new Scanner(System.in);
		int soju_num;
		int soju=3000;
		soju_num = one.nextInt();
		System.out.println(soju_num * soju);
		
		
		System.out.print("너나치킨  ");
		Scanner two = new Scanner(System.in);
		int chi_num;
		int chi=12000;
		chi_num = two.nextInt();
		System.out.println(chi_num * chi);
		
		System.out.println("-------------------");	
		int total = soju*soju_num + chi*chi_num;
		double tax = total * 0.1;
		System.out.print("과세합계");
		System.out.printf("    %d\n", total-(int)tax);
		
		System.out.print("부가세");
		System.out.printf("       %d\n", (int)tax);
		
		System.out.println("-------------------");	
		System.out.print("총합계");
		System.out.printf("      %d\n", total);
		
		System.out.print("받은금액    ");
		Scanner three = new Scanner(System.in);
		int money;
		money = three.nextInt();
		
		System.out.print("잔돈        ");
		System.out.println(money-(int)total);
		
		System.out.println("-------------------");
		long time = System.currentTimeMillis();
		SimpleDateFormat exp = new SimpleDateFormat("yyyy.MM.dd.hh:mm:ss");
		String tm = exp.format(time);
		System.out.println(tm);
		
		one.close();
		two.close();
		three.close();
		System.out.println("\n<3번>");
		//3.
		int rate1;
		//int 1stPlayer;     // 숫자 시작 안됨
		//int myprogram.java;  // 사용 가능 기호는 _, $
		//int long;   //예약어 사용 불가능
		int TimeLimit;
		int numberOfWindows;
		
		System.out.println("\n<4번>");
		// 4.
		// 표현식 : expression
		// 계산이나 처리를 위해 작성하는 식을 의미
		// 수학에서 말하는 수식과 유사
		// 표현식의 중요한 특징은 평가 evaluate임
		// 즉, 코드의 결과를 알아내는 과정을 의미
		
		int x, y, z, s, s0, v, t, g;
		int result;
		
		x = 10;
		y = 20;
		z = 30;
		s0 = 5;
		v = 10;
		t = 15;
		g = 20;
		
		result = 3 * x;
		System.out.print("3x = ");
		System.out.println(result);
		
		result = 3 * x + y;
		System.out.print("3x+y = ");
		System.out.println(result);
		
		System.out.print("(x+y)/7 = ");
		System.out.println((x+y)/7);
		
		System.out.print("(3x+y)/(z+2) = ");
		System.out.println((3*x+y)/(z+2));
		
		s = s0 + v * t + (1/2) * g * t ^ 2;
		System.out.print("s=s0+vt+(1/2)gt^2 = ");
		System.out.println(s);
		
		/*
		int x = 2;
		int y = 3;
		int z = 4;
		int s0 = 6;
		int v0 = 7;
		int t = 3;
		int g = 2;
		double s = s0+v0*t+0.5*g*Math.pow(t, 2);
		
		System.out.print("3x = ");
		System.out.println(3*x);
		System.out.print("3x+y = ");
		System.out.println(3*x+y);
		System.out.print("(x+y)/7 = ");
		System.out.println((x+y)/7);
		System.out.print("(3x+y)/(z+2) = ");
		System.out.println((3*x+y)/(z+2));
		System.out.print("s=s0+vt+0.5gt^2 = ");
		System.out.println(s);
	
		*/
		System.out.println("\n<5번>");
		// 5.
		
		double number = (1/3)*3;
		int quotient = 7/3;
		int remainder = 7%3;
		result = 11; result /= 2;
		
		// 예상 값 : 1, 실제 값 : 0.0
		// '정수 나누기 정수'의 결과값은 정수이기 때문
		System.out.println("( 1 / 3 ) * 3 = " + number);
		
		// 예상 값 : 2.3333, 실제값 : 2
		System.out.println("7 / 3 = " + quotient);
		
		System.out.println("7 % 3 = " + remainder);
		
		// 복합대입연산자
		// 산술연산자와 대입연산자를 합쳐놓은 연산자
		// ex) a = a + 1 => a *= 1
		System.out.println("result /= 2 = " + result);
		
		
		System.out.println("\n<6번>");
		// 6. 
		double xx=2.5;
		double yy=1.5;
		int m=18;
		int n=4;
		
		System.out.println(xx+n*yy-(xx+n)*yy);
		System.out.println(m/n+m%n);
		System.out.println(5*xx-n/5);
		System.out.println(1-(1-(1-(1-(1-n)))));
	}

}
