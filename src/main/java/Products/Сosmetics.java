package Products;

import Warehouse.ReadWriteWarehouse;

import java.util.ArrayList;
import java.util.Scanner;

public class Сosmetics extends Product implements ReadWriteWarehouse {

    private static ArrayList<Сosmetics> сosmetics = new ArrayList<>(CosmeticsType.LUX.getAmount());

    public static ArrayList<Сosmetics> getСosmetics() {
        return сosmetics;
    }

    public static void setСosmetics(ArrayList<Сosmetics> сosmetics) {
        Сosmetics.сosmetics = сosmetics;
    }

    public Сosmetics(String name, String vendorСode, double price) {
        super(name, vendorСode, price);
    }

    public Сosmetics() {

    }


    @Override
    public void addProduct() {
        if (сosmetics.size() <= CosmeticsType.LUX.getAmount()) {
            System.out.println("Enter name of cosmetics: ");
            Scanner input = new Scanner(System.in);
            String name = input.nextLine();

            System.out.println("Enter vendor code of cosmetics: ");
            String vendorСode = input.nextLine();

            System.out.println("Enter price of cosmetics: ");
            double price = input.nextDouble();

            Сosmetics cosmetic = new Сosmetics(name, vendorСode, price);
            сosmetics.add(cosmetic);
        } else System.out.println("There is no space in the сosmetics warehouse");
    }

    @Override
    public void deleteProduct() {
        if (сosmetics.isEmpty()) {
            System.out.println("No сosmetics on warehouse.");
        } else {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter vendor code of perfume: ");
            String vendorСodeInput = input.nextLine();

            for (int i = 0; i < сosmetics.size(); i++) {
                if (сosmetics.get(i).toString().contains(vendorСodeInput)) {
                    сosmetics.remove(i);
                    System.out.println("Delete successful");
                } else {
                    System.out.println("No cosmetics found for delete");
                }
            }
        }
    }


    @Override
    public void viewProduct() {
        System.out.println("Product.Сosmetics on warehouse :" + сosmetics.toString());

    }

}
