package hi_choi.basic.day14;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lotto645V2 {
    public static void main(String[] args) {
        // 로또 645 프로그램 만들기
        // Set를 이용해서 1~45사이 임의의 6개의 숫자 생성
        // 중복은 허용하지 않음
        // Random - nextInt

        Set<Integer> lots = new HashSet<>();
        while(lots.size() < 6){
        Random rmd = new Random();
            lots.add(rmd.nextInt(45)+1);
        }
        // 중복 발생시 lotto 변수의 갯수가 하나씩 줄어둠
        // 따라서, 중복이 나오지 않을 때까지 뽑기를 계속 무한 반복
        // 복원 추출 - 한번 뽑은 것을 다시 뽑을 수 있음

        for(Integer lot : lots){
            System.out.print(lot + " ");
        }
    }
}
