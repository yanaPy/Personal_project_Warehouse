import java.util.ArrayList;
import java.util.Scanner;

public class Сosmetics extends Product implements ReadWriteWarehouse {

    ArrayList<Сosmetics> сosmetics = new ArrayList<>();

    public Сosmetics(String name, String vendorСode, double price) {
        super(name, vendorСode, price);
    }

    public Сosmetics() {

    }


    @Override
    public void addProduct() {
        System.out.println("Enter name of cosmetics: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        System.out.println("Enter vendor code of cosmetics: ");
        String vendorСode = input.nextLine();

        System.out.println("Enter price of cosmetics: ");
        double price = input.nextDouble();

        Сosmetics cosmetic = new Сosmetics(name, vendorСode, price);
        сosmetics.add(cosmetic);
    }

    @Override
    public void deleteProduct() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter vendor code of perfume: ");
        String vendorСodeInput = input.nextLine();

        for (int i = 0; i < сosmetics.size(); i++) {
            if (сosmetics.get(i).toString().contains(vendorСodeInput)){
                сosmetics.remove(i);
            } else {
                    System.out.println("No cosmetics found");
                }
            }
        }


    @Override
    public void viewProduct() {
        System.out.println("Сosmetics on warehouse :"+ сosmetics.toString());

    }

}
