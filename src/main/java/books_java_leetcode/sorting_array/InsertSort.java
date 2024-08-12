package books_java_leetcode.sorting_array;

import java.util.Arrays;
import java.util.Comparator;

public class InsertSort {
    public static void main(String[] args) {
        int[] array = {7, 4, 11, 3, 2};
        Melon [] melons = new Melon[]{new Melon("fresh", 3), new Melon("ice", 2), new Melon("warm", 4), new Melon("chicken", 1)};

        Comparator<Melon> byType = Comparator.comparing(Melon::getType).thenComparing(Melon::getWight);

        insertionSortWithComparator(melons, byType);
        System.out.println(Arrays.asList(melons));
//        insertSort(array);
    }

    public static void insertSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j=j-1;
            }
            arr[j + 1] = key;
        }
    }

    public static <T> void insertionSortWithComparator(T[] arr, Comparator<? super T> c) {
        int n = arr.length;

        for (int i = 1; i < n; ++i) {
            T key = arr[i];
            int j = i - 1;

            while (j >= 0 && c.compare(arr[j], key) > 0) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
