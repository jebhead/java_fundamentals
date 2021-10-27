package labs_examples.lambdas.labs;

import java.util.function.*;

public class Built_in {

    public static void main(String[] args) {

       tryBiFunction();
       tryFunction();
       trySupplier();
       tryPredicate();
       tryBiPredicate();
       tryToDoubleBiFunction();

    }

    public static void tryBiFunction() {

        BiFunction<Integer, Integer, Integer> tes = (a, b) -> {

            return a*b;

        };
        System.out.println(tes.apply(9,8));
    }

    public static void tryFunction() {

        Function<Integer, Integer> tes2 = (a) -> {

            return (a-3)*a;

        };

        System.out.println(tes2.apply(8));
    }

    public static void trySupplier()  {

        Supplier<Double> randNum = () -> Math.random();

        System.out.println(randNum.get() + "  ... is random");
    }

    public static void tryPredicate()  {

        Predicate<Integer> test3 = (i) -> (i == 3);
        System.out.println(test3.test(7));
    }

    public static void tryBiPredicate()  {

        BiPredicate<Integer, Integer> test4 = (i, j) -> (i > j);
        System.out.println(test4.test(12,8));

    }

    public static void tryToDoubleBiFunction()  {

        ToDoubleBiFunction<Double, Double> test5 = (i, j) -> (i+5)*i-j;
        System.out.println(test5.applyAsDouble(8.8, 12.7));

    }


}
