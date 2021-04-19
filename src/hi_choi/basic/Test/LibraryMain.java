package hi_choi.basic.Test;


import java.util.Scanner;

public class LibraryMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LibraryService lsv = LibraryServiceImpl.getInstance();

        while(true){
            lsv.displayMenu();
            String menu = sc.next();

            switch(menu)
            {
                case "1" : lsv.newLibrary();break;
                case "2" : lsv.showLibrary();break;
                case "3" : lsv.showOneLibrary();break;
                case "4" : lsv.modifyLibrary();break;
                case "5" : lsv.removeLibrary();break;
                case "0" : System.exit(0);break;
                default :
                    System.out.println("잘못 입력하셨습니다.");
            }
        }

    }
}
