package finalmodifier;

import java.util.Arrays;
import java.util.List;

public class Week {

    public static final List<String> DAYS_OF_WEEK =
            Arrays.asList("Hétfő", "Kedd", "Szerda",
            "Csütörtök", "Péntek", "Szombat",
            "Vasárnap");

    public static void main(String[] args) {

        System.out.println(DAYS_OF_WEEK);

        DAYS_OF_WEEK.set(1, "Szerda");

        System.out.println(DAYS_OF_WEEK);
    }
}
