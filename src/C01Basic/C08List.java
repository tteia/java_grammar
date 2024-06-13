package C01Basic;

import java.util.*;
import java.util.stream.Collectors;

public class C08List {
    public static void main(String[] args) {
//        // List 선언 방법
//        ArrayList<String> myList = new ArrayList<String>();
//        ArrayList<String> myList1 = new ArrayList<>(); // 생락 가능
//
//        // 가장 일반적인 List 선언 방법
//        // 왼쪽에는 인터페이스(실체가 없고 선언만 되어있는 요소), 오른쪽에는 구현체(실체)
//        List<String> myList3 = new ArrayList<>();
//        // 초기값 생성방법
//        myList3.add("java");
//        myList3.add("python");
//        myList3.add("C++");
//        // 초기값 생성방법 2. 리스트를 주입 -> () 안에 리스트만 넣을 수 있다.
//        // Arrays.asList는 배열을 리스트로 변환하는 메서드
//        String[] myArr = {"java", "python", "C++"};
//        List<String> myList4 = new ArrayList<>(Arrays.asList(myArr));
//        List<String> myList6 = new ArrayList<>(List.of(myArr)); // 위 아래 모두 같은 표현
//
//
//        int[] intArr = {10, 20, 30};
//        // List<int[]> myList5 = new ArrayList<>(Arrays.asList(intArr));  // int 는 안되고 int[] 배열은 된다 !
//        // 위랑 아래랑 같은 표현. 아래는 for 문을 통해 담았다.
//        List<Integer> myList5 = new ArrayList<>();
//        for(int i : intArr){
//            myList5.add(i);
//        }

//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        //add(index, 값) : 중간에 값 삽입 => 성능이 저하됨.
//        myList.add(0,30);
//        System.out.pri.ntln(myList);
//
//        List<Integer> myList2 = new ArrayList<>();
//        myList2.add(1);
//        myList2.add(2);
//
//        // 특정 리스트의 요소를 모두 add
//        myList.addAll(myList2);
//
//        // get : 특정 위치의 요소를 반환
//        System.out.println(myList.get(0));
//
//        // for 문을 통해 전체 list 출력
//        // size() : 리스트의 길이(개수) 반환
//        for(int i = 0; i < myList.size(); i++){
//            System.out.println(myList.get(i));
//        }
//
//        // remove : 요소 삭제
//        // 1) index를 통한 삭제 2)value를 통한 삭제
//        myList.remove(0);
//        System.out.println(myList);
//        myList.remove(Integer.valueOf(10));
//        System.out.println(myList);

//        List<Integer> myList = new ArrayList<>();
//        myList.add(10);
//        myList.add(20);
//        myList.add(30);
//        // set(index, value) : 인덱스 위치의 자리에 value 값 변경(setting)
//        myList.set(myList.size()-1, 10);
//        System.out.println(myList);
//        // indexOf : 특정 값이 몇 번째 index 에 위치했는지 return
//        // 가장 먼저 나오는 값의 index 리턴
//        System.out.println(myList.indexOf(10));
//        // 전체 삭제 : clear()
//        myList.clear();
//        // isEmpty : 값이 비었는지 안 비었는지 !
        // empty 여도 null 은 아니다 !
//        List<Integer> list = new ArrayList<>();
//        // System.out.println(list.isEmpty());
//        // contains : 특정 값이 있는지 없는지 확인 !
//        list.add(10);
//        System.out.println(list.contains(20));

//        // 이중 리스트(리스트 안에 리스트)
//        List<List<Integer>> myList = new ArrayList<>();
//        myList.add(new ArrayList<>());
//        myList.add(new ArrayList<>());
//        myList.get(0).add(1);
//        myList.get(0).add(2);
//
//        // 리스트 안에 배열 : 배열 사이즈 2, 3, 4개짜리 배열 3개 들어가는 것으로 add.
        // 너무너무 어려워요.......ㅠ...
//        List<int[]> myList2 = new ArrayList<>();
//        에.
//        myList2.add(new int[]{1,2});
//        myList2.add(new int[]{10,20,30});

        // 리스트 정렬 : Collections.sort(), 리스트객체.sort()
//        List<Integer> myList = new ArrayList<>();
//        myList.add(5);
//        myList.add(3);
//        myList.add(2);
//        myList.add(1);
//        myList.add(4);
//        // 정렬 1. Collections.sort(); 전통적으로 많이 사용되는 방법.
//        Collections.sort(myList);
//        Collections.sort(myList, Comparator.reverseOrder());
//        //정렬 2. 리스트객체.sort();
//        myList.sort(Comparator.naturalOrder()); //오름차순
//        myList.sort(Comparator.reverseOrder()); //내림차순


        // 프로그래머스 : n의 배수 고르기
//        int n = 3;
//        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
//        List<Integer> tmp = new ArrayList<>();
//        for(int i = 0; i < numlist.length; i++){
//            if(numlist[i] % n == 0){
//                tmp.add(numlist[i]);
//            }
//        }
//        int[] answer = new int[tmp.size()];
//        for(int i = 0; i < answer.length; i++){
//            answer[i] = tmp.get(i);
//        }
//        System.out.println(Arrays.toString(answer));

        // 두 개 뽑아서 더하기

        // 배열과 List 간의 변환
        // 1. String 배열을 List<String>으로 변환.
        String[] stArr = {"java", "python", "C++"};
        // 1-1. Arrays.asList
        List<String> stList = new ArrayList<>(Arrays.asList(stArr));
        // 1-2. for 문을 통해 담기.
        // 1-3. streamApi(참고만)
        List<String> stList2 = Arrays.stream(stArr).collect(Collectors.toList());
        // 2. List<String>을 String 배열로 변환.
        // 2-1. for 문을 통해 담기.
        // 2-2. streamApi
        String[] stArr2 = stList.toArray(new String[stList.size()]);
        // 3. int 배열을 List<Integer> 로 변환.
        // 3-1. for 문을 통해 담기
        // 3-2. streamAPI 사용
        int[] intArr = {10,20,30,40};
        List<Integer> intList = Arrays.stream(intArr).boxed().collect(Collectors.toList()); // boxed -> int 요소를 형변환 시키는 것

    }
}
