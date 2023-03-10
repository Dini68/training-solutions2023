package attributes.bill;

public class BillItem {

    private final String product;
    private final int price;
    private final int quantity;
    private final double vatPercent;

    public BillItem(String product, int price,
                    int quantity, double vatPercent) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
        this.vatPercent = vatPercent;
    }

    public String getProduct() {
        return product;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getVatPercent() {
        return vatPercent;
    }

    public double calculateTotalPrice() {
        return price * (1 + vatPercent) * quantity;
    }
}
