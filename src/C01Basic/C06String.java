package C01Basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class C06String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        참조자료형 : 기본 자료형을 제외한 모든 자료형
//        WrapperClass : 기본형 타입을 Wrapping한 클래스
//        int와 Integer간의 형변환
//        int a
        // String 과 int 의 형변환
//        int a = 10;
//        // int -> String 변환
//        String st1 = Integer.toString(a);
//        String st2 = String.valueOf(a);
//        // String -> int 변환
//        int b = Integer.parseInt(st1);

        // 참조 자료형에 원시 자료형을 담을 때에는 Wrapper 클래스를 써야한다.
//        List<Integer> list1 = new ArrayList<Integer>();
//        list1.add(10);
//        list1.add(20);
//        list1.add(30);


//        String 변수 생성 방법
        // 객체 생성
//        String st1 = new String("hello");
//      // 리터럴 방식 : 권장하는 방식.
        // 문자열 pool 을 통해 성능 향상.
//        String st2 = "hello";
//        String st3 = new String("hello");
//        String st4 = "hello";
//        System.out.println(st1 == st3); //stack 에 값이 저장된 게 아니라 힙 메모리에 주소값이 저장. => 주소값 비교가 되기 때문에 false
//        System.out.println(st2 == st4); //pool 에 저장되기 때문에 똑같은 주소를 바라보게 됨.
//        System.out.println(st3 == st4); //false
//        System.out.println(st1.equals(st2)); //equals 로 비교하면? 모두 true !
        // String 문자열 비교는 equals ! 메모리 주소 비교가 아니라 값 비교.
//        System.out.println("hello".equals("hELlo")); // false
//        System.out.println("hello".equalsIgnoreCase("hEllo")); // true
//
        // 문자열 길이 : length();
//        String st1 = "hello java java";
//        System.out.println(st1.length());
//        // indexOf : 특정 문자열의 위치 반환, 가장 먼저 나오는 문자열의 위치.
//        int index1 = st1.indexOf("java");
//        System.out.println(index1);
//        System.out.println(st1.lastIndexOf("java")); // 마지막 문자열의 index 위치.
//
//        // contains : 특정 문자열이 있는지 여부를 boolean 으로 리턴.
//        System.out.println(st1.contains("hello")); //true
//        System.out.println(st1.contains("world")); //false
//
//        // charAT : 특정 index의 문자(char)값을 리턴
//        String st = "asdwdgerq";
//        char ch1 = st.charAt(0);
//        System.out.println(ch1);
//        // 위 문자열에 a의 개수가 몇 개인지 count
//        int count = 0;
//        for(int i = 0; i < st.length(); i++){
//            if(st.charAt(i) == 'a'){
//                count++;
//            }
//        }
//        System.out.println(count);

        // toCharArray() : String 문자열을 char 배열로 리턴.
//        System.out.println(Arrays.toString(st.toCharArray()));
        // toCharArray , for each 문 활용해서 a가 몇 개인지 count.
//        char[] arr = st.toCharArray(); // 배열로 만들기
//        int count = 0;
//        for(char i : arr){
//            if(i == 'a'){
//                count++;
//            }
//        }
//        System.out.println(count);

        // 문자열 더하기 : +=
//        String st1 = "hello";
//        st1 += " world"; // 연산작업 -> 메모리에 접근하여 재할당 것과 똑같다.

//        // substring(a,b) : a 이상 b 미만의 index 문자를 잘라 리턴
//        String str = "hello world";
//        System.out.println(str.substring(0,5));
//        System.out.println(str.substring(6,str.length()));

        // 프로그래머스 > 특정 문자 제거하기
        /*
        class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        char alp = letter.charAt(0);
        for(int i = 0; i < my_string.length(); i++){
            if(my_string.substring(i, i+1).equals(letter)){
            answer += my_string.substring(i,i+1);
        }
        return answer;
    }
}
         */

        // trim, strip : 문자열 양쪽 끝의 공백 제거.
        // 성능은 똑같음 ! strip(후기모델) 을 더 보편적으로 사용.
//        String trimSt1 = " Hello World  ";
//        String trimSt2 = trimSt1.trim();
//        String trimSt3 = trimSt1.strip();
//        System.out.println(trimSt3);
//        System.out.println(trimSt1);

        // toUppercase : 대문자로 변환 , toLowercase : 소문자로 변환.
//        String s1 = "Hello";
//        String s2 = s1.toUpperCase();
//        System.out.println(s2);
//        String s3 = s1.toLowerCase();
//        System.out.println(s3);

        // char -> String 변환
