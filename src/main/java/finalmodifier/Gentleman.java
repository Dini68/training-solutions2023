package finalmodifier;

public class Gentleman {

    public static final String MESSAGE_PREFIX = "Hello ";

    public String sayHello(String name) {
        return MESSAGE_PREFIX + name + "!";
    }

    public static void main(String[] args) {
        Gentleman ge = new Gentleman();

        System.out.println(ge.sayHello("Hunor"));
    }

}
