package labs_examples.packages.labs.pack1;

import static labs_examples.packages.labs.pack2.jclass2.exMethod4;

public class jclass1 {

    public static void exMethod1() {

        exMethod2();

    }

   public static void exMethod2() {

        exMethod1();
        exMethod4();

   }

}
