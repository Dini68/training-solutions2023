package aslist;

import java.util.Arrays;
import java.util.List;

public class Island {

    public static void main(String[] args) {

        List<String> importantThings =
                Arrays.asList("fire", "book", "knives");

        System.out.println(importantThings);

        importantThings.set(1, "glass");

        System.out.println(importantThings);
    }
}
