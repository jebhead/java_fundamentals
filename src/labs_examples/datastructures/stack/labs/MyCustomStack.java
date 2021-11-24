package labs_examples.datastructures.stack.labs;

import labs_examples.datastructures.linkedlist.examples.CustomLinkedList;

import java.util.Stack;

public class MyCustomStack<T> {


    // using Kevin Graham's code with T as generic

    private CustomLinkedList<T> list = new CustomLinkedList<>();

    public void push(T item) {

        list.insert(item);
    }


    public T pop() {
        try {

            T item = list.get(0);

            list.remove(0);

            return item;
        } catch (NullPointerException ex) {
            System.out.println("Exception" + ex);
            return null;
        }
    }


    public boolean empty() {
        return list.isEmpty();
    }

    public static void main(String[] args) {

        MyCustomStack<String> qbstack = new MyCustomStack<>();

        qbstack.push("Burrow");
        qbstack.push("Prescott");
        qbstack.push("Brady");
        qbstack.push("Murray");
        qbstack.push("Allen");
        qbstack.push("Mahomes");


        System.out.println();


        System.out.println();


        System.out.println(qbstack.pop());
        System.out.println(qbstack.pop());
        System.out.println(qbstack.pop());
        System.out.println(qbstack.pop());
        System.out.println(qbstack.pop());
        System.out.println(qbstack.pop());

        System.out.println();


    }
}

