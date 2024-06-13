package C02ClassBasic;
// public class 는 하나만 ! 일반 class 는 여러개 OK
// class 를 통해서 객체를 만듦 -> 고유의 메모리값을 할당한 요소를 만든다. => 복제본을 만든 것!
public class C0202Class {
    public static void main(String[] args) {
        System.out.println(myCalculator.sum(10,20));

        // A 부서의 매출
        // 20원 발생
        myCalculator.sumAcc(20);
        System.out.println(myCalculator.total);
        // 30원 발생
        myCalculator.sumAcc(30);
        System.out.println(myCalculator.total);
        // 40원 발생
        myCalculator.sumAcc(40);
        System.out.println(myCalculator.total);

        // B부서의 매출
        myCalculator.sumAcc(10);
        // 클래스메서드 호출방식 : 클래스명.메서드명();
        myCalculator.sumAcc(20);
        myCalculator.sumAcc(30);
        System.out.println(myCalculator.total);

        // 객체를 사용한 프로그램 : 객체 고유의 메모리 공간 할당
        // A 회사의 매출
        myCalculatorInstance m1 = new myCalculatorInstance();
        // 객체메서드 호출 방식 : 객체명.메서드명();
        m1.sumAcc(10);
        m1.sumAcc(20);
        m1.sumAcc(30);
        // B 회사의 매출
        myCalculatorInstance m2 = new myCalculatorInstance();
        m1.sumAcc(100);
        m1.sumAcc(200);
        m1.sumAcc(300);

        C0203Person person1 = new C0203Person();
        // 변수 값에 직접 접근하여 값을 할당하는 방식.
//        person1.name = "홍길동";
//        person1.email = "홍길동@naver.com";
//        person1.age = 19;
//        person1.eating();
//        System.out.println("이름 : " + person1.name +"\n" + "이메일은 " + person1.email);

        // 일반적인 패턴은 변수 값에 직접 접근하지 않는다.
        // 의도를 명확히한 메서드를 통해 변수값을 할당하고 가져옴.
        person1.eating();
        person1.setName("홍길동");
        System.out.println(person1.getName());
        person1.eating();
    }
}
class myCalculator{
    // static int =
    static int total = 0;
    static int sum(int a, int b){
        return a+b;
    }
    static int sumAcc(int a){
        total += a;
        return total;
    }
}

class myCalculatorInstance{
    // static 이 붙어있는 변수는 클래스 변수, static 이 붙어있지 않으면 객체 변수
    int total = 0;
    int sum(int a, int b){
        return a+b;
    }
    // static -> 객체 변수에 접근이 안됨. (total 에 접근 불가)
    void sumAcc(int a){
        // this 는 객체 그 자신을 의미.
        // 만약 a 대신 total 이 들어가더라도 this 를 활용하면 명확하게 인식함.
        this.total += a;
    }
}
