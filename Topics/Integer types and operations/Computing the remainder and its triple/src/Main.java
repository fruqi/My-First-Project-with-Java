import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        var reminderResult = input % 2;

        System.out.println(reminderResult);

        var multiplicationResult = reminderResult * 3;

        System.out.println(multiplicationResult);

        scanner.close();
    }
}
