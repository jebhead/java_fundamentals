package labs_examples.objects_classes_methods.labs.methods;

import java.util.Scanner;

public class Conson_count {

    // Write a method to count all consonants (the opposite of vowels) in a String

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a word ");
        String word = scanner.next();

        int count = 0;
        String vowels = "aeiou";
        int ans = 0;

        while (count < word.length()) {

            char c = word.charAt(count);
            int i = vowels.indexOf(c);

            count = count +1;
            if (i == -1) {
                 ans = ans + 1;
            }
        }
        System.out.println("Number cons is " + ans);
    }
}
