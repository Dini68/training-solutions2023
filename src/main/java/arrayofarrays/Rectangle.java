package arrayofarrays;

public class Rectangle {

    public int[][] rectangularMatrix(int size) {

        int[][] rectangular = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                rectangular[i][j] = i;
            }
        }
        return rectangular;
    }

    public static void main(String[] args) {

        Rectangle re = new Rectangle();

        int[][] result = re.rectangularMatrix(4);

        for (int[] i : result) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
