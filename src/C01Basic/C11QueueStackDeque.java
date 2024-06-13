package C01Basic;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class C11QueueStackDeque {
    public static void main(String[] args) {
//        Queue<Integer> myQue = new LinkedList<>();
//        myQue.add(10);
//        myQue.add(20);
//        myQue.add(30);
//        System.out.println(myQue.peek()); // 꺼내만 보고 집어 넣는 거..?
//        System.out.println(myQue);
//        System.out.println(myQue.poll()); //
//        System.out.println(myQue);

        // LinkedList 와 ArrayList 시간 복잡도 비교
        // LinkedList 의 add
//        LinkedList<Integer> list1 = new LinkedList<>();
//        long startTime = System.currentTimeMillis();
//        for(int i = 0; i < 10000; i++){
//            list1.add(0, 10);
//        }
//
//        long endTime = System.currentTimeMillis();
//        System.out.println("LikedList의 중간 삽입 : " + (endTime - startTime));
//
//        ArrayList<Integer> list2 = new ArrayList<>();
//        long startTime2 = System.currentTimeMillis();
//        for(int i = 0; i < 10000; i++){
//            list2.add(0, 10);
//        }
//
//        long endTime2 = System.currentTimeMillis();
//        System.out.println("ArrayList의 중간 삽입 : " + (endTime2 - startTime2));
//
//        long startTime3 = System.currentTimeMillis();
//        for(int i = 0; i < 10000; i++){
//            list1.get(i);
//        }
//        long endTime3 = System.currentTimeMillis();
//        System.out.println("LikedList의 조회 : " + (endTime3 - startTime3));
//
//        long startTime4 = System.currentTimeMillis();
//        for(int i = 0; i < 10000; i++){
//            list2.add(0, 10);
//        }
//
//        long endTime4 = System.currentTimeMillis();
//        System.out.println("ArrayList의 중간 삽입 : " + (endTime4 - startTime4));

//        Queue<String> myQue = new LinkedList<>();
//        myQue.add("문서1");
//        myQue.add("문서2");
//        myQue.add("문서3");
//        while (!myQue.isEmpty()){
//            System.out.println(myQue.poll());
//        }

        // ArrayBlockingQueue : 길이제한 큐
        Queue<String> queue = new ArrayBlockingQueue<>(3);
//        queue.add("10");
//        queue.add("20");
//        queue.add("30");
//        queue.add("40");
        // add 를 사용하면 길이 제한 초과 시 예외 발생(오류로 멈춤)

//        queue.offer("10");
//        queue.offer("20");
//        queue.offer("30");
//        queue.offer("40");
//        System.out.println(queue);

//        System.out.println(queue); // Queue full 이라고 오류 발생 !

        // 우선순위 큐 :  데이터를 꺼낼 때 정렬된 데이터 pop. .. .? > 정렬이 이미 되어있어서 시간 복잡도가 조타.
//        Queue<Integer> pq = new PriorityQueue<>();
//        pq.add(30);
//        pq.add(20);
//        pq.add(10);
//        pq.add(40);
//        pq.add(50);
//
//
//        while (!pq.isEmpty()){
//            System.out.println(pq.poll());
//        }

        // stack
//        Stack<Integer> st1 = new Stack<>();
//        st1.push(10);
//        st1.push(20);
//        st1.push(30);
//        System.out.println(st1.pop()); // pop : 요소를 제거 후 반환
//        System.out.println(st1.peek()); // 20. 위에서 30이 pop 됐으니까!
//        System.out.println(st1.size());
//        System.out.println(st1.isEmpty());

        // String 객체 5개 정도 Stack 추가 후에 while 문을 통해 출력
//        Stack<String> str = new Stack<>();
//        str.push("banana");
//        str.push("kiwi");
//        str.push("cherry");
//        str.push("apple");
//        str.push("melon");
//        while(!str.isEmpty()){
//            System.out.println(str.pop());
//        }

        // Deque
        Deque<Integer> d1 = new ArrayDeque<>();
        d1.addLast(10);
        d1.addLast(20);
        d1.addFirst(30);
        System.out.println(d1);
        System.out.println(d1.peekFirst()); // = poll()
        System.out.println(d1.peekLast()); // = pop()

        // Queue 문제 : 다리를 지나는 트럭
    }
}
