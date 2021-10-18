package labs_examples.generics.labs;

import java.util.ArrayList;

public class Exer_3b {

    public static void main(String[] args) {

        ArrayList<String > a1 = new ArrayList<>();
        a1.add("Burrow");
        a1.add("Mahomes");
        a1.add("Prescott");

        int countList;
        countList = countItemslist(a1);

        System.out.println("There are " + countList + " elements in the list");

        System.out.println(a1);

        ArrayList<String> switched = new ArrayList();

        switched = switchPlace(a1);

        System.out.println(switched);
    }

    private static <T> ArrayList<String> switchPlace(ArrayList<T> b) {

        ArrayList<String > a2 = new ArrayList<>();

        a2.add(0, (java.lang.String) b.get(2));
        a2.add(1, (java.lang.String) b.get(1));
        a2.add(2, (java.lang.String) b.get(0));

        return a2;
    }

    private static <E> int countItemslist(ArrayList<E> a) {

        int c = 0;

        c = a.size();

        return c;
    }
}

