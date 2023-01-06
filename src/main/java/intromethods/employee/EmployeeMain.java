package intromethods.employee;

public class EmployeeMain {

    public static void main(String[] args) {

        Employee em = new Employee("Hunor", 2025,
                1000000);

        System.out.println(em);

        em.raiseSalary(200000);

        System.out.println(em);

        em.setName("Kovács");

        System.out.println(em);
    }
}
