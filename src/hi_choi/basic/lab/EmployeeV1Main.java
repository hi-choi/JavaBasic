package hi_choi.basic.lab;

import java.util.Scanner;

public class EmployeeV1Main {
    // 사원정보를 입력받아 동적배열에 저장하고
    // 조회 및 수정/삭제하는 프로그램 작성
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeService eps = EmployeeServiceImpl.getInstance();

        while(true){
            eps.displayMenu();
            String menu = sc.next();

            switch(menu)
            {
                case "1" : eps.newEmployee();break;
                case "2" : eps.showEmployee();break;
                case "3" : eps.showOneEmployee();break;
                case "4" : eps.modifyEmployee();break;
                case "5" : eps.removeEmployee();break;
                case "0" : System.exit(0);break;
                default :
                    System.out.println("잘못 입력하셨습니다.");
            }
        }

    }
}
