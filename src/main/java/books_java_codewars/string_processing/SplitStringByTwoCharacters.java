package books_java_codewars.string_processing;

import java.util.Arrays;

public class SplitStringByTwoCharacters {
    public static String[] solution(String s) {
        if (s.length() % 2 != 0) {
            s += "_";
        }
        return s.split("(?<=\\G.{2})");
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("abc")));
    }
}
