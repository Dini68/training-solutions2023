package arrayofarrays;

public class Triangular {

    public int[][] triangularMatrix(int size) {

        int[][] triangular = new int[size][];
        for (int i = 0; i < size; i++) {
            triangular[i] = new int[i + 1];
            for (int j = 0; j < i + 1; j++)
                triangular[i][j] = i;
        }

        return triangular;
    }

    public static void main(String[] args) {
        Triangular tr = new Triangular();

        int[][] result = tr.triangularMatrix(5);

        for (int[] i: result) {
            for (int j: i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
