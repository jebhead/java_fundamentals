package labs_examples.multi_threading.labs;

public class OddEven {

    String state; // contains the state of the clock
    int nod = -1;
    int neven = 0;

    synchronized void odd(boolean on) {
        if(!on) {
            state = "odd";

            notify(); // notify any waiting threads
            return;
        }
        nod = nod + 2;
        System.out.println(nod);

        state = "odd"; // set the current state to ticked

        notify(); // let even() run
        try {
            while(!state.equals("even"))
                wait(); // wait for tock() to complete
        }
        catch(InterruptedException exc) {
            System.out.println("Thread interrupted.");
        }
    }

    synchronized void even(boolean on) {
        if(!on) {
            state = "even";

            notify(); // notify any waiting threads
            return;
        }
        neven = neven + 2;
        System.out.println(neven);

        state = "even"; // set the current state to even

        notify(); // let odd() run
        try {
            while(!state.equals("odd"))
                wait(); // wait for tick to complete
        }
        catch(InterruptedException exc) {
            System.out.println("Thread interrupted.");
        }
    }
}

