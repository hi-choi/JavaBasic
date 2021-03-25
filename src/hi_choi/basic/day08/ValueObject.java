package hi_choi.basic.day08;

public class ValueObject {
    public static void main(String[] args) {
        // setter / getter
        // 기본적으로 클래스의 멤버변수의 접근지정자는
        // private으로 선언하는 것이 좋음 - datahiding 차원
        // 이렇게 선언하는 경우 외부 클래스에서 멤버변수에
        // 접근이 불가능하게 되는데, 이때 setter/getter 메서드를
        // 이용하면 접근불가변수를 조작할 수 있음

        C sj = new C();
        // sj.name = "혜교";
        // 멤버변수가 private으로 선언되었으므로 접근 불가 - 값 대입 실패!
        // OOP에서는 객체의 변수르 외부에서 직접 접근하는 것을
        // 권장하고 있지 않음
        // 즉, 데이터는 외부에서의 접근을 막는다는 의미임
        // 만일, 접근하려면 객체에서 공개한 메서드를 통해서만
        // 가능하도록 유도함 - setter / getter
        
        sj.setName("혜교");
        sj.setKor(99);
        sj.setEng(57);
        sj.setMat(32);
        // setter를 이용해서 객체의 변수에 값 대입

        System.out.println(sj.getName());
        System.out.println(sj.getKor());
        System.out.println(sj.getEng());
        System.out.println(sj.getMat());
    }
}

class C {
    private String name;
    private int kor;
    private int eng;
    private int mat;

    // setter 정의 : public set변수명(변수명)
    // 외부에서 객체의 멤버변수에 값을 설정할 때 (주입할 때)
    public void setName(String name) {
        this.name = name;
    }
    public void setKor(int kor){
        this.kor = kor;
    }
    public void setEng(int eng){
        this.eng = eng;
    }
    public void setMat(int mat){
        this.mat = mat;
    }

    // getter 정의 : public 반환유형 get 변수명()
    public String getName() {
        return name;
    }

    public int getKor(){
        return kor;
    }
    public int getEng(){
        return eng;
    }
    public int getMat(){
        return mat;
    }
}

class D {
    private String userid;
    private String passwd;
    private String email;

    public D() {
    }

    public D(String userid, String passwd, String email) {
        this.userid = userid;
        this.passwd = passwd;
        this.email = email;
    }
}