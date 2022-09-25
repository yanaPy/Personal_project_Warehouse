package account;

import account.Account;

import java.util.Scanner;

public class CreateAccount {

    public static void createAccount() {
        System.out.println("Enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        System.out.println("Enter your surname: ");
        String surname = input.nextLine();

        System.out.println("Enter your patronymic: ");
        String patronymic = input.nextLine();

        User user = new User(name, surname, patronymic);
        Account account = new Account(user);
        Account.getAccounts().add(account);
        System.out.println("Your account number:" + account.getNumberAcc());
    }


}
