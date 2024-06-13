package C02ClassBasic;

public class C0204MethodOverloading {
    public static void main(String[] args) {
        C0204MethodOverloading c1 = new C0204MethodOverloading();
        System.out.println(sum(10,20));
        System.out.println(c1.sum(10,20,30));
        System.out.println(c1.sum(10.0, 10.2));
    }

    //public 이나 private 같은 접근제어자를 안 붙이면 기본적으로 default 접근 제어자 : 같은 패키지 내에서만 유효
    static int sum(int a, int b){ //static -> sum(a,b) 호출 , static 아니면 클래스명.메서드();-> C0204~~.sum(a,b)
        return a+b;
    }

    // 매개변수의 타입 또는 개수가 다르면 같은 이름의 메소드 정의 가능.
    // 즉, 메소드 오버로딩.
    double sum(double a, double b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }

}
