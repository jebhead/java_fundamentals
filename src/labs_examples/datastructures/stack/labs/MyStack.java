package labs_examples.datastructures.stack.labs;

import java.util.Stack;

public class MyStack {

    public static void main(String[] args) {

        Stack<String> qbstack = new Stack<>();

        qbstack.push("Burrow");
        qbstack.push("Prescott");
        qbstack.push("Brady");
        qbstack.push("Murray");
        qbstack.push("Allen");
        qbstack.push("Mahomes");

        System.out.println("Number of QBs in list is " + qbstack.size());
        System.out.println();

        qbstack.peek();
        System.out.println();
        qbstack.add("Mayfield");

        System.out.println(qbstack.pop());
        System.out.println(qbstack.pop());
        System.out.println(qbstack.pop());
        System.out.println(qbstack.pop());
        System.out.println(qbstack.pop());
        System.out.println(qbstack.pop());

        System.out.println();

        System.out.println(qbstack.size());

        System.out.println(qbstack.peek());

    }
}

