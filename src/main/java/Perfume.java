import java.util.ArrayList;
import java.util.Scanner;

public class Perfume extends Product implements ReadWriteWarehouse {

    private static ArrayList<Perfume> perfumesMass = new ArrayList<>(PerfumeType.MASSMARKET.getAmount());
    private static ArrayList<Perfume> perfumesLux = new ArrayList<>(PerfumeType.LUX.getAmount());


    public static ArrayList<Perfume> getPerfumesMass() {
        return perfumesMass;
    }

    public static void setPerfumesMass(ArrayList<Perfume> perfumesMass) {
        Perfume.perfumesMass = perfumesMass;
    }

    public static ArrayList<Perfume> getPerfumesLux() {
        return perfumesLux;
    }

    public static void setPerfumesLux(ArrayList<Perfume> perfumesLux) {
        Perfume.perfumesLux = perfumesLux;
    }

    public Perfume(String name, String vendorСode, double price) {
        super(name, vendorСode, price);

    }

    public Perfume() {

    }

    @Override
    public void addProduct() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter price of perfume: ");
        double price = input.nextDouble();


        if (price <= 1000 && perfumesMass.size() <= PerfumeType.MASSMARKET.getAmount()) {
            System.out.println("Enter name of perfume: ");
            String name = input.nextLine();

            System.out.println("Enter vendor code of perfume: ");
            String vendorСode = input.nextLine();

            Perfume perfume = new Perfume(name, vendorСode, price);
            perfumesMass.add(perfume);
            System.out.println("Successful");
        } else if (price > 1000 && perfumesLux.size() <= PerfumeType.LUX.getAmount()) {
            System.out.println("Enter name of perfume: ");
            String name = input.nextLine();

            System.out.println("Enter vendor code of perfume: ");
            String vendorСode = input.nextLine();
            Perfume perfume = new Perfume(name, vendorСode, price);
            perfumesLux.add(perfume);

        } else System.out.println("There is no space in the perfume warehouse");

    }

    @Override
    public void deleteProduct() {
        if (perfumesMass.isEmpty() && perfumesLux.isEmpty()) {
            System.out.println("No perfume on warehouse.");
        } else {
            System.out.println("Enter price of perfume: ");
            Scanner input = new Scanner(System.in);
            double price = input.nextDouble();

            if (price <= 1000 && !perfumesMass.isEmpty()) {
                System.out.println("Enter vendor code of perfume: ");
                Scanner inputNext = new Scanner(System.in);
                String vendorСodeInput = inputNext.nextLine();

                for (int i = 0; i < perfumesMass.size(); i++) {
                    if (perfumesMass.get(i).toString().contains(vendorСodeInput)) {
                        perfumesMass.remove(i);
                        System.out.println("Delete successful");
                    } else if (!perfumesMass.get(i).toString().contains(vendorСodeInput)) {
                        System.out.println("No perfumes found for delete");
                    }
                }

            } else if (price > 1000 && !perfumesLux.isEmpty()) {
                System.out.println("Enter vendor code of perfume: ");
                Scanner inputNext = new Scanner(System.in);
                String vendorСodeInput = inputNext.nextLine();
                for (int i = 0; i < perfumesLux.size(); i++) {
                    if (perfumesLux.get(i).toString().contains(vendorСodeInput)) {
                        perfumesLux.remove(i);
                        System.out.println("Delete successful");
                    } else if (!perfumesLux.get(i).toString().contains(vendorСodeInput)) {
                        System.out.println("No perfumes found for delete");
                    }
                }
            } else System.out.println("No perfume on warehouse.");

        }
    }

    @Override
    public void viewProduct() {
        System.out.println("Perfume of mass market : " + perfumesMass.toString());
        System.out.println("Perfume of lux : " + perfumesLux.toString());
    }
}
