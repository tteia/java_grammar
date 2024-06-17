package C04Interface;

public class DogImplements implements AnimalInterface01{
    @Override
    public void makeSound() {
        System.out.println("멍멍");
    }
}
class DogMultiImplements implements AnimalInterface01, AnimalInterface02{

    @Override
    public void makeSound() {
        System.out.println("멍멍");
    }

    @Override
    public String play(String a, String b) {
        return a+"와 "+b+"가 같이 뛰어놉니다.";
    }
}