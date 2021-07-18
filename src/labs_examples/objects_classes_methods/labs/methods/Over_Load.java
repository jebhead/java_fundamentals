package labs_examples.objects_classes_methods.labs.methods;

public class Over_Load {

    //Demonstrate method overloading in this class

    public static void main(String[] args) {
         int a = 1;
         int b = 2;
         int c = 3;

         int sum2 = sumer(a, b);
         int sum3 = sumer(a, b, c);

        System.out.println(sum2 + " " + sum3);
    }

    public static int sumer(int a, int b) {

        int answer = a + b;
        return answer;
    }
    public static int sumer(int a, int b, int c) {

        int answer = a + b + c;
        return answer;
    }
}
