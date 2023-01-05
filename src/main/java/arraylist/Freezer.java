package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Freezer {

    public static void main(String[] args) {
        List<String> foods = new ArrayList<>();
        foods.add("meat");
        foods.add("milk");
        foods.add("orange");
        foods.add("butter");
        foods.add("carrot");
        System.out.println(foods);
        System.out.println(foods.size());
        foods.remove("butter");
        foods.remove("milk");
    }
}
