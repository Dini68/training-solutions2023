package enumtype.university;

import java.util.Arrays;

public class UniversityMain {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(University.values()));

        for (University un : University.values()) {
            System.out.println(un.getName());
        }
    }
}
