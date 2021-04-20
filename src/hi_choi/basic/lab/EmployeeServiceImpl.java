package hi_choi.basic.lab;

import hi_choi.basic.sungjuk.SungJukVO;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService{

    // 멤버변수 선언
    List<EmployeeVO> edata = new ArrayList<>();
    EmployeeVO ep = null;


    // 단일 상수 선언
    static final String JOBID[] = {"AD_PRES","AD_VP","AD_ASST","FI_MSG","FI_ACCOUNT", "AC_MGR", "AC_ACCOUNT",
            "SA_MAN", "SA_REP", "PU_MAN", "PU_CLERK", "ST_MAN", "ST_CLERK","SH_CLERK","IT_PROG","MK_MAN",
            "MK_REP","HR_REP","PR_REP"};
    static final int MINSAL = 2000;
    static final int MAXSAL = 40000;
    static final int MAXDEPT = 270;
    static final int MAXMGRID = 206;

    // 싱글톤 블럭 시작
    public EmployeeServiceImpl() {
    }


    private static EmployeeService epsv = null;

    public static EmployeeService getInstance() {
        if(epsv ==null) epsv = new EmployeeServiceImpl();
        return epsv;
    }
    // 싱글톤 블록 끝
    
    // 화면에 프로그램 메뉴를 출력
    @Override
    public void displayMenu() {
        String displaymenu =
                        "==========================\n" +
                        "   사원관리 프로그램 v1 \n" +
                        "==========================\n" +
                        "  1. 사원데이터 입력\n" +
                        "  2. 사원데이터 조회\n" +
                        "  3. 사원데이터 상세조회\n" +
                        "  4. 사원데이터 수정\n" +
                        "  5. 사원데이터 삭제\n" +
                        "  0. 프로그램 종료\n" +
                        "==========================\n" +
                        "  작업을 선택하세요 : ";

        System.out.print(displaymenu);
    }

    // 새로운 사원데이터를 입력받음
    @Override
    public void newEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("사번은? : ");
        String empno = sc.next();
        
        System.out.println("이름은? : ");
        String fname = sc.next();

        System.out.println("성은? : ");
        String lname = sc.next();

        System.out.println("이메일은? : ");
        String email = sc.next();

        System.out.println("전화번호는? : ");
        String phone = sc.next();

        Calendar c = Calendar.getInstance();
        String hdate = c.get(Calendar.YEAR) +"-" + (c.get(Calendar.MONTH)+1) + "-" + c.get(Calendar.DAY_OF_MONTH);


        EmployeeVO ep = new EmployeeVO(empno, fname, lname, email, phone, hdate);
        // 사원 추가정보를 생성해서 사원정보로 저장
        //makeExtInfo(ep);
        epsv.makeExtInfo(ep);
        edata.add(ep);
    }

    // 사원 기본정보(사번, 이름, 성, 이메일, 전화번호, 입사일)등을
    // 리스트 형태로 출력
    @Override
    public void showEmployee() {

        String fmt = "사번:%s, 이름:%s, 성:%s, 이메일:%s, 전화번호:%s, 입사일:%s\n";

        for(EmployeeVO ep : edata){
            System.out.printf(fmt, ep.getEmpno
                    (), ep.getFname(), ep.getLname(), ep.getEmail(), ep.getPhone(), ep.getHdate());
        }

    }

    @Override
    public void showOneEmployee() {
        String fmt = "사번:%s, 이름:%s, 성:%s, 이메일:%s, 전화번호:%s, 입사일:%s,\n"
                + "직책:%s, 급여:%d, 수당:%.2f, 상사번호:%d, 부서번호:%d\n";
        Scanner sc = new Scanner(System.in);
        System.out.println("조회할 사원번호는? ");
        String empno = sc.next();

        EmployeeVO emp = null;
        for(EmployeeVO e : edata){
            // 찾는 데이터가 동적배열에 존재한다면
            // emp 변수에 저장하고 반복문을 종료함
            if(e.getEmpno().equals(empno)){
                emp = e;
                break;

            }
        }

        System.out.printf(fmt, emp.getEmpno(),emp.getFname(),emp.getLname(), emp.getEmail(), emp.getPhone(), emp.getHdate(),emp.getJobid(),emp.getSal(),emp.getComm(),emp.getMgrid(),emp.getDeptid());


    }

    @Override
    public void makeExtInfo(EmployeeVO ep) {
        double magic = Math.random() ;

        int lth = JOBID.length;
        String jobid = JOBID[(int)(magic*lth)];
        ep.setJobid(jobid);

        ep.setSal((int)((magic*100)+1)*100);

        ep.setComm(magic);
        ep.setMgrid((int)(magic*106)+100);
        ep.setDeptid((int)((magic*27)+1)*10);
        /* // 난수 생성 방법 2
           Random rnd = new Random();
           int key = rnd.nextInt(JOBID.length);
           String jobid = JOBID[key];

           int sal = rnd.nextInt(MAXSAL) + MINSAL;
           int mgrid = rnd.nextInt(MAXMGRID) + 100;
           int deptid = (rnd.nextInt(MAXDEPT)%100) * 10;

           DecimalFormat df = new DecimalFormat("#.#");
           double comm = Double.parseDouble(df.format(rnd.nextDouble()/2));

           ep.setJobid(Jobid);
           ep.setSal(sal);
           ep.setComm(comm);
           ep.setMgrid(mgrid+"");
           ep.setDeptid(deptid+"");
        */

    }

    @Override
    public void modifyEmployee() {
        
    }

    @Override
    public void removeEmployee() {

    }

}
