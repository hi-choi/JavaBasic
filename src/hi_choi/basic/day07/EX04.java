package hi_choi.basic.day07;

import java.util.Calendar;
import java.util.Scanner;

public class EX04 {
    public static void main(String[] args) {
        // 생년월일을 입력받아 나이 계산
        // 현재연도 - 생년년도
        // 생일이 지났으면 그대로 사용
        // 생일이 지나지않았으면 -1
        Scanner sc = new Scanner(System.in);
        System.out.print("생일의 연도는? : ");
        int year = sc.nextInt();
        System.out.print("생일의 월은? : ");
        int month = sc.nextInt();
        System.out.print("생일의 일은? : ");
        int day = sc.nextInt();
        computeBirth(year, month, day);
        computeChange();
    }

    public static void computeChange(){
        // 잔돈 계산하는 프로그램
        // 지불요구금액 : 54300원
        // 지불액 : 100000원
        // 잔돈 : 45680원
        int price, pay, change;
        int [] wons = new int[8];
        int [] notes = {50000, 10000, 5000, 1000, 500, 100, 50, 10};

        Scanner sc = new Scanner(System.in);
        System.out.print("사용요금은? ");
        price = sc.nextInt();
        System.out.print("지불액은? ");
        pay = sc.nextInt();

        change = pay -price;
        for(int i= 0 ; i< wons.length; ++i){
            wons[i] = change / notes[i];
            change = change % notes[i];
        }
        String fmt = "사용요금은 %d, 지불액은 %d 일 때 \n" +
                "잔돈은 %d입니다.\n"+
                "50000원권은 %d장, 10000원권은 %d장, 5000원권은 %d장, 1000원권은 %d장, " +
                "500원은 %d개, 100원은 %d개, 50원은 %d개, 10원은 %d개입니다.";
        System.out.printf(fmt, price, pay, (pay-price), wons[0],wons[1],wons[2],wons[3],wons[4],wons[5],wons[6],wons[7]);

    }
    public static void computeBirth(int byear, int bmonth, int bday){
        //int cyear = 2021;
        int cyear = Calendar.getInstance().get(Calendar.YEAR);
        //int cmonth = 3;
        int cmonth = Calendar.getInstance().get(Calendar.MONTH)+1;
        //int cday = 24;
        int cday = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        int age = cyear - byear-1;


        // 1985.4.25 ==> 2021.3.24 기준 35세 (생일 안지남)
        if(cmonth < bmonth) {        // 3월(현재) < 5월(생일)
            age = age;
            System.out.println("가");
        }
        else if (cmonth == bmonth){     // 3월 == 3월
            if(cday <= bday){                   //24일(현재) < 25일(생일)
                age = age;
                System.out.println("나");
            }
            else{                               //24일(현재) > 15일(생일)
                age = age + 1;
                System.out.println("다");
            }

        }
        else{                  // 3월(현재) > 1월 (생일)
            age = age + 1;
            System.out.println("라");
        }

        
        String fmt = "현재 : %d년 %d월 %d일 \n" + "생일 : %d년 %d월 %d일\n" + "나이 : %d세";
        System.out.printf(fmt, cyear, cmonth, cday, byear, bmonth, bday, age);

    }
}
