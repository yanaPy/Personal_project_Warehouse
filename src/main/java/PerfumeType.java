public enum PerfumeType {

    MASSMARKET(50),
    LUX(20);

    private final int amount;

    PerfumeType(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

}
