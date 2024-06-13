package C01Basic;

import java.math.BigDecimal;
import java.util.Scanner;

public class C002Variable {
    public static void main(String[] args) {
//        정수 : byte(1바이트), int(4바이트), long(8바이트)
//        byte a = 127;
//        byte b = -128;
//        a++;
//        b--;
//        System.out.println(a);
//        System.out.println(b);
//
//        int int_a = 10;
//        long long_a = 20L; // 명시적으로 L을 붙여 long 타입임을 명시하기도 함.
//
////        실수 : float, double(기본)
//        float f1 = 1.123f;
//        double d1 = 1.123;
//
//        부동소수점 오차 테스트
//        double d2 = 0.1;
//        System.out.println(d2);
//
//        double total = 0;
//        for(int i = 0; i < 1000; i++){
//            total += 0.1 * 10;
//        }
//        System.out.println(total/10);
////        소수점 오차의 대안으로 Bigdecimal 클래스 사용
//        double d1 = 1.03;
//        double d2 = 0.42;
//        System.out.println(d1-d2);
//        Bigdecimal의 원리 : 저장할 때 문자열로 저장해서, 연산할 때 정수로 변환. 최종 결과는 실수로 반환.
//        BigDecimal b1 = new BigDecimal("1.03");
//        BigDecimal b2 = new BigDecimal("0.42");
//        double result = b1.subtract(b2).doubleValue();
//        System.out.println(result);

////        문자형 : char
//        char m1 = '가';
//        System.out.println(m1);
//
////        boolean : true or false
//        boolean bool1 = true;
//        boolean bool2 = false;
//        Scanner sc = new Scanner(System.in);
//        int input1 = sc.nextInt();
//        boolean bool3 = input1 > 0;
////        if 조건절 안에 boolean 타입값이 들어옴에 유의
//        if(bool3){
//            System.out.println("입력하신 값은 0보다 큽니다.");
//        }
//        타입 변환
////        묵시적 타입 변환
//        char ch1 = 'a';
//        int ch1_num = ch1;
////        알파벳 비교를 위한 묵시적 타입변환 발생 => 매우 빈번
//        System.out.println('a' > 'b');
////        명시적 타입 변환
//        System.out.println((int)'a');
//
////        int -> double 형변환은 문제 없음
//        int i1 = 10;
//        double d1 = i1;
//        System.out.println(d1);

////        double -> int 묵시적 형변환 불가능. 명시적은 가능. => 소수점 절사
//        double d2 = 10.5;
//        int i2 = (int)d2;
//        System.out.println(i2);
//
//
////        형변환 관련 나눗셈 문제
//        int a = 1;
//        int b = 4;
//        int c = 1/4;
////        int/int 이므로 결과값을 int로 판단, 소수점 절사
////        두 값 중에 한 값만이라도 double로 명시적 형변환 시켜주면 결과값 double
//        double d = 1/4;
//        System.out.println(c);
//        System.out.println(d);

////        변수와 상수
//        int a1 = 10;
////        변수값 재할당
//        a1 = 20;
//        System.out.println(a1);
//
////        상수는 초기화 이후에 값이 재할당되는 것이 불가능
////        상수는 final 키워드를 통해 표현. 값의 항상성을 유지할 수 있다.
////        일반적으로 상수값은 대문자로 표기
//        final int AGES = 20;
//        AGES = 20; //변수를 재선언하는 것을 막음.
    }
}
