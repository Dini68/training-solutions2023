package meetingrooms;

import java.util.List;
import java.util.Scanner;

public class MeetingRoomController {

    private final Office office = new Office();

    public Office getOffice() {
        return office;
    }

    public static void main(String[] args) {
        MeetingRoomController controller =
                new MeetingRoomController();

        controller.runMenu();
    }

    public void runMenu() {
        Scanner scanner = new Scanner(System.in);
        readOffice();

        printMenu();

        int numOfMenu;
        do {
            System.out.print("Válassz menüt: ");
            numOfMenu = Integer.parseInt(scanner.nextLine());

            if (numOfMenu == 1) {
                printIfMenu1();
            }
            if (numOfMenu == 2) {
                printIfMenu2();
            }
            if (numOfMenu == 3) {
                printIfMenu3();
            }
            if (numOfMenu == 4) {
                printIfMenu4();
            }
            if (numOfMenu == 5) {
                printIfMenu5(scanner);
            }
            if (numOfMenu == 6) {
                printIfMenu6(scanner);
            }
            if (numOfMenu == 7) {
                printIfMenu7(scanner);

            }
        } while (numOfMenu != 8);
        System.out.println("...Kilépés");
    }

    private void printIfMenu7(Scanner scanner) {
        System.out.print("...Területe nagyobb, mint: ");
        List<MeetingRoom> filtered = office.getMeetingRoomsWithAreaLargerThan(
                Integer.parseInt(scanner.nextLine()));
        for (MeetingRoom item : filtered) {
            printMeetingRoomInfo(item);
        }
    }

    private void printMeetingRoomInfo(MeetingRoom item) {
        System.out.println(
                item.getName() + ": sz=" +
                        item.getWidth() + " h=" +
                        item.getLength() + " t=" +
                        item.getArea());
    }

    private void printIfMenu6(Scanner scanner) {
        System.out.print("...Névtöredék: ");
        List<MeetingRoom> filtered = office.getMeetingRoomsWithGivenNamePart(
                scanner.nextLine());
        for (MeetingRoom item : filtered) {
            printMeetingRoomInfo(item);
        }
    }

    private void printIfMenu5(Scanner scanner) {
        System.out.print("Tárgyaló neve: ");
        MeetingRoom found = office
                .getMeetingRoomWithGivenName(scanner.nextLine());
        if (found != null) {
            System.out.println("sz=" +
                    found.getWidth() + " h=" +
                    found.getLength() + " t=" +
                    found.getArea());
        }
    }

    private void printIfMenu4() {
        System.out.println("...Területek: ");
        for (MeetingRoom item : office.getMeetingRooms()) {
            printMeetingRoomInfo(item);
        }
    }

    private void printIfMenu3() {
        System.out.println("...Minden második tárgyaló: ");
        for (MeetingRoom item : office.getEverySecondMeetingRoom()) {
            System.out.println(item.getName());
        }
    }

    private void printIfMenu2() {
        System.out.println("...Tárgyalók visszafelé sorrendben: ");
        for (MeetingRoom item : office.getMeetingRoomsInReverseOrder()) {
            System.out.println(item.getName());
        }
    }

    private void printIfMenu1() {
        System.out.println("...Tárgyalók sorrendben: ");
        for (MeetingRoom item : getOffice().getMeetingRooms()) {
            System.out.println(item.getName());
        }
    }

    private void readOffice() {
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
            office.addMeetingRoom(name, width, length);
        }
    }

    public void printMenu() {
        System.out.println("\t\tMenü");
        System.out.println("----------------------------");
        System.out.println("1. Tárgyalók sorrendben");
        System.out.println("2. Tárgyalók visszafelé sorrendben");
        System.out.println("3. Minden második tárgyaló");
        System.out.println("4. Területek");
        System.out.println("5. Keresés pontos név alapján");
        System.out.println("6. Keresés névtöredék alapján");
        System.out.println("7. Keresés terület alapján");
        System.out.println("8. Kilépés");
    }
}
