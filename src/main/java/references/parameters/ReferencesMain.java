package references.parameters;

public class ReferencesMain {

    public static void main(String[] args) {

        Person pe1 = new Person("Dénes", 54);
        Person pe2 = new Person("Hunor", 11);

        pe1 = new Person("Tünde", 52);
        pe2 = pe1;

        pe2.setName("Lilla");

        System.out.println(pe1);
        System.out.println(pe2);

        int num1 = 24;
        int num2 = num1;
        num2++;

        System.out.println(num1);
        System.out.println(num2);

        pe1 = new Person("Kati", 60);

        System.out.println(pe1);
        System.out.println(pe2);
    }
}
