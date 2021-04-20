package hi_choi.basic.day16;

import hi_choi.basic.sungjuk.SungJukServiceV3;
import hi_choi.basic.sungjuk.SungJukServiceV3Impl;
import hi_choi.basic.sungjuk.SungJukVO;

import java.util.Scanner;

public class SungJukV7CMain {

    // 성적처리프로그램 v7b - ArrayList + 텍스트기반스트림
    // 입력한 성적데이터를 JSON직렬화를 통해 텍스트 기반 파일에 저장
    // JSON직렬화 : 각 데이터항목을 반정형형식으로 파일에 저장하는 방식
    // { 항목명1 : 항목값1, 항목명2 : 항목값2, 항목명3 : 항목값3, ...}
    // SungJukServiceV3
    // initSungJuk3, saveSungJuk3 (파일처리/json직렬화) 추가
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SungJukServiceV3 sjsrv = SungJukServiceV3Impl.getInstance();

        String menu ="";
        SungJukVO sj = null;
        sjsrv.initSungJuk3();

        while(true) {
            sjsrv.displayMenu();
            menu = sc.next();

            switch(menu)
            {
                case "1" : sjsrv.newSungJuk();break;
                case "2" : sjsrv.showSungJuk();break;
                case "3" : sjsrv.showOneSungJuk();break;
                case "4" : sjsrv.modifySungJuk();break;
                case "5" : sjsrv.removeSungJuk();break;
                case "0" : sjsrv.saveSungJuk3(); System.exit(0);break;
                default :
                    System.out.println("잘못 입력하셨습니다.");
            }
        }
    }
}
