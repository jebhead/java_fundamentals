package labs_examples.fundamentals.labs;


/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";

        // please declare an int variable below, and set it to the value of the length of "str"

        int strl = 6;

        String str2 = "hello";
        // please initialize a boolean variable and test whether str is equal to str2

        int str2l = 5;

        // please concatenate str & str2 and set the result to a new String variable below

        String both = str.concat(str2);

        System.out.println("together they are: " + both);

        System.out.println(both.replace('h', 'J'));
        System.out.println("ha ha ha");
        System.out.println(" ");

        System.out.println(str);
        System.out.println(str2);
        System.out.println("Are these two equal? ");
        System.out.println(str.equals(str2));
        System.out.println(" ");

        System.out.println("Does hello contain he?");

        System.out.println(str.contains("he"));


        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc

    }


}