package classstructureintegrate;

import java.util.Scanner;

public class ProductMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Product name: ");
        String name = scanner.nextLine();

        System.out.print("Product price: ");
        int price = scanner.nextInt();

        Product product = new Product(name, price);

        System.out.println(product.getProductInfo());

        System.out.println("Increase 10000 HUF ");
        product.increasePrice(10000);
        System.out.println(product.getProductInfo());

        System.out.println("Decrease 5000 HUF ");
        product.decreasePrice(5000);
        System.out.println(product.getProductInfo());
    }
}
