package C02ClassBasic;

// 스택 오버플로우 확인
public class C0206RecursiveBasic {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 10; i ++){
            sum += i;
        }
        System.out.println(sum);
        System.out.println(addAcc(10));

        // 피보나치 수열 구현 => 100번째
        // 1 1 2 3 5
        int a = 1;
        int b = 1;
        for(int i = 2; i < 5; i++){
            int temp = a;
            a = b;
            b = temp + a;
        }
        System.out.println(b);

        System.out.println(fibonacci(15));
    }
    static int fibonacci(int n){
        if(n <= 2){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    static int addAcc (int n){
        if(n == 1){
            return 1; // 재귀함수를 멈추게 함 !
        }
        return n + addAcc(n-1);
    }
}
