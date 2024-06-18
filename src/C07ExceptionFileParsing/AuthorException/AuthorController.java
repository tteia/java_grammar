package C07ExceptionFileParsing.AuthorException;

import java.util.Scanner;

public class AuthorController {
    public static void main(String[] args) {
        AuthorService authorService = new AuthorService();
        while(true){
            Scanner sc = new Scanner(System.in);
            //입력을 받는다. 3가지
            System.out.println("1. Register");
            System.out.println("2. Login");
            int choice = sc.nextInt();

            if(choice == 1){
                System.out.println("Enter Name");
                String name = sc.nextLine();
                System.out.println("Enter Email");
                String email = sc.nextLine();
                System.out.println("Enter password");
                String password = sc.nextLine();
            }
            authorService.register(name, email, password);

        }
    }
}
