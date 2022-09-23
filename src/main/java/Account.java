import java.util.ArrayList;
import java.util.Scanner;

public class Account {

    public final User user;

    private static boolean accessAllowed;
    private int numberAcc;
    private static int count = 0;
    public static ArrayList<Account> accounts = new ArrayList<>();

    {
        numberAcc = count;
        count++;
    }

    public Account(User user) {
        this.user = user;
        this.numberAcc=numberAcc;
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


        for (Account acc : accounts) {
            if (acc.toString().contains(accInput)) {
                System.out.println("Valid. Access allowed." );
                accessAllowed=true;
            } else {
                System.out.println("Invalid accounts data. Access denied");
                accessAllowed=false;
            }
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "user: " + user +
                ", numberAcc: " + numberAcc +
                '}';
    }
}