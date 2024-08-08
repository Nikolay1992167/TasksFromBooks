package books_java_leetcode.sorting_array;

import java.util.Arrays;
import java.util.Comparator;

public class Runner {
    public static void main(String[] args) {

        Melon [] melons = new Melon[]{new Melon("fresh", 3), new Melon("ice", 2), new Melon("warm", 4), new Melon("chicken", 1)};

        Arrays.sort(melons, Comparator.comparingInt(Melon::getWight));
        System.out.println(Arrays.asList(melons));
        Arrays.sort(melons, Comparator.comparingInt(Melon::getWight).reversed());
        System.out.println(Arrays.asList(melons));
    }
}
