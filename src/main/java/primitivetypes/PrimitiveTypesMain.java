package primitivetypes;

public class PrimitiveTypesMain {

    public static void main(String[] args) {

        int a = 2;
        Integer b = 2;
        Integer c = a;
        Integer d = b;
        Integer e = Integer.valueOf(2);
        int f = Integer.valueOf(2);
        int g = Integer.valueOf(a);
        int h = Integer.valueOf(c);
        int i = Integer.parseInt("2");
        Integer j = Integer.parseInt("2");

        System.out.println(a + " " + b + " " + c + " " +
                        d + " " + e + " " + f + " " +
                        g + " " + h + " " + i + " " + j);

        boolean k = true;
        Boolean l = true;
        boolean m = Boolean.valueOf(true);
        Boolean n = Boolean.valueOf(true);
        boolean o = Boolean.parseBoolean("TrUe");
        Boolean p = Boolean.parseBoolean("TrUe");
        boolean q = Boolean.valueOf("TreU");
        Boolean r = Boolean.valueOf("TreU");

        System.out.println(k + " " + l + " " + m + " " +
                n + " " + o + " " + p + " " +
                q + " " + r);

    }
}
