package BankService;

public interface BankService {
    default void deposit(int money, BankAccount bankAccount){
        int myMoney = bankAccount.getBalance(); // 기존에 얼마 있는지 얻기.
        int total = myMoney + money;
        bankAccount.updateBalance(total);
        System.out.println(money+"원 카드로 입금되었습니다.");
        System.out.println("현재 잔액은 " + total + "원 입니다.");
    }
}
