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

    public boolean sameTempValuesDaylight(double[] day,
                                          double[] anotherDay){
        int minHours = min(day.length, anotherDay.length);
        return Arrays.equals(
                Arrays.copyOfRange(day, 0, minHours),
                Arrays.copyOfRange(anotherDay, 0, minHours));
    }

    private int min(int dayHours, int anotherDayHours) {
        if (dayHours < anotherDayHours) {
            return dayHours;
        }
        return anotherDayHours;
    }

    public boolean wonLottery(int[] tip, int[] won) {
        int[] tipCopy = Arrays.copyOf(tip, tip.length);
        int[] wonCopy = Arrays.copyOf(won, won.length);

        Arrays.sort(tipCopy);
        Arrays.sort(wonCopy);
        return Arrays.equals(tipCopy, wonCopy);
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

        double[] day3 = {4, 1.6, 2.3, 3.8, 5};
        double[] anotherDay3 = {4, 1.6, 2.3, 3.8};
        System.out.println(am.sameTempValuesDaylight(day3, anotherDay3));

        int[] tip = {8, 1, 12, 11, 20};
        int[] won = {20, 8, 1, 12, 11};
        System.out.println(Arrays.toString(tip));
        System.out.println(Arrays.toString(won));

        System.out.println(am.wonLottery(tip, won));
        System.out.println(Arrays.toString(tip));
        System.out.println(Arrays.toString(won));
    }

}
