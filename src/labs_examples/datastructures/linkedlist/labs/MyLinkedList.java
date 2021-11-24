package labs_examples.datastructures.linkedlist.labs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *      LinkedLists - Exercise_01
 *
 *      Demonstrate your mastery of Java's built-in LinkedList class by demonstrating the following:
 *
 *      1) create a LinkedList (from Java's libraries)
 *      2) add()
 *      3) addAll()
 *      4) addFirst()
 *      5) addLast()
 *      6) getFirst()
 *      7) getLast()
 *      8) get()
 *      9) set()
 *      10) push()
 *      11) pop()
 *      12) remove()
 *      13) contains()
 *      14) listIterator()
 *      15) clear()
 */


public class MyLinkedList {

    public static void main(String[] args) {

        LinkedList<String> qbs = new LinkedList();

        qbs.add("Mahomes");
        qbs.add("Murray");
        qbs.add("Brady");
        qbs.add("Stafford");
        qbs.add("Prescott");
        qbs.add("Allen");
        qbs.add("Jackson");

        Iterator i = qbs.iterator();

        while(i.hasNext()) {
            System.out.println(i.next());
        }

        System.out.println();

        System.out.println(qbs.get(3));
        System.out.println();
        System.out.println(qbs.pop());
        System.out.println(qbs.pop());
        System.out.println(qbs.pop());

        System.out.println();

        qbs.addFirst("Bradshaw");

        qbs.addLast("Burrow");

        Iterator j = qbs.iterator();

        while(j.hasNext()) {
            System.out.println(j.next());
        }

        System.out.println();

        ArrayList<String> plus = new ArrayList<>();
        plus.add("Mahomes");
        plus.add("Murray");
        plus.add("Brady");

        qbs.addAll(plus);

        Iterator p = qbs.iterator();

        while(p.hasNext()) {
            System.out.println(p.next());
        }
        System.out.println();

        qbs.remove(0);
        qbs.remove(4);

        Iterator l = qbs.iterator();

        while(l.hasNext()) {
            System.out.println(l.next());
        }
        System.out.println();

        qbs.push("Brady");
        qbs.push("Murray");

        qbs.remove(8);
        qbs.remove(7);

        Iterator o = qbs.iterator();

        while(o.hasNext()) {
            System.out.println(o.next());
        }
        System.out.println();


    }
}
