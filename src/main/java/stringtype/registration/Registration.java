package stringtype.registration;

import java.util.Scanner;

public class Registration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        UserValidator uv = new UserValidator();

        String answerOfValid;

        System.out.print("Username: ");
        String correct = "Helyes";
        String incorrect = "Helytelen";
        String username = scanner.nextLine();
        answerOfValid = uv.isValidUsername(username) ?
                correct : incorrect;
        System.out.println(answerOfValid);

        System.out.print("Password1: ");
        String password1 = scanner.nextLine();
        System.out.print("Password2: ");
        String password2 = scanner.nextLine();
        answerOfValid = uv.isValidPassword(password1, password2) ?
                correct : incorrect;
        System.out.println(answerOfValid);

        System.out.print("Email: ");
        String email = scanner.nextLine();
        answerOfValid = uv.isValidEmail(email) ?
                correct : incorrect;
        System.out.println(answerOfValid);

    }
}
