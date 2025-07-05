import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);

        System.out.println("input num is : "+num);
    }
}

// String a = "45"
