package C04Interface;

public class InterfaceMain {
    public static void main(String[] args) {
        CatImplements cat1 = new CatImplements();
        cat1.makeSound();
        DogImplements dog1 = new DogImplements();
        dog1.makeSound();

        AnimalInterface01 cat2 = new CatImplements();
        cat2.makeSound();
        AnimalInterface01 dog2 = new DogImplements();
        dog2.makeSound();
        // 다형성 : 하나의 객체가 여러 개의 참조변수를 가질 수 있음을 의미.

        CatMultiImplements cat3 = new CatMultiImplements();
        cat3.makeSound();
        System.out.println(cat3.play("턱시도", "러시안블루"));

        DogMultiImplements dog3 = new DogMultiImplements();
        dog3.makeSound();
        System.out.println(dog3.play("진돗개", "삽살개"));

        // 인터페이스1 , 2에 각각 정의된 것만 사용할 수 있다.
//        AnimalInterface02 cat4 = new CatMultiImplements();
//        cat4.makeSound();
//        System.out.println(cat4.play("턱시도", "러시안블루"));
//
//        AnimalInterface02 dog4 = new DogMultiImplements();
//        dog4.makeSound();
//        System.out.println(dog4.play("진돗개", "삽살개"));

        // 기본적으로 추상클래스, 인터페이스는 객체 생성이 불가능하나
        // 익명 내부 클래스 방식으로 생성 가능. -> 익명 클래스라고 부름.
        AnimalInterface01 ai1 = new AnimalInterface01() {
            @Override
            public void makeSound() {
                System.out.println("hello");
            }
        };
        ai1.makeSound();


    }
}


