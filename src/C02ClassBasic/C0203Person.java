package C02ClassBasic;

public class C0203Person {
    // static 으로 선언했다면? 메서드 자체의 값이 계속 갈아끼워짐.
    // private -> 다른 클래스에서 사용이 안됨.
    // private String name;
    private String name;
    private String email;
    private int age;
    public void eating(){
        System.out.println(this.name + "이 밥을 먹는다.");
    }
    // setter
    public void setName(String name){
        this.name = name;
    }
    // getter
    public String getName(){
        return this.name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
