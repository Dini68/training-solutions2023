package weektwo;

public class Product {

    private final String name;
    private final String code;

    public Product(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public boolean areTheyEqual(Product p) {
        return name.equals(p.name) &&
                Math.abs(code.length() - p.code.length()) <= 1;
    }

    public static void main(String[] args) {
        Product pr1 = new Product("milk", "212313");
        Product pr2 = new Product("milk", "1212313");
        Product pr3 = new Product("bean", "212313");

        System.out.println(pr1.getName());
        System.out.println(pr1.getCode());

        System.out.println(pr2.getName());
        System.out.println(pr2.getCode());

        System.out.println(pr3.getName());
        System.out.println(pr3.getCode());

        System.out.println(pr1.areTheyEqual(pr2));

        System.out.println(pr1.areTheyEqual(pr3));
    }
}
