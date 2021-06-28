package labs_examples.datatypes_operators.labs;

import java.util.Scanner;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Enter a radius between 1 and 1,000,000: ");
        // assign input to variable as int
        int radius = scanner.nextInt();
        System.out.print("Enter a height between 1 and 1,000,000: ");
        // assign input to variable as int
        int height = scanner.nextInt();

        double pi = 3.14159;

        double volume = pi * radius * radius * height;
        double surface = (2 * pi * radius * height) + (2 * pi * radius * radius);
        double surface2 = 2*pi*radius*(radius+height);

        System.out.println("Volume = " + volume);
        System.out.println("Surface = " + surface);
        System.out.println("Surface = " + surface2);
    }
}