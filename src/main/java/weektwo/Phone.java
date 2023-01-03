package weektwo;

import java.util.Scanner;

public class Phone {

    private String type;
    private int mem;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Type: ");
        String type = scanner.nextLine();
        System.out.print("Memory: ");
        int mem = Integer.parseInt(scanner.nextLine());

        Phone phone1 = new Phone(type, mem);
        Phone phone2 = new Phone("Honor", 128);

        System.out.println(phone1.type + " " + phone1.mem);
        System.out.println(phone2.type + " " + phone2.mem);

    }

    public Phone(String type, int mem) {
        this.type = type;
        this.mem = mem;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMem() {
        return mem;
    }

    public void setMem(int mem) {
        this.mem = mem;
    }
}
