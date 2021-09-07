package labs_examples.objects_classes_methods.labs.methods;

public class Ex_maxNum2 {

    public static void main(String[] args) {

        int[] nums = {5, 6, 3, 6, 8, 7, 2};

        int max = nums[0];
        System.out.println(nums[3]);

        for (int i = 0; i < nums.length; i++) {

            if (max < nums[i]) {
                max = nums[i];
            }
        }
        System.out.println();
        System.out.println("The max is " + max);
    }
}


