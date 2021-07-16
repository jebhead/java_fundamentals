package labs_examples.objects_classes_methods.labs.methods;

public class MethodTraining_1 {


    public static void main(String[] args) {

        int a = 5;
        int b = 7;


        int sum = changeNum(a);

        System.out.println(a);
        System.out.println(sum);

    }
        static int changeNum(int a){

            a = a + 3;

            return a;


        }
    }

