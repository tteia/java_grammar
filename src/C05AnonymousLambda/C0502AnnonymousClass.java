package C05AnonymousLambda;

public class C0502AnnonymousClass {
    public static void main(String[] args) {
//        AbstractAnimal a1 = new AbstractAnimal() {
//            // AbstractAnimal 상속한 클래스가 별도로 존재하지 않고,
//            // 익명의 클래스가 만들어짐과 동시에 익명 객체 생성.
//
//            @Override
//            void makeSound2() {
//
//            }
//        }
        // 익명 객체에 구현 메서드가 1개 밖에 없을 때에 람다표현식(화살표 함수)로 표현 가능.
//        Animal a2 = new Animal() {
//            @Override
//            public void makeSound() {
//                System.out.println("동물 소리를 냅니다.");
//            }
//        };
        // () 부분에 매개변수를 지정하여 구현체에서 활용.
        // 변수의 개수에 맞춰서 지정.
        // animal 에 (a, b, c) 였다면 Animal a2 = (a, b, c) ->
        Animal a2 = () -> System.out.println("동물 소리를 냅니다.");
        a2.makeSound();


        //Animal2로 익명 객체를 만들어서 input1 + input2 + input3 을 더해서 return 하는 메서드 정의
        //return 문자열 출력
//        Animal2 a3 = new Animal2() {
//            @Override
//            public String makeSound(String a, String b, int c) {
//                return a+b+c;
//            }
//        };
        // 위 코드를 한 번에 !
        Animal2 a3 = ((a, b, c) -> a+b+c); // 함수명이 필요없어서 익명함수라고 불린다.
        System.out.println(a3.makeSound("hello", "world", 3));
        // 실행문이 한 줄일 때는 {}와 return 생략 가능
        // 두 줄 이상일 때는 {}를 사용해서 return 처리.
        Animal2 a4 = new Animal2() {
            @Override
            public String makeSound(String a, String b, int c) {
                if(c > 10){
                    return a;
            }
                else{
                    return a+b;
                }
        }
    };
}
    interface Animal{
        void makeSound();
    }
    interface Animal2{
        String makeSound(String a, String b, int c);
    }
    abstract class AbstractAnimal{
        void makeSound1(){

        }
        //abstract가 되면 반드시 구현되어야 한다!
        abstract void makeSound2();
    }
}
