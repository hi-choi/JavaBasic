package hi_choi.basic.Test;
import java.util.ArrayList;
import java.util.Scanner;

public class LibraryServiceImpl implements LibraryService{


    private static LibraryService lsv = null;
    ArrayList<LibraryVO> datas = new ArrayList<>();

    public LibraryServiceImpl() {
    }


    public static LibraryService getInstance() {
        if(lsv ==null) lsv = new LibraryServiceImpl();
        return lsv;
    }


    @Override
    public void displayMenu() {
        String displaymenu =
                "==========================\n" +
                        "   도서관관리 프로그램 v1 \n" +
                        "==========================\n" +
                        "  1. 도서관데이터 입력\n" +
                        "  2. 도서관데이터 조회\n" +
                        "  3. 도서관데이터 상세조회\n" +
                        "  4. 도서관데이터 수정\n" +
                        "  5. 도서관데이터 삭제\n" +
                        "  0. 프로그램 종료\n" +
                        "==========================\n" +
                        "  작업을 선택하세요 : ";

        System.out.print(displaymenu);

    }

    @Override
    public void newLibrary() {
        Scanner sc = new Scanner(System.in);
        System.out.print("도서관명은? ");
        String lbname = sc.next();
        System.out.print("시도는? ");
        String sido = sc.next();
        System.out.print("구군은? ");
        String gugun = sc.next();
        System.out.print("도서관유형은? ");
        String lbyte = sc.next();
        System.out.print("휴관일은? ");
        String clsday = sc.next();

        System.out.print("주소는? ");
        String addr = sc.next();
        System.out.print("전화번호는? ");
        String phone = sc.next();
        System.out.print("홈페이지는? ");
        String homepage = sc.next();
        System.out.print("위도는? ");
        String lat = sc.next();
        System.out.print("경도는? ");
        String lon = sc.next();

        LibraryVO lv = new LibraryVO(lbname, sido, gugun, lbyte, clsday, addr, phone, homepage, lat, lon);
        datas.add(lv);

    }

    @Override
    public void showLibrary() {
        String fmt = "도서관명 : %s, 시도명 : %s, 구군 : %s, 도서관 유형 : %s, 휴관일 : %s\n";

        for (LibraryVO L : datas){
            System.out.printf(fmt, L.getLbname(),L.getSido(),L.getGugun(),L.getLbtype(),L.getClsday());

        }

    }

    @Override
    public void showOneLibrary() {

        Scanner sc = new Scanner(System.in);
        System.out.println("조회할 도서관명은? ");
        String lname = sc.next();

        LibraryVO ly = null;
        String fmt = "도서관명 : %s, 시도명 : %s, 구군 : %s, 도서관 유형 : %s, 휴관일 : %s, 주소 : %s, 전화번호 : %s, 홈페이지 : %s, 위도 : %s, 경도 : %s\n";

        for (LibraryVO L : datas){
            if(L.getLbname().equals(lname)){
                ly = L;
                break;
            }
        }
        System.out.printf(fmt, ly.getLbname(),ly.getSido(),ly.getGugun(),ly.getLbtype(),ly.getClsday(), ly.getAddr(),ly.getPhone(),ly.getHomepage(),ly.getLat(),ly.getLon());

    }

    @Override
    public void modifyLibrary() {

    }

    @Override
    public void removeLibrary() {

    }
}
