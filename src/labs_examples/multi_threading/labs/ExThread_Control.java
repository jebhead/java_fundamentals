package labs_examples.multi_threading.labs;

//import labs_examples.multi_threading.examples.thread.Ext_Thread;

public class ExThread_Control {

    public static void main(String args[]) {
        System.out.println("** Main Thread Start **");

        Ext_Thread t1 = new Ext_Thread("Thread A");
        t1.setPriority(1);
        Ext_Thread t2 = new Ext_Thread("Thread B");
        t2.setPriority(9);
        Ext_Thread t3 = new Ext_Thread("Thread C");
        t3.setPriority(2);

        // notice when the next line prints
        System.out.println("** Main Thread End **");
    }
}
