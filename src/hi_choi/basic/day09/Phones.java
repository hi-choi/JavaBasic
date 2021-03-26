package hi_choi.basic.day09;

public class Phones {
    public static void main(String[] args) {
        NormalPhone n = new NormalPhone();
        n.sendcall();

        MP3phone m = new MP3phone();
        m.playMusic();

        SmartPhone s = new SmartPhone();
        s.takepic();
    }
}

interface PhoneInterface{
    void sendcall();
    void receivecall();
}

class NormalPhone implements PhoneInterface {
    @Override
    public void sendcall() {
        System.out.println("전화 거는 중...");
    }

    @Override
    public void receivecall() {
        System.out.println("전화 받는 중...");

    }
}

interface MP3Interface extends PhoneInterface{
    void playMusic();
    void viewMovie();

}

interface SmartInterface extends PhoneInterface{
    void takepic();
    void surfInternet();
    void playGame();
}

class MP3phone implements PhoneInterface, MP3Interface{

    @Override
    public void sendcall() {

    }

    @Override
    public void receivecall() {

    }

    @Override
    public void playMusic() {
        System.out.println("음악을 재생합니다.");
    }

    @Override
    public void viewMovie() {
        System.out.println("동영상을 재생합니다.");
    }
}

class SmartPhone implements PhoneInterface, SmartInterface {
    @Override
    public void sendcall() {

    }

    @Override
    public void receivecall() {

    }

    @Override
    public void takepic() {
        System.out.println("사진을 찍습니다.");
    }

    @Override
    public void surfInternet() {
        System.out.println("인터넷을 검색합니다..");
    }

    @Override
    public void playGame() {
        System.out.println("게임을 합니다.");

    }
}
// 상속 : 부모클래스가 가진 특성과 기능을 변화없이 받음
// 구현 : 부모클래스가 정해준 틀에 맞춰 새롭게 작성
// 따라서, 아래처럼 짜는 것은 다소 세련되지 못함
class MP3phone2 extends NormalPhone implements MP3Interface {

    @Override
    public void playMusic() {
        
    }

    @Override
    public void viewMovie() {

    }
}