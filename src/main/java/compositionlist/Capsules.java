package compositionlist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {

    private final List<String> colours = new ArrayList<>();

    public void addLast(String colour) {
        colours.add(colour);
    }

    public void addFirst(String colour) {
        colours.add(0, colour);
    }

    public void removeFirst() {
        if (!colours.isEmpty()) {
            colours.remove(0);
        }
        if (colours.isEmpty()) {
            System.out.println("Capsules is empty!");
        }
    }

    public void removeLast() {
        if (!colours.isEmpty()) {
            colours.remove(colours.size() - 1);
        }
        if (colours.isEmpty()) {
            System.out.println("Capsules is empty!");
        }
    }

    public List<String> getColours() {
        return colours;
    }

    @Override
    public String toString() {
        return "colours= " + colours;
    }

    public static void main(String[] args) {
        Capsules ca = new Capsules();
        System.out.println(ca);

        ca.addLast("red");
        System.out.println(ca);

        ca.addLast("green");
        System.out.println(ca);

        ca.addFirst(("white"));
        System.out.println(ca);

        ca.removeLast();
        System.out.println(ca);

        ca.removeFirst();
        System.out.println(ca);

        ca.removeFirst();
        System.out.println(ca);

        ca.removeFirst();
        System.out.println(ca);

    }
}
