package books_java_leetcode.sorting_array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReversedArray {
    public static void main(String[] args) {
        int[] arr = {-1, 2, 3, 1, 4, 5, 3, 2, 22};
        reverse(arr);
        int [] reversed = IntStream.rangeClosed(1, arr.length)
                        .map(i->arr[arr.length-i]).toArray();
        System.out.println(Arrays.toString(reversed));
    }

    public static void reverse(int[] arr) {
        for(int leftHead = 0, rightHead = arr.length-1; leftHead<rightHead; leftHead++, rightHead--) {
            int temp = arr[leftHead];
            arr[leftHead] = arr[rightHead];
            arr[rightHead] = temp;
        }
    }
}
