package introdate;

import java.time.LocalDateTime;

public class University {

    public static void main(String[] args) {

        Exam exam1 = new Exam("Matematika",
                LocalDateTime.of(2022, 5, 25,
                        15,30));

        Exam exam2 = new Exam("Magyar",
                LocalDateTime.of(2022, 5, 2,
                        8,30));

        System.out.println(exam1.getSubject());
        System.out.println(exam1.getExamDate());
        System.out.println(exam1.getExamDate().getYear() + " "
                       + exam1.getExamDate().getMonth() + " "
                       + exam1.getExamDate().getDayOfMonth() + " "
                       + exam1.getExamDate().getHour() + " "
                       + exam1.getExamDate().getMinute());

        String text = exam1.getExamDate().isBefore(exam2.getExamDate()) ?
                "Az 1. vizsga időpont előbb van, mint a második" :
                "Az 1. vizsga időpont később van, mint a második";

        System.out.println(text);

        System.out.println(exam1.getMessage());

        System.out.println(exam2.getMessage());
    }
}
