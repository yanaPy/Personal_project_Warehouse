package userAccount;

import java.util.ArrayList;
import java.util.Scanner;

public class Account {

    public final User user;

    private static boolean accessAllowed;
    private int numberAcc;
    private static int count = 0;
    private static ArrayList<Account> accounts = new ArrayList<>();

    {
        numberAcc = count;
        count++;
    }

    public User getUser() {
        return user;
    }

    public static boolean isAccessAllowed() {
        return accessAllowed;
    }

    public static void setAccessAllowed(boolean accessAllowed) {
        Account.accessAllowed = accessAllowed;
    }

    public void setNumberAcc(int numberAcc) {
        this.numberAcc = numberAcc;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Account.count = count;
    }

    public static ArrayList<Account> getAccounts() {
        return accounts;
    }

    public static void setAccounts(ArrayList<Account> accounts) {
        Account.accounts = accounts;
    }

    public Account(User user) {
        this.user = user;
        this.numberAcc = numberAcc;
    }


    protected int getNumberAcc() {
        this.numberAcc = numberAcc;
        return numberAcc;
    }

    public static boolean getAccessAllowed() {
        return accessAllowed;
    }

    public static void loginAccount() {
        System.out.println("Enter account data: ");
        Scanner input = new Scanner(System.in);
        String accInput = input.nextLine();

        if (accounts.toString().contains(accInput)) {
            System.out.println("Valid. Access allowed.");
            accessAllowed = true;
        } else {
            System.out.println("Invalid accounts data. Access denied");
            accessAllowed = false;
        }

    }

    @Override
    public String toString() {
        return "Account.Account{" +
                "user: " + user +
                ", numberAcc: " + numberAcc +
                '}';
    }
}