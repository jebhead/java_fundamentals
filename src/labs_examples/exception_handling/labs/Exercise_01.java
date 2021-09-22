package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */

class Exercise_1 {

    public static void main(String[] args) {


        int[] array = {1, 3, 7, 4, 0};

        try {
            double x = divide(5, 2);
            System.out.println("answer " + x);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            ;
        }
        System.out.println(" * ");

        try {
            double y = divide(array);
            System.out.println("answer " + y);
        } catch (ArrayIndexOutOfBoundsException exc1){
            System.out.println(exc1.getMessage());
        } catch (ArithmeticException exc2) {
            System.out.println(exc2.getMessage());
        } catch (Exception exc3) {
            System.out.println(exc3.getMessage());
        }

    }

    private static double divide(int[] a) throws ArrayIndexOutOfBoundsException, ArithmeticException {

        return a[0]/a[1];
    }

    private static double divide(int i, int i1) throws Exception {

        if (i1 == 0) {
            throw new ArithmeticException("division by zero not allowed");
        }

        return i/i1;
    }
}

