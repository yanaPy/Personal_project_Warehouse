package Products;

public enum CosmeticsType {

    LUX(1);

    private final int amount;

    CosmeticsType(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

}
