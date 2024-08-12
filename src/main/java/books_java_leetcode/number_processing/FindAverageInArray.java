package books_java_leetcode.number_processing;

import java.math.BigDecimal;
import java.util.Arrays;

public class FindAverageInArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 7, 8};

        double result = Arrays.stream(numbers)
                .average()
                .getAsDouble();

        BigDecimal bigDecimal = new BigDecimal(result).setScale(2, BigDecimal.ROUND_HALF_UP);
        System.out.println(bigDecimal);
    }
}
