package composition.person;

public class PersonMain {

    public static void main(String[] args) {

        Address address = new Address("Dánia",
                "Koppenhága", "12345");

        System.out.println(address.addressToString());

        Person person = new Person("Hunor",
                "222222222");

        System.out.println(person.personToString());

        person.moveTo(address);

        System.out.println(person.getAddress().addressToString());
    }
}
