package introcontrol;

public class IntroControl {

    public int subtractTenIfGreaterThanTen(int number) {
        if (number <= 10) {
            return number;
        }
        return number - 10;
    }

    public String describeNumber(int number) {
        if (number == 0) {
            return "zero";
        }
        return "not zero";
    }

    public String greetingToJoe(String name) {
        if (name.equals("Joe")) {
            return "Hello Joe";
        }
        return "";
    }

    public int calculateBonus(int sale) {
        if (sale >= 1000000) {
            return (int)Math.round(sale * 0.1);
        }
        return 0;
    }

    public int calculateConsumption(int prev, int next) {
        if (next > prev) {
            return next - prev;
        }
            return next - prev + 10000;
    }

    public void printNumbers(int max) {
        for (int i = 0; i <= max; i++) {
            System.out.println(i);
        }
    }

    public void printNumbersBetween(int min, int max) {
        for (int i = min; i <= max; i++) {
            System.out.println(i);
        }
    }

    public void printNumbersBetweenAnyDirection(int a, int b) {
        if (a > b) {
            for (int i = a; i >= b; i--) {
                System.out.println(i);
            }
        }
        else {
            for (int i = a; i <= b; i++) {
                System.out.println(i);
            }
        }
    }
    public void printOddNumbers(int max) {
        for (int i = 1; i <= max; i += 2) {
            System.out.println(i);
        }
    }


}
