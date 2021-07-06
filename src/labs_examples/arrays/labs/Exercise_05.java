package labs_examples.arrays.labs;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {


        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        for (int i = nums.length - 1; i >= 0; i = i -2 ) {
            System.out.println(nums[i]);
        }
    }
}

