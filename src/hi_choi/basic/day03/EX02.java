package hi_choi.basic.day03;

public class EX02 {
	public static void main(String[] args) {
		//7
		boolean fmt;
		
		System.out.println("가. " + (3 + 4.5 * 2 + 27 /8));
		System.out.println("나. " + (true || false && 3 < 4 || !(5==7)));
		fmt = true || (3 < 5 && 6 >= 2); 
		System.out.println("다. " + fmt);
		//System.out.println("라. " + !true > 'A'); // 잘못된 비교대상으로 오류
		
		//단일문자를 수식에 사용하면
		//자동으로 숫자형으로 바뀜
		//숫자형으로 변환시 ASCII 코드 참조함
		//0 : 48, A : 65, a : 97
		//Z : 90, D : 68, M : 77
		System.out.println("마. " + (7 % 4 + 3 - 2 / 6 * 'z'));

		
		System.out.println("바. " + ('D' + 1 + 'M' % 2 / 3));
		System.out.println("사. " + (5.0 / 3 + 3 / 3));
		System.out.println("아. " + (53 % 21 < 45 / 18));
		fmt=(4<6)||true && false || false && (2 > 3);
		System.out.println("자. " + fmt);
		System.out.println("차. " + (7 - (3 + 8 * 6 + 3) - (2 + 5 * 2)));
		
		

		
		//8
		
		System.out.print("May 13, 2021 fell on day number");
		
		//특정연도 -1의 12월31일의 요일 출력
		//0 : 일, 1 : 월, ... , 6 : 토
		//따라서, 특정연도의 1월 1일의 요일 출력하려면
		//계산식 결과에 +1을 해주면 됌.
		System.out.println( ( (13 + (13 * 3 - 1) / 5 + 2021 % 100 + 2021 % 100 / 4 + 2021 / 400 - 2 * (2021 / 100) ) % 7 + 7) % 7);
		System.out.print("Check out this line ");
		System.out.println(" //hello there" + '9' + 7);	// '9'와 7이 int가 아님
		
		//H와 I 사이 산술연산자로 인해
		//H와 I가 숫자형으로 변환되어 + 연산이 수행됨 (72+73)
		System.out.print('H' + 'I' + "is" + 1 + "more example");
		System.out.print('H' + 6.5 + 'I' + "is" +1 + "more example");
		
		//System.out.print("Print both of us", "Me too");		// 두 개의 출력문 사용해야함
		System.out.print("Reverse" + 'I' + 'T');
		System.out.print("No! Here is " +1 + "more example");
		//System.out.println("Here is" + 10 * 10)) // that's 100 // 괄호 갯수 오류, 세미콜론 붙여야함
		System.out.println("Not x is" + true); //that's true
		//System.out.print();		// 출력할 대상이 지정되지 않았으므로 오류발생! ()안에 인자 필요
		//System.out.println;		// 괄호가 필요!
		//System.out.print("How about this one" ++ '?' + 'Huh?');	// 문자열에 사용할 수 없는 증감연산자를 사용했음		
	}
}
