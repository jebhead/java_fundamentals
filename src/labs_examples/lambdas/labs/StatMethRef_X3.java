package labs_examples.lambdas.labs;

import java.util.function.BiFunction;

public class StatMethRef_X3 {

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> convertNums0 = (x, y) -> StatMethRef_X3.convertNbrs(x, y);
        int result0 = convertNums0.apply(13, 17);
        System.out.println("The converted number is " + result0);

        BiFunction<Integer, Integer, Integer> convertNums1 = StatMethRef_X3 :: convertNbrs;
        int result1 = convertNums1.apply(41, 23);
        System.out.println("The converted number is " + result1);
    }

    public static int convertNbrs(int x, int y){

        return x*(x-3)+((y-11)*(y-7));
    }
}
