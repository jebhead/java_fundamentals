package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 6: Basic while loop
 *
 *      Use a "while" loop find the sum of numbers to from 1-100. Print the sum to the console
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter a number as an upper bound --> ");

        int upper = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter a number as a lower bound --> ");

        int lower = scanner2.nextInt();

        double n = upper - lower;
        int i = lower;
        double sum = 0;

        while(i <= upper) {

            sum = sum + i;
            i = i + 1;

            //System.out.println(i);
        }
        System.out.println("The sum is " + sum);
        System.out.println("the average is " + sum/n);
    }
}
