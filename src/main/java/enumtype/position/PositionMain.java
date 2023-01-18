package enumtype.position;

public class PositionMain {

    public static void main(String[] args) {

        for (Position po : Position.values()) {

            System.out.println(po + " " + po.getSalary() +
                    " " + po.getBenefit());
        }
    }
}
