package labs_examples.objects_classes_methods.labs.methods;

import java.util.ArrayList;
import java.util.Scanner;

public class vHi_Lo {

//    Write a method that will return a small array containing the highest and lowest numbers in a given numeric array,
//    which is passed in as an argument


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number of integers separated by commas --> ");
        String userNums = scan.next();
        String[] array = userNums.split(",");

        ArrayList<Integer> list = new ArrayList<>();

        for (String element : array) {
            int nums = Integer.parseInt(element);
            list.add(nums);

        }
        int ansN = maxMin(list);
        int ansX = minMax(list);

        System.out.println(ansX + " " + ansN);
    }

    public static int maxMin(ArrayList<Integer> list) {

        int max = list.get(0);

        for (int elem : list) {

            if (elem > max) {
                max = elem;
            }
        }
        int ansMax = max;
        return ansMax;
    }

    public static int minMax(ArrayList<Integer> list) {

        int min = list.get(0);

        for (int elem : list) {

            if (elem < min) {
                min = elem;
            }
        }
        int ansMin = min;
        return ansMin;

    }
}
