package BankService;

import BankService.BankAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankController {
    public static void main(String[] args) {
        List<BankAccount> bankAccounts = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("계좌번호를 입력하세요.");
        String accountNumber = sc.nextLine();
        BankAccount bankAccount = new BankAccount(accountNumber);
        while (true){
            System.out.println("서비스 번호를 입력하세요. 1.카드 2.카카오페이");
            int number = Integer.parseInt(sc.nextLine());
            if(number == 1){
                System.out.println("카드 서비스입니다.");
            }
            else System.out.println("카카오페이 서비스입니다,");
            System.out.println("입금하시려면 1번, 출금하시려면 2번");
            int number2 = Integer.parseInt(sc.nextLine());
            if(number == 1){
                System.out.println("입금 서비스입니다.");
                BankCardService bcs = new BankCardService();
                if(number2 == 1){
                    System.out.println("입금하실 금액을 입력하세요.");
                    int money = Integer.parseInt(sc.nextLine());
                    bcs.deposit(money, bankAccount);
                }
                else{
                    System.out.println("출금 서비스입니다.");
                    System.out.println("출금하실 금액을 입력하세요.");
                    int money = Integer.parseInt(sc.nextLine());
                    bcs.withdraw(money, bankAccount);
                }
            }
            else if(number == 2){
                BankKakaoService bks = new BankKakaoService();
                System.out.println("카카오페이 서비스입니다.");
                if(number2 == 1){
                    System.out.println("입금 서비스입니다.");
                    System.out.println("입금하실 금액을 입력하세요.");
                    int money = Integer.parseInt(sc.nextLine());
                    bks.deposit(money, bankAccount);
                }
                else{
                    System.out.println("출금 서비스입니다.");
                    System.out.println("출금하실 금액을 입력하세요.");
                    int money = Integer.parseInt(sc.nextLine());
                    bks.withdraw(money, bankAccount);
                }
            }

        }
    }
}