package array;

public class ArrayHandler {

    public void addIndexToNumber(int[] source) {

        for (int i = 0; i < source.length; i++) {
            source[i] = source[i] + 1;
        }
    }

    public void concatenateIndexToWord(String[] source) {

        for (int i = 0; i < source.length; i++) {
            source[i] = source[i] + 1;
        }
    }

    public static void main(String[] args) {
        ArrayHandler ah = new ArrayHandler();

        int[] numArr = {1, 4, 3, 8, 7, -8, 0};
        ah.addIndexToNumber(numArr);
        for (int num : numArr) {
            System.out.println(num);
        }
        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i]);
            if (i < numArr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        String[] strArr = {"bab", "só", "jég", "hal", "kék"};
        ah.concatenateIndexToWord(strArr);
        for (String str : strArr) {
            System.out.println(str);
        }
        for (int i = 0; i < strArr.length; i++) {
            System.out.print(strArr[i]);
            if (i < strArr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
