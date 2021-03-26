package hi_choi.basic.day09;

public class StarCraft {
    public static void main(String[] args) {
        //SCV s = new SCV("SCV", 45, 5, 2.81, 50, 0);
        // scv 유닛을 만들때마다 초기값을 지정하는 것은 다소 번거로움
        // 즉, 동일한 속성을 가진 유닛을 만들때 마다
        // 매개변수를 통해 객체를 만드는 것은 비효율적임
        // 이럴 경우, 생성자내에 초기값을 지정하는 것이 나음

        SCV s = new SCV();
        System.out.println("SCV의 체력 " + s.hp);
        s.attack();
        s.move();
        s.specialAbility();

        Marine m = new Marine();
        m.attack();
        m.move();
        m.specialAbility();

        Firebat f = new Firebat();
        f.attack();
        f.move();
        f.specialAbility();

    }
}

abstract class Unit {
    protected String name;
    protected int hp;
    protected int power;
    protected double mvspd;
    protected int mineral;
    protected int gas;

    public Unit() {
    }

   // public Unit(String name, int hp, int power, double mvspd, int mineral, int gas) {
   //     this.name = name;
   //     this.hp = hp;
   //     this.power = power;
   //     this.mvspd = mvspd;
   //     this.mineral = mineral;
    //    this.gas = gas;
    //}

    abstract public void attack();
    abstract public void move();
    abstract public void specialAbility();
}

class SCV extends Unit{

    final String fmtattack = "융합절단기를 이용해서 대상에 %d의 피해를 주고있습니다.\n";
    final String fmtmove = "지정한 위치로 %.2f속도로 이동중입니다.\n";
    final String fmtspabty = "대상을 수리하는 중입니다.\n";

    public SCV() {
        name = "건설로봇";
        hp = 45;
        power = 5;
        mvspd = 2.81;
        mineral = 50;
        gas = 0;
    }

    @Override
    public void attack() {
        // sout("융합절단기를 이용해서 ...")
        // 추상메서드를 이용해서 부모클래스에 정의된
        // attack메서드르 유닛에 맞게 재정의함
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

class Marine extends Unit{

    final String fmtattack = "가우스소총을 이용해서 대상에 %d의 피해를 주고있습니다.\n";
    final String fmtmove = "지정한 위치로 %.2f속도로 이동중입니다.\n";
    final String fmtspabty = "전투자극제를 사용해서 이동속도 50%증가, 공격속도 33%증가합니다.\n";

    public Marine() {
        name = "해병대";
        hp = 50;
        power = 30;
        mvspd = 2.95;
        mineral = 50;
        gas = 0;
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
class Firebat extends Unit{
    
    final String fmtattack = "화염방사기를 이용해서 대상에 %d의 피해를 주고있습니다.\n";
    final String fmtmove = "지정한 위치로 %.2f속도로 이동중입니다.\n";
    final String fmtspabty = "화염병사병의 특수효과입니다.\n";
    
    public Firebat() {
        
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
/*
abstract class Terran {

    protected String name; // 이름
    protected int life; // 체력
    protected int attack; // 공격력
    protected int mineral; // 소요광물
    protected int gas; // 소요가스

    abstract protected void attack();
    abstract protected void move();
    abstract protected void specialAbility();

    public Terran() {
    }

    public Terran(String name, int life, int attack, int mineral, int gas) {
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.mineral = mineral;
        this.gas = gas;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getMineral() {
        return mineral;
    }

    public void setMineral(int mineral) {
        this.mineral = mineral;
    }

    public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }
}

class SCV extends Terran {     // 건설로봇


    public SCV(String name, int life, int attack, int mineral, int gas) {
        this.name = "SCV";
        this.life = 60;
        this.attack = 5;
        this.mineral = 50;
        this.gas = 0;
    }


    @Override
    protected void attack() {

    }

    @Override
    protected void move() {

    }

    @Override
    protected void specialAbility() {

    }
}
*/