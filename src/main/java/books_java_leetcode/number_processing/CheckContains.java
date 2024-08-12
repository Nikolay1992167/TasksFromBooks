package books_java_leetcode.number_processing;

import java.util.Arrays;

public class CheckContains {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 7, 8};

//        boolean result = checkContains(numbers, 12);
//        boolean result = binarySearchExample(numbers, 12);
        boolean result = streamSearch(numbers, 5);
        System.out.println(result);
    }

    private static boolean streamSearch(int[] numbers, int target) {
        return Arrays.stream(numbers)
                .anyMatch(e -> e == target);
    }

    private static boolean binarySearchExample(int[] numbers, int i) {
        Arrays.sort(numbers);
        int resultSearch = Arrays.binarySearch(numbers, 12);
        return resultSearch >= 0;
    }

    public static boolean checkContains(int[] arr, int toContain) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == toContain) {
                return true;
            }
        }
        return false;
    }
}
