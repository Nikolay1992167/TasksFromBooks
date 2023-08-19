package books_java_codewars.char_processing;

import java.util.Map;
import java.util.stream.Collectors;

public class CountingDuplicateCharacters {
    public static Map<Character, Long> countDuplicateCharacters(String line){
       Map<Character, Long> result = line.chars()
       .mapToObj(c->(char)c)
       .collect(Collectors.groupingBy(c->c, Collectors.counting()));
       return result;
    }

    public static void main(String[] args) {
        System.out.println(countDuplicateCharacters("drfffdrt"));
    }
}
