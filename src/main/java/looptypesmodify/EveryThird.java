package looptypesmodify;

import java.util.Arrays;

public class EveryThird {

    public int[] changeToZero(int[] numbers) {

        int[] copyNum = Arrays.copyOf(numbers, numbers.length);
        for (int i = numbers.length-1; i >= 0; i -=3) {
            copyNum[i] = 0;
        }

        return copyNum;
    }

    public static void main(String[] args) {

        int[] numbers = {2, 6, 3, 5, 7, 2, 6, 2, 3, 5, 7, 3, 2, 9};

        EveryThird et = new EveryThird();

        int[] result = et.changeToZero(numbers);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(result));
    }
}
