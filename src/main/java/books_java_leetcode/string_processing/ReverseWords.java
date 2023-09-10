package books_java_leetcode.string_processing;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ReverseWords {
    private static final Pattern PATTERN = Pattern.compile(" +");
    public static String reverse(String line){
        return PATTERN.splitAsStream(line)
                .map(w->new StringBuilder(w).reverse())
                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        String reverse = reverse("Grom go at the lake!");
        System.out.println(reverse);
    }
}
