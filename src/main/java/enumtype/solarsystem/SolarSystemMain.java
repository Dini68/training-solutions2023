package enumtype.solarsystem;

import java.util.Arrays;

public class SolarSystemMain {


    public static void main(String[] args) {

        for (SolarSystem ss : SolarSystem.values()) {
            System.out.print(ss + " ");
            System.out.println(ss.getMoons());
        }

    }
}
