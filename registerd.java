import java.util.Scanner;

public class registerd {

    public static void main(String[] args) {

        user user = new user();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First number?");
        int a = scanner.nextInt();
        System.out.println("Enter Seconds number?");
        int b = scanner.nextInt();
        scanner.close();

        System.out.println(user.getAdditionResult(a, b));

        System.out.println(user.getSubstractResult(a, b));

    }
}