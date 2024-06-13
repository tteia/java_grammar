package C03Inheritance;

// extends 키워드를 통해 상속관계를 표현
public class C0301Inheritance extends parents{
    int c = 30;
    public static void main(String[] args) {
//        System.out.println(a); => static 이 없어서 호출이 안된다.
        C0301Inheritance c1 = new C0301Inheritance();
        System.out.println(c1.a);
        System.out.println(c1.c); // 자식 클래스라 하더라도 private 변수는 상속 및 접근 불가.
        // 메서드 상속
        c1.parentMethod();
    }
    // 부모 메서드 재정의 = overriding 오버라이딩 (매우 중요 !!!)
    // @ : 성능의 최적화를 위해 붙여주는 게 좋은 것으로 알려져있음.
    @Override
    void parentMethod() {
        System.out.println("부모 클래스가 아니라 자식 클래스입니다.");
    }
    void childMethod() {
        System.out.println("자식 클래스입니다.");
    }
}

class parents{
    int a = 10;
    private int b = 20;
    void parentMethod(){
        System.out.println("부모 클래스입니다.");
    }
}
