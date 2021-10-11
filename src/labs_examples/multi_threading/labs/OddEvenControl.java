package labs_examples.multi_threading.labs;

//import labs_examples.multi_threading.examples.MyThread8;
//import labs_examples.multi_threading.examples.TickTock;

public class OddEvenControl {

    public static void main(String args[]) {
        OddEven oe = new OddEven();
        OddEvenThread o = new OddEvenThread("odd", oe);
        OddEvenThread e = new OddEvenThread("even", oe);

        try {
            o.thread.join();
            e.thread.join();
        } catch(InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }
    }
}
