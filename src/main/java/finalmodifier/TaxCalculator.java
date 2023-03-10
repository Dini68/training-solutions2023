package finalmodifier;

public class TaxCalculator {

    public static final double AFA = 0.27;

    public double tax(double price) {
        return price * AFA;
    }

    public double priceWithTax(double price) {
        return price + tax(price);
    }

    public static void main(String[] args) {
         TaxCalculator tc = new TaxCalculator();

        System.out.println(tc.tax(10000));
        System.out.println(tc.priceWithTax(10000));
    }
}
