package hi_choi.basic.day09;

public class StarCraft2 {
    public static void main(String[] args) {

        SCV2 s = new SCV2();
        System.out.println("SCV의 체력 " + s.hp);
        s.attack();
        s.move();
        s.specialAbility();

        Marine2 m = new Marine2();
        m.attack();
        m.move();
        m.specialAbility();

        Firebat2 f = new Firebat2();
        f.attack();
        f.move();
        f.specialAbility();
    }
}


interface Unit2Interface {

    void attack();
    void move();
    void specialAbility();
}

class Unit2{
    String name;
    int hp;
    int power;
    double mvspd;
    int mineral;
    int gas;
}

class SCV2 extends Unit2 implements Unit2Interface {

    public SCV2() {
        name = "건설로봇";
        hp = 45;
        power = 5;
        mvspd = 2.81;
        mineral = 50;
        gas = 0;
    }

    final String fmtattack = "융합절단기를 이용해서 대상에 %d의 피해를 주고있습니다.\n";
    final String fmtmove = "지정한 위치로 %.2f속도로 이동중입니다.\n";
    final String fmtspabty = "대상을 수리하는 중입니다.\n";

    @Override
    public void attack() {
        System.out.printf(fmtattack, power);

    }

    @Override
    public void move() {
        System.out.printf(fmtmove, mvspd);

    }

    @Override
    public void specialAbility() {
        System.out.println(fmtspabty);
    }
}

class Marine2 extends Unit2 implements Unit2Interface {

    public Marine2() {
        name = "해병대";
        hp = 50;
        power = 30;
        mvspd = 2.95;
        mineral = 50;
        gas = 0;
    }
    final String fmtattack = "가우스소총을 이용해서 대상에 %d의 피해를 주고있습니다.\n";
    final String fmtmove = "지정한 위치로 %.2f속도로 이동중입니다.\n";
    final String fmtspabty = "전투자극제를 사용해서 이동속도 50%증가, 공격속도 33%증가합니다.\n";

    @Override
    public void attack() {
        System.out.printf(fmtattack, power);

    }

    @Override
    public void move() {
        System.out.printf(fmtmove, mvspd);

    }

    @Override
    public void specialAbility() {
        System.out.println(fmtspabty);
    }
}

class Firebat2 extends Unit2 implements Unit2Interface{

    final String fmtattack = "화염방사기를 이용해서 대상에 %d의 피해를 주고있습니다.\n";
    final String fmtmove = "지정한 위치로 %.2f속도로 이동중입니다.\n";
    final String fmtspabty = "화염병사병의 특수효과입니다.\n";

    public Firebat2() {

        name = "화염병사병";
        hp = 50;
        power = 8 * 2;
        mvspd = 1.875;
        mineral = 50;
        gas = 25;
    }

    @Override
    public void attack() {
        System.out.printf(fmtattack, power);
    }

    @Override
    public void move() {
        System.out.printf(fmtmove, mvspd);
    }

    @Override
    public void specialAbility() {
        System.out.println(fmtspabty);

    }
}


