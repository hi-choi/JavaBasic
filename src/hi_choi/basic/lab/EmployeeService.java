package hi_choi.basic.lab;

public interface EmployeeService {
    void displayMenu(); // 메뉴출력
    void newEmployee(); // 생성
    void showEmployee(); // 기본정보 출력
    void showOneEmployee(); // 기본정보 + 추가정보 출력
    void makeExtInfo(EmployeeVO ep); // 난수 생성
    void modifyEmployee();
    void removeEmployee();
}
