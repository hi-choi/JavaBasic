package hi_choi.basic.day04;
import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		
		// 구구단 출력하기
		// ex) 7단을 출력하세요 v1
		System.out.println("7 × 1 = 7");
		System.out.println("7 × 2 = 14");
		System.out.println("7 × 3 = 21");
		System.out.println("7 × 4 = 28");
		System.out.println("7 × 5 = 35");
		System.out.println("7 × 6 = 42");
		System.out.println("7 × 7 = 49");
		System.out.println("7 × 8 = 56");
		System.out.println("7 × 9 = 63");
		System.out.println("----- -----");
		
		// ex) 7단을 출력하세요 v2 - for
		for (int i = 1 ; i < 10 ; i++) {
			System.out.printf("7 × %d = %d\n", i, 7 * i);
		}
		System.out.println("----- -----");
		
		// ex) 7단을 출력하세요 v3 - while, printf
		int i = 1;
		String fmt = "7 × %d = %d\n";
		while (i < 10) {
			System.out.printf(fmt, i, 7 * i);
			i++;
		}
		System.out.println("----- -----");
		
		// ex) 3단을 출력하세요 - while, printf
		i = 1;
		fmt = "3 × %d = %2d\n";
		while (i < 10) {
			System.out.printf(fmt, i, 3 * i);
			i++;
		}
		System.out.println("----- -----");
		
		// 구구단 프로그램 v1
		// 사용자로부터 숫자(1 ~ 9)를 하나 입력 받아,
		// 구구단을 출력하는 프로그램 작성
		// scanner, while, printf
		
	
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 구구단의 단을 입력하세요 : ");
		int dan = sc.nextInt();
		i = 1;
		fmt = "%d × %d = %2d\n";
		while (i <= 9 ) {
			System.out.printf(fmt, dan, i, (i * dan));
			i++;
		}
		
		// 구구단 프로그램 v2
		// 단, 1 ~ 9 이외의 숫자나 문자를 입력 받으면
		// "잘못 입력하셨습니다!!"라는 메시지를 출력하도록 합니다.
		
		System.out.print("출력할 구구단의 단을 입력하세요2 : ");
		char dan2 = sc.next().charAt(0);
		// 입력받은 문자열 중 첫번째 글자만 뽑아서
		// char형 변수에 대입
		
		// 입력받은 문자의 ASCII 코드값이 49~57인지 검사
		String result = (dan2 >= 49 && dan2 <= 57) ? "구구단출력" : "잘못출력하셨습니다.";
		System.out.println(result);
		
		
		// 구구단 프로그램 v3
		// 단, 1 ~ 9 이외의 숫자나 문자를 입력 받으면
		// "잘못 입력하셨습니다!!"라는 메시지를 출력하도록 합니다.
		
		System.out.print("출력할 구구단의 단을 입력하세요3 : ");
	
		String dan3 = sc.next();		
		i = 1;
		try {

			while(i <= 9) {
				System.out.printf(fmt, Integer.parseInt(dan3), i, (Integer.parseInt(dan3) * i));
				i++;
			}
		} catch(Exception ex){
			System.out.println("잘못입력하셨습니다!");
			
		}
		// 예외처리코드(try-catch)를 이용해서
		// 프로그램 실행중 오류발생시제어를
		// catch 코드쪽으로 넘김
		
		// ex) 주민번호를 이용해서 성별을 출력하는 코드를 작성하세요
		// 주민번호 123456-7654321에서 7이 성별을 나타내는 코드
		// 1 : 1999년 이전에 출생한 남자
		// 2 : 1999년 이전에 출생한 여자
		// 3 : 2000년 이후에 출생한 남자
		// 4 : 2000년 이후에 출생한 여자
		// charAt를 이용해서 풀어보세요.
		String jumin = "123456-3234657";
		char gender = jumin.charAt(7);
		result = gender=='1'? "1999남자":
				 gender=='2'? "1999여자":
				 gender=='3'? "2000남자":"2000여자";
		System.out.println(result);
		
		/*
		System.out.println(dan2 + "" + (int)dan2);
		i = 1;
		fmt = "%d × %d = %2d\n";
		
		
		
		while(true)
		{
			dan=sc.nextInt();
			
			if(dan >= 1 && dan <= 9) {
				while(i < 10) {
				System.out.printf(fmt, dan, i, dan * i);
				i++;
				}
				sc.close();
				break;
			}
			else {
				System.out.println("잘못된 숫자를 입력하셨습니다.");
				break;
			}
			

		}
		
		*/
		
	}
}
