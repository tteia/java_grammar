package C01Basic;

import java.util.Scanner;

public class C04Ifstatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
////        도어락키 if문
//        int answer = 1234;
//        Scanner sc = new Scanner(System.in);
//        int password = sc.nextInt();
//
//        if(answer == password){
//            System.out.println("문이 열렸습니다.");
//        }
//
//        else{
//            System.out.println("비밀번호가 다릅니다.");
//        }
//
//    }
//    알파벳이 소문자인지 대문자인지 판별하는 프로그램
//        char alp = sc.nextLine().charAt(0);
//
//        if (alp >= 'a' && alp <= 'z') {
//            System.out.println("소문자입니다.");
//        } else if (alp >= 'A' && alp <= 'Z') {
//            System.out.println("대문자입니다.");
//        }
//        else {
//            System.out.println("알파벳이 아닙니다.");
//        }

//        택시요금 : 10,000 , 버스 요금 : 3,000원, 킥보드 : 2,000
//        System.out.println("교통비를 입력하세요.");
//        int money = sc.nextInt();
//        if(money >= 10000){
//            System.out.println("택시 타세요.");
//        } else if (money >= 3000) {
//            System.out.println("버스 타세요.");
//        } else if (money >= 2000) {
//            System.out.println("킥보드 타세요.");
//        }
//        else {
//            System.out.println("걸어가세요.");
//        }

        //삼항연산자 : 결과값 = 조건식 ? 반환값1 : 반환값2
//        int answer = 1234;
//        System.out.println("비밀번호를 입력하세요.");
//        int input = sc.nextInt();
//        String result = (answer == input) ? "문이 열렸습니다" : "비밀번호가 다릅니다.";
//        System.out.println(result);

//        switch문 : if / else if 등의 조건문을 가독성 있게 표현하는 구문.
        int answer = 1234;
        System.out.println("원하시는 서비스 번호를 입력하세요.");
        int input = sc.nextInt();
        switch (input){
            case 1:
                System.out.println("대출 업무입니다.");
                break;
            case 2:
                System.out.println("예금 업무입니다.");
                break;
            case 3:
                System.out.println("적금 업무입니다.");
                break;
            case 0:
                System.out.println("상담사 연결입니다.");
                break;
            default:
                System.out.println("잘못 누르셨습니다.");
                break;
        }
    }
}
