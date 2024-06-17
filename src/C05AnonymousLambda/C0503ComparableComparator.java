package C05AnonymousLambda;

import java.util.*;

public class C0503ComparableComparator {
    public static void main(String[] args) {
//        자바에서는 비교를 위한 인터페이스 2개 제공 : Comparable, Comparator
//        Comparable 인터페이스에는 compareTo 메서드 선언
//        Comparator 인터페이스에는 compare 메서드 선언

//        String 클래스에 compareTo 내장 (Comparable 구현)
//        String 클래스 외에 많은 내장 클래스에서 CompareTo
//        String a = "hello";
//        String b = "java";
////        두 문자열의 각 자리를 순차적으로 비교
////        문자열의 비교는 유니코드 값의 차이를 반환
//        System.out.println(a.compareTo(b));
//
//        Integer a1 = 10;
//        Integer a2 = 10;
//        System.out.println(a1.compareTo(a2));

//        List<String> myList = new ArrayList<>();
//        myList.add("java");
//        myList.add("python");
//        myList.add("javascript");
//        Collections.sort(myList);
//        System.out.println(myList);
//        Collections.sort(myList, Comparator.reverseOrder());
//        System.out.println(myList);

//        List<Student> students = new ArrayList<>();
//
//        students.add(new Student("hong1",18));
//        students.add(new Student("hong2",17));
//        students.add(new Student("hong3",19));
//        students.add(new Student("hong4",10));
//        students.add(new Student("hong5",20));

//      방법1.  Student 객체에서 Comparable 을 구현 -> compareTo 메서드를 오버라이딩
//        Collections.sort(students);
//        for (Student student : students) {
//            System.out.println(student.getName());
//            System.out.println(student.getAge());
//        }
//        방법 2. Comparator 를 구현한 익명객체를 sort 에 주입
//        Comparator<Student> myComparator = new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
////                return o1.getAge() - o2.getAge();
//                return o1.getName().compareTo(o2.getName());
//            }
//        };
        // 객체 안에 구현된 게 하나밖에 없는 함수 >> 화살표 함수로 표현 가능
        //students.sort((a,b) -> a.getName().compareTo(b.getName()));
//        students.sort((o1,o2) -> o1.getAge() - o2.getAge());
        // System.out.println(students);
//
//        for (Student student : students) {
//            System.out.println(student.getName());
//            System.out.println(student.getAge());
//        }

        // 아래 문자열을 글자 길이 순서로 내림차순 정렬하여라.
//        String[] stArr = {"hello", "java", "C++", "world2"};
//        Arrays.sort(stArr, Comparator.reverseOrder()); // => 이건 문자 기준 내림차순 정렬
        // > Arrays.sort(stArr, (a,b)->b.compareTO(a)); : b 가 앞이면 내림차순, a가 앞이면 오름차순.
//        Arrays.sort(stArr, (a22,b22)->b22.length()-a22.length());
//        System.out.println(Arrays.toString(stArr));

//        // [4,5], [1,2], [5,0], [3,1]
//        // 위 배열이 들어간 아래 리스트를 배열의 0번째가 아닌 1번째를 기준으로 내림차순 정렬. (뒤 숫자 값 기준 정렬)
//        List<int[]> myList = new ArrayList<>();
//        myList.add(new int[]{4,5});
//        myList.add(new int[]{1,2});
//        myList.add(new int[]{5,0});
//        myList.add(new int[]{3,1});
//        myList.sort((a33,b33)->b33[1]-a33[1]); // 내림차순이라서 b - a
//        // 빼기(-) 연산을 통해서 음수면 작고, 0이면 같고, 양수면 크다 ! 를 표현.
//        // compareTo 도 마찬가지. 왼쪽이 더 크면 양수, 같으면 0, 오른쪽이 더 크면 음수!
//        for(int[] a66 : myList){
//            System.out.println(Arrays.toString(a66));
//        }

        // 위 배열이 들어간 아래 리스트를 배열의 0번째가 아닌 1번째를 기준으로 내림차순 정렬. (뒤 숫자 값 기준 정렬)
        // 만약 1번째가 같으면 내림차순 정렬.
//        List<int[]> myList = new ArrayList<>();
//        myList.add(new int[]{4,5});
//        myList.add(new int[]{1,2});
//        myList.add(new int[]{5,5}); // 5,0 에서 5, 5로 수정.
//        myList.add(new int[]{3,1});
//        Comparator<int[]> c1 = (o1, o2){
//            if (o1[1] == o2[1]) {
//                return o2[0] - o1[0];
//            } else {
//                return o2[1] - o1[1];
//            }
//        };
//            @Override
//            public int compare(int[] o1, int[] o2){
//                if(o1[1] == o2[1]){
//                    return o2[0] - o1[0];
//                }
//                else{
//                    return o2[1] - o1[0];
//                }
//            }
//        };
//        myList.sort((a, b)->b[1]-a[1]);
//        for(int[] a : myList){
//            System.out.println(Arrays.toString(a));
//        }
//        String[] stArr = {"hello", "java", "C++", "world2"};
//        // 수업이 너무 빨라서 따라갈 수가 없네 . . . . ㅠ
//        Queue<String> pq = new PriorityQueue<>(); //Comparator 를 받기 위한 오버로딩이 되어 있을 것.
//                                                 //new PriorityQueue<>(Comparator.reverseOrder()); 도 가능함.
//        // 글자 길이 내림차순 pq
//        // Queue<String> pq = new PriorityQueue<>((o1, o2) -> o2.length() - o1.lenghth());
//        for(String s : stArr){
//            pq.add(s);
//        }
//        while(!pq.isEmpty()){
//            System.out.println(pq.poll());
//        }
//        int[] numbers = {3, 30, 34, 5, 9};
//        Arrays.sort(numbers);
//        int max = numbers[0];
//        String answer = "";
//        for(int i = 0; i < numbers.length; i++){
////            if(max < numbers[i] % 10){
////                max = numbers[i] % 10;
////                answer += numbers[i];
////            }
//            // 그럼 10으로 나눈 몫이 a, 나머지가 b인 배열을 만들어서 안대내.
//            // 34303 이 아니라 34330 이 되어야 하니까 ㅠ
//            // 만약 나머지가 똑같으면 일단 배열에 집어넣기..?
//            // 그걸로 숫자 조합해서 큰 게 뭔지 찾기
//            // String join > builder 나 buffer 가 더 빠름,,
//
//
////            numbers[i] = 0;
//        }
//        System.out.println(answer);
        //myList.sort((a33,b33)->b33[1]-a33[1]);

        // 스레드 구현 방법 : 스레드 상속, Runnable 주입
        // Runnable 인터페이스 : 스레드 구현.
        // Runnable 인터페이스 주입을 통한 스레드 생성.
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("새로 생성한 스레드1 입니다.");
            }
        });
        t1.start();
        Thread t2 = new Thread(()-> System.out.println("새로 생성한 스레드2 입니다."));
        t2.start();
        new Thread(()-> System.out.println("새로 생성한 쓰레드3 입니다.")).start();
        System.out.println("main 스레드 입니다.");
    }
}
//class Student implements Comparable<Student>{
class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    // student 출력하는 폼 만들기
    // 모든 클래스의 조상클래스인 Object 클래스의 toString 메서드를 Overriding 하여
    // 객체 호출시에 자동으로 toString 메서드 호출
    @Override
    public String toString(){
        return "이름 : " + this.name + ", 나이 : " + this.age;
    }

//    @Override
//    public int compareTo(Student s) {
//        return this.age - s.getAge();
////        이름 내림차순
////        return this.name.compareTo(s.getName());
////        이름 오름차순
////        return s.getName().compareTo(this.name);
//
//    }
}