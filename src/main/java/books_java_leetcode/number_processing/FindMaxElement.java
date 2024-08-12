package books_java_leetcode.number_processing;

import java.util.Arrays;

public class FindMaxElement {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1, -4, 6, 2};
//        int result = max(arr);

        int result = Arrays.stream(arr)
                .max()
                .getAsInt();

        System.out.println(result);
    }

    public static int max (int[] arr) {
        int max = arr[0];
        for (int number:arr) {
            max = Math.max(max, number);
//            if (max < number) {
//                max = number;
//            }
        }
        return max;
    }
}
