package labs_examples.generics.labs;

import com.sun.tools.javah.Gen;

public class GenClass1_Contr {

    public static void main(String[] args) {

        GenClass1<String> strex11 = new GenClass1<>("Wake-up", "Go to sleep");

        System.out.println(strex11);

        GenClass1<Integer> intex11 = new GenClass1<>(123, 456);

        System.out.println(intex11);

        System.out.println();

        System.out.println(strex11.getObjex11() + " is easy as " + intex11.getObjex11());

        System.out.println(strex11.getObjex12() + " is easy as " + intex11.getObjex12());
    }
}
