package books_java_leetcode.string_processing;

import java.util.StringJoiner;

public class JoinSomeLineWithHelpDelimiter {
    public static String joinByDelimiter(char delimiter, String ... args){
        StringJoiner joiner = new StringJoiner(String.valueOf(delimiter));
        for (String word:args) {
            joiner.add(word);
        }
        return joiner.toString();
    }

    public static void main(String[] args) {
        System.out.println(joinByDelimiter('@', "my", "name", "Nikolay"));
    }
}
