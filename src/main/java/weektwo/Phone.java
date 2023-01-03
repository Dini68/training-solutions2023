package weektwo;

public class Phone {

    private String type;
    private int mem;

    public static void main(String[] args) {
        Phone phone1 = new Phone("Samsung", 64);
        Phone phone2 = new Phone("Honor", 128);
        System.out.println(phone1.type);
        System.out.println(phone1.mem);
        System.out.println(phone2.type);
        System.out.println(phone2.mem);
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
