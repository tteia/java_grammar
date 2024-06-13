//package C02ClassBasic;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class C0207RESTART {
//    //    static List<Inteer> myList;
////
////    static List<List<Integer>> answer;
////    static int count;g
//    public static void main(String[] args) {
//
////        myList로 만들수 있는 2개짜리 숫자조합을 이중리스트에 담기
////        [[1,2], [1,3] [1,4], ...]
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
//        List<Integer> myList = new ArrayList<>(Arrays.asList(1,2,3,4));
//        List<List<Integer>> answer = new ArrayList<>();
//        combi(answer, new ArrayList<>(), myList, 2, 0);
//        permu(answer, new ArrayList<>(), myList, 2, 0);
//        System.out.println(answer);
//    }
//    static void combi(List<List<Integer>> answer, List<Integer> temp, List<Integer> myList, int count, int start){
//        if(temp.size() == count){
//            // temp 값을 그대로 add 할 경우 temp 주소가 add 됨 !
//            // answer 리스트를 이중으로 선언한 이유가 바로 이것. temp 리스트 자체를 add 하기 위해서
////            answer.add(temp);
//            answer.add(new ArrayList<>(temp));
//            return;
//        }
//        for(int i=start; i < myList.size(); i++){
//            temp.add(myList.get(i));
//            combi(answer, temp, myList, count ,i+1);
//            temp.remove(temp.size()-1);
//        }
//    }
//
//    static void permu(List<List<Integer>> answer, List<Integer> temp, List<Integer> myList, int count, List<Integer> visited){
//        if(temp.size() == count){
//            // temp 값을 그대로 add 할 경우 temp 주소가 add 됨 !
//            // answer 리스트를 이중으로 선언한 이유가 바로 이것. temp 리스트 자체를 add 하기 위해서
////            answer.add(temp);
//            answer.add(new ArrayList<>(temp));
//            return;
//        }
//        for(int i=0; i < myList.size(); i++){
//            //boolean visited 이용하기
//                visited[i] = true;
//                temp.add(myList.get(i));
//                combi(answer, temp, myList, count ,i+1);
//                temp.remove(temp.size()-1);
//                visited[i] = false;
//            }
//
//        }
//    }
//}