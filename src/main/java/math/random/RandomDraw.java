package math.random;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomDraw {

    public static void main(String[] args) {

        List<String> persons = Arrays.asList("Zoli", "Béla",
                "Jani", "Zsolt", "Gabi", "Peti", "Géza",
                "Miki", "Sanyi", "Huni");

        Random rnd = new Random();

        int first = rnd.nextInt(5) + 1;
        int second = rnd.nextInt(5) + 6;

        System.out.println(persons.get(first - 1));
        System.out.println(persons.get(second - 1));
    }
}
