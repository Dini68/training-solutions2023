package introcontrol;

public class IntroControlMain {

    public static void main(String[] args) {

        IntroControl ic = new IntroControl();

        System.out.println(
                ic.subtractTenIfGreaterThanTen(10));
        System.out.println(
                ic.subtractTenIfGreaterThanTen(15));

        System.out.println(
                ic.describeNumber(0));
        System.out.println(
                ic.describeNumber(10));

        System.out.println(
                ic.greetingToJoe("Jack"));
        System.out.println(
                ic.greetingToJoe("Joe"));

        System.out.println(
                ic.calculateBonus(2000000));
        System.out.println(
                ic.calculateBonus(900000));

        System.out.println(
                ic.calculateConsumption(100, 150));
        System.out.println(
                ic.calculateConsumption(9990, 50));

        ic.printNumbers(10);

        ic.printNumbersBetween(7, 13);

        ic.printNumbersBetweenAnyDirection(4, 9);
        ic.printNumbersBetweenAnyDirection(6, 1);

        ic.printOddNumbers(15);

    }
}
