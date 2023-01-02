package classstructureintegrate;

public class Product {

    private final String name;
    private int price;

    public String getProductInfo() {
        return name + ": " + price + " HUF";
    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void increasePrice(int amount) {
        price += amount;
    }

    public void decreasePrice(int amount) {
        price -= amount;
    }


}
