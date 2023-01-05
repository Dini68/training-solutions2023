package arrays;

import java.util.Arrays;

public class ArraysMain {

    public String numberOfDaysAsString() {
        int[] numberOfDays = {31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31};
        return Arrays.toString(numberOfDays);
    }

    public String multiplicationTableAsString(int size) {
        int[][] mul = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                mul[i][j] = (i + 1) * (j + 1);
            }
        }
        return Arrays.deepToString(mul);
    }

    public boolean sameTempValues(double[] day,
                                  double[] anotherDay) {
        return Arrays.equals(day, anotherDay);
    }

    public static void main(String[] args) {
        ArraysMain am = new ArraysMain();
        System.out.println(am.numberOfDaysAsString());

        System.out.println(am.multiplicationTableAsString(5));

        double[] day = {1.5, 2.0};
        double[] anotherDay = {1.6, 2.3};
        System.out.println(am.sameTempValues(day, anotherDay));

        double[] day2 = {1.6, 2.3};
        double[] anotherDay2 = {1.6, 2.3};
        System.out.println(am.sameTempValues(day2, anotherDay2));
    }

}
