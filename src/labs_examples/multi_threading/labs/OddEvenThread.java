package labs_examples.multi_threading.labs;

class OddEvenThread implements Runnable {

    Thread thread;
    OddEven oeOb;

    public OddEvenThread(String name, OddEven oe) {

        thread = new Thread(this, name);
        oeOb = oe;
        thread.start();
    }

    public void run() {

        if (thread.getName().compareTo("odd") == 0) {
            for (int i = 0; i < 5; i++)
                oeOb.odd(true);
            oeOb.odd(false);
        } else {
            for (int i = 0; i < 5; i++)
                oeOb.even(true);
            oeOb.even(false);

        }
    }
}
