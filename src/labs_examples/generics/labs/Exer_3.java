package labs_examples.generics.labs;

//       1) Write a generic method that accepts two generic arguments. This generic method should only accept
//        arguments which are sublasses of Number. The generic method must return the sum (as a double) of whatever two
//        numbers were passed in regardless of their type.

public class Exer_3 {

    public static void main(String[] args) {

        int i = 6;
        double d = 8.4;
        double sum;

        sum = summer(i,d);

        System.out.println(sum);
    }

    public static <T extends Number, U extends Number> double summer(T t, U u) {

        double s;

        s = t.doubleValue() + u.doubleValue();

        return s;
    }
}