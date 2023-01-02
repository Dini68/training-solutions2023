package classstructureconstructors;

public class StoreMain {

    public static void main(String[] args) {

        Store storeOne = new Store("Heineken");
        Store storeTwo = new Store("Milk");

        System.out.println(storeOne.getProductInfo());
        System.out.println(storeTwo.getProductInfo());

        storeOne.store(1000);
        storeTwo.store(500);

        System.out.println(storeOne.getProductInfo());
        System.out.println(storeTwo.getProductInfo());

        storeOne.dispatch(100);
        storeTwo.dispatch(200);

        System.out.println(storeOne.getProductInfo());
        System.out.println(storeTwo.getProductInfo());
    }
}
