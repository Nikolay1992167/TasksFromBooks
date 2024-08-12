package books_java_leetcode.stream_learn;

import java.util.Arrays;
import java.util.stream.Stream;

public class CreateStream {

    public static void main(String[] args) {
        String [] arr = {"One", "Two", "Three", "Four", "Five"};

        Stream<String> stream = Arrays.stream(arr);
        Stream<String> stream1 = Arrays.stream(arr, 1, arr.length - 1);

        // Creat from List
        Stream<String> streamList = Arrays.asList(arr).stream();
        Stream<String> streamList2 = Arrays.asList(arr).subList(0,2).stream();

        // from Stream.of()
        Stream<String> streamOf = Stream.of(arr);
        Stream<String> streamOf2 = Stream.of("One", "Two", "Three");

        int[] numbers = {1,2,3,4,5};

        int[] result = Arrays.stream(numbers)
                .filter(e -> e % 2 != 0)
                .toArray();
        Arrays.stream(result)
                .forEach(System.out::println);
        String resultWord = Arrays.stream(numbers)
                .mapToObj(e -> String.valueOf(e))
                .reduce("", (a, b) -> a + b);
        System.out.println(resultWord);
    }
}
