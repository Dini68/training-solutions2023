package classstructureconstructors;

public class Store {

    private final String product;
    private int stock;

    public Store(String product) {
        this.product = product;
    }

    public void store(int amount) {
        stock += amount;
    }

    public void dispatch(int amount) {
        stock -= amount;
    }

    public String getProductInfo() {
        return product + " stock: " + stock + " db";
    }

    public int getStock() {
        return stock;
    }

    public String getProduct() {
        return product;
    }
}
