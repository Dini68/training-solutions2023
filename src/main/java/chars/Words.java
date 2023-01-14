package chars;

public class Words {

    public String pushWord(String word) {
        String newWord = "";
        for (char c :  word.toCharArray()) {
            newWord += Character.toString(c + 1);
        }
        return newWord;
    }

    public static void main(String[] args) {

        Words words = new Words();
        System.out.println(words.pushWord("alma"));
    }
}
