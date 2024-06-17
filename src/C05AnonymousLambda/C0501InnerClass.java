package C05AnonymousLambda;

public class C0501InnerClass {
    public static void main(String[] args) {
        StaticInnerClass m1 = new StaticInnerClass();
        m1.display();

        C0501InnerClass outer = new C0501InnerClass();
        MemberInnerClass m2 = outer.new MemberInnerClass();
        m2.display();
    }

    // 일반 내부 클래스
    public class MemberInnerClass {
        int a = 10;
        void display() {
            System.out.println("a의 값은 " + a);
        }
    }

    // static 내부 클래스
    static class StaticInnerClass {
        int b = 20;
        void display() {
            System.out.println("b의 값은 " + b);
        }
    }
}




