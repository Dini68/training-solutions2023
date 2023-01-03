package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class PerformanceTest {

    public static void main(String[] args) {
        Performance pe = new Performance(
                LocalDate.of(1968, 6, 2),
                "Queen",
                LocalTime.of(18,0),
                LocalTime.of(20,0));

        System.out.println(pe.getInfo());

    }
}
