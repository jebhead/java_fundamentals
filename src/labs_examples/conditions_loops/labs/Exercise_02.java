package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use an if-else statement
 *      to accomplish this task.
 * 
 *      Bonus Tricky Challenge: Use a "nested-if" statement.
 *
 */

import java.util.Scanner;

public class Exercise_02 {

    public static void main(String[] args) {

        // 1) create scanner (don't forget to import Scanner!)
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Enter a number between 1 to 7 corresponding to days of the week, or 8 as other");
        // assign input to variable as int
        int number = scanner.nextInt();

        if(number == 1){
            System.out.println("Monday");
        }else if(number == 2){
            System.out.println("Tuesday");
        }else if(number == 3){
            System.out.println("Wednesday");
        }else if(number == 4){
            System.out.println("Thursday");
        }else if(number == 5){
            System.out.println("Friday");
        }else if(number == 6){
            System.out.println("Saturday");
        }else if(number == 7){
            System.out.println("Sunday");
        }else if(number == 8){
            System.out.println("Other");
        }

        if(number > 1){
            if(number > 2){
                if(number > 3){

                }else{
                    System.out.println("wednesday");
                }

            }else{
                System.out.println("tuesday");
            }
        }else
            System.out.println("monday");
    }
}
