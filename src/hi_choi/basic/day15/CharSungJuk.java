package hi_choi.basic.day15;

import java.io.*;
import java.util.Scanner;

public class CharSungJuk {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int kor;
        int eng;
        int mat;

        //여러 줄로 입력받기
        //System.out.println("이름은?");
        //name = sc.next();
        //System.out.println("국어는?");
        //kor = sc.nextInt();
        //System.out.println("영어는?");
        //eng = sc.nextInt();
        //System.out.println("수학은?");
        //mat = sc.nextInt();

        //한 줄로 입력받기
        System.out.println("성적은? ('이름 국어 영어 수학' 순서로)");
        name = sc.next();
        kor=sc.nextInt();
        eng=sc.nextInt();
        mat=sc.nextInt();

        String fpath="c:/Java/sungjuk.dat";

        // 입력받은 성적데이터를 파일에 저장
        FileWriter fw = null;
        BufferedWriter bw = null;
        try{
            fw = new FileWriter(fpath, true);
            // 파일에 데이터 누적 옵션설정은 FileWriter의 append 속성에 true값을 지정
            // 기본값은 false로 지정되어 있음
            bw = new BufferedWriter(fw);
            //fw.write(name+"\n");
            //fw.write(kor+"\n");
            //fw.write(eng+"\n");
            //fw.write(mat+"\n");
            //bw.write(name+","+kor+","+eng+","+mat+"\n");

            String fmt = "%s, %d, %d, %d\n";
            String data = String.format(fmt, name, kor, eng, mat);
            bw.write(data);
            bw.close();
            fw.close();

        }catch(IOException e){
            System.out.println("파일쓰기 오류!!");
            e.printStackTrace();
        }

        // 저장한 성적데이터를 화면에 출력
        FileReader fr = null;
        BufferedReader br = null;
        try{
            fr = new FileReader(fpath);
            br = new BufferedReader(fr);
            while(br.ready()){
                System.out.println(br.readLine());
            }
            br.close();
            fr.close();

        }catch(Exception e){
            e.printStackTrace();
        }

    }


}
