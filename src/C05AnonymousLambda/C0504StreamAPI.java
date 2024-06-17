package C05AnonymousLambda;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class C0504StreamAPI {
    public static void main(String[] args) {
//        int[] arr = {20, 10, 4, 12};
//        // 전통적인 방식의 데이터 접근 방식. (메모리 주소 접근(원본))
//        for(int i = 0; i < arr.length; i++){
//            System.out.println(arr[i]);
//        }
//        // 함수형 프로그래밍 방식 : 데이터와 객체 중심이 아닌 입력에 따른 출력만 존재.
//        // java에서 함수형 프로그래밍을 지원하기 위한 라이브러리가 streamAPI
//        // foreach : 스트림의 각 요소를 소모하면서 동작을 수행.
//        Arrays.stream(arr).forEach(a-> System.out.println(a));
//
//        // 스트림의 생성
//        String[] stArr = {"HTML", "CSS", "JAVA", "PYTHON"};
//        // stream<클래스명> : 제네릭 타입으로 stream 객체가 생성됨.
//        // <> 요게 제네릭 !
//        Stream<String> stream1 = Arrays.stream(stArr);
//        List<String> stList = new ArrayList<>(Arrays.asList(stArr));
//        Stream<String> stream2 = stList.stream();
//
//        int[] intArr = {10,20,30,40,50};
//        // int 는 기본형 자료. 따라서 아래처럼 안된다!
////        Stream<Integer> stream3 = Arrays.stream(intArr);
//        // 기본형 자료는 별도의 stream 제공
//        IntStream stream3 = Arrays.stream(intArr);
//
//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);
//
//        // List 자료형이 Int 가 아닌 Integer 이므로 Intstream 사용 불가 !
//        Stream<Integer> stream4 = myList.stream();
//        IntStream stream5 = myList.stream; // 안됨


        // stream 변환(중개연산) : filter, map, sorted, distinct, limit
//        String[] stArr = {"HTML", "CSS", "JAVA", "PYTHON"};
//        // filter : 특정 기준으로 대상을 filtering 하는 것. Stream<String> 반환 (새로운 String 으로 반환)
//        // 참조변수 스트림변환의 경우 제네릭의 타입 소거 문제 발생.
//        // 제네릭의 타입 소거란 제네릭 타입을 런타임 시점에는 제거하는 것을 의미.
//        // 그래서 타입이 소거된 Stream 객체에서 배열로 변환하려면 타입이 뭔지를 명시해줘야 함. (타입캐스팅)
//        String[] newStArr = Arrays.stream(stArr).filter(a->a.length() <= 4).toArray(a->new String[a]); // a변수에는 stream 요소의 개수가 들어온다.
//        // 메소드 참조 방식(매개변수가 추론 가능할 때 생략하는 형식) : class::method
//        String[] newStARr2 = Arrays.stream(stArr).filter(a->a.length() <= 4).toArray(String[]::new);
//        //Arrays.stream(stArr).forEach(System.out::println);
//
//        int[] intArr = {10, 20, 30, 40, 50, 10};
//        int[] newIntArr = Arrays.stream(intArr).filter(a->a<=30).toArray();
//        // Arrays.stream(intArr).filter(a->a<=30) 자체가 intstream에 포함되어있기 때문에 .toArray() 만 써도 된다 !
//
//        // 중복제거
//        int[] newIntArr2 = Arrays.stream(intArr).distinct().toArray();
//        System.out.println(Arrays.toString(newIntArr2));
//        int total = Arrays.stream(intArr).sum();
//        System.out.println(total);
//
//        // map : 기존의 stream 을 조작하여 새로운 스트림 반환
//        int[] newMapArr = Arrays.stream(intArr).map(a->a*10).toArray();
//        System.out.println(Arrays.toString(newMapArr));
//        // 홀수찾기
//        int[] arr1 = {1,2,3,4,5,6};
//        int[] answer = Arrays.stream(arr1).filter(a->a%2!=0).toArray();
//        System.out.println(Arrays.toString(answer));
//        // 홀수만 담은 배열의 값을 제곱한 새로운 배열 생성 : filter, map
//        int[] answer2 = Arrays.stream(answer).map(a->a*a).toArray();
//        System.out.println(Arrays.toString(answer2));
//        // 홀수만 담은 배열의 값을 제곱한 새로운 배열 오름차순 정렬 생성 : filter, map, sorted
//        int[] arr4 = Arrays.stream(answer2).sorted().toArray();
//
//        // mapToInt : intStream 형태로 변환해주는 map
//        String[] stArr1 = {"HTML", "CSS", "JAVASCRIPT", "JAVA"};
//        // 각 문자열의 길이를 담은 새로운 int 배열 생성
//        // mapToInt 를 활용해 int 배열을 생성하는 map 사용하기
//        int[] intArr5 = Arrays.stream(stArr).mapToInt(a->a.length()).toArray();
//        int[] intArr6 = Arrays.stream(stArr).mapToInt(a->a.length()).limit(3).toArray();
//        System.out.println(Arrays.toString(intArr5));
//        System.out.println(Arrays.toString(intArr6));

//        // stream 의 소모 > sum : 합계, reduce : 누적합계, foreach : 출력
//        int[] intArr = {10, 20, 30, 40};
//        Arrays.stream(intArr).forEach(a-> System.out.println(a));
//        int intArrTotal = Arrays.stream(intArr).sum();
//        // 값이 있을 수도 있고, 없을 수도 있음을 명시한 객체.
//        int intArrMax = Arrays.stream(intArr).max().getAsInt(); //.getAsInt() : 값을 꺼내겠다 !
//        int intArrMin = Arrays.stream(intArr).min().getAsInt();
//        int intArrCount = (int)Arrays.stream(intArr).count();
//
//        // reduce(초기값, 연산식);
//        int allMultiply = Arrays.stream(intArr).reduce(1, (a,b) -> a*b);
//        int allAdd = Arrays.stream(intArr).reduce(0, (a,b) -> a+b);
//        System.out.println(allMultiply);
//        System.out.println(allAdd);
//        String[] stArr = {"hello", "java", "world"};
//        String stAllAdd = Arrays.stream(stArr).reduce(":",(a,b) -> a+b);
//        System.out.println(stAllAdd);

//        // findFirst
//        // 0503 파일에 작성해둔 Student 클래스 사용
//        List<Student> students = new ArrayList<>();
//        students.add(new Student("kim", 20));
//        students.add(new Student("choi", 32));
//        students.add(new Student("lee", 36));
//        students.add(new Student("park", 22));
//        // 나이가 30 이상인 학생 중 첫번째 index 값을 가지는 학생 객체 생성
//        Student s1 = students.stream().filter(a->a.getAge()>=30).findFirst().get();
//        System.out.println(s1);

//        // student 객체 실습
//        // 1. 모든 객체의 평균 나이
//        // 2. 가장 나이 어린 사람 찾기
//        // 3. 30대의 이름을 String 배열에 담기
//        int aveAge = (int)students.stream().mapToInt(a->a.getAge()).average().getAsDouble();
//        Student s2 = students.stream().sorted((a,b)->a.getAge()-b.getAge()).findFirst().get();
//        // 익명 함수를 만들어서 Comparator 객체로 던져줌. 마찬가지로 오름차순 a->b
//        System.out.println(s2.getName());
//        String[] nameArr = students.stream().filter(a->a.getAge()>=30).map(a->a.getName()).toArray(String[]::new);
//        // students.stream().filter(a->a.getAge()>=30) 여기까지는 String 타입 , map 이후부터 Int
//        System.out.println(Arrays.toString(nameArr));

        // Optional 객체 : 특정 객체에 값이 없을지도 모른다는 것을 명시적으로 표현.
        // ofNullable : null 이 있을 수도 있는 경우에 Optional 객체를 생성하는 메서드.
//        Optional<String> opt1 = Optional.ofNullable(null);
//        String st1 = null;
//        if(opt1.isPresent()){
//            System.out.println(opt1.get().compareTo("hello"));
//        }
//        else{
//            System.out.println("값이 없습니다.");
//        }

//        // Optional 객체 생성 세 가지
//        Optional<String> opt1 = Optional.empty();
//        Optional<String> opt2 = Optional.of("hello"); // null 이 못 들어감 !
//        Optional<String> opt3 = Optional.ofNullable(null); // null 이 들어갈 수 있음
//
//        // Optional 객체 처리 방법 네 가지
//        // 방법 1. isPresent() 확인 후 get()
//        // 방법 2. orElse() : 값이 있으면 있는 값 return, 없으면 지정값 return
//        // 방법 3. orElseGet() : 값이 있으면 있는 값 return, 없으면 람다함수 실행
//        // 방법 4. orElseThrow() : 가장 중요 !! 값이 있으면 있는 값 return, 없으면 지정된 예외 강제 발생.
//
//        // 방법 1.
//        if(opt3.isPresent()){
//            System.out.println(opt3.get().length());
//        }
//        // 방법 2.
//        System.out.println(opt3.orElse("").length()); // "hello" > 5 , null > 0
//        // 방법 3.
//        System.out.println(opt3.orElseGet(()->new String("")).length());
//        // 방법 4.
//        // 개발에서 예외를 사용자에게 적절한 메세지 전달 목적으로 강제 발생시키는 경우도 존재한다.
//        System.out.println(opt3.orElseThrow(()->new NoSuchElementException("값이 없습니다.")).length());

        List<Student> students = new ArrayList<>();
        students.add(new Student("kim", 20));
        students.add(new Student("kim1", 21));
        students.add(new Student("kim2", 23));
        students.add(new Student("kim3", 25));
//        방법1
        OptionalDouble answer = students.stream().filter(a->a.getAge()>=29).mapToInt(a->a.getAge()).average();
        if(answer.isPresent()){
            System.out.println(answer.getAsDouble());
        }else {
            System.out.println("값이 없습니다.");
        }
        System.out.println(answer);
//        방법2
        double answer2 = students.stream().filter(a->a.getAge()>=29).mapToInt(a->a.getAge()).average().orElseThrow(()->new NoSuchElementException("값이 없습니다."));
        

    }
}
