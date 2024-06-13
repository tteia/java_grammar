package C02ClassBasic;
// 클래스라는 큰 메서드의 집합 안에 메인 메서드가 있다.
public class C0201Method {
    public static void main(String[] args) {
        // for 문 이용해서 1 ~ 10 까지 total 값 출력
        // for 문 -> total += i .
        // 20 까지 더 더해주려면? 또 for 문을 돌리게 됨.

        System.out.println(sumAcc(100,200));
        // 클래스명.메서드 : 기본 방식
        // 같은 클래스 내에서의 클래스 메서드 호출은 클래스명 생략 가능.
        // 다른 클래스 파일에서 한다면 -> sout(C0201Method.sumAcc(100,200));
    }
        // 이를 해결해주기 위해 함수를 만들어서 사용한다 ! (메서드)
        // 동적인 프로그램을 만들어주는 것.
        // 메서드 구성 요소 : 매개변수, 리턴타입, 접근제어자(public), 클래스 메서드 여부(static)
        // static 이 붙어있으면 class 메서드, 없으면 뭐,..? 못 들었어요..

    // sumAdd 메서드 생성.
    // int 라는 리턴 타입을 가짐.
    // input(매개변수) 값을 int 2개로 정의.
    public static int sumAcc(int start, int end){
        int total = 0;
        for(int i = start; i <= end; i++){
            total+= i;
        }
        return total;
    }

    //void 메서드
    public static void sumAcc2(int start, int end){
        int total = 0;
        for(int i = start; i <= end; i++){
            total+= i;
        }
        System.out.println(total);
    }
}
