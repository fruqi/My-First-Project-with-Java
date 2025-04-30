import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Use a Scanner to read user input
        var scanner = new Scanner(System.in);

        // Read the number of apples from the user
        int apple = scanner.nextInt();

        // Read the number of oranges from the user
        var orange = scanner.nextInt();


        // Calculate the total number of fruits and print the result
        System.out.println(apple + orange);

        scanner.close();
    }
}
