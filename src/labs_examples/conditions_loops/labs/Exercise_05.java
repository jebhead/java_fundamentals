package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 5: Calculator
 * <p>
 * Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 * of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 * Print the results to the console.
 * <p>
 * For example, if a user enters 1 and 100, the output should be:
 * <p>
 * The sum is: 5050
 * The average is: 50.5
 */

import java.util.Scanner;

public class Exercise_05 {

    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter a number as an upper bound --> ");

        int upper = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter a number as a lower bound --> ");

        int lower = scanner2.nextInt();

        double sum = 0;
        double n = 1 + upper - lower;

        for (int c = lower; c <= upper; c++) {

            sum = sum + c;
            //System.out.println(c);

        }
        System.out.println("Cumulative is " + sum);
        System.out.println("Average of numbers is " + sum/n);
    }
}

