import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstText = scanner.nextLine();
        String secondText = scanner.nextLine();

        String sanitizedText1 = firstText.replace(" ", "");
        String sanitizedText2 = secondText.replace(" ", "");

        boolean result = sanitizedText1.equals(sanitizedText2);

        System.out.println(result);
    }
}
