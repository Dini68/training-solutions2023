package arrayofarrays;

import java.util.Arrays;

public class DailyValues {

    public int[][] getValues() {

        int[][] result = new int[12][];
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31,
                30, 31, 30, 31};
        for (int i = 0; i < 12; i++) {
            result[i] = new int[days[i]];
        }
        return result;
    }

    public static void main(String[] args) {

        DailyValues dv = new DailyValues();
        System.out.println(Arrays.deepToString(dv.getValues()));
    }
}
