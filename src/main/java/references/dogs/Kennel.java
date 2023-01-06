package references.dogs;

import java.util.ArrayList;
import java.util.List;

public class Kennel {

    public static void main(String[] args) {

        List<Dog> dogs = new ArrayList<>();

        Dog d1 = new Dog("tacsi",4,"fekete");
        Dog d2 = new Dog("retriver",3,"barna");
        Dog d3 = new Dog("kuvasz",8,"fehér");

        dogs.add(d1);
        dogs.add(d2);
        dogs.add(d3);

        System.out.println(dogs);
        System.out.println();

        Dog d4 = dogs.get(1);
        d4.setColour("vörös");

        System.out.println(dogs);
        System.out.println();

        Dog d5 = new Dog("spaniel", 7, "szürke");

        System.out.println(d5);

        d5 = dogs.get(1);

        System.out.println(d5);

        dogs.add(d5);

        System.out.println(dogs);

        Dog d6 = d4;
        d6.setColour("kék");

        System.out.println(dogs);

        List<Dog> dogs2 = dogs;

        Dog d7 = d4;

        d7.setColour("zöld");

        System.out.println(dogs2);

        d2.setColour("Lila");

        System.out.println(dogs2);

        d2.setColour(null);

        System.out.println(dogs2);

        Dog d8 = d1;

        d8 = null;

        System.out.println(dogs2);

        Dog d9 = d1;

        d9.setColour("ezüst");

        System.out.println(dogs2);




    }
}
