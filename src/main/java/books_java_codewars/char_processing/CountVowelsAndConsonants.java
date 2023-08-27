package books_java_codewars.char_processing;

import org.javatuples.Pair;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


public class CountVowelsAndConsonants {

    private static final Set<Character> allVowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

    public static Pair<Long, Long> countVowelsAndConsonants(String line) {
        line = line.toLowerCase();
        long vowels = line.chars().filter(n -> allVowels.contains((char) n)).count();
        long consonants = line.chars().filter(n -> !allVowels.contains((char) n)).filter(ch -> (ch >= 'a' && ch <= 'z')).count();
        return Pair.with(vowels, consonants);
    }

    public static Pair<Long, Long> countVowelsAndConsonantsTwo(String line) {
        Map<Boolean, Long> result = line.chars()
                .mapToObj(c -> (char) c)
                .filter(ch -> (ch >= 'a' && ch <= 'z'))
                .collect(Collectors.partitioningBy(allVowels::contains, Collectors.counting()));
        return Pair.with(result.get(true), result.get(false));
    }


    public static void main(String[] args) {
        Pair<Long, Long> result = countVowelsAndConsonants("Nikolay");
        System.out.println(result);
    }
}

