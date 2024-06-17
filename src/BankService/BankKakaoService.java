package BankService;

public class BankKakaoService implements BankService{
    @Override
    public void deposit(int money, BankAccount bankAccount){
        int myMoney = bankAccount.getBalance(); // 기존에 얼마 있는지 얻기.
        int total = myMoney + money;
        bankAccount.updateBalance(total);
        System.out.println(money+"원 카카오페이로 입금되었습니다.");
        System.out.println("현재 잔액은 " + total + "원 입니다.");
    }
    public void withdraw(int money, BankAccount bankAccount){
        int myMoney = bankAccount.getBalance();
        if(myMoney < money){
            System.out.println("잔액 부족입니다.");
        }else {
            myMoney -= money;
            System.out.println(money + "원 카카오페이에서 출금되었습니다.");
        }
        System.out.println("현재 잔액은 " + myMoney + "원 입니다.");
    }
}
