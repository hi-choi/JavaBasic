package hi_choi.basic.day10;

import hi_choi.basic.sungjuk.SungJukService;
import hi_choi.basic.sungjuk.SungJukServiceImpl;
import hi_choi.basic.sungjuk.SungJukVO;

public class SungJukV5bMain {
    public static void main(String[] args) {
        //SungJukService sjsrv = new SungJukServiceImpl();
        SungJukService sjsrv = SungJukServiceImpl.getInstance();
        SungJukVO sj = sjsrv.readSungJuk();
        sjsrv.computeSungJuk(sj);
        sjsrv.printSungJuk(sj);

        System.out.println(sj.toString());
    }
}
