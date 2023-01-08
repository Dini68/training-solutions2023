package compositionlist.computer;

public class PersonalComputerMain {

    public static void main(String[] args) {
        PersonalComputer pc = new PersonalComputer(
                new Cpu("Rysen 7",3000));

        System.out.println(pc);

        pc.addHardware(new Hardware("alaplap",
                "Gigabyte"));
        System.out.println(pc);

        pc.addSoftware(new Software("Windows",
                10.1));

        System.out.println(pc);
    }
}
