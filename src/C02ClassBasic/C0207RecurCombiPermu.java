//package C02ClassBasic;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
////순열과 조합
//public class C0207RecurCombiPermu {
//    static List<Integer> myList;
//    static List<Integer> answer;
//    static int count;
//    public static void main(String[] args) {
//
////        List<Integer>myList = new ArrayList<>(Arrays.asList(1,2,3,4));
//////        myList로 만들수 있는 2개짜리 숫자조합을 이중리스트에 담기
//////        [[1,2], [1,3] [1,4], ...]
////        List<List<Integer>> combinations = new ArrayList<>();
////        List<Integer> temp = new ArrayList<>();
////        for(int i=0; i<myList.size()-1; i++){
////            temp.add(myList.get(i));
////            for(int j=i+1; j<myList.size(); j++){
////                temp.add(myList.get(j));
////                combinations.add(temp);
////                temp.remove(myList.size()-1);
////            }
////            temp.remove(myList.size()-1);
////        }
//
//        myList = new ArrayList<>(Arrays.asList(1,2,3,4));
//        answer = new ArrayList<>();
//        count = 5;
//        combinations(new ArrayList<>(), 0);
//        System.out.println(answer);
//    }
//    // 최종 담을 리스트 answer / answer 에 담길 이중리스트인 temp / myList 는 문제(1,2,3,4) / 몇 개의 조합을 구할건지! count
//    // static void combinations(List<List<Integer>> answer, List<Integer>temp , List<Integer>myList, int count, int start)
//    // answer, myList, count 값은 static으로 따로 선언해도 된다.
//    // temp 는 재귀함수를 타고 들어갈 때마다 값이 바뀌기 때문에 static 으로 둘 수가 없다.
//    static void combinations(List<Integer>temp, int start){
//        if(temp.size() == count){
//            // temp 값을 그대로 add 할 경우 temp 주소가 add 됨 !
//            // answer 리스트를 이중으로 선언한 이유가 바로 이것. temp 리스트 자체를 add 하기 위해서
////            answer.add(temp);
//            answer.add(new ArrayList<>(temp));
//            return;
//        }
//        for(int i=start; i<myList.size(); i++){
//            temp.add(myList.get(i));
//            combinations(answer, temp, myList, count, i+1 );
//            temp.remove(temp.size()-1); // 백트래킹
//        }
//    }
//}
