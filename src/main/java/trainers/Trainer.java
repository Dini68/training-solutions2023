package trainers;

public class Trainer {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Trainer(String name) {
        this.name = name;
    }

    public void printEmployeeName() {
        System.out.println(getName());
    }

}
