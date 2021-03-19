package hi_choi.basic.day03;

public class EX03 {

	public static void main(String[] args) {
		
		//9. 
		System.out.print("가. ");
		System.out.println(true && false && true || true);
		System.out.print("나. ");
		System.out.println(true || true && true && false);	//false 아님? 이해 안됨 질문 할 것!
		System.out.print("다. ");
		System.out.println((true && false) || (true && !false) || (false && !false));
		System.out.print("라. ");
		System.out.println((2<3)||(5>2) && !(4==4) || 9 !=4);
		System.out.print("마. ");
		System.out.println(6==9||5<6&&8<4||4>3);
		
		//10.
		System.out.print("가. ");
		System.out.println(27 / 13 + 4);
		System.out.print("나. ");
		System.out.println(27 / 13 +4.0);
		System.out.print("다. ");
		System.out.println(42.7 % 3 + 18);
		System.out.print("라. ");
		//System.out.println((3 < 4) && 5 / 8);	// 좌항은 boolean 우항은 int이므로 자료형 불일치
		System.out.print("마. ");
		System.out.println(23 / 5 + 23 / 5.0);
		System.out.print("바. ");
		System.out.println(2.0+'a');	// 아스키코드 'a'는 97이므로 97+2.0 = 99.0
		System.out.print("사. ");
		System.out.println(2+'a');		// 아스키코드 'a'는 97이므로 2+97 = 99
		System.out.print("아. ");
		System.out.println('a'+'b');	// 아스키코드 97+98=195
		System.out.print("자. ");		
		System.out.println('a'/'b');	// 아스키코드 97/98=0
		System.out.print("차. ");
		//System.out.println('a' && !'b');	// char 자료형에는 ! 연산자 사용 불가능
		System.out.print("카. ");
		System.out.println((double) 'a' / 'b');	// 아스키코드 97÷98=0
		
	}

}
