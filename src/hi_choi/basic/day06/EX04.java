package hi_choi.basic.day06;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
public class EX04 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("태어난 년도는 언제인가요? : ");
        int year = sc.nextInt();
        computeBirth(year);

        System.out.print("돌려주어야하는 잔돈은 얼마인가요? : ");

        int back_money = sc.nextInt();

        computeChange(back_money);

    }

    public static void computeBirth(int birth){
        int year = Calendar.getInstance().get(Calendar.YEAR);

        System.out.println(year-birth + "살 입니다.");

    }

    public static void computeChange(int money){
        int fiveman = 0;
        int man = 0;
        int fivecheon = 0;
        int cheon = 0;
        int fiveback = 0;
        int back = 0;
        int five = 0;
        int one = 0;

        while(money >=10){
            if(money >= 50000){
                fiveman++;
                money= money - 50000;
            }
            else if (money >= 10000){
                man++;
                money = money - 10000;
            }
            else if (money >= 5000){
                fivecheon++;
                money = money - 5000;
            }
            else if (money >= 1000){
                cheon++;
                money = money - 1000;
            }
            else if (money >= 500){
                fiveback++;
                money = money - 500;
            }
            else if (money >= 100) {
                back++;
                money = money - 100;
            }
            else if (money >= 50){
                five++;
                money = money - 50;
            }
            else if (money >= 10){
                one++;
                money = money -10;
            }

        }

        System.out.println("50000원 : " + fiveman + "개 10000원 : " + man + "개 5000원 : " +
                fivecheon + "개 1000원 : " + cheon + "개 500원 : " + fiveback + "개 100원 : " + back + "개 50원 : " + five + "개 10원 : " + one + "개");
    }

}
