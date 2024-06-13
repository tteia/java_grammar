package C02ClassBasic;

// 1. BankService 라는 클래스 생성 => main 메서드에서 BankAccount 객체 생성 후 입출금 등 테스트
// 2. BankAccount 라는 클래스 생성
// accountNumber(계좌번호), balance(잔액) 변수
// 생성자 1개 : accountNumber 를 초기화
// getter 가 모든 변수에 맞게 존재
// deposit(예금하기) : balance(잔액) 증가시키는 메서드 -> "~원 입금되었습니다."
// withdraw(출금하기) : balance(잔액) 감소시키는 메서드 -> 출금액보다 잔액이 적으면 "잔액이 부족합니다" 충분하면 "~원 출금되었습니다"
// while(true){} : 어떤 서비스 이용할지 질문.
// 1. 계좌 개설 2. 입금 3. 출금 4.계좌 송금
// 1-1. 계좌 번호를 입력하세요. 1-2. list 에 담기.
// 2-1. 입금 금액을 입력하세요.
// 3-1. 출금 금액을 입력하세요.
// 4-1. 입금 받는 사람을 입력하세요. 4-2. 계좌번호 찾기. 입금 금액을 입력하세요.

//
//public class C0200BankService {
//    C0200BankService bs = new C0200BankService();
//
//}
//
//class BankService{
//
//}
//
//class BankAccount{
//    private String accountNumber;
//    private int balance;
//    int deposit(int a){
//        balance += a;
//        return balance;
//    }
//    int withdraw(int a){
//        balance -= a;
//        return balance;
//    }
//
//    public String getAccountNumber() {
//        return accountNumber;
//    }
//
//    public void setAccountNumber(String accountNumber) {
//        this.accountNumber = accountNumber;
//    }
//
//    public int getBalance() {
//        return balance;
//    }
//
//    public void setBalance(int balance) {
//        this.balance = balance;
//    }
//}

