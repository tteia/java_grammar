package C04Interface;

public class StaticFinalInterface {
    public static void main(String[] args) {
        MyInterface m1 = new MyImplements();
        m1.methodA();
        // MyImplements 에 my_constant 변수가 상속(static final)
        System.out.println(MyImplements.my_constant);
    }
}

interface MyInterface{
    // 아래 변수는 컴파일 타임에 static final 키워드가 붙음.
    int my_constant = 10;
    public default void methodA(){
        System.out.println("helloworld");
    }
}
class MyImplements implements MyInterface{

}
