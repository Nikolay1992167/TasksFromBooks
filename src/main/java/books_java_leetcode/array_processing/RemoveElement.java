package books_java_leetcode.array_processing;

import java.util.Arrays;
import java.util.List;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1,2,3,4,5,6};

        System.out.println(Arrays.toString(removeElement(arr, 6)));

//        int findValue = 5;
//        int[] array = Arrays.stream(arr)
//                .filter(i -> i != findValue)
//                .toArray();
//        System.out.println(Arrays.toString(array));
    }

    public static int[] removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i++] = nums[j];
            }
        }
        return nums;
    }
}
