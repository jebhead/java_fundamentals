package labs_examples.multi_threading.labs;

import labs_examples.multi_threading.examples.runnable.MyFirstRunnable;

public class Runnable_Controller {

    public static void main(String[] args) {

        System.out.println("** Main Thread Start **");
        RunnableClass t1 = new RunnableClass("Thread 1");
        RunnableClass t2 = new RunnableClass("Thread 2");
        RunnableClass t3 = new RunnableClass("Thread 3");
        System.out.println("** Main Thread End **");

    }
}
