public class MathTable {
    public static void main(String[] args) {
        int a = 3;
        // 6 * 1 = 6*1
        // 6 * 2 = 6*2
        // 6 * 3 = 6*3
        int i = 0;
        while (i < 11) {
            System.out.println(a + " * " + i + " = " + (a * i));
            // System.out.println(i);
            i = i + 1;
        }

        for (int n = 0; n < 11; n = n + 1) {
            System.out.println(a + " * " + n + " = " + (a * n));
            // System.out.println(i);
        }

    }

}
