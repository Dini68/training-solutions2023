package weektwo.project;

import java.util.Scanner;

public class Controller {

    private Office office;

    public Office getOffice() {
        return office;
    }

    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.readOffice();

        controller.printMenu();

        controller.runMenu();
    }

    public void readOffice() {
        office = new Office();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Tárgyalók száma: ");
        int numOfRooms = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numOfRooms; i++) {
            System.out.print(i + 1 + ". tárgyaló neve: ");
            String name = scanner.nextLine();

            System.out.print(i + 1 +
                    ". tárgyaló szélessége méterben: ");
            int width = Integer.parseInt(scanner.nextLine());

            System.out.print(i + 1 +
                    ". tárgyaló hosszúsága méterben: ");
            int length = Integer.parseInt(scanner.nextLine());
            System.out.println();
            MeetingRoom actualRoom = new MeetingRoom(name,
                    length, width);

            office.addMeetingRoom(actualRoom);
        }
    }

    public void printMenu() {
        System.out.println("\t\tMenü");
        System.out.println("----------------------------");
        System.out.println("1. Tárgyalók sorrendben");
        System.out.println("2. Tárgyalók visszafele");
        System.out.println("3. Minden második tárgyaló");
        System.out.println("4. Területek");
        System.out.println("5. Keresés pontos név alapján");
        System.out.println("6. Keresés névtöredék alapján");
        System.out.println("7. Keresés terület alapján");
        System.out.println("8. Kilépés");
    }

    public void runMenu() {
        Scanner scanner = new Scanner(System.in);

        int numOfMenu;
        do {
            System.out.print("Válassz menüt: ");
            numOfMenu = Integer.parseInt(scanner.nextLine());

            if (numOfMenu == 1) {
                office.printNames();
            } else if (numOfMenu == 2) {
                office.printNamesReverse();
            } else if (numOfMenu == 3) {
                office.printEventNames();
            } else if (numOfMenu == 4) {
                office.printAreas();
            } else if (numOfMenu == 5) {
                System.out.print("Tárgyaló neve: ");
                office.printMeetingRoomsWithName(
                        scanner.nextLine());
            } else if (numOfMenu == 6) {
                System.out.print("Névtöredék: ");
                office.printMeetingRoomsContains(
                        scanner.nextLine());
            } else if (numOfMenu == 7) {
                System.out.print("Területe nagyobb, mint: ");
                office.printAreasLargerThan(
                        Integer.parseInt(scanner.nextLine()));
            }
        } while (numOfMenu != 8);
    }
}
