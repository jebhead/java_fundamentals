package labs_examples.lambdas.labs;

public class A1_ClassX1 {

    public static void main(String[] args) {

        A1_X1 result1 = new A1_X1() {
            @Override
            public double formula(double x, double y) {
                return (x-1)*x-(y*3);
            }
        };

        double formResult = result1.formula(3.4,5.4);
        System.out.println(formResult);
    }
}
