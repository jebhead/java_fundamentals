package labs_examples.generics.labs;

import java.util.ArrayList;

public class Exer_3a {

    public static void main(String[] args) {

        ArrayList<String > a1 = new ArrayList<>();
        a1.add("Burrow");
        a1.add("Mahomes");
        a1.add("Prescott");

        int countList;
        countList = countItemslist(a1);

        System.out.println("There are " + countList + " elements in the list");
    }

    private static <E> int countItemslist(ArrayList<E> a) {

        int c = 0;

        c = a.size();

        return c;
    }
}
