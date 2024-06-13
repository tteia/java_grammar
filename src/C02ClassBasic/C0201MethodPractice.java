package C02ClassBasic;

public class C0201MethodPractice {
    public static void main(String[] args) {
        if(find(6)){
            System.out.println("소수입니다.");
        }
        else {
            System.out.println("소수가 아닙니다.");
        }
    }
    // 리턴 타입 boolean, 매개변수는 int 숫자인 소수 판별 메서드 만들어보기.
    // if(true) 소수입니다. / 거짓입니다.
    public static boolean find(int N){
        boolean find = true;
        for(int i = 2; i*i <= N; i++){
            if(N % i == 0){
                return false; // 메서드는 return 을 만나면 바로 종료됨 !
                             // void 타입에서도 메서드 강제 종료를 위해 return 사용.
            }
        }
        return find;
    }

    //void 로 만들어보기 (void 의 전형적인 형식인 print)
    public static void find2(int N){
        boolean find = true;
        for(int i = 2; i*i <= N; i++){
            if(N % i == 0){
                System.out.println("소수가 아닙니다.");
                return;
            }
        }
        System.out.println("소수입니다.");
    }
}
