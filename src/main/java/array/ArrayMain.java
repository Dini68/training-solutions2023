package array;

public class ArrayMain {

    public static void main(String[] args) {

        String[] days = {"Hétfő", "Kedd", "Szerda", "Csütörtök"
                , "Péntek", "Szombat", "Vasárnap"};

        System.out.println(days[1]);
        System.out.println(days.length);

        int[] powersOf2 = new int[5];

        powersOf2[0] = 1;
        for (int i = 1; i < 5; i++) {
                powersOf2[i] = powersOf2[i - 1] * 2;
        }
        for (int i: powersOf2) {
            System.out.print(i + " ");
        }
        System.out.println();

        boolean[] booleans = new boolean[6];

        booleans[0] = false;
        for (int i = 1; i < 6; i++) {
            booleans[i] = !booleans[i - 1];
        }
        for (boolean b: booleans) {
            System.out.print(b + " ");
        }
        System.out.println();
    }
}
