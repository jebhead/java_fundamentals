package labs_examples.objects_classes_methods.labs.methods;

import java.util.ArrayList;
import java.util.Scanner;

public class vHi_Lo_2 {

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
        int[] answer = new int[2];
        answer = maxMin(list);
        System.out.println("the max is " + answer[0] + "  and the min is " + answer[1]);

    }

    public static int[] maxMin(ArrayList<Integer> list) {

        int max = list.get(0);
        int min = list.get(0);

        for (int element : list) {

            if (max < element) {
                max = element;
            }
            if (min > element) {
                min = element;
            }
        }
        int [] methodAnswer = {max, min};
        return methodAnswer;
    }
}
