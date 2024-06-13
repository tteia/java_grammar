package C01Basic;

import java.util.*;

public class C09Map {
    public static void main(String[] args) {
//        Map<String, String> myMap = new HashMap<>();
//        myMap.put("basketball", "농구");
//        myMap.put("baseball", "야구");
//        myMap.put("soccer", "축구");
//        System.out.println(myMap);
//        myMap.put("baseball", "크리켓");
//        // baseball 을 map 에서 검색하는 복잡도 O(1)
//        System.out.println(myMap.get("baseball"));
//        myMap.remove("baseball");
//        // putIfAbsent : 비어있으면 put
//        myMap.putIfAbsent("basketball", "배구");
//        System.out.println(myMap);
//        // getOrDefault : key가 없으면 default 값 return
//        System.out.println(myMap.getOrDefault("baseball", "비어있음"));
//        System.out.println(myMap.containsKey("baseball"));
//
        // 농구 : 2 , 배구 : 2 , 야구 : 1
        Map<String, Integer> myMap = new HashMap<>();
//        String[] arr = {"농구", "농구", "배구", "야구", "배구"};
//        for(String a : arr){
//            if(myMap.containsKey(a)){
//                myMap.put(a, myMap.get(a)+1);
//            }
//            else{
//                myMap.put(a, 1);
//            }
////            myMap.put(a, myMap.getOrDefault(a, 0)+1);
//        }
//        System.out.println(myMap);

        // keySet() : 키 목록을 반환
        // values() : value 목록을 반환

        // map은 인덱스가 없기 때문에 enhanced for 문을 활용해야 한다.
        for(String a : myMap.keySet()){
            System.out.println(a); // 키 값
            System.out.println(myMap.get(a)); // value 값
        }
        for(int a : myMap.values()){
            System.out.println(a);
        }
        // iteratr 를 활용하여 key 값 하나씩 출력
        Iterator<String> myIter = myMap.keySet().iterator();
        // next() 메서드는 데이터를 하나씩 소모시키면서 return.
//        System.out.println(myIter.next());
//        System.out.println(myIter);

        // hasNext() 는 iterator 안에 값이 있는지 없는지 boolean return
//        while (myIter.hasNext()){
//            System.out.println(myIter.next());
//        }

        // LinkedHashMap : 데이터 삽입 순서 유지
        Map<String, Integer> linkedMap = new LinkedHashMap<>();
        linkedMap.put("hello5", 1);
        linkedMap.put("hello4", 1);
        linkedMap.put("hello3", 1);
        linkedMap.put("hello2", 1);
        linkedMap.put("hello1", 1);
        System.out.println(linkedMap); // 넣는 순서가 유지되는 것을 확인할 수 있다.

        // TreeMap : key 를 통해 데이터를 정렬(최적화된 정렬 => n log n 의 복잡도를 가짐)
//        Map<String, Integer> treeMap = new TreeMap<>();
//        treeMap.put("hello5", 1);
//        treeMap.put("hello4", 1);
//        treeMap.put("hello3", 1);
//        treeMap.put("hello2", 1);
//        treeMap.put("hello1", 1);
//        System.out.println(treeMap);











    }
}
