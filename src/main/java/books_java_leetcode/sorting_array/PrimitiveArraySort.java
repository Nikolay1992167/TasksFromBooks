package books_java_leetcode.sorting_array;

import java.util.Arrays;

public class PrimitiveArraySort {

    public static void main(String[] args) {

        int[] array = {7, 8, 11, 3, 2, 14, 67, 32, 23, 1};

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        for (int left = 0, right = array.length-1; left < right; left++, right--) {
            int element = array[left];
            array[left] = array[right];
            array[right] = element;
        }
        System.out.println(Arrays.toString(array));
        int[] array1 = Arrays.stream(array)
                .boxed()
                .sorted(Integer::compareTo)
                .mapToInt(a -> a)
                .toArray();
        System.out.println(Arrays.toString(array1));
    }
}
