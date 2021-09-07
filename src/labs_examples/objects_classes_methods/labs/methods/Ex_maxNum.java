package labs_examples.objects_classes_methods.labs.methods;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex_maxNum {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Input as many ints sep'd by commas -->  ");
        String fromUser = scan.next();
        String[] strArray = fromUser.split(",");

        ArrayList<Integer> list = new ArrayList<>();

        for (String element : strArray) {

            int nums = Integer.parseInt(element);
            list.add(nums);

            System.out.println(nums);
        }
        System.out.println("Number of nums " + list.size());
        int max = maxNum(list);
        System.out.println("Largest number is " + max);
    }

    public static int maxNum(ArrayList<Integer> list) {

       int max = list.get(0);
       for(int i : list) {
           if (i > max) {
               max = i;
           }
       }
       return max;

    }
}

