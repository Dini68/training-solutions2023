package localvariables;

public class DistanceMain {

    public static void main(String[] args) {

        Distance distance = new Distance(1000, true);

        System.out.println("Distance: " + distance.getDistanceInKm() +
                " km");
        System.out.println("Exact: " + distance.isExact());
    }
}
