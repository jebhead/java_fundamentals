package labs_examples.generics.labs;

/**
 * Generics Exercise 2:
 *
 *      Create a class with a generic method that takes in an ArrayList of any Numeric type and returns the sum of all
 *      Numbers in the ArrayList. Demonstrate how to call this method from the main() method.
 */
import java.util.ArrayList;

class Demo {

    public static void main(String[] args) {

        ArrayList<Double> a1 = new ArrayList<>();
        a1.add(2.3);
        a1.add(3.4);
        a1.add(8.5);

        double sumd;
        sumd = sumArraylist(a1);

        System.out.println(sumd);


        ArrayList<Integer> b1 = new ArrayList<>();
        b1.add(2);
        b1.add(3);
        b1.add(8);

        double sumi;
        sumi = sumArraylist(b1);

        System.out.println(sumi);
    }

    public static <E> double sumArraylist(ArrayList<E> m1) {

        double sum = 0;

        for(int i =0; i < m1.size(); i++) {
            System.out.println(m1.get(i));
            //sum = sum + (double) m1.get(i);
        }
        return sum;
    }
}



