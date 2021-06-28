package labs_examples.datatypes_operators.labs;

import java.util.Scanner;

public class NumGuess_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Enter integer between 1 and 20: ");
        // assign input to variable as int
        int n = scanner.nextInt();
        System.out.println("n = " + n);

        for (int c = 0; c <= 20; c = c + 1) {
            if (c == n)
                System.out.println("This is n: " + c);
        }
    }
}
