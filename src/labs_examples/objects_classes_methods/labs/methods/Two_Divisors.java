package labs_examples.objects_classes_methods.labs.methods;

import java.util.ArrayList;

public class Two_Divisors {

    public static void main(String[] args) {

        //Write a method that takes 3 arguments (int maxNum, int divisor1, int divisor2) and returns an Integer Arraylist.
        //        In this method create an Integer ArrayList and populate it with each number between zero and maxNum that is
        //        divisible by both divisor1 and divisor2. Then return this ArrayList. After calling this method, print out the
        //        length of the returned list

        int maxNum = 108;
        int divisor1 = 9;
        int divisor2 = 6;

        System.out.println(maxNum + " " + divisor1 + " " + divisor2);

        ArrayList<Integer> commons = findCommon(maxNum, divisor1, divisor2);

        System.out.println(commons);
    }

    public static ArrayList<Integer> findCommon(int maxNum, int divisor1, int divisor2) {

        int[] toMax = new int[maxNum+1];
        int i = 1;

        while (i <= maxNum) {

            toMax[i] = i;
            if (maxNum < 55) {
            System.out.print(toMax[i] + " ");
            }
            i=i+1;
        }
        System.out.println();

        int[] maxDivs1 = new int[maxNum/divisor1+1];
        maxDivs1[0] = divisor1;
        int d1 = 1;
        int i1 = 0;

        while (i1 < maxNum/divisor1) {

            maxDivs1[d1] = (d1+1) * divisor1;
            System.out.print(maxDivs1[i1] + " ");
            d1 = d1 + 1;
            i1++;
        }
        System.out.println();

        int[] maxDivs2 = new int[maxNum/divisor2+1];
        maxDivs2[0] = divisor2;
        int d2 = 1;
        int i2 = 0;

        while (i2 < maxNum/divisor2) {

            maxDivs2[d2] = (d2+1) * divisor2;
            System.out.print(maxDivs2[i2] + " ");
            d2 = d2 + 1;
            i2++;
        }
        System.out.println();

        ArrayList<Integer> factors = new ArrayList<>();

        for (int ndx = 0; ndx < maxNum; ndx++) {
            if(toMax[ndx] % divisor1 == 0 && toMax[ndx] % divisor2 == 0) {
                factors.add(toMax[ndx]);
            }
        }
        return factors;
    }
}
