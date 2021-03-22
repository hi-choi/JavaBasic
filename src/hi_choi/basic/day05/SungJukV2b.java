package hi_choi.basic.day05;

// 성적처리프로그램 v2b
// 성적처리시 학점계싼을 switch문으로 작성
// 반복문을 이용해서 성적데이터입력을 계속 수행함
import java.util.Scanner;

public class SungJukV2b {

	public static void main(String[] args) {
		// 변수선언
		String name;
		int kor, eng, mat, tot;
		double avg;
		char grd = '가';
		String fmt = "%s, %d, %d, %d\n" + "%d, %.1f, %c\n";
		
		// 성적처리
		Scanner sc = new Scanner(System.in);
		int i = 1;
		while(i<=3) {	// while문의 조건식을 true로 설정하면
						// 횟수 지정없이 계속 코드를 실행함
			System.out.print("이름은? ");
			name = sc.next();
			System.out.print("국어는? ");
			kor = sc.nextInt();
			System.out.print("영어는? ");
			eng = sc.nextInt();
			System.out.print("수학은? ");
			mat = sc.nextInt();
			
			tot = kor + eng + mat;
			avg = (double)tot/3;
			
			/*
			if (avg >= 90) grd = '수';
			else if (avg >= 80) grd = '우';
			else if (avg >= 70) grd = '미';
			else if (avg >= 60) grd = '양';
			else if (avg >= 50) grd = '가';
			*/
			
			// 학점계산을 switch문으로 작성
			// avg : 99.9 => (int)avg : 99
			switch((int)avg / 10) {
				case 10 : case 9 : grd = '수'; break;
				case 8 : grd = '우'; break;
				case 7 : grd = '미'; break;
				case 6 : grd = '양'; break;
				default : grd = '가'; break;
			
			}
			
			
			// 결과출력
			System.out.printf(fmt, name, kor, eng, mat, tot, avg, grd);
			i++;
		}	//while

		
		
		sc.close();
	}	// main
	
}	// class
