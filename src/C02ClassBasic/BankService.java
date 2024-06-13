//package C02ClassBasic;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class BankService {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        List<BankAccount> bankAccounts = new ArrayList<>();
//        while(true){
//
//            System.out.println("이용하실 서비스를 선택해주세요.");
//            System.out.println("1. 계좌 개설 2. 입금 3. 출금 4. 계좌 송금");
//            int number = Integer.parseInt(sc.nextLine());
//            if(number == 1){
//                System.out.println("생성하실 계좌번호를 입력해주세요.");
//                String accountNumber = sc.nextLine();
//                BankAccount bankAccount = new BankAccount(accountNumber); // 계좌번호를 받을거니까
//                bankAccounts.add(bankAccount);
//                System.out.println("생성이 완료 되었습니다.");
//                System.out.println(BankAccount.id);
//                // 계좌가 생성될 때마다 id+=1 이기 때문에 조회하면 내 값이 아니라 현재의 id 값이 얼마인지가 나온다.
//                System.out.println(bankAccounts.get(i).getId(i)); // getId 를 만들어 줌
//                break;
//            } else if (number == 2) {
//                System.out.println("입금하실 금액을 입력해주세요.");
//                int money = Integer.parseInt(sc.nextLine());
//                System.out.println("입금하실 계좌번호를 입력해주세요.");
//                String accountNumber = sc.nextLine();
//                // 입금 진행하기
//                for(int i = 0; i < bankAccounts.size(); i++){
//                    if(bankAccounts.get(i).getAccountNumber().equals(accountNumber)){
//                        bankAccounts.get(i).deposit(money);
//                    }
//                }
//
//            } else if (number == 3) {
//                System.out.println("출금하실 금액을 입력해주세요.");
//                int money = sc.nextInt();
//                System.out.println("출금하실 계좌번호를 입금해주세요.");
//                String drawNum = sc.nextLine();
//                // 출금 진행하기
//                for(int i = 0; i < bankAccounts.size(); i++){
//                    if(bankAccounts.get(i).getAccountNumber().equals(accountNumber)){
//                        bankAccounts.get(i).withdraw(money);
//                    }
//                }
//            }
//            else{
//                System.out.println("출금하실 계좌번호를 입력해주세요.");
//                String yourNumber = sc.nextLine();
//                System.out.println("입금하실 계좌번호를 입력해주세요");
//                String myNumber = sc.nextLine();
//                System.out.println("송금 금액을 입력해주세요.");
//                int money = Integer.parseInt(sc.nextLine());
//                // 송금 진행하기.. ^^
//                BankAccount myAccount = null;
//                BankAccount yourAccount = null;
//                for(int i = 0; i < bankAccounts.size(); i++){
//                    if(bankAccounts.get(i).getAccountNumber().equals(myNumber)){
//                        myAccount = bankAccounts.get(i);
//                    }
//                    if(bankAccounts.get(i).getAccountNumber().equals(yourNumber)){
//                        yourAccount = bankAccounts.get(i);
//                    }
//                }
//                myAccount.transfer(money, yourAccount);
//            }
//        }
//
//
//    }
//}
//
//class BankAccount{
//    // static -> 매출의 경우 매출값이 누적됨. static 이 객체변수가 아닌 클래스 모두가 공유하게 됨.
//    // 이를 활용해 id auto_increment
//    // 객체 변수 int 의 경우 자동으로 0 으로 초기화가 됨. Long 은 0L 로 초기화.
//    static Long static_id = 0L; // 일반적으로 id는 Long 으로 잡는다. db 에서도 Bigint 사용하듯이. 확장성을 따져서 설계하기 때문.
//    private Long id;
//    private String accountNumber;
//    private int balance;
//    // 클래스명이랑 똑같은 메서드...?
//    BankAccount(String accountNumber){
//        static_id += 1;
//        id = static_id; // 내 고유 id 값을 알기 위해서.
//        this.accountNumber = accountNumber;
//    }
//    public void deposit(int money){
//        this.balance += money;
//        System.out.println(money + "원 입금 되었습니다.");
//        System.out.println("현재 잔액 " + getBalance() + "원 입니다.");
//    }
//    public void withdraw(int money){
//        if(this.balance < money){
//            System.out.println("잔액 부족입니다.");
//        }
//        else{
//            this.balance -= money;
//            System.out.println(money + "원 출금 되었습니다.");
//        }
//        System.out.println("현재 잔액 " + getBalance() + "원 입니다.");
//    }
//    public void transfer(int money, BankAccount bankAccount){
//        this.balance -= money;
//        bankAccount.deposit(money);
//        System.out.println("현재 잔액 " + getBalance() + "원 입니다.");
//    }
//    public String getAccountNumber(){
//        return accountNumber;
//    }
//    public int getBalance(){
//        return balance;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//}
//
//// static 붙이지 않기 ! 객체 메서드로 만들어줘야 함.