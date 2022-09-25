package warehouse;

import product.Perfume;
import product.Сosmetics;
import account.Account;
import account.CreateAccount;

import java.util.Scanner;

public class WarehouseSystem {

    public static void main(String[] args) {

        Perfume perfume = new Perfume();
        Сosmetics сosmetics = new Сosmetics();


        while (true) {

            System.out.println("Choose option:");
            System.out.println("1 - Create account");
            System.out.println("2 - Login account");
            System.out.println("3 - Work with main.java.app.warehouse");
            System.out.println("4 - Quit");

            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();

            if (choice == 1) {
                CreateAccount.createAccount();
            } else if (choice == 2) {
                Account.loginAccount();
            } else if (choice == 3) {

                if (Account.getAccessAllowed() == true) {
                    while (true) {
                        System.out.println("Choose option:");
                        System.out.println("1 - Add perfume");
                        System.out.println("2 - Delete perfume");
                        System.out.println("3 - View perfume");
                        System.out.println("4 - Add cosmetics");
                        System.out.println("5 - Delete cosmetics");
                        System.out.println("6 - View cosmetics");
                        System.out.println("7 - Quit");
                        int choiceNext = input.nextInt();
                        if (choiceNext == 1) {
                            perfume.addProduct();
                        } else if (choiceNext == 2) {
                            perfume.deleteProduct();
                        } else if (choiceNext == 3) {
                            perfume.viewProduct();
                        } else if (choiceNext == 4) {
                            сosmetics.addProduct();
                        } else if (choiceNext == 5) {
                            сosmetics.deleteProduct();
                        } else if (choiceNext == 6) {
                            сosmetics.viewProduct();
                        } else if (choiceNext == 7) {
                            break;
                        } else {
                            System.out.println("Invalid choice");
                        }
                    }
                } else
                    System.out.println("Operations from the main.java.app.warehouse are available only to authorized users");
            } else if (choice == 4) {
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }

    }
}
