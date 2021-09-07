package labs_examples.objects_classes_methods.labs.methods;

import java.util.Scanner;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        //Multiply and Add pert

        Scanner resp1 = new Scanner(System.in);

        System.out.print("enter two numbers separated by comma --> ");
        String input = resp1.next();
        String[] array = input.split(",");

        int a = Integer.parseInt(array[0]);
        int b = Integer.parseInt(array[1]);

        int product = multiply(a, b);
        int sum = divide(a, b);

        System.out.println("The product is " + product + " and the quotient is " + sum);

        // The Joke part

        Scanner resp2 = new Scanner(System.in);

        System.out.println("Hey, wanna hear a joke?  Y/N --> ");
        String ansJoke = resp2.next();

        if (ansJoke.equalsIgnoreCase("n")) {
            System.out.println("Ok - be that way... ");
        } else {
            System.out.println("A horse walks into a bar, and the bartender says:");
            System.out.println(" ... Hey - why the long face?  ");
            System.out.println();
        }

        // Years to Seconds converter

        Scanner resp3 = new Scanner(System.in);
        System.out.print("OK - now enter a number of years, and we'll convert to seconds --> ");

        int years = resp3.nextInt();

        int seconds = secondsInyear(years);

        System.out.println("In " + years + " years, there are " + seconds + " seconds!");

        // VarArg part


        Exercise_01 obj = new Exercise_01();
        obj.varargsMethod("one", "two", "three");
        obj.varargsMethod("www");



    }

// START Methods ************

    public static int multiply(int a, int b) {
        int result = a * b;

        return result;
    }

    public static int divide(int a, int b) {

        int result2 = (a / b);

        return result2;
    }

    public static int secondsInyear(int years) {

        int result = years * 365 * 24 * 60 * 60;
        return result;
    }


    // you can pass one or more Strings to the method below because it uses varargs
    public void varargsMethod( String y, String...v){
        int x = v.length;

// we can now iterate through each String in the array (called "v") created by the varargs parameter
        for (String word : v){
            System.out.println(word);
        }
    }


    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b


    // 3) Create a static void method that will print of joke of your choice to the console


    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents


    // 5) Create a varargs method that will return the length of the varargs array passed in

}

