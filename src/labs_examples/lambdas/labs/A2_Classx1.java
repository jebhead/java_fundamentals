package labs_examples.lambdas.labs;

public class A2_Classx1 {

    public static void main(String[] args) {

        A1_X1 newForm2 = (double x, double y) -> 3 * x - y * y + 5;
        double result2 = newForm2.formula(4.8, 9.7);

        System.out.println(result2);

        A1_X1 newForm21 = (double x, double y) -> x*x-y;
        double result21 = newForm21.formula(3.4,7.8);

        System.out.println(result21);

    }
}
