package labs_examples.datastructures.linkedlist.labs;

import java.util.Iterator;

import java.util.LinkedList;


public class MyOwnList<T> {

    private Node head;

    public MyOwnList(T... data) {

        if (data.length < 1) {
            head = null;
        } else {
            for (int i = 0; i < data.length; i++) {
                add(data[i]);
            }
        }

    }

    public void add(T data) {

        insert(data, size());
    }

    private void insert(T data, int index) {

        if (head == null) {
            head = new Node(data);
        } else {

            Node iterator = head;

            Node previous = null;

            if (index == 0) {

                head = new Node(data, head);

            } else if (index < size()) {



                int count = 0;


                while (count != index) {
                    previous = iterator;
                    iterator = iterator.next;
                    count++;
                }



                previous.next = new Node(data, iterator);


            } else {


                while (iterator.next != null) {
                    iterator = iterator.next;
                }


                iterator.next = new Node(data);
            }
        }
    }

    private int size() {

        int count = 0;
        Node iter = head;
        while (iter != null) {
            count++;
            iter = iter.next;
        }
        return count;
    }

    public T get(int index) {
        try {
            // simple variable to use for looping over the list
            int count = 0;


            Node iterator = head;


            while (count != index) {
                iterator = iterator.next;
                count++;
            }
            return (T) iterator.data;


        } catch (NullPointerException ex) {
            return null; // list is empty
        }
    }

    public static void main(String[] args) {

        MyOwnList list = new MyOwnList(1, 2, 3, 4, 5, 6);

        list.add(7);

        System.out.println(list.size());

        System.out.println();

        list.insert(8, 3);

        System.out.println(list.get(0));

        System.out.println();

        for(int i =0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }
}
