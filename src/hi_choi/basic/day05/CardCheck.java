package hi_choi.basic.day05;
import java.util.Scanner;

public class CardCheck {
// 문자열.charat(자릿수) : 지정한 자릿수의 문자하나 추출
	public static void main(String[] args) {
		// 신용카드 번호의 첫글자를 보고
		// 어떤 종류와 은행인지 알려주는 프로그램
		// 3 : JCB카드
		// 4 : Visa카드
		// 5 : Master카드
		
		System.out.print("카드번호를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		String cardnum = sc.next();
		String cardtype = "";
		String cardbank = "";
		String fmt = "카드종류는 %s 이고요, %s 입니다.";
		/*
		if(cardnum.charAt(0)=='3') {
			cardtype = "JCB카드";
			switch(cardnum.charAt(5)) {
			case '7' : cardbank = "NH농협카드"; break;
			case '1' : cardbank = "신한카드"; break;
			case '2' : cardbank = "KB국민카드"; break;	
			}
		}
		else if (cardnum.charAt(0)=='4') {
			cardtype = "Visa카드";
			switch(cardnum.charAt(1)) {
			case '0' : cardbank = "비씨카드"; break;
			case '3' : cardbank = "신한카드"; break;
			case '5' : cardbank = "국민은행"; break;	
			}
		}
		else if (cardnum.charAt(0)=='5') {
			cardtype = "Master카드";
			switch(cardnum.charAt(1)) {
			case '1' : cardbank = "신한카드"; break;
			case '2' : cardbank = "외한카드"; break;
			case '4' : cardbank = "국민은행"; break;	
			}
		}
		*/
		switch(cardnum.charAt(0)) {
			case '3' : cardtype = "JCB카드"; break;
			case '4' : cardtype = "Visa카드"; break;
			case '5' : cardtype = "Master카드"; break;
		} // switch

		switch(cardnum) {
			case "356317" : cardbank = "NH농협카드"; break;
			case "356901" : cardbank = "신한카드"; break;
			case "356912" : cardbank = "KB국민카드"; break;
			case "404825" : cardbank = "비씨카드"; break;
			case "438676" : cardbank = "신한카드"; break;
			case "457973" : cardbank = "국민은행"; break;
			case "515594" : cardbank = "신한카드"; break;
			case "524353" : cardbank = "외한카드"; break;
			case "540926" : cardbank = "국민은행"; break;
		}
		
		System.out.printf(fmt, cardtype, cardbank);
	} // main

}