//        char ch1 = 'a';
//        String st1 = Character.toString(ch1);
//        System.out.println(st1);
//        char ch2 = st1.charAt(0);
//        System.out.println(ch2);

        // replace(a,b) : a 문자열을 b 문자열로 대체
//        String st1 = "hello world";
//        String st2 = st1.replace("world", "java");
//        System.out.println(st2);

        // replaceAll(a,b) : replace 와 동일, 정규 표현식을 쓸 수 있음.
//        String st1 = "01abc123한글123"; // 숫자, 알파벳, 한글 등이 섞여있을 때
//        String answer = "";
//        // for 문 활용으로 소문자 알파벳 제거
//        for (int i = 0; i < st1.length(); i++){
//            if(st1.charAt(i) >= 'a' && st1.charAt(i) <= 'z'){
//                continue;
//            }
//            else{
//                answer += st1.charAt(i);
//            }
//        }
//        System.out.println(answer);

        // replaceAll 과 정규 표현식 활용
//        String st1 = "01QWERabc123한글123"; // 숫자, 알파벳, 한글 등이 섞여있을 때
//        // [a-z]+ : 한 개 이상의 소문자를 표현하는 정규 표현식.
//        // [A-Za-z]+ : 대소문자 포함
//        // [가-힣]+ : 한글
//        String answer = st1.replaceAll("[A-Za-z]","");
//        System.out.println(answer);

        // String의 matches 와 Pattern.matches()
//        String test = "helloA";
//        System.out.println(test.matches("[A-Za-z]+"));
//
//        // ^ : 정규표현식의 시작, $ : 정규표현식 끝, * : 빈 값 포함
//        boolean b2 = Pattern.matches("^[A-Za-z]*$", "helloworld");
//        System.out.println(b2);

        // 전화번호 패턴 검증
//        String number = sc.nextLine();
//        if(Pattern.matches("^\\d{3}-\\d{4}-\\d{4}$", number)){
//            System.out.println("올바르게 입력하셨습니다.");
//        }
//        else{
//            System.out.println("틀린 형식의 전화번호입니다.");
//        }

        // 이메일 검증 : 소문자 알파벳과 숫자로 이루어진 id@알파벳.com
//        String email = sc.nextLine();
//        boolean b3 = Pattern.matches("^[a-z0-9]+@[a-z0-9]+.com$", email);
//        System.out.println(b3);

        // split : 특정 문자를 기준으로 문자열을 자르는 것. 문자열 배열을 return.
//        String a = "a:b:c:d";
//        String[] a_arr = a.split(":");
//        System.out.println(Arrays.toString(a_arr));
//        String b = "a b c  d";
//        // \s : 공백.
//        String[] b_arr = b.split("\\s+");
//        System.out.println(Arrays.toString(b_arr));

        // isEmpty 와 null (자료 타입)
//        String st1 = null;
//        String st2 = "";
//        // equal 관계가 아님
//        System.out.println(st1 == st2);
//        // 문제 발생 X
//        System.out.println(st2.isEmpty()); //true
//        // 문제 발생 O : NullPointer Exception 예외 발생
//        System.out.println(st1.isEmpty()); //false

        // join : String[]을 하나의 Sring 으로 만드는 메서드
//        String[] arr = {"java", "python", "C++", "javascript"};
//        String st = String.join(" ", arr);
//        System.out.println(st);

        // StringBuffer
//        StringBuffer sb1 = new StringBuffer("hello");
        // append : 문자열 가장 뒤에 다른 문자열을 더하는 것.
//        sb1.append(" world");
//        sb1.append(" java");
//        String answer = sb1.toString();
//        sb1.insert(5, " python");
//        sb1.delete(17, sb1.length());
//        System.out.println(sb1);


        // StringBuilder
        // String += < StringBuffer < StringBuilder
        // StringBuilder는 스레드 safe X
//        StringBuilder sb2 = new StringBuilder();
//        sb2.append("hello");
//        sb2.append("\n");
//        sb2.append("world");
//
//        //StringBuilder를 사용해서
//        String my_string = "hello";
//        StringBuilder sb3 = new StringBuilder();
//        int n = 3;
//        for(int i = 0; i < my_string.length(); i++){
//            char temp = my_string.charAt(i);
//            for(int j = 0; j < n; j++){
//                sb3.append(temp);
//            }
//        }
//        System.out.println(sb3);

        // 문자열 밀기 - 프로그래머스
//        String A = "hello";
//        String B = "ohell";
//        int len = A.length();
//        StringBuilder sb = new StringBuilder();
//        int answer = 0;
//        while(!sb.equals(B)){
//            sb.insert(0, sb.substring(len-1, len));
//            sb.delete(len, len+1);
//            answer++;
//            if(answer > len){
//                answer = -1;
//                break;
//            }
//

    }
}





