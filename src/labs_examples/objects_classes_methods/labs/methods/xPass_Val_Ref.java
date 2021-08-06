package labs_examples.objects_classes_methods.labs.methods;

import videos_source_code.classes.Test;

public class xPass_Val_Ref {

    //Demonstrate the difference between "pass by value" and "pass by reference"

    public static void main(String[] args) {

        int x = 5;
        System.out.print(x + " --> ");
        int morphx = change(x);
        System.out.print(morphx);

//        int obj1 = new int();
//        System.out.print(obj1 + " --> ");
//        int morpho = changeObj(obj1);
//        System.out.println(morpho);

    }

    public static int change(int x) {
        x = x + 10;
        return x;
    }

}



