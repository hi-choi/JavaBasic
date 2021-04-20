package hi_choi.basic.sungjuk;

// 성적 서비스 V3
// 입력, 처리, 출력, 수정, 삭제 기능 구현
// 프로그램 메뉴 출력 기능 구현
// 파일입출력 + 직렬화 기능 추가
public interface SungJukServiceV3 extends SungJukServiceV2 {

    //자바직렬화
    void initSungJuk();
    void saveSungJuk();

    //csv 직렬화
    void initSungJuk2();
    void saveSungJuk2();

    //json 직렬화
    void initSungJuk3();
    void saveSungJuk3();
}

