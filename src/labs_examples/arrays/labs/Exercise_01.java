package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 * Arrays calculator
 * <p>
 * Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 * calculate the sum of all of the numbers in the array as well as the average.
 * <p>
 * Print the results to the console.
 */

public class Exercise_01 {

    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter a number  --> ");

        int num1 = scanner1.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter a number  --> ");

        int num2 = scanner2.nextInt();

        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Enter a number  --> ");

        int num3 = scanner1.nextInt();

        Scanner scanner4 = new Scanner(System.in);
        System.out.print("Enter a number  --> ");

        int num4 = scanner1.nextInt();

        int[] numbers = {num1, num2, num3, num4};

        double s = 0;

        for (int i = 0; i < numbers.length; i++) {
            s = s + numbers[i];
        }
        System.out.println(s);
        System.out.println(s / numbers.length);
    }
}