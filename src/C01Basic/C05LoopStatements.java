package C01Basic;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class C05LoopStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        while(true){
//            System.out.println("원하시는 단수를 입력해주세요.");
//            int num = sc.nextInt();
//            int a = 1;
//            while(a < 10){
//                System.out.println(num + " X " + a + " = " + (num*a));
//                a++;
//            }
//        }

//        도어락키 while 문
//        String answer = "0123";
//        int stop = 0;
//        while(true){
//            System.out.println("비밀번호를 입력하세요.");
//            String password = sc.nextLine();
//            if(answer.equals(password)){
//                System.out.println("문이 열렸습니다.");
//                break;
//            }
//            else {
//                System.out.println("비밀번호가 다릅니다.");
//                System.out.println();
//                stop++;
//                if(stop >= 5){
//                    System.out.println("입력 횟수 초과");
//                    break;
//                }
//            }
//
//        }
//        int answer = 1234;
//        int password = sc.nextInt();
//
//        if(answer == password){
//            System.out.println("문이 열렸습니다.");
//        }
//
//        else{
//            System.out.println("비밀번호가 다릅니다.");
//        }

//        int num = 1234;
//        int result = 0;
//        int a = num % 10;
//        int b = 1000;
//        int c = 0;
//
//        while(true){
//            result += (a-c) * b;
//            b /= 10;
//            c++;
//            if(b < 1){
//                break;
//            }
//        }
//
//        while(true){
//            int temp = num % 10;
//            result = result * 10 + temp;
//            num /= 10;
//            if(num == 0){
//                break;
//            }
//        }
//        System.out.println(result);
//        int a = 1;
//        do {
//            a++;
//            System.out.println(a);
//        }while (a < 10);

//        최대 공약수 구하기
//        int a = 24; int b = 36;
//        int max = 0;
//        for(int i = 1; i <= a; i++){
//            if(a % i == 0){
//                if(b % i == 0){
//                    if(max < i){
//                        max = i;
//                    }
//                }
//            }
//        }
//        System.out.println(max);

//        소수 찾기
//        int input = sc.nextInt();
//        boolean trueOrNot = false;
//        for(int i = 2; i < input; i++){
//            if(input % i == 0){
//                trueOrNot = true;
//                break;
//            }
//        }
//        if(trueOrNot == false){
//            System.out.println("소수입니다.");
//        }
//        enhanced for 문 (향상된 for문 - for each문)
        int[] arr = {1, 3, 5, 7, 9};
//        일반 for 문
        for(int i = 0; i < 5; i++){
            System.out.println(arr[i]);
        }
//        enhanced for 문 : 반복횟수는 arr에 들어가있는 데이터 수만큼 반복.
        for(int i : arr){
            System.out.println(i);
        }
////        일반 for문을 통한 arr값 변경 후 출력
//
////        향상된 for문을 통한 arr값 변경 후 출력
//        for(int i : arr){
//            i += 10;
//        }
//        System.out.println(Arrays.toString(arr)); // 메모리 주소 출력이 내용 출력.
//        자바 변수의 유효 범위 : {}
//        int num = 10;
//        if(num > 1){
//            int abc = 20;
//            num = 20;
//        }
////        if문 밖에서는 abc 변수의 존재를 모른다 > abc = 30; 과 같이 선언 불가.
//
////        다중 반복문
//        for(int i = 2; i < 10; i++){
//            System.out.println(i + "단 입니다.");
//            for(int j = 1; j < 10; j++){
//                System.out.println(i + " X " + j + " = " + i*j);
//            }
//        }
//
////        라벨문
//        loop1:
//        for(int i = 0; i < 5; i++){
//            boolean test = false;
//            for(int j = 0; j < 5; j++){
//                System.out.println("hello world");
//                if(j == 2){
//                    break loop1;
//                }
//            }
//
//        }
//        int[] arr = {1,2,3,4}; // 1차원 배열
//        int[][] arr2 = {{1,2,3},{4,5,11},{7,8,9},{10,11,12}}; // 2차원 배열
//        //System.out.println(arr2[2]); // 주소값 출력
//        int target = 11;
//        loop1:
//        for(int i = 0; i < 4; i++){
//            for(int j = 0; j < 3; j++){
//                if(arr2[i][j] == target) {
//                    System.out.println(i + "," + j + "에 11이 있습니다.");
//                    break loop1; // 먼저 찾으면 뱉어내고 멈춰야되니까 break loop1;
//                }
//
//            }
//        }

    }
}
