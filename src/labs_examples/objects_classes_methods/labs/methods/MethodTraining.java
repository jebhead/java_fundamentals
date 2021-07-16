package labs_examples.objects_classes_methods.labs.methods;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class MethodTraining {

    // Overloading with an arrayList...

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("Input as many ints sep'd by commas -->  ");
        String fromUser = scan.next();
        String[] strArray = fromUser.split(",");

        //int[] nums;

        ArrayList<Integer> list = new ArrayList<>();

        for (String element : strArray) {

            int nums = Integer.parseInt(element);
            list.add(nums);

            System.out.println(nums);
        }

        System.out.println(list);

    }
}

//        int a = 3;
//        int b = 5;
//
//        int sum = addition(a,b);
//        System.out.println("sum");
//
//        public static int addition() {
//
//        int addition(int a, int b){
//            return a + b
//        }
//
//        int addition(int a, int b, int c){
//            return a + b + c
//        }
//
//        int addition(double a, double b, double c){
//            return ((int)(a + b + c))
        //}
        //int sum = addition(list);

//    public static int addition(list){
//        int a = 0;
//
//        for(int i : list){
//            a=a+i;
//            System.out.println(i);}
//        System.out.println(a);
//        return a;
//        }

        //public static int addition(list) {

//        for(int element : list) {
//
//        }

        //}


//    1) Demonstrate method overloading in this class


//
//    2) Demonstrate the difference between "pass by value" and "pass by reference"


//
//    3) Create a method that will return the largest of 4 numbers (all of which are passed in as arguments)
//
//    4) Write a method to count all consonants (the opposite of vowels) in a String
//
//    5) Write a method that will determine whether or not a number is prime
//
//    6) Write a method that will return a small array containing the highest and lowest numbers in a given numeric array,
//    which is passed in as an argument
//
//    7) Write a method that takes 3 arguments (int maxNum, int divisor1, int divisor2) and returns an Integer Arraylist.
//    In this method create an Integer ArrayList and populate it with each number between zero and maxNum that is
//    divisible by both divisor1 and divisor2. Then return this ArrayList. After calling this method, print out the
//    length of the returned list
//
//
//    8) Write a method that will reverse an array in place use only one extra temp variable. For this exercise you cannot
//    instantiate a second array. You must reverse the array in place using only one extra temp variable. Hint: this
//    variable is used to temporarily store individual values in the array



