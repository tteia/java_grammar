package C01Basic;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class C07Array {
    public static void main(String[] args) {
//        // 배열 표현식 1 : 리터럴 방식
//        int[] intArr1 = {1,2,3,4,5};
//        // 배열 표현식 2 : new ___ > 배열 선언 후 할당 방식
//        int[] intArr2 = new int[5]; // 선언될 때 반드시 길이도 함께 선언
//        intArr2[0] = 1;
//        intArr2[1] = 2;
//        intArr2[2] = 3;
//        intArr2[3] = 4;
//        System.out.println(intArr2[4]); //0으로 초기화
//        for(int i = 0; i < intArr2.length; i++){
//            System.out.println(intArr2[i]);
//        }
//        // for each 문은 배열의 값 변경 X
//        for(int i : intArr2){
//            System.out.println(i);
//        }
//        // 배열 표현식 3
//        int[] intArr3 = new int[]{1,2,3,4};
//        // 배열 표현식 4 : 불가
//        int[] intArr4 = new int[]; // 배열의 길이는 사전에 지정되어야 한다.
//        String[] stArr = new String[5];
//        stArr[0] = "hello";
//        stArr[1] = "java";
//          // null pointer exception
//        String[] stArr2 = new String[5];
//        Arrays.fill(stArr2, ""); // 공백으로 채워놓는 것.
//        System.out.println(stArr2[3]);

        // 85, 65, 90인 int 배열 선언, 총합 / 평균 구하기.

        // 최대값, 최소값 구하기
//        int[] arr = {10, 20, 30, 40, 9, 12};
//        int max = 0; // max = arr[0] 또는 Integer.MIN_VALUE 로도 세팅 가능.
//        int min = arr[0]; // Integer.MAX_VALUE 로도 가능!
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] > max){
//                max = arr[i];
//            }
//            if(arr[i] < min){
//                min = arr[i];
//            }
//        }
//
//        System.out.println(max);
//        System.out.println(min);
//    }
        // 배열의 순서바꾸기
//        int[] arr = {10, 20};
//        int temp = arr[0];
//        arr[0] = arr[1];
//        arr[1] = temp;

//        int[] arr = {10, 20, 30, 40, 50};
//
//        for (int i = 0; i < arr.length - 1; i++) {
//            int temp = arr[i];
//            arr[i] = arr[i + 1];
//            arr[i + 1] = temp;
//        }
//        System.out.println(Arrays.toString(arr));

        // 배열 뒤집기
//        int[] arr = {1,2,3,4,5};
//        int[] arr1 = new int[arr.length];
//        for(int i = arr.length-1; i >= 0; i--){
//            int temp = arr[i];
//            for(int j = 0; j < arr1.length; j++){
//                arr1[j] = temp;
//            }
//        }
//        System.out.println(Arrays.toString(arr1));

//    static void test(int[] arr){
//    }

//        int num = 1234;
//        String nums = Integer.toString(num);
//        String newnum = "";
//        for(int i = (nums.length() - 1); i >= 0; i--){
//            newnum += nums.charAt(i);
//        }
//        System.out.println(newnum);
//        int num = 1234;
//        String stNum = Integer.toString(num);
//        StringBuilder sb = new StringBuilder();
//        int count = stNum.length() - 1;
//        for(int i = 0; i < stNum.length(); i++){
//            sb.append(stNum.charAt(count-i));
//        }
//        String answer = sb.toString(); // int로 뱉으라고 했다면? int answer = Integer.parseInt(result);
//        System.out.println(answer);

        // 정렬
//        int[] arr = {5,1,2,7,3,8};
//        Arrays.sort(arr); // 오름차순 정렬이 기본
//        System.out.println(Arrays.toString(arr));
//
//        // 문자 정렬
//        // 아스키 코드 기준으로 정렬 -> 대문자가 먼저 나온다.
//        String[] fruits = {"banana", "kiwi", "apple", "Apple"};
//        Arrays.sort(fruits);
//        System.out.println(Arrays.toString(fruits));

        // 문자열의 index 순서로 비교.
//        String[] fruits2 = {"apple1", "apple21", "apple11"};
//        Arrays.sort(fruits2);
//        System.out.println(Arrays.toString(fruits2));

        // 내림차순
//        String[] st_arr = {"hello", "hi", "bye", "goodmorning"};
//        Arrays.sort(st_arr, Comparator.reverseOrder());


        // 기본형 타입은 Comparator 로 처리 불가. ex)숫자
//        int[] arr = {5,1,7,2,9,3};
        // Arrays.sort(arr, Comparator.reverseOrder()); -> 타입 오류로 작동하지 않음
        // 방법 1. 오름차순 정렬 후 배열 뒤집기

        // 방법 2. streamapi, lambda를 활용한 내림차순 정렬
//        int[] answer = Arrays.stream(arr) // arr 를 대상으로 Stream 객체로 감싼다
//                .boxed() // int 요소를 Integer 로 형변환 시키는 메서드.
//                .sorted(Comparator.reverseOrder())
//                .mapToInt(a->a) // Integer를 int로 형변환.
//                .toArray(); // 배열로 전환


        // 프로그래머스 k번째 수
        /*
        for(int i = 0; i < commands.length; i++){
            int start = commands[i][0] - 1;
            int end = commands[i][1];
            int value = commands[i][2] - 1;
            int[] temp = new int[end-start];
            int count = 0
            for(int j = start; j < end; j++){
                temp[count] = array[i];
                count++;
            }
            Arrays.sort(temp);
         */

        // 선택정렬 알고리즘
//        int[] arr = {17, 20, 19, 25, 12};
//        for(int i = 0; i < arr.length; i++){
//            for(int j = i+1; j < arr.length; j++){
//                int tmp = 0;
//                if(arr[i] > arr[j]){
//                    tmp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = tmp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));

        // 숫자 조합의 합 : 모두 각기 다른 숫자의 배열이 있을 때,
        // 만들어질 수 있는 2개의 조합의 합을 출력.
//        int[] intArr = {10, 20, 30, 40, 50, 60};
//        for(int i = 0; i < intArr.length; i++){
//            for(int j = i+1; j < intArr.length; j++){
//                int A = intArr[i];
//                int B = intArr[j];
//
//            }
//        }


        // 배열의 복사 : copyOf(배열, end_length), copyOfRange(배열, start, end)
//        int[] arr = {10, 20, 30, 40, 50};
//        int[] newArr = Arrays.copyOf(arr, 10);
//        System.out.println(Arrays.toString(newArr));
//        int[] newArr2 = Arrays.copyOfRange(arr, 1, 4);
//        System.out.println(Arrays.toString(newArr2));

        // 프로그래머스 두 개 뽑아서 더하기
//        int[] numbers = {5, 0, 2, 7};
//        int[] newNums = new int[numbers.length*2];
//        int tmp = 0;
//
//        for(int i = 0; i < numbers.length; i++){
//            for(int j = i+1; j < numbers.length; j++){
//                newNums[tmp] = numbers[i]+numbers[j];
//                tmp++;
//            }
//        }
//        Arrays.sort(newNums);
//        int[] temp = new int[newNums.length];
//        int count = 0;
//        for(int i = 0; i < newNums.length; i++){
//            if(i == 0 || newNums[i] != newNums[i-1]){
//                temp[count] = newNums[i];
//                count++;
//            }
//        }
//        int[] answer = Arrays.copyOfRange(temp, 0, count);
//        System.out.println(Arrays.toString(answer));


        // 배열의 중복 제거
//        int[] temp = {10, 10, 5, 7, 40, 40, 10, 10};
//        Arrays.sort(temp); // {5, 7, 10, 10, 10, 10, 40, 40}
//        int[] newTemp = new int[temp.length];
//        int num = 0;
//
//        for(int i = 0; i < temp.length; i++){
//            if(i == 0 || temp[i] != temp[i-1]){
//                newTemp[num] = temp[i];
//                num++;
//            }
//        }
//        System.out.println(Arrays.toString(newTemp));
//        int[] answer = Arrays.copyOfRange(newTemp, 0, num);
//        System.out.println(Arrays.toString(answer));

        // 배열의 검색
//        int[] arr = {5, 3, 1, 8, 7};
//        int answer = 0;
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] == 8){
//                answer = i;
//                break;
//            }
//        }
//        System.out.println(answer);

        // 이진검색 (Binary Search) - 이분탐색
        // 복잡도 O(log n)
//        int[] arr = {1, 3, 6, 8, 9, 11, 15};
//        // 사전에 오름차순이 되어있어야 이진검색 가능.
//        System.out.println(Arrays.binarySearch(arr, 15));

        // 배열간 비교
//        int[] arr1 = {10, 20, 30};
//        int[] arr2 = {10, 20, 30};
//        // Arrays.equals : 값과 순서까지 동일해야 true
//        System.out.println(Arrays.equals(arr1, arr2));

        // 2차원 배열 선언과 할당
//        int[][] arr = new int[2][3];
//        arr[0][0] = 1;
//        arr[0][1] = 2;
//
//        // {{1,2,3}, {4,5,6}}
//        // 리터럴 방식으로 할당
//        int[][] arr2 = {{1,2,3}, {4,5,6}};
//
//        // 2차원 배열 출력
//        System.out.println(Arrays.deepToString(arr2));


        // 2차원 가변배열 선언 후 할당
//        int[][] arr = new int[2][];
//        arr[0] = new int[3];
//        arr[1] = new int[4];
//        // 가변 배열 리터럴 방식
//        int[][] arr2 = {{10,20}, {10,20,30}};

        // [3][4] 사이즈 배열을 선언한 뒤
        // 1~12까지 숫자값을 각 배열에 할당한 후 출력
        // {1,2,3,4}, {5,6,7,8}, {9,10,11,12}

//        int[][] arr = new int[3][4];
//        int count = 1;
//        for(int i = 0; i < arr.length; i++){
//            for(int j = 0; j < arr[i].length; j++){
//                arr[i][j] = count;
//                count++;
//            }
//        }
//        System.out.println(Arrays.deepToString(arr));
//
//        int[][] arr1 = {{1,2},{2,3}};
//        int[][] arr2 = {{3,4},{5,6}};
//        int[][] answer = new int[arr1.length][arr1[0].length];
//        for(int i = 0; i < arr1.length; i++){
//            for(int j = 0; j < arr1[i].length; j++){
//                answer[i][j] = arr1[i][j] + arr2[i][j];
//            }
//        }
//        System.out.println(Arrays.deepToString(answer));

        // 가변배열실습 : 행의길이(전체배열의길이) 5 => {{10},{20,20},...{50,50,50,50,50}}
        int[][] arr = new int[5][];
        for(int i = 0; i < arr.length; i++){
            arr[i] = new int[i+1];
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = (i+1)*10;
            }
        }
        System.out.println(Arrays.deepToString(arr));

    }
}
