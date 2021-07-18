package labs_examples.objects_classes_methods.labs.methods;

public class Exer_2p4 {

    //  IS THIS A PRIME NUMBER

    public static void main(String[] args) {

        int num = 7;

        System.out.println(num);

        Boolean prm = isPrime(num);

        System.out.println(prm);
    }

    public static Boolean isPrime(int num) {

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}


//          3) Create a method that will return the largest of 4 numbers (all of which are passed in as arguments)
//
//          4) Write a method to count all consonants (the opposite of vowels) in a String
//
//          5) Write a method that will determine whether or not a number is prime
