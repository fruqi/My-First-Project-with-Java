import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        // Create a Scanner object to read input
        Scanner in = new Scanner(System.in);

        // Read the next integer
        int n = in.nextInt(); 

        // Compute and print the square of n
        int nSquare = n * n;
        System.out.println(nSquare);

        // Compute and print the cube of n
        int nCube = n * n * n;
        System.out.println(nCube);

        // Compute and print the fourth power of n
        int fourthPower = nSquare * nSquare;
        System.out.println(fourthPower);
    }
}
