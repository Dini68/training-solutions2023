package stringtype;

public class StringTypeMain {

    public static void main(String[] args) {

        String prefix = "Hello ";
        String name = "John Doe";
        String message = prefix + name;
        message = message + 444;
        boolean b = message.equals("Hello John Doe");
        boolean c = message.equals("Hello John Doe444");
        System.out.println(prefix);
        System.out.println(name);
        System.out.println(message);
        System.out.println(b);
        System.out.println(c);

        System.out.println("" + "");
        System.out.println(("" + "").length());

        System.out.println("Abcde".length());
        System.out.println("Abcde".charAt(0) + ", "
                + "Abcde".charAt(2));
        System.out.println("Abcde".substring(0, 3));
    }
}
