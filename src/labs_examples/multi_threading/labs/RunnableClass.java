package labs_examples.multi_threading.labs;

public class RunnableClass implements Runnable {

    Thread thread;

    public RunnableClass(String name) {

        thread = new Thread(this, name);

        thread.start();
    }


    @Override
    public void run() {

        //System.out.println();(thread.getName() + " starting.");
        try {
            for(int count=0; count<10; count++) {
                // put this thread to sleep for 400 milliseconds
                Thread.sleep(400);
                System.out.println("In " + thread.getName() +
                        ", count is " + count);
            }
        }
        // catch the potential exception
        catch(InterruptedException exc) {
            System.out.println(thread.getName() + " interrupted.");
        }
        System.out.println(thread.getName() + " terminating.");

    }
}
