package hi_choi.basic.day18;

import hi_choi.basic.sungjuk.*;

import java.util.Scanner;

public class SungJukV8Main {

    // 성적처리프로그램 v8 - JDBC 프로그래밍
    // 입력한 성적데이터를 DBMS를 이용해서 관리함
    // 따라서, 프로그램 종료시 입력했던 데이터는 그대로 유지됨

    // 새로운 프로그래밍 패턴 토입 : 3 layer architecture
    // 프레젠테이션 - 비즈니스 로직 - 데이터 액세스
    //                   ~Service       ~DAO
    // SungJukDAO (insertSungJuk, selectSungJuk,
    // selectOneSungJuk, updateSungJuk, deleteSungJuk)


    // SungJukServiceV4
    // JDBCUtil (JDBC관련 정보 및 객체 생성)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SungJukServiceV4 sjsrv = SungJukServiceV4Impl.getInstance();

        String menu ="";
        SungJukVO sj = null;

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
                case "0" : System.exit(0);break;
                default :
                    System.out.println("잘못 입력하셨습니다.");
            }
        }
    }
}
