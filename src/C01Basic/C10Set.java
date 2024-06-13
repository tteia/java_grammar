package C01Basic;

import java.util.*;

public class C10Set {
    public static void main(String[] args) {
//        Set<String> mySet = new HashSet<>();
//        mySet.add("h");
//        mySet.add("h");
//        mySet.add("e");
//        mySet.add("l");
//        mySet.add("l");
//        mySet.add("o");
//        System.out.println(mySet);

//        List<String> myList = new ArrayList<>();
//        myList.add("tennis");
//        myList.add("baseball");
//        myList.add("baseball");
//        myList.add("basketball");
//        myList.add("basketball");
//        // List 를 인자값으로 받아서 초기값 세팅 가능
//        Set<String> mySet = new HashSet<>(myList);
//        System.out.println(mySet);
//
//        String[] arr = {"tennis", "tennis", "baseball", "basketball"};
//        Set<String> mySet2 = new HashSet<>(Arrays.asList(arr));
//        mySet2.remove("baseball");
//        System.out.println(mySet2);

        // 집합 관련 함수 : 교집합(retainAll) / 합집합(addAll) / 차집합(removeAll)
        Set<String> set1 = new HashSet<>(Arrays.asList("java", "python", "javascript"));
        Set<String> set2 = new HashSet<>(Arrays.asList("java", "html", "css"));

        set1.retainAll(set2); // 교집합
        set1.addAll(set2); // 합집합
        set1.removeAll(set2); // 차집합
        System.out.println(set1);

        // 관련 문제 : 뉴스 클러스터링

        //LinkedHashSet, TreeSet
        Set<String> mySet = new TreeSet<>();
        mySet.add("hello5");
        mySet.add("hello5");
        mySet.add("hello4");
        System.out.println(mySet);

        // 두 개 뽑아서 더하기 : 배열 , 리스트, treeset 활용
//        int[] numbers = {2,1,3,4,1};
//        int n = numbers.length;
//        int[] newNums = new int[(n * (n - 1)) / 2];
//        int tmp = 0;
//
//        for(int i = 0; i < numbers.length; i++){
//            for(int j = i + 1; j < numbers.length; j++){
//                newNums[tmp] = numbers[i] + numbers[j];
//                tmp++;
//            }
//        }
//
//        Arrays.sort(newNums);
//        int[] temp = new int[newNums.length];
//        int count = 0;
//
//        for(int i = 0; i < newNums.length; i++){
//            if(i == 0 || newNums[i] != newNums[i - 1]){
//                temp[count] = newNums[i];
//                count++;
//            }
//        }
//
//        int[] answer = Arrays.copyOfRange(temp, 0, count);
//
//        Set<Integer> mySet = new TreeSet<>();

    }
}
