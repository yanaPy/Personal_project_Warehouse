public class Product {

    private double price;
    private String vendorСode;
    private String name;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getVendorСode() {
        return vendorСode;
    }

    public void setVendorСode(String vendorСode) {
        this.vendorСode = vendorСode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
