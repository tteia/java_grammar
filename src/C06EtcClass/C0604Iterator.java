package C06EtcClass;

import java.util.*;

public class C0604Iterator {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("apple");
        myList.add("cherry");
        myList.add("banana");

        // enhanced for 문 : 원본 변경 불가
        for(String a : myList){
            System.out.println(a);
        }
        // iterator 는 참조하고 있는 원본 데이터 삭제 가능 > remove
        Iterator<String> iters2 = myList.iterator();
        while(iters2.hasNext()){
            if(iters2.next().equals("banana")){
                iters2.remove();
            }
        }
        System.out.println(myList);
    }
}
