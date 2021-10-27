package labs_examples.lambdas.labs;

public class A5_Classx1 {

    public static void main(String[] args) {

        A5_Interface3var obj5 = (double p, double d, double q) -> 2+2*p-d-4+2*q*q;

        double result5 = obj5.form(4.5, 7.6, 3.4);
        System.out.println(result5);


        A5_Interface3var anon5 = new A5_Interface3var() {
            @Override
            public double form(double p, double d, double q) {
                return (p*p-6)-d/2+(q*d);
            }
        };

        double result52 = anon5.form(4.5,6.7, 2.1);

        System.out.println(result52);
    }

}
