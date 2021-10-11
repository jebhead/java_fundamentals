package labs_examples.multi_threading.labs;

public class Ext_Thread extends Thread {

    Ext_Thread(String name) {

        super(name);

        start();
    }
    public void run() {
        System.out.println(getName() + " starting.");
        try {
            for(int count=0; count < 12; count++) {
                Thread.sleep(1000);
                System.out.println("In " + getName() +
                        ", count is " + count);
            }
        }
        catch(InterruptedException exc) {
            System.out.println(getName() + " interrupted.");
        }

        System.out.println(getName() + " terminating.");
    }

}
