package attributes.bill;

public class Bill {

    public static void main(String[] args) {
        BillItem bi = new BillItem("Computer", 100000,
                5,0.27);

        System.out.println("Product: " + bi.getProduct());
        System.out.println("Price: " + bi.getPrice());
        System.out.println("Quantity: " + bi.getQuantity());
        System.out.println("VAT percent: " + bi.getVatPercent());

        System.out.println("Total price: " +
                bi.calculateTotalPrice());
    }
}
