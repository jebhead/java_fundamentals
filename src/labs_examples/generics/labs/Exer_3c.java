package labs_examples.generics.labs;

import java.util.ArrayList;

public class Exer_3c {

    public static void main(String[] args) {

        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(5);
        a1.add(8);
        a1.add(2);
        a1.add(9);

        int countList;
        countList = countItemslist(a1);

        System.out.println("There are " + countList + " elements in the list");

        System.out.println(a1);

        ArrayList<Integer> switched = new ArrayList();

        switched = switchPlace(a1);

        System.out.println(switched);

        int largest;
        largest = getBiggest(a1);

        System.out.println(largest);
    }

    private static <Y> int getBiggest(ArrayList<Y> c) {

        int t = 0;
//        for(int p = 0; p < c.size(); p++){
//
//            if (c.get(p).intValue() > t){
//
//                t = c.get(p).intValue();
//
//            }
//        }
        return t;
    }

    private static <T> ArrayList<T> switchPlace(ArrayList<T> b) {

        ArrayList<T> a2 = new ArrayList<>();

        a2.add(0, b.get(2));
        a2.add(1, b.get(1));
        a2.add(2, b.get(0));
        a2.add(3, b.get(3));

        return a2;
    }

    private static <E> int countItemslist(ArrayList<E> a) {

        int c = 0;

        c = a.size();

        return c;
    }
}
