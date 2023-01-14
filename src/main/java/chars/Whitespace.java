package chars;

public class Whitespace {

    public String makeWhitespaceToStar(String text) {

        String newText = "";
        for (char c : text.toCharArray()) {
            if (Character.isWhitespace(c)) {
                newText += "*";
            }
            else {
                newText += c;
            }
        }

        return newText;
    }

    public static void main(String[] args) {

        Whitespace ws = new Whitespace();
        System.out.println(ws.makeWhitespaceToStar(
                "k  lj ijo j"));
    }
}
