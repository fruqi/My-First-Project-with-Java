import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        String substring = text.substring(start, ++end);

        System.out.println(substring);
    }
}
