package hi_choi.basic.day17;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JDBCMember {
    public static void main(String[] args) {
        // 네이버 회원가입 기능을 JDBC로 구현
        // 테이블명 : NMember (playground)
        // 테이블 컬럼 구성 : 아이디userid, 비밀번호passwd, 이름name, 생년월일birth, 성별gender,
        //                    이메일email, 휴대전화hp
        // 자동입력 컬럼 : 회원번호mbno(pk), 가입일regdate

        MariaJDBC jdbc = new MariaJDBC();

        // 회원가입 테이블(NMember) 생성 SQL문
        String sql = " create table NMember " +
                " (mbno int auto_increment primary key, userid varchar(30) not null, passwd varchar(30) not null," +
                " name varchar(10) not null, birth Date not null, gender int not null , email varchar(50), " +
                "  hp varchar(30), regdate datetime default current_timestamp) ";

        // INSERT SQL 문
        String sqli = " insert into NMember (userid, passwd, name, birth, gender, email, hp) " +
                " values(?,?,?,?,?,?,?) ";

        // 데이터 삽입 테스트
        // insert into NMember (userid, passwd, name, birth, gender, email, hp) values ('aaa','bbb','ccc','2000-03-01',0,'abc123@987xyz, '010-1234-5678');
        // 데이터 조회 테스트
        // select mbno, userid, name, regdate from NMember order by mbno desc;

        // 데이터 상세 조회 테스트
        // select * from NMember where mbno = 1;

        // 데이터 수정 테스트
        // update NMember set name = '전지현', birth = '2020-04-21', hp='010-6789-1234' where mbno = 1;

        // 데이터 삭제 테스트
        // delete from NMembber where mbno=  1;

        // CREATE SQL문 실행
        try(
                Connection conn = jdbc.openConn();
                PreparedStatement pstmt = conn.prepareStatement(sql);
                ) {

            boolean isOK = pstmt.execute(sql);
            if(isOK) System.out.println("테이블 생성!");


        }catch(Exception ex){
            System.out.println("테이블이 이미 존재합니다.");
            //ex.printStackTrace();
        }

        // INSERT SQL문 실행
        Scanner sc = new Scanner(System.in);
        System.out.println("회원정보를 입력하세요!");
        System.out.println("입력순서는 아이디, 비밀번호, 이름, 생년월일, 성별, 이메일, 핸드폰입니다.");
        String userid = sc.next();
        String passwd = sc.next();
        String name = sc.next();
        String birth = sc.next();
        String gender = sc.next();
        String email = sc.next();
        String hp = sc.next();

        // JDBC를 이용해 NMember 테이블에 회원정보 저장하기
        try(
                Connection conn = jdbc.openConn();
                PreparedStatement pstmt = conn.prepareStatement(sqli);
                ){
            pstmt.setString(1, userid);
            pstmt.setString(2, passwd);
            pstmt.setString(3, name);
            pstmt.setString(4, birth);
            pstmt.setString(5, gender);
            pstmt.setString(6, email);
            pstmt.setString(7, hp);

            int cnt = pstmt.executeUpdate();
            if(cnt>0) System.out.println("정보 추가 완료!");

        }catch(Exception ex){
            ex.printStackTrace();
        }


        // 회원가입 완료 후 지금까지 가입한 모든 회원 조회
        // 조회 대상 컬럼 : 회원번호, 아이디, 이름, 가입일
        String sqls = "select mbno, userid, name, regdate from NMember order by mbno desc";

        try(
                Connection conn = jdbc.openConn();
                PreparedStatement pstmt = conn.prepareStatement(sqls);
                ResultSet rs = pstmt.executeQuery();
                ){

            String fmt = "%s %s %s %s\n";
            StringBuffer sb = new StringBuffer();
            while(rs.next()){
                String result = String.format(fmt,
                rs.getString(1)
                        ,rs.getString(2)
                        ,rs.getString(3)
                        ,rs.getString(4).substring(0,10));

                sb.append(result);
            }
            System.out.println(sb.toString());
        }catch(Exception ex){
            ex.printStackTrace();
        }


    } // main
} // class
