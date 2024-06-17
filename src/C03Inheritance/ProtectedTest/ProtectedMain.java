// 루트(최상단) 패키지는 src
//

package C03Inheritance.ProtectedTest;

import C03Inheritance.C0304ProtectedClass;
import C03Inheritance.C0304ProtectedTest;
// * 을 통해 패키지 내의 모든 클래스 import 가능
// * 을 통해 패키지 내의 패키지까지 포함해서 모든 내용 import는 불가능
// import java.* -> X / java.util.* -> O
import C03Inheritance.ProtectedTest.*;

public class ProtectedMain extends C0304ProtectedClass {
    public static void main(String[] args) {
        C0304ProtectedClass c1 = new C0304ProtectedClass(); // 상속이 아님 !! protected 접근 안됨 !
//        System.out.println(c1.s2); // default 접근 불가
//        System.out.println(c1.s3); // protected 접근 불가

        ProtectedMain p1 = new ProtectedMain();
//        System.out.println(p1.s2); // default 접근 불가
        System.out.println(p1.st3); // 상속한 객체에서 protected 접근 가능
    }
}
