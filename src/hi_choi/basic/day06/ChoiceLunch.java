package hi_choi.basic.day06;
import javax.swing.*;
import javax.xml.transform.sax.SAXSource;
import java.util.Random;

public class ChoiceLunch {
    public static void main (String[] args){
        // 배열을 이용한 점심메뉴 고르기
        String[] menu = {"김밥", "라면", "돈까스", "우동", "짜장면","햄버거", "짬뽕"};
        // 점심메뉴를 배열로 정의
        
        //Random rnd = new Random();
        //int idx = rnd.nextInt(7);
        // 난수 생성
        // 메뉴는 7개이므로 idx변수의 범위는 0~6
        
        // Math.random를 이용해서 실제 난수가 만들어지는 원리를 알아봄
        // 0 ~ 9 사이 임의의 난수 생성
        double magic = Math.random();
        System.out.println(magic);
        System.out.println((int)(magic * 10));

        // 0 ~ 99 사이 임의의 난수 생성
        System.out.println((int)(magic * 100));

        // 0 ~ (n-1) 범위 난수 : random * b
        // 0 ~ (100-1) 범위 난수
        System.out.println((int)(magic * 100));
        
        // a이상 ~ b 미만 범위 난수 : (random * (최대값 - 최소값)) + 최소값
        // 1 ~ 45 미만 범위 난수
        System.out.println((int)(magic *(45-1))+1);
        //System.out.println(menu[idx]);

        // 메뉴출력을 위한 난수 생성 표현식
        int idx = (int)(Math.random() * 7);

        // 생성된 난수로 선택된 메뉴 출력
        System.out.println(menu[idx]);
    }
}
