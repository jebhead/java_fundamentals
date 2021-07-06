package labs_examples.arrays.labs;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList();

        cars.add("Galaxy");
        cars.add("Mustang");
        cars.add("Fairlane");
        cars.add("Focus");
        cars.add("Fusion");
        cars.add("GT");


        if (!cars.isEmpty()){
            // iterate over ever element in the ArrayList and print it
            for (String s : cars){
                System.out.print(s + " ");
            }
            System.out.println();
        }
        System.out.println("Number of cars in the collection " + cars.size());
        System.out.println("Do we have no cars? " + cars.isEmpty());
        System.out.println("Do we have a Focus? " + cars.contains("Focus"));
        System.out.println("Car in space 3 is " + cars.get(2));
    }
}

