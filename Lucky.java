public class Lucky {
    public static void main(String[] args) {
        int n = 76;
        int sum = 0;
        while (n > 0) {
            int ld = n % 10;
            sum = sum + ld;
            n = n / 10;

        }
        if (sum % 4 == 0 || sum % 7 == 0) {
            System.out.print("is a Lucky number");
        } else {
            System.out.print("is  not a Lucky number");
        }
    }
}
