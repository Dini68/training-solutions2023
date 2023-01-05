package arraylist;

import java.util.Arrays;
import java.util.List;

public class Crossword {

    public static void main(String[] args) {
        String text = "KULCS, KÁLYHA, LÓ, AJTÓ, CSERESZNYEFA, " +
                "TEJ, FELHŐ, CIPŐ, MOSODA, KÁVÉTEJSZÍN, " +
                "CITERA, BABA";

        List<String> words = Arrays.asList(text.split(", "));
        System.out.println(words.size());

        for (String s: words) {
            if (s.length() == 6) {
                System.out.println(s);
            }
        }
    }
}
