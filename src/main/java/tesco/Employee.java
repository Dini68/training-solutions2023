package tesco;

import java.util.Arrays;

public class Employee {

    private final String name;
    private final String idNumber;
    private final EmploymentType employment;

    public Employee(String name, String idNumber, EmploymentType employment) {
        this.name = name;
        this.idNumber = idNumber;
        this.employment = employment;
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Kovács", "517190", EmploymentType.WEEKLY_40_HOURS);
        System.out.println(emp.getEmployment().getHours());
        System.out.println(Arrays.toString(EmploymentType.values()));
        System.out.println(EmploymentType.valueOf("WEEKLY_40_HOURS"));
    }

    public String getName() {
        return name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public EmploymentType getEmployment() {
        return employment;
    }
}
