package labs_examples.lambdas.labs;

public class A3_Classx1 {

    public static void main(String[] args) {

        A3_Interface newform3 = (int a) -> 2*a*a;
        int result3 = newform3.form(4);

        System.out.println(result3);

        newform3 = (int a) -> a*a*a/8;
        result3 = newform3.form(5);

        System.out.println(result3);

        A3_Interface anon3 = new A3_Interface() {
            @Override
            public int form(int a) {

                return 3+2*a;
            }
        };

        int result31 = anon3.form(8);
        System.out.println(result31);
    }

}
