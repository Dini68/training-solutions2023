package tesco;

import java.util.Arrays;

public class Employee {

    private final String name;
    private final String idNumber;
    private final Employment employment;

    public Employee(String name, String idNumber, Employment employment) {
        this.name = name;
        this.idNumber = idNumber;
        this.employment = employment;
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Kovács", "517190", Employment.FORTY_HOURS);
        System.out.println(emp.getEmployment().getHours());
        System.out.println(Arrays.toString(Employment.values()));
    }

    public String getName() {
        return name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public Employment getEmployment() {
        return employment;
    }
}
