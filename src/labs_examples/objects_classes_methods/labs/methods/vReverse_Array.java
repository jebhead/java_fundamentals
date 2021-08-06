package labs_examples.objects_classes_methods.labs.methods;

import java.util.ArrayList;

public class Reverse_Array {

    //Write a method that will reverse an array in place use only one extra temp variable. For this exercise you cannot
    //instantiate a second array. You must reverse the array in place using only one extra temp variable. Hint: this
    //variable is used to temporarily store individual values in the array

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(45);
        list.add(12);
        list.add(41);
        list.add(23);
        list.add(76);
        list.add(98);
        list.add(58);

        System.out.println(list);

        System.out.println();
        int temp = 0;



        for (int i = 0; i < list.size() / 2; i++) {

            temp = list.get(i);
            list.remove(i);
            list.add(i, list.get(list.size() - i -1));
            list.remove(list.size() - i - 1);
            list.add(list.size() - i, temp);
        }
        System.out.println(list);
    }
}
