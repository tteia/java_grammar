package C06EtcClass;

import java.util.ArrayList;
import java.util.Arrays;

public class C0603GenericMain {
    public static void main(String[] args) {
        String[] stArr = {"java", "python", "C"};
        stChange(stArr, 0, 1);
        System.out.println(Arrays.toString(stArr));
        Integer[] intArr = {10, 20, 30};
        intChange(intArr, 0, 1);
        System.out.println(Arrays.toString(intArr));
        genericChange(stArr, 1, 2);
        System.out.println(Arrays.toString(stArr));

        Person p1 = new Person();
        p1.setValue("namyejun");

        GenericPerson<Integer> p1Age = new GenericPerson();
        p1Age.setValue(22);

        // 제네릭 사용
//        List<String> myList = new ArrayList<>();
//        myList.add("hello");
//        myList.add("java");

        // 컴파일 후 제네릭 소거 > 컴파일시 <> 가 소거 됨.
//        List myList = new ArrayList<>();
//        myList.add("hello");
//        myList.add("java");
    }

    // 제네릭 메서드 생성 : 반환 타입 왼쪽에 <T> 선언. (type 의 약자)
    // 제네릭 클래스 생성 : 클래스명 오른쪽에 <T> 선언.
    // 유의점 : 제네릭은 객체 타입이 들어와야 함.
    // T 자리에 Object 가 올 수 있음 !
    static <T> void genericChange(T[] stArr, int a, int b){
        T tmp = stArr[a];
        stArr[a] = stArr[b];
        stArr[b] = tmp;
    }

    static void stChange(String[] stArr, int a, int b){
        String tmp = stArr[a];
        stArr[a] = stArr[b];
        stArr[b] = tmp;
    }

    static void intChange(Integer[] stArr, int a, int b){
        Integer tmp = stArr[a];
        stArr[a] = stArr[b];
        stArr[b] = tmp;
    }
}
// 제네릭 클래스는 클래스명 옆에 <T> 선언
class GenericPerson<T>{
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

class Person{
    String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
