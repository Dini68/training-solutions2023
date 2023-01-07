package composition.realestate;

public class RealEstateDotCom {

    public static void main(String[] args) {

        Address address = new Address("Bp", "1181",
                "Vikár", 9);

        System.out.println(address);

        Details details = new Details("nice house sale",
                address, 2, 5);

        System.out.println(details);

        RealEstate re = new RealEstate("Sale flat",
                50000000, details);

        System.out.println(re);
    }
}
