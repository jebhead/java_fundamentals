package labs_examples.arrays.labs;


import java.util.Scanner;

/**
 * More labs_examples.arrays
 * <p>
 * Using the array below, take in a number from 1-10 from the user and print out the index of that
 * element.
 */

public class Exercise_02 {


    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10 --> ");

        int num = scanner.nextInt();

        //System.out.println("The number is " + num);

        for(int i = 0; i < array.length; i++ ) {
            if(array[i] == num) {
                System.out.println("Your number is " + num + " and the index is " + i);
                break;
            }
        }

    }
}
