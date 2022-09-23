public class Product {

    private double price;
    private String vendorСode;
    private String name;

    public Product(String name, String vendorСode, double price) {
        this.price = price;
        this.vendorСode = vendorСode;
        this.name = name;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", vendorСode='" + vendorСode + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
