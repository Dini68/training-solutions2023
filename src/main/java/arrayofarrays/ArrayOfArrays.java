package arrayofarrays;

public class ArrayOfArrays {

    public void printArrayOfArrays(int[][] a) {
        for (int[] i : a) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] numbers = new int[4][3];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                numbers[i][j] = j;
            }
        }

        ArrayOfArrays aa = new ArrayOfArrays();
        aa.printArrayOfArrays(numbers);
    }
}
