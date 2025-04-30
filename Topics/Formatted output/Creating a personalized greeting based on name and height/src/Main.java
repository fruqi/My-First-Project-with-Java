import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int height = scanner.nextInt();

        // TODO: Print the given statement replacing the placeholders with given inputs using formatted string.
        System.out.printf("Hello, my name is %s and I am %d cm tall.", name, height);
    }
}
