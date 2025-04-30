import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        String result = word.replace('a', 'b');

        System.out.println(result);
    }
}
