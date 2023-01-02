package conventions;

public class CarMain {

    public static void main(String[] args) {

        Car car = new Car("Hyundai","1.7 CRDI",
                5,5);

        System.out.println(car.getInfo());

        car.addModelName("ix35");

        System.out.println(car.getInfo());

        car.setCarType("Nissan");
        car.setEngineType("1.2");
        car.setDoors(5);
        car.setPersonS(4);
        car.addModelName("Micra");

        System.out.println(car.getInfo());
    }
}
