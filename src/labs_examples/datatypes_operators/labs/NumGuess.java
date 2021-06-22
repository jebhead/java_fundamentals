package labs_examples.datatypes_operators.labs;

import java.util.Scanner;

public class NumGuess {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Enter integer between 1 and 20: ");
        // assign input to variable as int
        int n = scanner.nextInt();
        int i = 10;

        if (n > 10){
            i = i + 5;
            System.out.println("n > 10");
        }
        else if(n == 10){
            i = 10;
            System.out.println("i is 10!");
        }
        else{
            i = i - 5;
            System.out.println("n < 10");
            if(n > 5){
                i = i + 3;
                System.out.println("n > 5");
                if(n < i){
                    System.out.println("n is 6 or 7");
                    if(n == 6){
                        System.out.println("n is 6!");
                    }
                    else{
                        System.out.println("n is 7!");
                    }
                }
                else {
                    System.out.println("n is 8 or 9");
                    if(n == 8){
                        System.out.println("n is 8!");
                    }
                    else{
                        System.out.println("n is 9!");
                    }
                }
            }
            else{
                if(n == 5){
                    System.out.println("n is 5!");
                }
                else if(n == 4){
                        System.out.println("n is 4!");
                    }
                else if( n== 3){
                        System.out.println("n is 3!");
                }
                else if( n== 2){
                    System.out.println("n is 2!");
                }else{
                    System.out.println("n is 1!");
                }
            }
        }

    }
}
