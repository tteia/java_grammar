//package C05AnonymousLambda;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//
//public class C0503ComparableComparator {
//    public static void main(String[] args) {
//        // 자바에서는 비교를 위한 인터페이스 2개 제공 : Comparable, Comparator
//        // Comparable 인터페이스에서느 compareTo 메서드
//        // Comparator 인터페이스에는 compare 메서드 선언
//
//        // String 클래스에 compareTo 내장(Comparable 구현)
//        // String 클래스 외에 java 의 많은 내장 클래스에서 Comparable을 구현하고 있다.
////        String a = "hello";
////        String b = "horld";
////        // 두 문자열의 각 자리를 순차적으로 비교
////        // 문자열의 비교는 유니코드 값의 차이를 반환하는 것.
////        System.out.println(a.compareTo(b));
////
////        int a1 = 10;
////        int a2 = 10;
////        Integer a3 = 10;
////        Integer a4 = 10;
////        System.out.println(a4.compareTo(a3));
////
////        List<String> myList = new ArrayList<>();
////        myList.add("java");
////        myList.add("python");
////        myList.add("javascript");
////        Collections.sort(myList); // Comparable의 compareTo 메서드를 구현하여 정렬.
////        System.out.println(myList);
////        Collections.sort(myList, Collections.reverseOrder());
////        System.out.println(myList);
////        myList.sort(Comparator.naturalOrder());
//
//        // List 에 students 객체 5개 정도 넣기
//        List<Student> students = new ArrayList<>();
//        students.add(new Student("kim", 24));
//        students.add(new Student("lee", 21));
//        students.add(new Student("park", 35));
//        students.add(new Student("choi", 15));
//        students.add(new Student("kim", 30));
////        // 방법 1. student 객체에서 Comparable 을 구현 => compareTo 메서드를 오버라이딩.
//////        Collections.sort(students);
//////        Collections.sort(students);
//////        students.sort(Comparator.reverseOrder()); // 얘네 다 안됨 !!
////        for(Student s : students){
////            System.out.println("이름은 " + s.getName() + "나이는 " + s.getAge());
////        }
//        // 방법 2. Comparator 를 구현한 익명 객체를 sort 에 주입
//        // students.sort(Comparator.reversOrder());
//        Comparator<Student> myComparator = new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getAge() - o2.getAge(); // 오름차순
//            }
//        };
////        students.sort(myComparator);
//    }
//}
//
//class Student implements Comparable<Student>{
//    String name;
//    int age;
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    @Override
//    public int compareTo(Student s) {
//        return this.age - s.getAge();
//    }
//}
