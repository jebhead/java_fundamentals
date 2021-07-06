package labs_examples.arrays.labs;

/**
 *  Reversing an array in place
 *
 *
 *      This is a very common interview challenge.
 *
 *      Using a for loop, please demonstrate how to reverse the nums[] array in place using only one extra variable. Please note,
 *      you cannot use a second array and you cannot instantiate any new variables in the class below.
 *
 *      Hint: you have two index
 *
 */
public class Exercise_06 {

    public static void main(String[] args) {
        int[] nums = {45, 87, 62, 99, 1, 42, 12};

        int temp = 0;

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < nums.length / 2; i++) {

            temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }

            for(int j = 0; j < nums.length; j++){
                System.out.print(nums[j] + " ");


        }
    }
}
