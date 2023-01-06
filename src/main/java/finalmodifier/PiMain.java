package finalmodifier;

public class PiMain {

    public static void main(String[] args) {

        System.out.println(CircleCalculator.PI);

        CylinderCalculator cc = new CylinderCalculator();
        CylinderCalculatorBasedOnCircle cbc =
                new CylinderCalculatorBasedOnCircle();

        System.out.println(cc.calculateVolume(10, 5));
        System.out.println(cbc.calculateVolume(10, 5));

        System.out.println(cc.calculateSurfaceArea(10, 5));
        System.out.println(cbc.calculateSurfaceArea(10, 5));
    }
}
